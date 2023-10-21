package com.uptc.frw.jpa.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="VEHICULOS_USADOS")
public class UseCar {
    @Id
    @Column(name="ID_CESION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="ID_CLIENTE",insertable = false, updatable = false)
    private Long idClient;

    @Column(name="MARCA")
    private String brand;

    @Column(name="CILINDRAJE")
    private Long cc;

    @Column(name="PRECIO_TASACION")
    private Double priceTaken;

    @Column(name="MODELO")
    private String model;
    @Column(name="FECHA")
    private Date date;

    @JsonIgnore
    @OneToMany(mappedBy = "useCar")
    private List<Bill> bill;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="ID_CLIENTE",nullable = false)
    private Client client;

    public UseCar() {
    }

    public UseCar(Client client,String brand, Long cc, Double priceTaken, String model, Date date) {
        this.client = client;
        this.brand = brand;
        this.cc = cc;
        this.priceTaken = priceTaken;
        this.model = model;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
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

    public Double getPriceTaken() {
        return priceTaken;
    }

    public void setPriceTaken(Double priceTaken) {
        this.priceTaken = priceTaken;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Bill> getBill() {
        return bill;
    }

    public void setBill(List<Bill> bill) {
        this.bill = bill;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "UseCar{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", brand='" + brand + '\'' +
                ", cc=" + cc +
                ", priceTaken=" + priceTaken +
                ", model='" + model + '\'' +
                ", date=" + date +
                ", bill=" + bill +
                ", client=" + client +
                '}';
    }
}
