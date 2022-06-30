package com.example.exoformateurstagiaire.repository;

import com.example.exoformateurstagiaire.entity.Former;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormerRepo {

    public List<Former> findByNom(String person);

    @Query("select f from Former f left join f.person p where p.nom =:nomperson")
    public List<Former> findByNomPerson(@Param("nomperson") String nom);
}
