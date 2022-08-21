/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.burak.cardealer.entity;

/**
 *
 * @author user
 */
public class Car {
    
    private long id;
    private String brand;
    private String carModel;
    private long modelYear;
    private long dealerShipId;

    
    
    public Car() {
    }

    public Car(String brand, String carModel, long modelYear,long dealerShipId) {
        this.brand = brand;
        this.carModel = carModel;
        this.modelYear = modelYear;
        this.dealerShipId = dealerShipId;
    }

    public Car(long id, String brand, String carModel, long modelYear, long dealerShipId) {
        this.id = id;
        this.brand = brand;
        this.carModel = carModel;
        this.modelYear = modelYear;
        this.dealerShipId = dealerShipId;
    }

   

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", brand=" + brand + ", carModel=" + carModel + ", modelYear=" + modelYear + ", dealerShipId=" + dealerShipId + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public long getModelYear() {
        return modelYear;
    }

    public void setModelYear(long modelYear) {
        this.modelYear = modelYear;
    }

    public long getDealerShipId() {
        return dealerShipId;
    }

    public void setDealerShipId(long dealerShipId) {
        this.dealerShipId = dealerShipId;
    }

    
}
