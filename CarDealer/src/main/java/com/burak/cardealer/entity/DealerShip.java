/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.burak.cardealer.entity;

/**
 *
 * @author user
 */
public class DealerShip {
    
    
    private long id;
    private String companyName;
    private String country;
    private String city;

    public DealerShip(String companyName, String country, String city) {
        this.companyName = companyName;
        this.country = country;
        this.city = city;
    }

    public DealerShip(int id, String companyName, String country, String city) {
        this.id = id;
        this.companyName = companyName;
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "DealerShip{" + "id=" + id + ", companyName=" + companyName + ", country=" + country + ", city=" + city + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    
}
