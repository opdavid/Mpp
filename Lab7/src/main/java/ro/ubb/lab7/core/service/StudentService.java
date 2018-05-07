package ro.ubb.lab7.core.service;

import org.springframework.stereotype.Service;
import ro.ubb.lab7.core.domain.Student;
import java.util.List;

@Service
public interface StudentService {

    List<Student> getAll();

    Student findStudent(Long id);

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Long id);

}
