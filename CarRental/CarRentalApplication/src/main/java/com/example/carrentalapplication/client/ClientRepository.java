package com.example.carrentalapplication.client;

import com.example.carrentalapplication.car.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findAllByCity(String city);

    Optional<Client> findClientByEmail(String email);
}
