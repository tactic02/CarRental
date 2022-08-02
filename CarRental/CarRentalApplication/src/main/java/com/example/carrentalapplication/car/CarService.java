package com.example.carrentalapplication.car;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class CarService {
    private final CarRepository carRepository;
    private final CarDtoMapper carDtoMapper;

    public CarService(CarRepository carRepository, CarDtoMapper carDtoMapper){
        this.carRepository = carRepository;
        this.carDtoMapper = carDtoMapper;
    }

    protected List<CarDto> findCarByModel(String model){
        List<Car> cars = StreamSupport.stream(carRepository.findAll().spliterator(), false).toList();

        return cars.stream().filter(car -> car.getModel().equals(model))
                .map(carDtoMapper::map)
                .collect(Collectors.toList());
    }

    protected List<CarDto> findAllCarYoungerThan(int year){
        List<Car> cars = StreamSupport.stream(carRepository.findAll().spliterator(), false).toList();

        return cars.stream().filter(car -> car.getYearOfRelease() > year)
                .map(carDtoMapper::map)
                .collect(Collectors.toList());
    }

    protected List<CarDto> findAllCarOlderThan(int year){
        List<Car> cars = StreamSupport.stream(carRepository.findAll().spliterator(), false).toList();

        return cars.stream().
                filter(car -> year > car.getYearOfRelease())
                .map(carDtoMapper::map)
                .collect(Collectors.toList());
    }

    protected Optional<CarDto> findCar(long id){
        return carRepository.findById(id)
                .map(carDtoMapper::map);
    }

    protected List<CarDto> findAllNotBorrowedCar(){
        List<Car> cars = StreamSupport.stream(carRepository.findAll().spliterator(), false).toList();

        return cars.stream()
                .filter(car -> car.getStartTimeOfBorrowed() == null)
                .map(carDtoMapper::map)
                .collect(Collectors.toList());
    }


}
