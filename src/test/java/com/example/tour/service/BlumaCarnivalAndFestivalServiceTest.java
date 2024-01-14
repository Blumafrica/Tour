package com.example.tour.service;

import com.example.tour.data.models.CarnivalAndFestival;
import com.example.tour.dtos.requests.CreateFestivalAndCarnivalRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BlumaCarnivalAndFestivalServiceTest {

    @Autowired
    private CarnivalAndFestivalService service;

    @Test
    public void testThatFestivalAndCarnivalCanBeCreated(){
        CreateFestivalAndCarnivalRequest request = new CreateFestivalAndCarnivalRequest();
        request.setAbout("it's our culture");
        request.setTime("8:00 am");
        request.setCity("ebutte metta");
        request.setDay("monday");
        request.setMonth("april");
        request.setName("ogun festival");
        request.setState("oyo state");
        request.setYear("2024");
        request.setStreet("8 moss street");
        request.setFiles(List.of("collect", "back"));
        request.setEndingDay("april 1");
        request.setEndingDay("march 29");
        CarnivalAndFestival response = service.create(request);
        assertNotNull(response);
        assertNotNull(response.getInformation());

    }

}