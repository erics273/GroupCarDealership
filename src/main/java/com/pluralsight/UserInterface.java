package com.pluralsight;

//imported the scanner so we can use it
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    //private property to hold the dealershop
    private Dealership dealership;

    //empty constructor
    public UserInterface() {}

    public void display(){
        //call the init method
        this.init();

        //create the scanner
        Scanner theScanner = new Scanner(System.in);

        //create a variable that we can use to determine if our app menu should display even aftter we chose an option
        boolean menuRunning = true;

        //this loop will run until menuRunning is set to false
        while(menuRunning){

            System.out.println("""
                    === Welcome to the car dealership, choose an option below ===
                    
                    1 - Find vehicles within a price range
                    2 - Find vehicles by make / model
                    3 - Find vehicles by year range
                    4 - Find vehicles by color
                    5 - Find vehicles by mileage range
                    6 - Find vehicles by type (car, truck, SUV, van)
                    7 - List ALL vehicles
                    8 - Add a vehicle
                    9 - Remove a vehicle
                    99 - Quit
                    
                    """);

            //store the menu option in a variable called menuChoice
            int menuChoice = theScanner.nextInt();

            //do the thing based on the menu choice above
            switch (menuChoice){
                case 1: this.processGetByPriceRequest(); break;
                case 2: this.processGetByMakeModelRequest(); break;
                case 3: this.processGetByYearRequest(); break;
                case 4: this.processGetByColorRequest(); break;
                case 5: this.processGetByMileageRequest(); break;
                case 6: this.processGetVehicleType(); break;
                case 7: this.processGetAllVehiclesRequest(); break;
                case 8: this.processAddVehicleRequest(); break;
                case 9: this.processRemoveVehicleRequest(); break;
                case 99:
                    //the user chose to quit
                    //say goodbye
                    System.out.println("See ya later dude!");

                    //stop the menu
                    menuRunning = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }


    }

    public void processGetByPriceRequest(){

    }

    public void processGetByMakeModelRequest(){

    }

    public void processGetByYearRequest(){

    }

    public void processGetByColorRequest(){

        //create a scanner
        Scanner theScanner = new Scanner(System.in);

        //ask the user what color they are looking for
        System.out.println("What color are you looking for: ");

        //store the answer
        String theColor = theScanner.nextLine();

        this.displayVehicles(dealership.getVehiclesByColor(theColor));

    }

    public void processGetByMileageRequest(){

    }

    public void processGetVehicleType(){
        //create a scanner
        Scanner theScanner = new Scanner(System.in);

        //ask the user what color they are looking for
        System.out.println("What type of vehicle (Car, Truck, SUV):  ");

        //store the answer
        String theType = theScanner.nextLine();

        this.displayVehicles(dealership.getVehiclesByType(theType));
    }

    public void processGetAllVehiclesRequest(){
        this.displayVehicles(dealership.getAllVehicles());
    }

    public void processAddVehicleRequest(){

    }

    public void processRemoveVehicleRequest(){

    }

    private void init(){

        //created the DFM
        DealershipFileManager theDealershipFileManager = new DealershipFileManager();

        //set the dealarship in the file (this.dealership) to the dealership created
        //amd returned by getDealership() on the file manager
        this.dealership = theDealershipFileManager.getDealership();


    }

    //method to display all vehicles
    private void displayVehicles(ArrayList<Vehicle> theVehicles){

        //we need to loop over all those vehicles to display
        for(Vehicle currentVehicle : theVehicles){
            //call the toString method so we get a nice display of the vehicle data
            System.out.println(currentVehicle.toString());
        }

    }

}
