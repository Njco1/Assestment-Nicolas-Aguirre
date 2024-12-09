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
@Table(name = "patient")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", length = 100, nullable = false)
    String name;

    @Column(name = "last_name", length = 100, nullable = false)
    String lastName;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "phone", nullable = false)
    int phone;

}
