package com.example.carrentalapplication.client;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    public List<Client> findAllClientByCity(String city){
        return clientService.findAllClientsByCity(city);
    }

    public Optional<Client> findClientByEmail(String email){
        return clientService.findClientByEmail(email);
    }

    public List<Client> findAlLClient(){
        return clientService.findAllClient();
    }

}
