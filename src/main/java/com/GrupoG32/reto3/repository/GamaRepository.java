package com.GrupoG32.reto3.repository;

import com.GrupoG32.reto3.model.GamaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamaRepository extends JpaRepository<GamaModel, Integer> {

}