package CarRental;

public class Truck extends Vehicle implements Rentable {

    private double maxLoad;

    public Truck(String model, String plateNumber, double pricePerDay, double maxLoad) {
        super(model, plateNumber, pricePerDay);

        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "Lätt lastbil: " + getModel() +
                ", Registreringsnummer: " + getPlateNumber() +
                ", Pris per dag: " + getPricePerDay() + "SEK" +
                ", Max last: " + maxLoad +
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
