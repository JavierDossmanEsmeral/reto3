package com.USAReto3.RETO3.dbo;

import com.USAReto3.RETO3.model.ReservationModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreDbo {
    private int idScore;
    private float value;
    private ReservationModel reservation;
}
