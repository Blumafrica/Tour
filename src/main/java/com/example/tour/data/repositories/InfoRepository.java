package com.example.tour.data.repositories;

import com.example.tour.data.models.Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<Info, Long> {
}
