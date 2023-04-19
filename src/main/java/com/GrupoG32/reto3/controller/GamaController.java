package com.GrupoG32.reto3.controller;

import com.GrupoG32.reto3.dbo.ClientDbo;
import com.GrupoG32.reto3.dbo.GamaDbo;
import com.GrupoG32.reto3.model.AdminModel;
import com.GrupoG32.reto3.model.GamaModel;
import com.GrupoG32.reto3.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Gama")
public class GamaController {

    @Autowired
    GamaService gamaService;

    @GetMapping("/all")
    public List<GamaModel> obtener(){
        return gamaService.obtener();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody GamaModel gama){
        gamaService.crear(gama);
    }
}
