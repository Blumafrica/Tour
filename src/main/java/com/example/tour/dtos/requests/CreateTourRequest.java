package com.example.tour.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CreateTourRequest {

    private String name;
    private String about;
    private List<String> files;
    private String day;
    private String month;
    private String year;
    private String time;
    private String State;
    private String city;
    private String startingDate;
    private String endingDate;
    private String adminId;
}
