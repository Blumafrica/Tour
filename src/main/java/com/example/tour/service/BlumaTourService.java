package com.example.tour.service;

import com.example.tour.Validate.Validator;
import com.example.tour.data.models.Info;
import com.example.tour.data.models.Tour;
import com.example.tour.data.models.Tourist;
import com.example.tour.data.repositories.InfoRepository;
import com.example.tour.data.repositories.TourRepository;
import com.example.tour.dtos.requests.CreateTourRequest;
import com.example.tour.dtos.requests.RequestForTour;
import com.example.tour.dtos.response.TourMapperResponse;
import com.example.tour.exception.TourException;
import com.example.tour.mapper.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BlumaTourService implements TourService{

    private final TourRepository repository;
    private final InfoRepository infoRepository;
    private final Validator validator;
    private final TouristService touristService;
    @Override
    public Tour create(CreateTourRequest request) {
        TourMapperResponse response = Mapper.map(request);
        Tour tour = response.getTour();
        Info savedInfo = infoRepository.save(response.getTourInfo());
        tour.setInfo(savedInfo);
        return repository.save(tour);
    }

    @Override
    public Tourist requestTour(RequestForTour request) throws TourException {
         validator.validateTourRequest(request);
        return touristService.createTourist(request);

    }
}
