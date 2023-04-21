package com.USAReto3.RETO3.service;

import com.USAReto3.RETO3.model.ReservationModel;
import com.USAReto3.RETO3.model.ScoreModel;
import com.USAReto3.RETO3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    ScoreRepository scoreRepository;

    public List<ScoreModel> obtener(){
        return scoreRepository.findAll();
    }

    public void crear(ScoreModel score){
        scoreRepository.save(score);
    }

}
