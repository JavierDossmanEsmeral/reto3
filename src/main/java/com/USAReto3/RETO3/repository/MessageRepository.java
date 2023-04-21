package com.USAReto3.RETO3.repository;

import com.USAReto3.RETO3.model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageModel, Integer> {

}
