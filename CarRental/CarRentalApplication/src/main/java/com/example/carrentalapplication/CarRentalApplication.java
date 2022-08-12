package com.example.carrentalapplication;

import com.example.carrentalapplication.client.ClientController;
import com.example.carrentalapplication.client.ClientRepository;
import com.example.carrentalapplication.client.ClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CarRentalApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CarRentalApplication.class, args);

    }

}
