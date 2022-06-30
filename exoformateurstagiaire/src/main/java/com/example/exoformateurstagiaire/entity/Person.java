package com.example.exoformateurstagiaire.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Inheritance
public abstract class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "type")
    @Size(max = 1)
    @NotNull
    private String type;
    @Column(name = "civility")
    @Size(max = 10)
    @NotNull
    private String civility;
    @Column(name = "lastname")
    @Size(max = 255)
    @NotNull
    private String lastname;
    @Column(name = "firstname")
    @Size(max = 255)
    @NotNull
    private String firstname;
    @Column(name = "email")
    @Size(max = 255)
    @NotNull
    private String email;
    @Column(name = "adress")
    @Size(max = 255)
    @NotNull
    private String adresse;


    public Person() {
    }

    public Person(Long id, String type, String civility, String lastname, String firstname, String email, String adresse) {
        this.id = id;
        this.type = type;
        this.civility = civility;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.adresse = adresse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCivility() {
        return civility;
    }

    public void setCivility(String civility) {
        this.civility = civility;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
