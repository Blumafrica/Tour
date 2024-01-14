package com.example.tour.service;

import com.example.tour.data.models.CarnivalAndFestival;
import com.example.tour.data.models.Info;
import com.example.tour.data.repositories.CarnivalAndFestivalRepository;
import com.example.tour.data.repositories.InfoRepository;
import com.example.tour.dtos.requests.CreateFestivalAndCarnivalRequest;
import com.example.tour.dtos.response.CarnivalMapperResponse;
import com.example.tour.mapper.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BlumaCarnivalAndFestivalService implements CarnivalAndFestivalService{

    private final CarnivalAndFestivalRepository carnivalAndFestivalRepository;
    private final InfoRepository infoRepository;

    @Override
    public CarnivalAndFestival create(CreateFestivalAndCarnivalRequest request) {
        CarnivalMapperResponse response = Mapper.map(request);
        Info info = response.getInfo();
        CarnivalAndFestival carnivalAndFestival = response.getCarnivalAndFestival();
        Info savedInfo = infoRepository.save(info);
        carnivalAndFestival.setInformation(savedInfo);
        return carnivalAndFestivalRepository.save(carnivalAndFestival);
    }
}
