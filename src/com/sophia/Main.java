package com.sophia;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //make instance of Dealership
        Dealership dealership = new Dealership("JAVA");
        System.out.println("Welcome to " + dealership.getDealershipName() + " Dealership!");

        //make instance of Car
        Car car1 = new Car("MINI", "Clubman", 1030, 75);
        Car car2 = new Car("BMW", "535", 5615, 30);
        Car car3 = new Car("Honda", "CRV", 20000, 50);

        dealership.getCurrentCarAvailable().add(car1);
        dealership.getCurrentCarAvailable().add(car2);
        dealership.getCurrentCarAvailable().add(car3);

        dealership.displayInventory();
        System.out.println("Would you like book a car type 1,return a car type 2 or exit type 3");
        int usersInput = scanner.nextInt();
        while (true) {
            if (usersInput == 1) {
                scanner.nextLine();
                dealership.bookACar();
                System.out.println("Would you like book a car type 1,return a car type 2 or exit type 3");
                usersInput = scanner.nextInt();
                while (usersInput == 2) {
                    dealership.returnACar();
                    System.out.println("Would you like book a car type 1,return a car type 2 or exit type 3");
                    usersInput = scanner.nextInt();
                    while (usersInput == 1) {
                        dealership.bookACar();
                        System.out.println("Would you like book a car type 1,return a car type 2 or exit type 3");
                        usersInput = scanner.nextInt();
                    }
                }
            }else if (usersInput == 2) {
                scanner.nextLine();
                dealership.returnACar();
                System.out.println("Would you like book a car type 1,return a car type 2 or exit type 3");
                usersInput = scanner.nextInt();
            }else{
                System.out.println("Thank you for your order");
                break;
            }
        }
    }
}