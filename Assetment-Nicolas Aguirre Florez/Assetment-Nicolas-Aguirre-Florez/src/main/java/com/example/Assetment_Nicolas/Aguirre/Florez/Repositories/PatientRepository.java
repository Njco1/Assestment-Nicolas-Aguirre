package com.example.Assetment_Nicolas.Aguirre.Florez.Repositories;

import com.example.Assetment_Nicolas.Aguirre.Florez.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
