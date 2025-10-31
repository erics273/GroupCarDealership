package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    //create the properties
    //ACCESS MODIFIER (public/private/protectd) DATA TYPE  NAME VARIABLE
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone){

        //this.* refers to the property on this class directly and name or whatever is what is passed in
        this.name = name;
        this.address = address;
        this.phone = phone;

        //actually create the empty list that will be the inventory
        this.inventory = new ArrayList<Vehicle>();

    }

    //our search vehicle methods to search our inventory
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }

    //should return a list of vehicles from the inventory that are of the color passed in
    public ArrayList<Vehicle> getVehiclesByColor(String color){

        //list to hold the results
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();

        //add any vehicles from our inventory that match the passed in color to the results list
        for(Vehicle currentVehicle : this.inventory){

            //only add to results if the color of the car matched the color passed into this method
            if(currentVehicle.getColor().equalsIgnoreCase(color)){
                results.add(currentVehicle);
            }

        }

        return results;

    }

    public ArrayList<Vehicle> getVehicleByMileage(int min, int max){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        //list to hold the results
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();

        //add any vehicles from our inventory that match the passed in color to the results list
        for(Vehicle currentVehicle : this.inventory){

            //only add to results if the color of the car matched the color passed into this method
            if(currentVehicle.getColor().equalsIgnoreCase(vehicleType)){
                results.add(currentVehicle);
            }

        }

        return results;
    }

    //hands back the entire list of inventory
    public ArrayList<Vehicle> getAllVehicles(){
        return this.inventory;
    }

    //puts a vehicle on the inventory list
    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }

    //will eventually remove cars from the inventory
    public void removeVehicle(Vehicle vehicle){

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " | " + address + " | " + phone;
    }
}
