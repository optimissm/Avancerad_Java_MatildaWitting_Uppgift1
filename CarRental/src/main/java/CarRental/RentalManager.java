package CarRental;

import java.util.ArrayList;
import java.util.List;

public class RentalManager {
    // håller listan över alla fordon
    private List<Rentable> vehicles;

    public RentalManager() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Rentable vehicle) {
        vehicles.add(vehicle);
    }

    public void displayAvailableVehicles() {
        System.out.println("nAvailable vehicles: ");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(": " + vehicles.get(i).toString());
        }
    }

    public void rentVehicle(int index, int days) {
        Rentable vehicle = vehicles.get(index);
        vehicle.rentOut(days);
        System.out.println("Total cost for renting this vehicle: "
        + vehicle.calcRentCost(days) + " SEK");
    }

    public void returnVehicle(int index, int days) {
        Rentable vehicle = vehicles.get(index);
        vehicle.returnVehicle();
    }

}
