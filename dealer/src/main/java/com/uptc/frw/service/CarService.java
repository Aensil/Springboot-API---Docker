package com.uptc.frw.service;

import com.uptc.frw.jpa.entity.Car;
import com.uptc.frw.jpa.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> findAllCar(){
        return carRepository.findAll();
    }

    public Car saveCar(Car car){
        return carRepository.save(car);
    }

    public Car findCar(Long id){
        return carRepository.findById(id).get();
    }

    public void deleteCar(Long id){
        carRepository.deleteById(id);
    }

    public Car updatePrice(Long id,Double price){
        Car car = findCar(id);
        car.setPrice(price);
        return saveCar(car);
    }
}
