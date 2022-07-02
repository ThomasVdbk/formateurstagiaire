package com.example.exoformateurstagiaire.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typePersonne")
public abstract class Personne {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING) //on précise que c'est un Enum que tu stockera en String
    @Column(name = "civility", length = 10)
    private Civilite civilite;
    @Column(name = "lastname") // ou (name = "lastname", length = 255)
    @Size(max = 255)
    @NotNull
    private String nom;
    @Column(name = "firstname")
    @Size(max = 255)
    @NotNull
    private String prenom;
    @Column(length = 255)
    private String email;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "adress_id")
    private Adresse adresse;

    public Personne() {
        super();
    }

    public Personne(Civilite civilite, String nom, String prenom, String email) {
        super();
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public Personne(Long id, Civilite civilite, String nom, String prenom, String email) {
        super();
        this.id = id;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

}
