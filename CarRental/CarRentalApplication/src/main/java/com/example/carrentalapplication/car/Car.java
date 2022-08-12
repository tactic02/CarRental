package com.example.carrentalapplication.car;

import com.example.carrentalapplication.Loan.Loan;
import com.example.carrentalapplication.client.Client;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 3, max = 50)
    private String brand;
    @NotNull
    @Max(1000000)
    @Min(0)
    private int kilometersTraveled;
    @Size(min = 3, max = 50)
    private String model;
    @Min(1900)
    @Max(2022)
    private int yearOfRelease;
    private int carBorrowedId;
    private LocalDateTime startTimeOfBorrowed;
    private LocalDateTime endTimeOfBorrowed;
    @NotNull
    private int rentalPriceFor1Day;
    @NotNull
    private int dailyPenalty;
    @ManyToMany(mappedBy = "previousCarsFromThisCarRental")
    private List<Client> previousClients = new ArrayList<>();
    @OneToMany
    public List<Loan> storyOfLoanForCar = new ArrayList<>();

    public Car(){

    }

    public Car(String brand, int kilometersTraveled, String model, int yearOfRelease, int rentalPriceFor1Day, int dailyPenalty){
        this.brand = brand;
        this.kilometersTraveled = kilometersTraveled;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.rentalPriceFor1Day = rentalPriceFor1Day;
        this.dailyPenalty = dailyPenalty;
    }

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

    public int getDailyPenalty() {
        return dailyPenalty;
    }

    public void setDailyPenalty(int dailyPenalty) {
        this.dailyPenalty = dailyPenalty;
    }

    public List<Client> getPreviousClients() {
        return previousClients;
    }

    public void setPreviousClients(List<Client> previousClients) {
        this.previousClients = previousClients;
    }

    public void addClient(Client client){
        previousClients.add(client);
    }

    public List<Loan> getStoryOfLoanForCar() {
        return storyOfLoanForCar;
    }

    public void setStoryOfLoanForCar(List<Loan> storyOfLoanForCar) {
        this.storyOfLoanForCar = storyOfLoanForCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", kilometersTraveled=" + kilometersTraveled +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
