package CarRental;

public class Convertable extends Vehicle {

    // attribut
    // boolean openRoof
private boolean openRoof;

public Convertable(String model, String plateNumber, double pricePerDay, boolean openRoof) {
    super(model, plateNumber, pricePerDay);

    this.openRoof = openRoof;
}

public boolean isOpenRoof() {
    return openRoof;
}
public void setOpenRoof(boolean openRoof) {
    this.openRoof = openRoof;
}

    @Override
    public double calcRentCost(int daysRented) {
        return daysRented * this.getPricePerDay();
    }
}
