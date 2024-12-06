package CarRental;

public class Moped extends Vehicle implements Rentable {

    // specifika attribut
    private boolean helmetIncluded;
    private int maxSpeed;

    public Moped(String model, String plateNumber, double pricePerDay, boolean helmetIncluded, int maxSpeed) {
        super(model, plateNumber, pricePerDay);

        this.helmetIncluded = helmetIncluded;
        this.maxSpeed = maxSpeed;
    }

    // override så att car kan funka från abstract vehicle
    @Override
    public String toString() {
        return "Moped: " + getModel() +
                ", Registreringsnummer: " + getPlateNumber() +
                ", Pris per dag: " + getPricePerDay() + "SEK" +
                ", Hjälm ingår: " + helmetIncluded +
                ", Maxfart: " + maxSpeed +
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
