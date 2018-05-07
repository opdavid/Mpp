package ro.ubb.lab7.core.domain;

import javax.persistence.Entity;

@Entity
public class Problem extends BaseEntity<Long> {
    private String description;
    private int number;

    public Problem () {}

    public Problem(String description, int number){
        this.description = description;
        this.number = number;
    }

    public Problem(long id, String description, int number) {
        super(id);
        this.description = description;
        this.number= number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return this.getDescription();
    }
}
