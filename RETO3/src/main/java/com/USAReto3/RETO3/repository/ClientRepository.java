package com.USAReto3.RETO3.repository;

import com.USAReto3.RETO3.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Integer> {

}
