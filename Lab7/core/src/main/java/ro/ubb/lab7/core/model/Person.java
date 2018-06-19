package ro.ubb.lab7.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Person implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String ssn;

    private String name;


}