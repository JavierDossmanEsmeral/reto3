package com.GrupoG32.reto3.dbo;

import com.GrupoG32.reto3.model.CarModel;
import com.GrupoG32.reto3.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDbo {
    private int idReservation;
    private Date startDate;
    private Date devolutionDate;
    private CarModel car;
    private ClientModel client;
}
