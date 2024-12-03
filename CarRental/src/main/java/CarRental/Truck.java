package CarRental;

public class Truck extends Vehicle {

    // attribut
    // double maxLoad
    //

    private double maxLoad;

    public Truck(String model, String plateNumber, double pricePerDay, double maxLoad) {
        super(model, plateNumber, pricePerDay);

        this.maxLoad = maxLoad;
    }

    public double getMaxLoad() {
        return maxLoad;
    }
    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

        @Override
    public double calcRentCost(int daysRented) {
        return daysRented * this.getPricePerDay();
    }
}
