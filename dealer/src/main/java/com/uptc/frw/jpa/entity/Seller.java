package com.uptc.frw.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="VENDEDORES")
public class Seller {
    @Id
    @Column(name = "ID_VENDEDOR")
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
    @OneToMany(mappedBy = "seller")
    private List<Bill> bill;

    public Seller() {
    }

    public Seller(String name, String nit, String address, Long phone) {
        this.name = name;
        this.nit = nit;
        this.address = address;
        this.phone = phone;
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

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nit='" + nit + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", bill=" + bill +
                '}';
    }
}