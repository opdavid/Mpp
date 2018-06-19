//package ro.ubb.lab7.core.model;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
///**
// * Created by radu.
// */
//
//@Entity
//@Table(name = "student_discipline")
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//public class StudentDiscipline implements Serializable {
//
//    @Id
//    @ManyToOne(optional = false, fetch = FetchType.EAGER)
//    @JoinColumn(name = "idstudent")
//    private Student student;
//
//    @Id
//    @ManyToOne(optional = false, fetch = FetchType.EAGER)
//    @JoinColumn(name = "discipline_id")
//    private Discipline discipline;
//
//    @Column(name = "grade")
//    private Integer grade;
//
//    @Override
//    public String toString() {
//        return "StudentDiscipline{" +
//                "student=" + student.getId() +
//                ", discipline=" + discipline.getId() +
//                ", grade=" + grade +
//                '}';
//    }
//}
