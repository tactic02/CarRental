package com.example.carrentalapplication.car;

import org.springframework.stereotype.Service;

@Service
public class CarDtoMapper {
    CarDto map(Car car){
        CarDto carDto = new CarDto();
        carDto.setId(car.getId());
        carDto.setBrand(car.getBrand());
        carDto.setKilometersTraveled(car.getKilometersTraveled());
        carDto.setModel(car.getModel());
        carDto.setYearOfRelease(car.getYearOfRelease());
        carDto.setCarBorrowedId(car.getCarBorrowedId());
        carDto.setStartTimeOfBorrowed(car.getStartTimeOfBorrowed());
        carDto.setEndTimeOfBorrowed(car.getEndTimeOfBorrowed());
        carDto.setRentalPriceFor1Day(car.getRentalPriceFor1Day());
        carDto.setPreviousClients(car.getPreviousClients());
        return carDto;
    }
}
