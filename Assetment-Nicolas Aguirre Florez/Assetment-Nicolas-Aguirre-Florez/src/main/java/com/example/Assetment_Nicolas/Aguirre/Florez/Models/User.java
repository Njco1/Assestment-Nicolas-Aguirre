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
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "username", length = 100, nullable = false)
    String username;

    @Column(name = "password", length = 100, nullable = false)
    String password;

    @Column(name = "role", length = 100, nullable = false)
    String role;

}
