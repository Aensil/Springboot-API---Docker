package com.uptc.frw.controller;

import com.uptc.frw.jpa.entity.UseCar;
import com.uptc.frw.service.UseCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usecar")
public class UseCarController {
    @Autowired
    private UseCarService useCarService;

    @GetMapping//GET ALL
    public List<UseCar> findAllUseCar(){
        return useCarService.findAllUseCar();
    }

    @PostMapping//POST A USE CAR
    public UseCar saveUseCar(@RequestBody UseCar useCar){
        return useCarService.saveUseCar(useCar);
    }

    @GetMapping("{id}")//GET BY ID
    public UseCar findUseCar(@PathVariable Long id){
        return useCarService.findUseCar(id);
    }

    @DeleteMapping("/{id}")//DELETE BY ID
    public void deleteUseCar(@PathVariable Long id){
        useCarService.deleteUseCar(id);
    }

    @PutMapping("/{id}")//UPDATE PRICE BY ID
    public UseCar updatePrice(@PathVariable Long id,@RequestBody Double price){
        return useCarService.updatePrice(id, price);
    }
}
