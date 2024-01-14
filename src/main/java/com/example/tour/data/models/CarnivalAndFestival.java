package com.example.tour.data.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "carnivalAndFestival")
@Setter
@Getter
public class CarnivalAndFestival {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String about;
    private String name;
    @OneToOne
    private Info information;
    @ElementCollection
    private List<String> filesUrl;


}
