package com.example.exoformateurstagiaire.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    private Long id;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "duration")
    @NotNull
    private int duration;
    @Column(name = "difficulty")
    @NotNull
    private String difficulty;

    public Subject(Long id, String name, int duration, String difficulty) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.difficulty = difficulty;
    }

    public Subject() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
