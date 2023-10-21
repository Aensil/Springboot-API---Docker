package com.uptc.frw.jpa.repository;

import com.uptc.frw.jpa.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
