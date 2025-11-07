package com.ylg.backend.models;

import jakarta.persistence.*;


@Entity
public class QuoteRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    private String customerName;
    private String email;
    private String phone;
    private String address;
    private String propertyType;
    private String notes;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    //constructor
    public QuoteRequest() {};

    public QuoteRequest(String customerName, String email, String phone, String address, String propertyType, String notes) {
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.propertyType = propertyType;
        this.notes = notes;
    }

    //Getters and Setters
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
