
package CarRental;

public class Car extends Vehicle {
    // detta är det som urskiljer bilarna från de andra fordonen
    // och från varandra
    private int doors;
    private int seats;

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
    }

    // setters och getters som vanligt till konstruktorn
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

    // implementerar den abstrakta metoden calcRentCost
    // tar emot hur många dagar fordonet hyrts
    // och beräknar totala kostnaden
    @Override
    public double calcRentCost(int daysRented) {

        return daysRented * this.getPricePerDay();

    }

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
