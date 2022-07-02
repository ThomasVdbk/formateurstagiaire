package com.example.exoformateurstagiaire.repository;

import com.example.exoformateurstagiaire.entity.Adresse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface AdresseRepo extends JpaRepository<Adresse, Long> {

    List<Adresse> findByVille(String ville);

    List<Adresse> findByCodePostal(String codePostal);

    List<Adresse> findByVilleOrCodePostal(String ville, String codePostal);

    @Query("select p.adresse from Personne p where p.id = :id")
    Adresse findByPersonne(@Param("id") Long id);
}
