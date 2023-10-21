package com.uptc.frw.service;

import com.uptc.frw.jpa.entity.Client;
import com.uptc.frw.jpa.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAllClient(){
        return clientRepository.findAll();
    }

    public Client saveClient(Client client){
        return clientRepository.save(client);
    }

    public Client findClient(Long id){
        return clientRepository.findById(id).get();
    }

    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }

    public Client updatePhone(Long id,Long phone){
        Client client = findClient(id);
        client.setPhone(phone);
        return saveClient(client);
    }
}
