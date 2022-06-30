package com.example.exoformateurstagiaire.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student extends Person{

    @Id
    private Long id;

    @Column(name = "birthdate")
    @NotNull
    private Date birthdate;


    public Student() {
    }

    public Student(Long id, String type, String civility, String lastname, String firstname, String email, String adresse, Long id1, Date birthdate) {
        super(id, type, civility, lastname, firstname, email, adresse);
        this.id = id1;
        this.birthdate = birthdate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
