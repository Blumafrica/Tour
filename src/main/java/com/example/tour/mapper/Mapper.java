package com.example.tour.mapper;

import com.example.tour.data.models.CarnivalAndFestival;
import com.example.tour.data.models.Info;
import com.example.tour.data.models.Tour;
import com.example.tour.data.models.Tourist;
import com.example.tour.dtos.requests.CreateFestivalAndCarnivalRequest;
import com.example.tour.dtos.requests.CreateTourRequest;
import com.example.tour.dtos.requests.RequestForTour;
import com.example.tour.dtos.response.CarnivalMapperResponse;
import com.example.tour.dtos.response.TourMapperResponse;

public class Mapper {

    public static CarnivalMapperResponse map(CreateFestivalAndCarnivalRequest request) {
        CarnivalAndFestival carnivalAndFestival = new CarnivalAndFestival();
        carnivalAndFestival.setName(request.getName());
        carnivalAndFestival.setAbout(request.getAbout());
        carnivalAndFestival.setFilesUrl(request.getFiles());
        return new CarnivalMapperResponse(getInformation(request), carnivalAndFestival);
    }

    private static Info getInformation(CreateFestivalAndCarnivalRequest request) {
        Info info = new Info();
        info.setCity(request.getCity());
        info.setDay(request.getDay());
        info.setState(request.getState());
        info.setMonth(request.getMonth());
        info.setTime(request.getTime());
        info.setYear(request.getYear());
        info.setEndingDay(request.getEndingDay());
        info.setStartingDay(request.getStartingDay());
        return info;
    }

    public static TourMapperResponse map(CreateTourRequest request) {
        Tour tour = new Tour();
        tour.setAbout(request.getAbout());
        tour.setName(request.getName());
        tour.setFiles(request.getFiles());
        return new TourMapperResponse(tour, getTourInformation(request));
    }

    private static Info getTourInformation(CreateTourRequest request) {
        Info info = new Info();
        info.setCity(request.getCity());
        info.setDay(request.getDay());
        info.setState(request.getState());
        info.setMonth(request.getMonth());
        info.setTime(request.getTime());
        info.setYear(request.getYear());
        info.setEndingDay(request.getEndingDate());
        info.setStartingDay(request.getStartingDate());
        return info;
    }

    public static Tourist map(RequestForTour request) {
        Tourist tourist = new Tourist();
        tourist.setAllergy(request.getAllergy());
        tourist.setEmail(request.getEmail());
        tourist.setEmergencyNumber(request.getEmergencyNumber());
        tourist.setFullName(request.getFullName());
        tourist.setPhoneNumber(request.getPhoneNumber());
        return tourist;
    }
}
