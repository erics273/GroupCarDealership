package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class DealershipFileManager {

    //class property/field to help us know the path of the csv
    private final String FILE_PATH = "src/main/resources/inventory.csv";

    //responsible for reading the csv
    //pulling the delaership data from the first line of the csv
    //splitting at the "|" to get the different parts (name, address, phone)
    //create the dealerhip from those parts

    //NOT DONE YET
    //then we process the rest of the csv using a loop to create vehicles
    //we add the created vehicles one at a time in the loop to the dealership
    public Dealership getDealership(){

        // i want to be able to work with my dealership outside of the try catch
        Dealership theDealership = null;

        try {
          //  try all this stuff  and if it fails do the stuff in the catch block
            //create a Buffered Reader
            BufferedReader inventoryReader = new BufferedReader( new FileReader(FILE_PATH) );

            //this reads the first line of the csv
            String dealershipInfo = inventoryReader.readLine(); //Eric's House of Cars|27 South Rainy Street|828-443-3448

            //splits the dealershipInfo into the individual pieces based on the |
            //it stores the values in an array called dealershipParts
            String[] dealershipParts = dealershipInfo.split("\\|");//Eric's House of Cars|27 South Rainy Street|828-443-3448

            //create a dealership out of the parts
            theDealership = new Dealership(dealershipParts[0], dealershipParts[1], dealershipParts[2]);

            //loop over the rest of the lines in the file and create vehicles and add them to the dealership inventory
            String vehicleInfo;
            while( (vehicleInfo = inventoryReader.readLine()) != null){
                //process each vehicle that we find
                String[] vehicleParts = vehicleInfo.split("\\|");

                //lets go ahead and deal with the different parts
                int vin = Integer.parseInt( vehicleParts[0] ); //10112|1993|Ford|Explorer|SUV|Red|525123|995.00
                int year = Integer.parseInt( vehicleParts[1] );
                String make = vehicleParts[2];
                String model = vehicleParts[3];
                String vehicleType = vehicleParts[4];
                String color = vehicleParts[5];
                int odometer = Integer.parseInt(vehicleParts[6]);
                double price = Double.parseDouble(vehicleParts[7]);

                //create a vehicle
                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

                //add it to the inventory of the dealership
                theDealership.addVehicle(vehicle);

            }

            //close the reader
            inventoryReader.close();


        } catch (IOException e) {

          //  do this stuff if the stuff in the try fails
            System.out.println("something went wrong " + e.getMessage());
            System.exit(0);

        }

        return theDealership;
//
    }

    //saves the dealership to the csv
    public void saveDealership(Dealership dealership){

    }

}
