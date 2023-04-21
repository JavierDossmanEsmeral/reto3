package com.USAReto3.RETO3.repository;

import com.USAReto3.RETO3.model.GamaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamaRepository extends JpaRepository<GamaModel, Integer> {

}
