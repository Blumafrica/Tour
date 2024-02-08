package com.example.tour.dtos.requests;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RequestForTour {


    private String fullName;
    private String phoneNumber;
    private String email;
    private String emergencyNumber;
    private String allergy;
    private String tourId;
}
