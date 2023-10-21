package com.uptc.frw.controller;

import com.uptc.frw.jpa.entity.Car;
import com.uptc.frw.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping//GET ALL
    public List<Car> findAll(){
        return carService.findAllCar();
    }

    @PostMapping//POST A CAR
    public Car saveCar(@RequestBody Car car){
        return carService.saveCar(car);
    }

    @GetMapping("{id}")//GET BY ID
    public Car findCar(@PathVariable Long id){
        return carService.findCar(id);
    }

    @DeleteMapping("/{id}")//DELETE BY ID
    public void deleteCar(@PathVariable Long id){
        carService.deleteCar(id);
    }

    @PutMapping("/{id}")//UPDATE PRICE BY ID
    public Car updatePrice(@PathVariable Long id,@RequestBody Double price){
        return carService.updatePrice(id,price);
    }
}
