package com.example.Assetment_Nicolas.Aguirre.Florez.Controllers;

import com.example.Assetment_Nicolas.Aguirre.Florez.Models.Appointment;
import com.example.Assetment_Nicolas.Aguirre.Florez.Services.AppointmentService;
import com.example.Assetment_Nicolas.Aguirre.Florez.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/appointments")
    public String getAppointments(Model model) {
        List<Appointment> appointments = appointmentService.getAllAppointments();
        model.addAttribute("appointments", appointments);
        model.addAttribute("doctors", doctorService.getAllDoctors());
        return "appointments";
    }

    @PostMapping("/appointments")
    public String createAppointment(@ModelAttribute Appointment appointment) {
        appointmentService.createAppointment(appointment);
        return "redirect:/appointments";
    }
}
