package ro.ubb.lab7.core.model;


import javax.persistence.Entity;

@Entity
public class Grade extends BaseEntity<Long> {
    private Long IdStudent;
    private Long IdProblem;
    private int number;

    public Grade(){}
    public  Grade(long id, long IdStudent, long IdProblem, int number)
    {
        super(id);
        this.IdStudent=IdStudent;
        this.IdProblem=IdProblem;
        this.number=number;
    }

    public Long getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(long idStudent) {
        IdStudent = idStudent;
    }

    public Long getIdProblem(){
        return IdProblem;
    }

    public void setIdProblem(long idProblem){
        idProblem=idProblem;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getNumber());
    }

    public int getNumber() {
        return number;
    }
}
