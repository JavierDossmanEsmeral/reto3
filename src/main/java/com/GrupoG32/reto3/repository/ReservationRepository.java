package com.GrupoG32.reto3.repository;

import com.GrupoG32.reto3.model.ReservationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationModel, Integer> {

}