package com.uptc.frw.controller;


import com.uptc.frw.jpa.entity.Client;
import com.uptc.frw.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping//GET ALL
    public List<Client> findAll(){
        return clientService.findAllClient();
    }

    @PostMapping//POST A CLIENT
    public Client saveClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @GetMapping("{id}")//GET BY ID
    public Client findClient(@PathVariable Long id){
        return clientService.findClient(id);
    }

    @DeleteMapping("/{id}")//DELETE BY ID
    public void deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
    }

    @PutMapping("/{id}")//UPDATE Phone BY ID
    public Client updatePhone(@PathVariable Long id,@RequestBody Long phone){
        return clientService.updatePhone(id, phone);
    }
}
