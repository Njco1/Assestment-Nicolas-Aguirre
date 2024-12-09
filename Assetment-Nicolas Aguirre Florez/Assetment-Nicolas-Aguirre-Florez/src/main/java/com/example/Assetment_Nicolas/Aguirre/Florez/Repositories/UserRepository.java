package com.example.Assetment_Nicolas.Aguirre.Florez.Repositories;
import com.example.Assetment_Nicolas.Aguirre.Florez.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
