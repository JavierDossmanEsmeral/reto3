package com.USAReto3.RETO3.service;

import com.USAReto3.RETO3.model.ClientModel;
import com.USAReto3.RETO3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> obtener(){
        return clientRepository.findAll();
    }

    public void crear(ClientModel client){
        clientRepository.save(client);
    }

}
