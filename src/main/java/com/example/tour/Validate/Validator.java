package com.example.tour.Validate;

import com.example.tour.data.models.Tour;
import com.example.tour.data.repositories.TourRepository;
import com.example.tour.dtos.requests.RequestForTour;
import com.example.tour.exception.TourException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class Validator {

    private final   TourRepository tourRepository;

    public  void validateTourRequest(RequestForTour request) throws TourException {
        String tourId = request.getTourId();
        Tour foundTour = tourRepository.findTourById(Long.valueOf(tourId));
        if (foundTour == null)
            throw new TourException("tour with this id " + request.getTourId() + " does not exist");

    }
}
