package com.uptc.frw.jpa.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name="TODAS_OPCIONES")
public class AllOptions {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_VENTAS",insertable = false, updatable = false)
    private Long idSell;

    @Column(name = "ID_OPCION",insertable = false, updatable = false)
    private Long idOption;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="ID_VENTAS",nullable = false)
    private Bill bill;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="ID_OPCION",nullable = false)
    private AditionalOption aditionalOption;

    public AllOptions() {
    }

    public AllOptions(Bill bill, AditionalOption aditionalOption) {
        this.bill = bill;
        this.aditionalOption = aditionalOption;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdSell() {
        return idSell;
    }

    public void setIdSell(Long idSell) {
        this.idSell = idSell;
    }

    public Long getIdOption() {
        return idOption;
    }

    public void setIdOption(Long idOption) {
        this.idOption = idOption;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public AditionalOption getAditionalOption() {
        return aditionalOption;
    }

    public void setAditionalOption(AditionalOption aditionalOption) {
        this.aditionalOption = aditionalOption;
    }

    @Override
    public String toString() {
        return "AllOptions{" +
                "id=" + id +
                ", idSell=" + idSell +
                ", idOption=" + idOption +
                ", bill=" + bill +
                ", aditionalOption=" + aditionalOption +
                '}';
    }
}
