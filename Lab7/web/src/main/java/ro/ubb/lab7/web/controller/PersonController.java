package ro.ubb.lab7.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ubb.lab7.core.model.Person;
import ro.ubb.lab7.core.model.Student;
import ro.ubb.lab7.core.service.PersonService;
import ro.ubb.lab7.web.converter.PersonConverter;
import ro.ubb.lab7.web.dto.EmptyJsonResponse;
import ro.ubb.lab7.web.dto.PersonDto;
import ro.ubb.lab7.web.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    private static final Logger log = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonConverter personConverter;


    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public List<PersonDto> getStudents() {
        log.trace("getPersons");

        List<Person> persons = personService.getAll();

        log.trace("getPersons: persons={}", persons);

        List<PersonDto> pd = new ArrayList<>();
        for(Person p: persons){
            pd.add(personConverter.convertModelToDto(p));
        }
        return pd;
    }

    @RequestMapping(value = "/persons", method = RequestMethod.POST)
    public PersonDto addPerson(@RequestBody final PersonDto personDto) {
        log.trace("addPerson: personDtoToMap={}", personDto);

        PersonDto result;
        try {
            Person person = personService.createPerson(
                    personDto.getSsn(), personDto.getName());

             result = personConverter.convertModelToDto(person);
        }catch (Exception e){
            Person p = new Person();
            p.setId(-1L);
            result = personConverter.convertModelToDto(p);
        }
        log.trace("createPerson: result={}", result);
        return result;
    }
}
