package com.example.carrentalapplication.client;

import com.example.carrentalapplication.car.Car;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 5, max = 100)
    private String firstName;
    @NotNull
    @Size(min = 5, max = 100)
    private String lastName;
    @Email
    private String email;
    @ManyToMany
    private List<Car> previousCarsFromThisCarRental;
    @OneToOne
    private Car currentCar;
    @Size(min = 2, max = 100)
    private String city;
    @Size(min = 2, max = 100)
    private String address;

    public Client(){

    }
    public static class Builder{
        private final String firstName;
        private final String lastName;
        private final String email;

        private List<Car> previousCarsFromThisCarRental;
        private Car currentCar;
        private String city;
        private String address;

        public Builder(String firstName, String lastName, String email){
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public Builder setPreviousCarsFromThisCarRental(List<Car> previousCarsFromThisCarRental){
            this.previousCarsFromThisCarRental = previousCarsFromThisCarRental;
            return this;
        }

        public Builder setCurrentCar(Car currentCar){
            this.currentCar = currentCar;
            return this;
        }

        public Builder setCity(String city){
            this.city = city;
            return this;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Client build(){
            return new Client(this);
        }

    }

    private Client (Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.previousCarsFromThisCarRental = builder.previousCarsFromThisCarRental;
        this.address = builder.address;
        this.city = builder.city;
        this.currentCar = builder.currentCar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Car> getPreviousCarsFromThisCarRental() {
        return previousCarsFromThisCarRental;
    }

    public Car getCurrentCar() {
        return currentCar;
    }

    public void setCurrentCar(Car currentCar) {
        this.currentCar = currentCar;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPreviousCarsFromThisCarRental(List<Car> previousCarsFromThisCarRental) {
        this.previousCarsFromThisCarRental = previousCarsFromThisCarRental;
    }

    public void addCar(Car car){
        previousCarsFromThisCarRental.add(car);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
