package com.example.Assetment_Nicolas.Aguirre.Florez.Services;

import com.example.Assetment_Nicolas.Aguirre.Florez.Models.User;
import com.example.Assetment_Nicolas.Aguirre.Florez.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
