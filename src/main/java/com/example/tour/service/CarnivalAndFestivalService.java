package com.example.tour.service;

import com.example.tour.data.models.CarnivalAndFestival;
import com.example.tour.dtos.requests.CreateFestivalAndCarnivalRequest;
import org.springframework.stereotype.Service;

@Service
public interface CarnivalAndFestivalService {
    CarnivalAndFestival create(CreateFestivalAndCarnivalRequest request);
}
