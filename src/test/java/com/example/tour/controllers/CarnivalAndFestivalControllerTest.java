package com.example.tour.controllers;

import com.example.tour.dtos.requests.CreateFestivalAndCarnivalRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CarnivalAndFestivalControllerTest {

    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper objectMapper = new ObjectMapper();


    @Test
    public void testThatCarnivalAndFestivalCanBeCreated(){
        CreateFestivalAndCarnivalRequest request = new CreateFestivalAndCarnivalRequest();
        request.setAbout("yemoja");
        request.setTime("8:00 am");
        request.setCity("ebutte metta");
        request.setDay("tuesday");
        request.setMonth("april");
        request.setName("ogun festival");
        request.setState("lagos state");
        request.setYear("2024");
        request.setStreet("8 moss street");
        request.setFiles(List.of("C:\\Users\\mariam\\Tour\\src\\main\\resources\\templates", "C:\\Users\\mariam\\Tour\\src\\main\\resources\\static"));

        try {
            byte [] content = objectMapper.writeValueAsBytes(request);

            mockMvc.perform(post("/api/v1/create/")
                            .content(content)
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().is2xxSuccessful())
                    .andDo(print());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}