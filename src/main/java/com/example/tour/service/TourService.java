package com.example.tour.service;

import com.example.tour.data.models.Tour;
import com.example.tour.data.models.Tourist;
import com.example.tour.dtos.requests.CreateTourRequest;
import com.example.tour.dtos.requests.RequestForTour;
import com.example.tour.exception.TourException;
import org.springframework.stereotype.Service;


@Service
public interface TourService {

    Tour create(CreateTourRequest request);

    Tourist requestTour(RequestForTour request) throws TourException;
}
