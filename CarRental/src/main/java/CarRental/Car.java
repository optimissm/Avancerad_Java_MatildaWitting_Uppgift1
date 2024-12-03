package CarRental;

public class Car extends Vehicle {
    // specifika attribut för Car
    // int doors
    // int seats
    private int doors;
    private int seats;

    // constructor
public Car(String model, String plateNumber, double pricePerDay, int doors, int seats) {
    // super är det som är för alla "den starkaste" som superman
    super(model, plateNumber, pricePerDay);

    this.doors = doors;
    this.seats = seats;
    }

    public int getDoors() {
    return doors;
    }

    public void setDoors(int doors) {
    this.doors = doors;
    }

    public int getSeats() {
    return seats;
    }

    public void setSeats(int seats) {
    this.seats = seats;
    }


    @Override
    public double calcRentCost(int daysRented) {
        return daysRented * this.getPricePerDay();
    }

}
