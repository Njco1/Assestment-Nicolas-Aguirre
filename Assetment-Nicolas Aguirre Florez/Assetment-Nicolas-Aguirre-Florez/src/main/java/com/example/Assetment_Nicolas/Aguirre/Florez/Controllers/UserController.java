package com.example.Assetment_Nicolas.Aguirre.Florez.Controllers;

import com.example.Assetment_Nicolas.Aguirre.Florez.Models.User;
import com.example.Assetment_Nicolas.Aguirre.Florez.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/register")
    public String register(User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }
}
