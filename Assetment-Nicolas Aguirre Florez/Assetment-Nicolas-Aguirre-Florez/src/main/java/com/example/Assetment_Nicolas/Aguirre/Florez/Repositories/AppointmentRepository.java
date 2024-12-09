package com.example.Assetment_Nicolas.Aguirre.Florez.Repositories;

import com.example.Assetment_Nicolas.Aguirre.Florez.Models.Appointment;
import com.example.Assetment_Nicolas.Aguirre.Florez.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDoctor(Doctor doctor);
}
