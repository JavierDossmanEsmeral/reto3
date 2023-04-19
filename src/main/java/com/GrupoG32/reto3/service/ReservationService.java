package com.GrupoG32.reto3.service;

import com.GrupoG32.reto3.model.MessageModel;
import com.GrupoG32.reto3.model.ReservationModel;
import com.GrupoG32.reto3.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    public List<ReservationModel> obtener(){
        return reservationRepository.findAll();
    }

    public void crear(ReservationModel reservation){
        reservation.setStatus("created");
        reservationRepository.save(reservation);
    }

}
