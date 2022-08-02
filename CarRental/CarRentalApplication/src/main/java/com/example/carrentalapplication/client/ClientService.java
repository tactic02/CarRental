package com.example.carrentalapplication.client;

import com.example.carrentalapplication.car.Car;
import com.example.carrentalapplication.car.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public List<Client> findAllClientsByCity(String city){
        return clientRepository.findAllByCity(city);
    }

    public Optional<Client> findClientByEmail(String email){
        return clientRepository.findClientByEmail(email);
    }





}
