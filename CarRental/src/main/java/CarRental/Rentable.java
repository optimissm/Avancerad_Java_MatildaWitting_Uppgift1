package CarRental;

public interface Rentable {
    // metoder
    // void rentVehicle
    // void returnVehicle
    // double calcRentCost(int days)

    // sätter in en metod för att hyra ut ett fordon
    void rentOut(int daysRented);

    // så att jag kan returnera fordonet
    void returnVehicle();

    // och beräkna kostnaden
    double calculateCost(int daysRented);

}
