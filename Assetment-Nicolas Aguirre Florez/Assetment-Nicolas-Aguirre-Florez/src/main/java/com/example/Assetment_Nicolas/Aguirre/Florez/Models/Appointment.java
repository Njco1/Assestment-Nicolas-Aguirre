package com.example.Assetment_Nicolas.Aguirre.Florez.Models;

import com.example.Assetment_Nicolas.Aguirre.Florez.Enums.StateEnum;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "appointment")

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "date", length = 100, nullable = false)
    LocalDate date;

    @Column(name = "time", nullable = false)
    LocalTime time;

    @Column(name = "reason", length = 100, nullable = false)
    String reason;

    @Column(name = "state",  length = 50, nullable = false)
    StateEnum state;

    @ManyToMany
    Doctor doctor;

    @ManyToOne
    Patient patient;
}

