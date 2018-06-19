package ro.ubb.lab7.core.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ubb.lab7.core.model.Person;
import ro.ubb.lab7.core.model.Student;
import ro.ubb.lab7.core.repository.PersonRepository;
import ro.ubb.lab7.core.repository.StudentRepository;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    private static final Logger LOG = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAll() {
        LOG.trace("getAll --- method entered");

        List<Person> result = personRepository.findAll();

        LOG.trace("getAll: result={}", result);

        return result;
    }

    @Override
    public Person createPerson(String ssn, String name) throws Exception {
        LOG.trace("savePerson: ssn={}, name={}", ssn, name);

        Person p = Person.builder()
                .ssn(ssn)
                .name(name)
                .build();
        if (findPerson(p.getSsn())){
            throw new Exception("duplicate Snn");
        }
        Person person = personRepository.save(p);

        LOG.trace("savePerson: person={}", person);

        return person;
    }

    @Override
    public void addPerson(Person person) {
        LOG.trace("addPerson: person={}", person);

        personRepository.save(person);

        LOG.trace("addPerson --- method finished");
    }

    @Override
    public boolean findPerson(String ssn) {
        LOG.trace("findPerson: ssn={}", ssn);

        for(Person p: personRepository.findAll()){
            if(p.getSsn().equals(ssn)){
                return true;
            }
        }

        LOG.trace("findPerson: ssn={}", ssn);

        return false;
    }
}
