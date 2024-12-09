package com.example.Assetment_Nicolas.Aguirre.Florez.Services;

import com.example.Assetment_Nicolas.Aguirre.Florez.Models.Patient;
import com.example.Assetment_Nicolas.Aguirre.Florez.Repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }
}
