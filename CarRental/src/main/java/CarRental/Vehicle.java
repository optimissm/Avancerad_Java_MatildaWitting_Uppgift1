package CarRental;

// abstract class för att alla sub klasser ska kunna ärva av en och samma
// utan att jag behöver duplicera samma attribut och metoder
abstract class Vehicle {

    // då sätter vi in alla gemensamma attribut här
    private String model;
    private String plateNumber;
    private double pricePerDay;

    // är fordonet uthyrt eller inte?
    private boolean isRented;

    public Vehicle(String model, String plateNumber, double pricePerDay) {
        this.model = model;
        this.plateNumber = plateNumber;
        this.pricePerDay = pricePerDay;
        // börjar med att sätta false, för just nu är den inte uthyrd
        this.isRented = false;
    }

    // osäker på setters
    // men tror inte det behövs då ingenting ska ändras
    // getters verkar dock användas so here we go

    public String getModel() {
        return model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    // kan vara så att isRented behöver både setter och getter
    // då jag vill kunna ändra status efter hur utlånad den är
    public boolean getIsRented() {
        return isRented;
    }
    public void setRented(boolean rented) {
        isRented = rented;
    }

    public abstract double calculateRentalCost(int daysRented);


}
