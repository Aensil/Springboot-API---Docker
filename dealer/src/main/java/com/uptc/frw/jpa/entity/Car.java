package com.uptc.frw.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="VEHICULOS")
public class Car {
    @Id
    @Column(name="ID_VEHICULO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="MARCA")
    private String brand;

    @Column(name="CILINDRAJE")
    private Long cc;

    @Column(name="PRECIO")
    private Double price;

    @Column(name="MODELO")
    private String model;

    @JsonIgnore
    @OneToMany(mappedBy = "car")
    private List<Bill> bill;

    public Car() {
    }

    public Car(String brand, Long cc, Double price, String model) {
        this.brand = brand;
        this.cc = cc;
        this.price = price;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getCc() {
        return cc;
    }

    public void setCc(Long cc) {
        this.cc = cc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Bill> getBill() {
        return bill;
    }

    public void setBill(List<Bill> bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", cc=" + cc +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", bill=" + bill +
                '}';
    }
}
