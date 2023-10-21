package com.uptc.frw.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="CLIENTE")
public class Client {
    @Id
    @Column(name = "ID_CLIENTE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOMBRE")
    private String name;

    @Column(name = "CEDULA")
    private String nit;

    @Column(name = "DIRECCION")
    private String  address;

    @Column(name = "TELEFONO")
    private Long phone;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Bill> bill;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<UseCar> useCar;

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public List<Bill> getBill() {
        return bill;
    }

    public void setBill(List<Bill> bill) {
        this.bill = bill;
    }

    public List<UseCar> getUseCar() {
        return useCar;
    }

    public void setUseCar(List<UseCar> useCar) {
        this.useCar = useCar;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nit='" + nit + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", bill=" + bill +
                ", useCar=" + useCar +
                '}';
    }
}
