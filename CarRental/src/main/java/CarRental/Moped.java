package CarRental;

public class Moped extends Vehicle {

    // specifika attribut
    // boolean helmetIncluded
    // int maxSpeed

    private boolean helmetIncluded;
    private int maxSpeed;

    public Moped(String model, String plateNumber, double pricePerDay, boolean helmetIncluded, int maxSpeed) {
        super(model, plateNumber, pricePerDay);

        this.helmetIncluded = helmetIncluded;
        this.maxSpeed = maxSpeed;
    }

    public boolean isHelmetIncluded() {
        return helmetIncluded;
    }
    public void setHelmetIncluded(boolean helmetIncluded) {
        this.helmetIncluded = helmetIncluded;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double calcRentCost(int daysRented) {
        return daysRented * this.getPricePerDay();
    }
}
