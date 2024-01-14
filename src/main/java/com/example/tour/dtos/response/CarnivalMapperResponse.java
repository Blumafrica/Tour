package com.example.tour.dtos.response;


import com.example.tour.data.models.CarnivalAndFestival;
import com.example.tour.data.models.Info;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CarnivalMapperResponse {
    private Info info;
    private CarnivalAndFestival carnivalAndFestival;
}
