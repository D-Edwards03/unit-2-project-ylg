package com.ylg.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ServiceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceTypeID;

    private String name;
    private String description;
    private Double basePrice;

    //Constructor
    private ServiceType() {};

    public ServiceType(String name, String description, Double basePrice) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
    }

    //Getters and setters
    public Long getServiceTypeID() {
        return serviceTypeID;
    }

    public void setServiceTypeID(Long serviceTypeID) {
        this.serviceTypeID = serviceTypeID;
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

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }
}
