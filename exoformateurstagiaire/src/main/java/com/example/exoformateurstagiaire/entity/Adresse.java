package com.example.exoformateurstagiaire.entity;

import javax.persistence.*;


    @Entity
    @Table(name = "adress")
    public class Adresse {
        @Id
        @GeneratedValue
        private Long id;
        @Version
        private int version;
        @Column(name = "street", length = 255)
        private String rue;
        @Column(length = 255)
        private String complement;
        @Column(name = "zipcode", length = 10)
        private String codePostal;
        @Column(name = "city", length = 100)
        private String ville;
        @Column(name = "country", length = 100)
        private String pays;

    public Adresse() { // Spring utilise les Beans et va chercher directement le constructeur VIDE puis utilise les Setter/Getter de la classe
        super(); // si pas super(), il le fait quand même
    }

    // Création Constructeur Plein pour faire nos Test, inutile pour Spring
    public Adresse(String rue, String complement, String codePostal, String ville, String pays) {
        super();
        this.rue = rue;
        this.complement = complement;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

        public Adresse(Long id, String rue, String complement, String codePostal, String ville, String pays) {
            super();
            this.id = id;
            this.rue = rue;
            this.complement = complement;
            this.codePostal = codePostal;
            this.ville = ville;
            this.pays = pays;
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
