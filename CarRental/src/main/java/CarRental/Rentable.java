
package CarRental;


// här har vi då interface. Interface är en samling metoddeklarationer
// som kan implementeras av klasserna
// det är de kontrakt som klasserna måste följa
public interface Rentable {
    // metoder att placera ut i Rentable
    // en för att hyra ut fordon
    void rentOut(int daysRented);

    // en för att se om den är uthyrd
    boolean isRented();

    // en för att beräkna kostnaden
    double calculateRentCost(int daysRented);

    // en för att kolla om den är uthyrd eller inte?

}
