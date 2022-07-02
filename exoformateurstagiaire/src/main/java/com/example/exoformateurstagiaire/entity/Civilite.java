package com.example.exoformateurstagiaire.entity;

public enum Civilite {
    M("Monsieur"), MME("Madame"),MLLE("Mademoiselle");// "Monsieur" est un label

    private final String label;

    private Civilite(String label){
        this.label = label;
    }
    public String getLabel(){
        return label;
    }
}
