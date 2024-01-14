package com.example.tour.data.repositories;

import com.example.tour.data.models.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TouristRepository extends JpaRepository<Tourist, Long> {

}
