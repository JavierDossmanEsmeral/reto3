package com.USAReto3.RETO3.service;

import com.USAReto3.RETO3.model.GamaModel;
import com.USAReto3.RETO3.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {

    @Autowired
    GamaRepository gamaRepository;

    public List<GamaModel> obtener(){
        return gamaRepository.findAll();
    }

    public void crear(GamaModel gama){
        gamaRepository.save(gama);
    }

}

