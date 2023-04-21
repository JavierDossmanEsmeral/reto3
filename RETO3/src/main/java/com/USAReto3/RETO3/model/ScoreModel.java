package com.USAReto3.RETO3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Score")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_score")
    private int idScore;
    private int stars;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_reservation", unique = true)
    @JsonIgnoreProperties({"score"})
    private ReservationModel reservation;
}
