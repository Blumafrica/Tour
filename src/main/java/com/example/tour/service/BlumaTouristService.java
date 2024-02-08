package com.example.tour.service;


import com.example.tour.data.models.Tourist;
import com.example.tour.data.repositories.TourRepository;
import com.example.tour.data.repositories.TouristRepository;
import com.example.tour.dtos.requests.RequestForTour;
import com.example.tour.mapper.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BlumaTouristService implements TouristService{

    private final TouristRepository touristRepository;


    @Override
    public Tourist createTourist(RequestForTour request) {
        Tourist tourist = Mapper.map(request);
        return touristRepository.save(tourist);
    }
}
