package com.example.carrentalapplication.client;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findAllByCity(String city);

    Optional<Client> findClientByEmail(String email);

    @Query("SELECT c.address, c.city, c.currentCar, c.email, c.firstName, c.lastName FROM Client c")
    List<Client> findAllClient();
}
