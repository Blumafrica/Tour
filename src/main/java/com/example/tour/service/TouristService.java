package com.example.tour.service;

import com.example.tour.data.models.Tourist;
import com.example.tour.dtos.requests.RequestForTour;
import org.springframework.stereotype.Service;

@Service
public interface TouristService  {

    Tourist createTourist(RequestForTour request);

}
