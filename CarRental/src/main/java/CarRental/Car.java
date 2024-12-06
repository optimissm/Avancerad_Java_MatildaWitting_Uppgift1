
package CarRental;

public class Car extends Vehicle implements Rentable{
    // vad skiljer då bilarna åt
    // final då detta inte ändras
    private final int doors;
    private final int seats;

    public Car(String model, String plateNumber,
               double pricePerDay, int doors, int seats) {
        super(model, plateNumber, pricePerDay);

        this.doors = doors;
        this.seats = seats;

    }

    // override så att car kan funka från abstract vehicle
    @Override
    public String toString() {
        return "Bil: " + getModel() +
                ", Registreringsnummer: " + getPlateNumber() +
                ", Pris per dag: " + getPricePerDay() + "SEK" +
                ", Antal dörrar: " + doors +
                ", Antal platser: " + seats +
                ", Uthyrd: " + (getIsRented() ? "Ja" : "Nej");
    }

    @Override
    public void rentOut(int daysRented) {
        setRented(true);

    }

    @Override
    public boolean isRented() {
        return getIsRented();
    }

    @Override
    public double calculateRentCost(int daysRented) {
        return daysRented * getPricePerDay();
    }

    @Override
    public double calculateRentalCost(int daysRented) {
        return 0;
    }


}
