package com.USAReto3.RETO3.service;

import com.USAReto3.RETO3.model.GamaModel;
import com.USAReto3.RETO3.model.MessageModel;
import com.USAReto3.RETO3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<MessageModel> obtener(){
        return messageRepository.findAll();
    }

    public void crear(MessageModel message){
        messageRepository.save(message);
    }

}
