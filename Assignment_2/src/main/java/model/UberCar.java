/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Milind
 */
public class UberCar {
    
    private String brand;
    private int manufacturedYear;
    private int minSeats;
    private int maxSeats;
    private String serialNumber;
    private String modelNumber;
    private String availableCity;
    private boolean maintenanceCertificate;
    private boolean available;

    public UberCar(String brand, int manufacturedYear, int minSeats, int maxSeats, String serialNumber, String modelNumber, String availableCity, boolean maintenanceCertificate, boolean available) {
        this.brand = brand;
        this.manufacturedYear = manufacturedYear;
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.availableCity = availableCity;
        this.maintenanceCertificate = maintenanceCertificate;
        this.available = available;
    }
    
    

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public int getMinSeats() {
        return minSeats;
    }

    public void setMinSeats(int minSeats) {
        this.minSeats = minSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getAvailableCity() {
        return availableCity;
    }

    public void setAvailableCity(String availableCity) {
        this.availableCity = availableCity;
    }

    public boolean isMaintenanceCertificate() {
        return maintenanceCertificate;
    }

    public void setMaintenanceCertificate(boolean maintenanceCertificate) {
        this.maintenanceCertificate = maintenanceCertificate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    @Override
    public String toString(){
       return this.getBrand();
             
    }
    
    
    
    
}
