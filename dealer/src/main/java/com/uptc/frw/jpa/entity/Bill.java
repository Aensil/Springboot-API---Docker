package com.uptc.frw.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="VENTAS")
public class Bill {
    @Id
    @Column(name = "ID_VENTAS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_CLIENTES",insertable = false, updatable = false)
    private Long idClient;

    @Column(name = "ID_VENDEDOR",insertable = false, updatable = false)
    private Long idSeller;

    @Column(name = "ID_VEHICULO",insertable = false, updatable = false)
    private Long idCar;

    @Column(name = "ID_CESION",insertable = false, updatable = false)
    private Long idCarRecieve;

    @Column(name = "FECHA")
    private Date date;

    @Column(name = "PRECIO_VENTA")
    private Double totalPrice;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="ID_CLIENTES",nullable = false)
    private Client client;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="ID_VENDEDOR",nullable = false)
    private Seller seller;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="ID_VEHICULO",nullable = false)
    private Car car;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="ID_CESION",nullable = false)
    private UseCar useCar;

    @JsonIgnore
    @OneToMany(mappedBy = "bill")
    private List<AllOptions> allOptions;

    public Bill() {
    }

    public Bill(Client client, Seller seller, Car car, UseCar useCar,Date date, Double totalPrice) {
        this.client = client;
        this.seller = seller;
        this.car = car;
        this.useCar = useCar;
        this.date = date;
        this.totalPrice = totalPrice;
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

    public Long getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(Long idSeller) {
        this.idSeller = idSeller;
    }

    public Long getIdCar() {
        return idCar;
    }

    public void setIdCar(Long idCar) {
        this.idCar = idCar;
    }

    public Long getIdCarRecieve() {
        return idCarRecieve;
    }

    public void setIdCarRecieve(Long idCarRecieve) {
        this.idCarRecieve = idCarRecieve;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public UseCar getUseCar() {
        return useCar;
    }

    public void setUseCar(UseCar useCar) {
        this.useCar = useCar;
    }

    public List<AllOptions> getAllOptions() {
        return allOptions;
    }

    public void setAllOptions(List<AllOptions> allOptions) {
        this.allOptions = allOptions;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", idSeller=" + idSeller +
                ", idCar=" + idCar +
                ", idCarRecieve=" + idCarRecieve +
                ", date=" + date +
                ", totalPrice=" + totalPrice +
                ", client=" + client +
                ", seller=" + seller +
                ", car=" + car +
                ", useCar=" + useCar +
                ", allOptions=" + allOptions +
                '}';
    }
}
