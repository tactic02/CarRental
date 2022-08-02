package com.example.carrentalapplication.car;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    public List<CarDto> findAllByModel(String model){
        return carService.findCarByModel(model);
    }

    public List<CarDto> findAllCarYoungerThan(int year){
        return carService.findAllCarYoungerThan(year);
    }

    public List<CarDto> findAllCarOlderThan(int year){
        return carService.findAllCarOlderThan(year);
    }

    public Optional<CarDto> findCar(long id){
        return carService.findCar(id);
    }
}
