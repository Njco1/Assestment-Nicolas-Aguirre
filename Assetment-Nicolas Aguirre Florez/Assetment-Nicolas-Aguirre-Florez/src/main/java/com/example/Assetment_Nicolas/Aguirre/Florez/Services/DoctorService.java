package com.example.Assetment_Nicolas.Aguirre.Florez.Services;

import com.example.Assetment_Nicolas.Aguirre.Florez.Models.Doctor;
import com.example.Assetment_Nicolas.Aguirre.Florez.Repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
