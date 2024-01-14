package com.example.tour.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Day;
    private String month;
    private String year;
    private String time;
    private String State;
    private String city;
    private String startingDay;
    private String endingDay;
}
