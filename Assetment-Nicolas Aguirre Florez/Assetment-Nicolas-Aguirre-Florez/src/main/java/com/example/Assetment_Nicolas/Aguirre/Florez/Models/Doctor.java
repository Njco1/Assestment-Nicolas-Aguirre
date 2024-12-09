package com.example.Assetment_Nicolas.Aguirre.Florez.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", length = 100, nullable = false)
    String name;

    @Column(name = "last_name", length = 100, nullable = false)
    String lastName;

    @Column(name = "medical_specialty",  length = 100, nullable = false)
    String medicalSpecialty;

    @Column(name = "available_times", nullable = false)
    int availableTimes;
}
