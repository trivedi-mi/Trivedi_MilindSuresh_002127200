/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Milind
 */
public class UberCarList {
    
    
    private ArrayList<UberCar> carList;

    
    private Date currentDate;
    
    public UberCarList(){
        
        this.carList = new ArrayList<>();
        
        UberCar car1 = new UberCar("Ferrari", 2019, 1, 2, "1767R","Z46", "Boston", true, false);
        UberCar car2 = new UberCar("BMW", 2019, 1, 4, "UHH29R", "X1", "New York", true,true);
        UberCar car3 = new UberCar("Toyota", 2018, 1, 4, "3JJ8787", "T1", "Boston", true,false);
        UberCar car4 = new UberCar("Ferrari", 2019, 1, 2, "1767J","UY2", "Boston", true, false);
        UberCar car5 = new UberCar("BMW", 2019, 1, 4, "UHH27", "X1", "New York", true,true);
        UberCar car6 = new UberCar("Toyota", 2018, 1, 4, "3JJ8789", "T1", "Boston", true,false);
        
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        
        
    }
    
    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
    
    public ArrayList<UberCar> getCarList() {
        return carList;
    }

    //Array for Uber Cars
    public void setCarList(ArrayList<UberCar> carList) {
        this.carList = carList;
    }
    
    public UberCar addCar(String brand, int manufacturedYear, int minSeats, int maxSeats, String serialNumber, String modelNumber, String availableCity, boolean maintenanceCertificate, boolean available){
        UberCar car = new UberCar(brand,manufacturedYear,minSeats, maxSeats, serialNumber,  modelNumber,  availableCity, maintenanceCertificate,  available);
        carList.add(car);
        return car;
    }
    
    public void deleteCar(UberCar car){
        carList.remove(car);
    }
    
    public UberCar searchCarSerialNum(String serialNum){
        for (UberCar car: carList){
            System.out.println(car.getSerialNumber());
            System.out.println(serialNum);
            
            if(car.getSerialNumber().equals(serialNum)){
                System.out.println("Inside if" + serialNum );
                return car;
            }
        }
        return null;
    }   
    
    
    
}
