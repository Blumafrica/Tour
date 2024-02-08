package com.example.tour.controllers;

import com.example.tour.dtos.requests.CreateTourRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
public class TourControllersTests {

    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper = new ObjectMapper();


    @Test
    public void testThatAdminCanCreateTour(){
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
        request.setAdminId("1");

        try {
            byte [] content = mapper.writeValueAsBytes(request);

            mockMvc.perform(post("/api/v1/create"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
