package ro.ubb.lab7.core.service;

import org.springframework.stereotype.Service;
import ro.ubb.lab7.core.model.Person;
import ro.ubb.lab7.core.model.Student;

import java.util.List;

@Service
public interface PersonService {

    List<Person> getAll();

    Person createPerson(String ssn, String name) throws Exception;

    boolean findPerson(String ssn);

    void addPerson(Person person);
}
