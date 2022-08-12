package com.example.carrentalapplication.Car_client_list;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int carId;
    private int previousClientId;

    public CarClient(){

    }

    public CarClient(int carId, int clientId){
        this.carId = carId;
        this.previousClientId = clientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getPreviousClientId() {
        return previousClientId;
    }

    public void setPreviousClientId(int previousClientId) {
        this.previousClientId = previousClientId;
    }
}
