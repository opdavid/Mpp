package ro.ubb.lab7.web.converter;

import org.springframework.stereotype.Component;
import ro.ubb.lab7.core.model.Person;
import ro.ubb.lab7.web.dto.PersonDto;

@Component
public class PersonConverter extends AbstractConverter<Person, PersonDto> {


    @Override
    public Person convertDtoToModel(PersonDto personDto) {
        throw new RuntimeException("not yet implemented");
    }

    @Override
    public PersonDto convertModelToDto(Person person) {
        PersonDto personDto = PersonDto.builder()
                .ssn(person.getSsn())
                .name(person.getName())
                .build();
        personDto.setId(person.getId());
        return personDto;
    }
}
