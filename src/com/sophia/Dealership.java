package com.sophia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dealership {
   static Scanner scanner = new Scanner(System.in);
    private String dealershipName;
   static  public ArrayList<Car> currentCarAvailable;
    static public ArrayList<Car> currentCarsBooked;


    //dealership constructor
    public Dealership(String dealershipName) {
        this.dealershipName = dealershipName;
        this.currentCarAvailable = new ArrayList<>();
        this.currentCarsBooked = new ArrayList<>();
    }


    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public ArrayList<Car> getCurrentCarsBooked() {
        return currentCarsBooked;
    }

    public void setCurrentCarsBooked(ArrayList<Car> currentCarsBooked) {
        this.currentCarsBooked = currentCarsBooked;
    }


    public ArrayList<Car> getCurrentCarAvailable() {
        return currentCarAvailable;
    }

    public void setCurrentCarAvailable(ArrayList<Car> currentCarAvailable) {
        this.currentCarAvailable = currentCarAvailable;
    }

    public void displayInventory() {
        for (int i = 0; i < currentCarAvailable.size(); i++) {
        }
        System.out.println("We have the " + currentCarAvailable);
    }


    public void bookACar() {
        System.out.println(" ");
        String prompt = "Would you like to book a ";
        for (int i = 0; i < currentCarAvailable.size(); i++) {
            if (i == currentCarAvailable.size() - 1) {
                prompt += "or " + currentCarAvailable.get(i).getMake() + "?";
            } else {
                prompt += currentCarAvailable.get(i).getMake() + ", ";
            }
        }
        System.out.println(prompt);
        String carName = scanner.nextLine();
        for (int i = 0; i < currentCarAvailable.size(); i++) {
            if (currentCarAvailable.get(i).getMake().equals(carName)) {
                currentCarsBooked.add(currentCarAvailable.get(i));
                currentCarAvailable.remove(i);
            }
        }
        System.out.println("Welcome");
        System.out.println("You booked a " + carName );
        System.out.println("Available Cars: " + currentCarAvailable.toString());
        System.out.println("Booked Cars: " + currentCarsBooked.toString());

    }

    public void returnACar() {
        System.out.println(" ");
        String prompt = "Would you like to return a ";
        for (int i = 0; i < currentCarsBooked.size(); i++) {
            if (currentCarsBooked.size() == 0) {
                System.out.println("There is no car to return.");
            } else if (i == currentCarsBooked.size() - 1 && currentCarsBooked.size() != 1) {
                prompt += "or " + currentCarsBooked.get(i).getMake() + "?";
            } else if (currentCarsBooked.size() - 1 != i) {
                prompt += currentCarsBooked.get(i).getMake() + ", ";
            } else {
                prompt += currentCarsBooked.get(i).getMake() + "?";
            }
        }
        System.out.println(prompt);
        String carReturn = scanner.nextLine();

        for (int i = 0; i < currentCarsBooked.size(); i++) {
            if (currentCarAvailable.get(i).getMake().equals(carReturn)) {
                currentCarsBooked.add(currentCarAvailable.get(i));
                currentCarAvailable.remove(i);


            }
     }
        //String carName = scanner.nextLine();
        System.out.println("You returned a " + carReturn );
        System.out.println("Available Cars: " + currentCarAvailable.toString());
        System.out.println("Booked Cars: " + currentCarsBooked.toString());
    }
}


