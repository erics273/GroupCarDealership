package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class DealershipFileManager {

    private final String FILE_PATH = "src/main/resources/inventory.csv";

    public Dealership getDealership(){

        try {
          //  try all this stuff  and if it fails do the stuff in the catch block
            //create a Buffered Reader
            BufferedReader inventoryReader = new BufferedReader( new FileReader(FILE_PATH) );

            //this reads the first line of the csv
            String dealershipInfo = inventoryReader.readLine();

            String[] dealershipParts = dealershipInfo.split("\\|");



        } catch (IOException e) {
          //  do this stuff if the stuff in the try fails
            System.out.println("something went wrong " + e.getMessage());
            System.exit(0);

        }

        return null;
//
    }

    //saves the dealership to the csv
    public void saveDealership(Dealership dealership){

    }

}
