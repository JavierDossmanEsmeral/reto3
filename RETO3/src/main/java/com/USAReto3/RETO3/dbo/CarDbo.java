package com.USAReto3.RETO3.dbo;

import com.USAReto3.RETO3.model.GamaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDbo {
    private int idCar;
    private String name;
    private String brand;
    private int year;
    private String description;
    private GamaModel gama;
}
