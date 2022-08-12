package com.example.carrentalapplication.Loan;

import com.example.carrentalapplication.car.Car;
import com.example.carrentalapplication.client.Client;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Car carId;
    @OneToOne
    private Client clientId;
    private LocalDateTime beginningOfLoan;
    private LocalDateTime endOfLoan;

    public Loan(){

    }

    public Loan(Car carId, Client clientId, LocalDateTime beginningOfLoan, LocalDateTime endOfLoan){
        this.carId = carId;
        this.clientId = clientId;
        this.beginningOfLoan = beginningOfLoan;
        this.endOfLoan = endOfLoan;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Car getCarId() {
        return carId;
    }

    public void setCarId(Car carId) {
        this.carId = carId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getBeginningOfLoan() {
        return beginningOfLoan;
    }

    public void setBeginningOfLoan(LocalDateTime beginningOfLoan) {
        this.beginningOfLoan = beginningOfLoan;
    }

    public LocalDateTime getEndOfLoan() {
        return endOfLoan;
    }

    public void setEndOfLoan(LocalDateTime endOfLoan) {
        this.endOfLoan = endOfLoan;
    }
}
