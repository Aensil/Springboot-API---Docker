package com.uptc.frw.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "OPC_ADICIONALES")
public class AditionalOption {
    @Id
    @Column(name = "ID_OPCION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOMBRE")
    private String name;

    @Column(name = "DESCRIPCION")
    private String description;

    @Column(name = "PRECIO_OPCION")
    private Double priceOption;

    @JsonIgnore
    @OneToMany(mappedBy = "aditionalOption")
    private List<AllOptions> allOptions;

    public AditionalOption() {
    }

    public AditionalOption(String name, String description, Double priceOption) {
        this.name = name;
        this.description = description;
        this.priceOption = priceOption;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPriceOption() {
        return priceOption;
    }

    public void setPriceOption(Double priceOption) {
        this.priceOption = priceOption;
    }

    public List<AllOptions> getAllOptions() {
        return allOptions;
    }

    public void setAllOptions(List<AllOptions> allOptions) {
        this.allOptions = allOptions;
    }

    @Override
    public String toString() {
        return "AditionalOption{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceOption='" + priceOption + '\'' +
                ", allOptions=" + allOptions +
                '}';
    }
}
