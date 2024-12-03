package CarRental;

// abstrakt klass med attribut som
// String model
// String plateNumber
// double dailyRentalPrice
abstract class Vehicle {

    String model;
    String plateNumber;
    double pricePerDay;

    public Vehicle(String model, String plateNumber, double pricePerDay) {
        this.model = model;
        this.plateNumber = plateNumber;
        this.pricePerDay = pricePerDay;
    }


    // metoder
    // getters och setters för alla attribut
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

    // en abstract metod doubleCalculateCost(int days)
    // som beräknar kostnad/dag
    // som alla fordonstyper behöver
    public abstract double calcRentCost(int daysRented);



}
