package com.example.tour.controllers;

import com.example.tour.data.models.CarnivalAndFestival;
import com.example.tour.dtos.requests.CreateFestivalAndCarnivalRequest;
import com.example.tour.service.CarnivalAndFestivalService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@AllArgsConstructor
public class CarnivalAndFestivalController {

    private final CarnivalAndFestivalService service;

    @PostMapping("/api/v1/create/")
    public ResponseEntity<?> create(@RequestBody CreateFestivalAndCarnivalRequest request){

        CarnivalAndFestival response = service.create(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


}
