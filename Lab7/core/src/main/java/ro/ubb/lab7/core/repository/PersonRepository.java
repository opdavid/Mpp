package ro.ubb.lab7.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ubb.lab7.core.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {

}