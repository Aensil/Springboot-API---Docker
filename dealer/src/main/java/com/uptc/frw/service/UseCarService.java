package com.uptc.frw.service;

import com.uptc.frw.jpa.entity.Bill;
import com.uptc.frw.jpa.entity.Client;
import com.uptc.frw.jpa.entity.UseCar;
import com.uptc.frw.jpa.repository.UseCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseCarService {
    @Autowired
    private UseCarRepository useCarRepository;

    @Autowired
    private ClientService clientService;

    public List<UseCar> findAllUseCar(){
        return useCarRepository.findAll();
    }
    public UseCar saveUseCar(UseCar useCar){
        Client client = clientService.findClient(useCar.getIdClient());
        useCar.setClient(client);
        return useCarRepository.save(useCar);
    }

    public UseCar findUseCar(Long id){
        return useCarRepository.findById(id).get();
    }

    public void deleteUseCar(Long id){
        useCarRepository.deleteById(id);
    }

    public UseCar updatePrice(Long id,Double price){
        UseCar useCar = findUseCar(id);
        useCar.setPriceTaken(price);
        return saveUseCar(useCar);
    }
}
