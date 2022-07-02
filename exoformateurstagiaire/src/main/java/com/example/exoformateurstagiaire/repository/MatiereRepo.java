package com.example.exoformateurstagiaire.repository;

import com.example.exoformateurstagiaire.entity.Difficulte;
import com.example.exoformateurstagiaire.entity.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatiereRepo extends JpaRepository<Matiere, Long> {
    // par @NamedQuery
    List<Matiere> findAllByDifficulte(@Param("dif") Difficulte difficulte);

}
