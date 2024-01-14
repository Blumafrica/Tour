package com.example.tour.service;


import com.example.tour.data.models.Tour;
import com.example.tour.dtos.requests.CreateFestivalAndCarnivalRequest;
import com.example.tour.dtos.requests.CreateTourRequest;
import com.example.tour.dtos.requests.RequestForTour;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BlumaTourServiceTest {

    @Autowired
    private BlumaTourService service;

    @Test
    public void testThatTourCanBeCreated(){

        CreateTourRequest request = new CreateTourRequest();
        request.setAbout("it's our culture");
        request.setTime("8:00 am");
        request.setCity("unsss");
        request.setDay("monday");
        request.setMonth("april");
        request.setName("zuma rock tour");
        request.setState("niger");
        request.setYear("2024");
        request.setStartingDate("25 march");
        request.setEndingDate("2 april");
        request.setFiles(List.of("collect", "back"));
        Tour tour = service.create(request);
        assertNotNull(tour);

    }
    @Test
    public void testThatUserCanJoinTour(){
        RequestForTour request = new RequestForTour();
    }


}
