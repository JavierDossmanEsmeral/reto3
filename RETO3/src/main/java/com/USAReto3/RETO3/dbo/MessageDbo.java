package com.USAReto3.RETO3.dbo;

import com.USAReto3.RETO3.model.CarModel;
import com.USAReto3.RETO3.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDbo {
    private int idMessage;
    private String messageText;
    private ClientModel client;
    private CarModel car;

}
