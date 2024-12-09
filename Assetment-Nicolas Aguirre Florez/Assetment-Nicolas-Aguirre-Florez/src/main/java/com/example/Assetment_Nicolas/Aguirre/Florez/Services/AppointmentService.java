package com.example.Assetment_Nicolas.Aguirre.Florez.Services;

import com.example.Assetment_Nicolas.Aguirre.Florez.Models.Appointment;
import com.example.Assetment_Nicolas.Aguirre.Florez.Models.Doctor;
import com.example.Assetment_Nicolas.Aguirre.Florez.Repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public void createAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    public List<Appointment> getAppointmentsForDoctor(Doctor doctor) {
        return appointmentRepository.findByDoctor(doctor);
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
}
