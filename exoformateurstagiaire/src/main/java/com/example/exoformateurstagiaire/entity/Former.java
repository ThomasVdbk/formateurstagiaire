package com.example.exoformateurstagiaire.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "former")
public class Former extends Person {

    @Id
    private Long id;
    @Column(name = "hiredate")
    @NotNull
    private Date hiredate;
    @Column(name = "experience")
    @NotNull
    private int experience;
    @Column(name = "interne")
    @NotNull
    private Boolean interne;



    public Former() {
    }


    public Former(Long id, String type, String civility, String lastname, String firstname, String email, String adresse, Date hiredate, int experience, Boolean interne) {
        super(id, type, civility, lastname, firstname, email, adresse);
        this.hiredate = hiredate;
        this.experience = experience;
        this.interne = interne;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Boolean getInterne() {
        return interne;
    }

    public void setInterne(Boolean interne) {
        this.interne = interne;
    }
}
