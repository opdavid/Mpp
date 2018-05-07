package ro.ubb.lab7.core.service;

import org.springframework.stereotype.Service;

import ro.ubb.lab7.core.model.Student;
import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {

    List<Student> getAll();

    Student findStudent(Long id);

    Student createStudent(String name, int grade);

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Long id);

}
