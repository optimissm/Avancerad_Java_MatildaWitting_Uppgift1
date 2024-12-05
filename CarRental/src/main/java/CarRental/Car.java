
package CarRental;

import java.io.Serializable;

public class Car extends Vehicle implements Rentable {
    // detta är det som urskiljer bilarna från de andra fordonen
    // och från varandra
    private int doors;
    private int seats;

    // för att hålla koll på om bilen är uthyrd eller inte
    private boolean isRented;

    // Konstruktor till Car
    // så att vi kan skapa dörrar och säten
public Car(String model, String plateNumber,
           double pricePerDay, int doors,
           int seats) {
    // super är det som är för alla "den starkaste" som superman
    // och detta skickas till Vehicle för initialisering
    super(model, plateNumber, pricePerDay);

    this.doors = doors;
    this.seats = seats;
    // för att as of right now så är inte bilen uthyrd
    this.isRented = false;
    }

    // setters och getters som vanligt till konstruktorn
    // men eftersom att dörrar och platser inte förändras
    // så är det onödigt
//    public int getDoors() {
//    return doors;
//    }
//
//    public void setDoors(int doors) {
//    this.doors = doors;
//    }
//
//    public int getSeats() {
//    return seats;
//    }
//
//    public void setSeats(int seats) {
//    this.seats = seats;
//    }

    @Override
    public void rentOut(int daysRented) {

    }

    @Override
    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println("Fordonet har returnerats.");
        } else {
            System.out.println("Fordonet är inte uthyrt.");
        }
    }

    @Override
    public double calcRentCost(int daysRented) {
        return daysRented * getPricePerDay();
    }

    @Override
    public String toString() {
        return "Bilmodell: " + getModel() +
                ", Registreringsnummer: " + getPlateNumber() +
                ", Pris per dag: " + getPricePerDay() + " SEK" +
                ", Dörrar: " + doors +
                ", Platser: " + seats +
                ", Uthyrd: " + (isRented ? "Ja" : "Nej");
    }



    // implementerar den abstrakta metoden calcRentCost
    // tar emot hur många dagar fordonet hyrts
    // och beräknar totala kostnaden
//    @Override
//    public double calcRentCost(int daysRented) {
//
//        return daysRented * this.getPricePerDay();
//
//    }
//
//    // eftersom klassen implementerar interface får vi ha en override
//    @Override
//    public void rentOut(int daysRented) {
//
//        System.out.println("Rent out for " + daysRented + " days");
//
//
//    }
//
//    @Override
//    public void returnVehicle() {
//
//    }
//
//    @Override
//    public double calculateCost(int daysRented) {
//        return 0;
//    }

//    @Override
//    public void rentOut(int daysRented){
//    if (!isRented) {
//        isRented = true;
//        System.out.println("Bilen är uthyrd i " + daysRented + " dagar");
//    } else {
//        System.out.println("Fordonet är redan uthyrt");
//    }
//    }

}
