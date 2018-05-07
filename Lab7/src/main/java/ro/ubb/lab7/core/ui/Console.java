package ro.ubb.lab7.core.ui;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.ubb.lab7.core.domain.Student;
import ro.ubb.lab7.core.service.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


@Component
public class Console {
    @Autowired
    private StudentService studentService;

    public void runConsole() {
        //add student
        //studentService.addStudent(new Student("test", 1));

        //get all students
//        studentService.getAll().forEach(System.out::println);

//        studentService.getAll().stream().findFirst()
//                .ifPresent(student -> {
//                    Long id = student.getId();
//
//                    //update student
//                    Student s = new Student("testupdate", 1);
//                    s.setId(id);
//                    studentService.updateStudent(s);
//
//                    //delete Student
//                    studentService.deleteStudent(id);
//                });


        do {
            int cmd = -1;
            System.out.println("Enter your command id: " + System.lineSeparator() +
                    "           0 - to exit" + System.lineSeparator() +
                    "           1 - to display all students" + System.lineSeparator() +
                    "           2 - to add a student" + System.lineSeparator() +
                    "           3 - to display all problems" + System.lineSeparator() +
                    "           4 - to add a problem" + System.lineSeparator() +
                    "           5 - filter students by name" + System.lineSeparator() +
                    "           6 - add a grade" + System.lineSeparator() +
                    "           7 - display all grades" + System.lineSeparator() +
                    "           8 - update Student" + System.lineSeparator() +
                    "           9 - delete Student" + System.lineSeparator() +
                    "           10 - report"
            );
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                cmd = Integer.valueOf(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (cmd) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    printAllStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
//                    printAllProblems();
                    break;
                case 4:
//                    addProblem();
                    break;
                case 5:
                    filter();
                    break;
                case 6:
//                    addGrade();
                case 7:
//                    printAllGrades();
                case 8:
                    update();
                    break;
                case 9:
                    delete();
                    break;
                case 10:
//                    report();
                    break;

            }
        } while (true);
    }

    private void addStudent() {
        Student student = readStudent();
        if (student != null) {
            studentService.addStudent(student);
        }
    }

    private Student readStudent() {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Id: ");
            long id = Integer.valueOf(buffReader.readLine());
            System.out.println("Name: ");
            String name = String.valueOf(buffReader.readLine());
            System.out.println("Group: ");
            int group = Integer.valueOf(buffReader.readLine());

            return new Student(id, name, group);

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException I) {
            System.out.println("You have inserted invalid data try again!");
            I.getMessage();
        }
        return null;
    }

    private void printAllStudents() {
        studentService.getAll().forEach(System.out::println);
    }

    private void update() {
        Student student = readStudent();
        if (student != null) {
            studentService.updateStudent(student);
        }
    }

    private void delete() {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Id:");
        Long id = null;
        try {
            id = Long.valueOf(buffReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        studentService.deleteStudent(id);
    }

    private void filter() {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Name:");
        try {
            String name = buffReader.readLine();
            for(Student s:studentService.getAll()){
                if(s.getName().equals(name))
                    System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
