package ro.ubb.lab7.core.model;


import lombok.*;

import javax.persistence.*;

@Entity
//@Table(name = "student_discipline")
//@IdClass(GradePK.class)
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
public class Grade extends BaseEntity<Long> {

    private long IdStudent;
    private long IdProblem;
    private int number;
//    @Id
//    @ManyToOne(optional = false, fetch = FetchType.EAGER)
//    @JoinColumn(name = "idstudent")
//    private Student student;
//
//    @Id
//    @ManyToOne(optional = false, fetch = FetchType.EAGER)
//    @JoinColumn(name = "idproblem")
//    private Problem problem;


    public Grade(long id, long IdStudent, long IdProblem, int number) {
        super(id);
        this.IdStudent = IdStudent;
        this.IdProblem = IdProblem;
        this.number = number;
    }

    public Long getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(long idStudent) {
        IdStudent = idStudent;
    }

    public Long getIdProblem() {
        return IdProblem;
    }

    public void setIdProblem(long idProblem) {
        this.IdProblem = idProblem;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getNumber());
    }

    public int getNumber() {
        return number;
    }
}
