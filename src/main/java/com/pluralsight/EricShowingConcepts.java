package com.pluralsight;

import java.util.ArrayList;

public class EricShowingConcepts {

    public static void main(String[] args) {
        Dealership myAwesomeCarDealershipWHereWeDOntRipPeopleOff = new Dealership("Erics Autorama", "123 fake street", "555-555-555");

//       ArrayList<Vehicle> someRandomInventory = new ArrayList<Vehicle>();
//
//       Vehicle vehicle1 = new Vehicle();
//        Vehicle vehicle2 = new Vehicle();
//
//        someRandomInventory.add(vehicle1);
//        someRandomInventory.add(vehicle2);


        DealershipFileManager myDealershipFileManager = new DealershipFileManager();

        myDealershipFileManager.getDealership();


    }

}
