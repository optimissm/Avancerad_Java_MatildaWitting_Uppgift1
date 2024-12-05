package CarRental;

// abstrakt klass med attribut som
// String model
// String plateNumber
// double dailyRentalPrice
abstract class Vehicle {

    // detta är de egenskaper som alla fordon ska ha
    String model;
    String plateNumber;
    double pricePerDay;

    // här är konstruktorn till de föregående egenskaperna
    public Vehicle(String model, String plateNumber, double pricePerDay) {
        this.model = model;
        this.plateNumber = plateNumber;
        this.pricePerDay = pricePerDay;
    }

    // setters och getters för alla egenskaper
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    // en abstrakt klass
    // som beräknar kostnad/dag
    // alla fordonstyper behöver implementera denna metod
    public abstract double calcRentCost(int daysRented);



}
