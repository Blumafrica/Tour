package com.example.tour.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "tour")
@Setter
@Getter
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne
    private Info info;
    private String about;
    @ElementCollection
    private List<String> files;

}
