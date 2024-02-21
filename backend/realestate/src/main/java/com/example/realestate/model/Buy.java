package com.example.realestate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Buy {
    @Id
    private int propertyId;
    private String propertyType;
    private String propertyPlace;
    private int bhk;
    private double amount;
    private String ownerName;
    private String ownerNumber;
    public Buy() {
    }
    public Buy(int propertyId, String propertyType, String propertyPlace, int bHK, double amount, String ownerName,
            String ownerNumber) {
        this.propertyId = propertyId;
        this.propertyType = propertyType;
        this.propertyPlace = propertyPlace;
        this.bhk = bHK;
        this.amount = amount;
        this.ownerName = ownerName;
        this.ownerNumber = ownerNumber;
    }
    public int getPropertyId() {
        return propertyId;
    }
    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }
    public String getPropertyType() {
        return propertyType;
    }
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
    public String getPropertyPlace() {
        return propertyPlace;
    }
    public void setPropertyPlace(String propertyPlace) {
        this.propertyPlace = propertyPlace;
    }
    public int getBHK() {
        return bhk;
    }
    public void setBHK(int bHK) {
        bhk = bHK;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerNumber() {
        return ownerNumber;
    }
    public void setOwnerNumber(String ownerNumber) {
        this.ownerNumber = ownerNumber;
    }
    
}
