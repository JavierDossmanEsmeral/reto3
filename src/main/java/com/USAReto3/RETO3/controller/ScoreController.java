package com.USAReto3.RETO3.controller;

import com.USAReto3.RETO3.dbo.ReservationDbo;
import com.USAReto3.RETO3.dbo.ScoreDbo;
import com.USAReto3.RETO3.model.ReservationModel;
import com.USAReto3.RETO3.model.ScoreModel;
import com.USAReto3.RETO3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @GetMapping("/all")
    public List<ScoreModel> obtener(){
        return scoreService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ScoreModel score){
        scoreService.crear(score);
    }
}
