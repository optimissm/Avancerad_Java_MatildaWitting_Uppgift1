package CarRental;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sätter in en ny scanner
        Scanner scan = new Scanner(System.in);
        // kopplar till RentalManager
        RentalManager manager = new RentalManager();

        // tillagda fordon
        manager.addVehicle(new Car("Tesla Cybertruck", "BHG 901",
                855.69, 4, 5));
        manager.addVehicle(new Car("Mini Cooper", "LIT 553",
                365.99, 2, 5));
        manager.addVehicle(new Moped("Vespa", "MIK 012",
                55.50, true, 40));
        manager.addVehicle(new Moped("Fiido", "KSD 257",
                35.99, false, 25));
        manager.addVehicle(new Truck("Renault Master", "OZX 295",
                849.95, 35000.0));
        manager.addVehicle(new Truck("VolksWagen Caddy", "TLM 38B",
                851.48, 4900));

        while (true) {
            System.out.println("Välkommen till vår virtuella biluthyrning. " +
                    "Vad kan jag hjälpa dig med? (1-4)");
            System.out.println("1. Visa tillgängliga fordon");
            System.out.println("2. Jag vill hyra ett fordon");
            System.out.println("3. Jag vill lämna tillbaka ett fordon");
            System.out.println("4. Avsluta");


            try {
                // den siffran (mellan 1-4 som väljs ger ett val
                // som refererar till switch satsen
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        // visa villka fordon som är tillgängliga
                        // To do
                        // klasser för fordon
                        // klasser för specifika fordon
                        manager.displayVehicles();
                        // avslutar detta alternativet typ
                        break;

                    case 2:
                        // hyra ett fordon

                        System.out.println("Vilket fordon vill du hyra? ");
                        // visa lista på alla (tillgängliga?) fordon
                        manager.displayAvailableVehicles();
                        int id = scan.nextInt();

                        // och för att val 1 ska ta ut fordon 1 och inte 0
                        // gör vi denna lilla if sats

                        int index = id -1;

                        if (index >= 0 && index < manager.getAllVehicles().size()) {
                            Rentable vehicle = manager.getVehicle(index);

                            if (!vehicle.isRented()){
                                System.out.println("Hur många dagar vill du hyra fordonet? ");
                                int days = scan.nextInt();
                                manager.rentVehicle(index, days);
                            } else {
                                System.out.println("Fordenet är redan uthyrt, välj ett annat. ");
                            }
                        } else {
                            System.out.println("Ogiltigt val, testa ett annat alternativ");
                        }

                        break;

                    case 3:
                        // returnera ett fordon
                        System.out.println("Vilket fordon vill du lämna tillbaka? ");
                        manager.displayVehicles();
                        int returnId = scan.nextInt();
                        int returnIndex = returnId - 1;

                        if (returnIndex >= 0 && returnIndex < manager.getAllVehicles().size()) {
                            Rentable vehicle = manager.getVehicle(returnIndex);
                            if (vehicle.isRented()){
                                System.out.println("Hur många dagar hyrdes fordonet? ");
                                int returnDays = scan.nextInt();

                                manager.rentVehicle(returnIndex, returnDays);

                                System.out.println("Fordonet har returnerats. ");
                            } else {
                                System.out.println("Detta är inget uthyrt fordon. " +
                                        "Kontrollera att uppgifterna stämmer och försök igen. ");
                            }
                        } else {
                            System.out.println("Ogiltigt val, testa ett annat alternativ");
                        }


                        break;


                    case 4:
                        System.out.println("Tack för besöket, välkommen åter!");
                        // avslutar hela programmet
                        System.exit(0);

                    default:
                        System.out.println("Fel, vänligen prova igen... ");

                }

            } catch (Exception e) {
                System.out.println("Ogiltig inmatning, försök igen");
                scan.nextLine();
            }
        }
    }
}

