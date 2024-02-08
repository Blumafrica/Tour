package com.example.tour.service;

import com.example.tour.data.models.Admin;
import com.example.tour.data.repositories.AdminRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class PostConstruction {

    private final AdminRepository adminRepository;

    @PostConstruct
    private void createAdmin(){
        Admin admin = new Admin();
        admin.setPassword("MA202M@I");
        admin.setName("admin22");
        adminRepository.save(admin);
    }
}
