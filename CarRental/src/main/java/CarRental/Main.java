package CarRental;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalManager manager = new RentalManager();

        manager.addVehicle(new Car("Tesla Cybertruck", "ABC 55S",
                855.99, 4, 5));
        manager.addVehicle(new Car("Ford Mustang", "KUL 100",
                600.00, 2, 5));

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to our Car Rental, " +
                    "choose a number on what I can help you with: ");
            System.out.println("1. Show available vehicles");
            System.out.println("2. Rent a vehicle");
            System.out.println("3. Return a rented vehicle");
            System.out.println("4. Exit");

            int choice = scan.nextInt();

            switch (choice) {


                case 1:
                    manager.displayAvailableVehicles();
                    break;

                case 2:
                    System.out.println("Choose what vehicle you want to rent: ");
                    int index = scan.nextInt();
                    System.out.println("How many days do you wish to rent this vehicle? ");
                    int days = scan.nextInt();
                    manager.rentVehicle(index, days);
                    break;

                case 3:
                    System.out.println("Choose what vehicle you want to return: ");
                    int returnIndex = scan.nextInt();
                    System.out.println("How many days was the vehicle rented? ");
                    int returnDays = scan.nextInt();
                    manager.returnVehicle(returnIndex, returnDays);
                    break;

                case 4:
                    System.out.println("Thank you for coming, welcome back! ");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, please try again. ");

            }
        }
    }
}
