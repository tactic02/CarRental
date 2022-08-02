package com.example.carrentalapplication.car;

import com.example.carrentalapplication.client.Client;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class CarDto {
    private Long id;
    private String brand;
    private int kilometersTraveled;
    private String model;
    private int yearOfRelease;
    private int carBorrowedId;
    private LocalDateTime startTimeOfBorrowed;
    private LocalDateTime endTimeOfBorrowed;
    private int rentalPriceFor1Day;
    private List<Client> previousClients;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometersTraveled() {
        return kilometersTraveled;
    }

    public void setKilometersTraveled(int kilometersTraveled) {
        this.kilometersTraveled = kilometersTraveled;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getCarBorrowedId() {
        return carBorrowedId;
    }

    public void setCarBorrowedId(int carBorrowedId) {
        this.carBorrowedId = carBorrowedId;
    }

    public LocalDateTime getStartTimeOfBorrowed() {
        return startTimeOfBorrowed;
    }

    public void setStartTimeOfBorrowed(LocalDateTime startTimeOfBorrowed) {
        this.startTimeOfBorrowed = startTimeOfBorrowed;
    }

    public LocalDateTime getEndTimeOfBorrowed() {
        return endTimeOfBorrowed;
    }

    public void setEndTimeOfBorrowed(LocalDateTime endTimeOfBorrowed) {
        this.endTimeOfBorrowed = endTimeOfBorrowed;
    }

    public int getRentalPriceFor1Day() {
        return rentalPriceFor1Day;
    }

    public void setRentalPriceFor1Day(int rentalPriceFor1Day) {
        this.rentalPriceFor1Day = rentalPriceFor1Day;
    }

    public List<Client> getPreviousClients() {
        return previousClients;
    }

    public void setPreviousClients(List<Client> previousClients) {
        this.previousClients = previousClients;
    }
}
