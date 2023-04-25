package com.USAReto3.RETO3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    private int idReservation;

    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "devolution_date")
    private Date devolutionDate;

    private String status;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_car", nullable = false)
    @JsonIgnoreProperties({"reservations"})
    private CarModel car;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_client", nullable = false)
    @JsonIgnoreProperties({"reservations","messages"})
    private ClientModel client;

    @OneToOne(cascade = CascadeType.MERGE, mappedBy = "reservation")
    @JoinColumn(name = "id_score",referencedColumnName = "id_score", unique = true)
    private ScoreModel score;
}
