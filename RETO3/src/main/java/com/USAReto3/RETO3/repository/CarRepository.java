package com.USAReto3.RETO3.repository;

import com.USAReto3.RETO3.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Integer> {

}
