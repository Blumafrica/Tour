package com.example.tour.dtos.response;

import com.example.tour.data.models.Info;
import com.example.tour.data.models.Tour;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TourMapperResponse {

    private Tour tour;
    private Info tourInfo;
}
