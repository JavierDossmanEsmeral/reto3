package com.USAReto3.RETO3.service;

import com.USAReto3.RETO3.model.MessageModel;
import com.USAReto3.RETO3.model.ReservationModel;
import com.USAReto3.RETO3.repository.ReservationRepository;
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
