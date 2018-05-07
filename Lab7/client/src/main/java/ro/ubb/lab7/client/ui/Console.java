package ro.ubb.lab7.client.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ro.ubb.lab7.web.dto.StudentDto;

@Component
public class Console {

    @Autowired
    private RestTemplate restTemplate;

    public void runConsole() {
        StudentsDto studentsDto = restTemplate
                .getForObject("http://localhost:8080/api/students", StudentsDto.class);
        studentsDto.getStudents()
                .forEach(System.out::println);


        StudentDto student = restTemplate
                .postForObject("http://localhost:8080/api/students",
                        new StudentDto("s1", 10),
                        StudentDto.class);
        System.out.println(student);


        student.setGrade(student.getGrade() + 1);
        restTemplate
                .put("http://localhost:8080/api/students/{studentId}",
                        student, student.getId());


        restTemplate
                .delete("http://localhost:8080/api/students/{studentId}",
                        student.getId());
    }
}
