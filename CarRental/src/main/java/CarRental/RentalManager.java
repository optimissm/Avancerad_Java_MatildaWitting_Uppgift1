package CarRental;

import java.util.ArrayList;
import java.util.List;

public class RentalManager {
    // skapa en lista för att se alla fordon
//    private ArrayList<String> allVehicles = new ArrayList<String>();
//
//    public RentalManager() {
//        allVehicles = new ArrayList<>();
//    }

    // istället för en vanlig hederlig ArrayList så gör vi en mer
    // framtidssäker List
    // som också ger bättre flexibilitet i användandet av
    // min interface Rentable
    // och kan därför innehålla allt från Car, Moped, Truck...
    private List<Rentable> allVehicles;

    public List<Rentable> getAllVehicles() {
        return allVehicles;
    }

    // constructor
    // med en ny, tom lista
    // tills vi fyller på den iiiiii...?
    public RentalManager() {
        allVehicles = new ArrayList<>();
    }

    // detta är så att vi kan hämta det fordon vi vill ur listan
    // tex för uthyrning
    public Rentable getVehicle(int id) {
        return allVehicles.get(id);
    }

    // detta är så vi kan returnera ett fordon
    public void addVehicle(Rentable vehicle) {
        allVehicles.add(vehicle);
    }

    public void displayVehicles() {
        System.out.println("Alla fordon: ");
        for (int i = 0; i < allVehicles.size(); i++) {
            System.out.println((i + 1) + (".") + allVehicles.get(i).toString());
        }
    }

    // metod för att enbart visa tillgängliga fordon
    public void displayAvailableVehicles() {
        System.out.println("Tillgängliga fordon: ");
        for (int i = 0; i < allVehicles.size(); i++) {
            Rentable vehicle = allVehicles.get(i);

            if(!vehicle.isRented()) {
                System.out.println((i + 1) + (".") + vehicle.toString());
            }
        }
    }

    public void rentVehicle(int id, int days){
        Rentable vehicle = allVehicles.get(id);

        vehicle.rentOut(days);
        System.out.println("Totala summan för att hyra detta fordon: "
                + vehicle.calculateRentCost(days) + " SEK");
    }

    public void returnVehicle(int id){
        Rentable vehicle = allVehicles.get(id);
        if (vehicle.isRented()) {
            vehicle.returnVehicle();
            System.out.println("Fordonet har returnerats.");
        } else {
            System.out.println("Detta är inte ett uthyrt fordon. " +
                    "Kolla så att du har fyllt i rätt uppgifter");
        }

    }



}
