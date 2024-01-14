package com.example.tour.service;

import com.example.tour.data.models.Tour;
import com.example.tour.dtos.requests.CreateTourRequest;

public interface TourService {

    Tour create(CreateTourRequest request);
}
