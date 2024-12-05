package VirtuellBiluthyrning;

import java.util.ArrayList;
import java.util.Scanner;

public class Convertible {
    public static void main(String[] args) { // Huvudmetod

        //// Scanner för användar inmatning
        Scanner scanner = new Scanner(System.in);

        // Skapar en lista och lägger till alla fordon i listan.
        ArrayList<Rentable> fordonsLista = new ArrayList<>();
        fordonsLista.add(new Car("Volvo", "ABC123", 500.0, 5));
        fordonsLista.add(new SUV("Jeep", "XYZ789", 800.0, "Diesel"));
        fordonsLista.add(new Truck("Toyota", "EWN456", 1200.0, 15500.0));

        // Huvudloopen körs
        boolean programKörs = true;

        //Huvudloop för att visa menyer och hantera användarval.
        while (programKörs) {
            System.out.println("\n--- Fordonsuthyrning ---");
            System.out.println("1. Visa tillgängliga fordon");
            System.out.println("2. Hyra ett fordon");
            System.out.println("3. Returnera ett fordon");
            System.out.println("4. Avsluta");
            System.out.println("Välj ett alternativ: ");

            //Visar menyn och tar emot användarens val.
            int val = scanner.nextInt();
            scanner.nextLine();


            switch (val) {
                case 1: // Visar alla tillgängliga fordon
                    System.out.println("\nTillgängliga fordon");
                    for (int i = 0; i < fordonsLista.size(); i++) {
                        System.out.println((i + 1) + ". " + fordonsLista.get(i).getClass().getSimpleName() +
                                " - " + ((Vehicle) fordonsLista.get(i)).getFordonsmodell());
                    }
                    break;

                    case 2: // Låter användaren hyra ett fordon och visar kostnaden
                        System.out.println("\nVilket fordon vill du hyra? Ange nummer:");
                        for (int i = 0; i < fordonsLista.size(); i++) {
                            System.out.println((i + 1) + ". " + fordonsLista.get(i).getClass().getSimpleName() +
                                    " - " + ((Vehicle) fordonsLista.get(i)).getFordonsmodell());
                        }
                        int hyresVal = scanner.nextInt();
                        scanner.nextLine();
                        if (hyresVal > 0 && hyresVal <= fordonsLista.size()) {
                            Rentable valtFordon = fordonsLista.get(hyresVal - 1);
                            System.out.print("Hur många dagar vill du hyra det? ");
                            int dagar = scanner.nextInt();
                            scanner.nextLine();
                            valtFordon.hyraUt();
                            double kostnad = valtFordon.beräknaHyresKostnad(dagar);
                            System.out.println("Hyreskostnad för " + dagar + " dagar: " + kostnad + " SEK");
                        } else {
                            System.out.println("Ogilyigt val!");
                        }
                        break;

                        case 3: // Låter användaren returnera ett fordon
                            System.out.println("\nVilket fordon vill du returnera? Ange nummer:");
                            for (int i = 0; i < fordonsLista.size(); i++) {
                                System.out.println((i + 1) + ". " + fordonsLista.get(i).getClass().getSimpleName() +
                                        " - " + ((Vehicle) fordonsLista.get(i)).getFordonsmodell());
                            }
                            int returnVal = scanner.nextInt();
                            scanner.nextLine();
                            if (returnVal > 0 && returnVal <= fordonsLista.size()) {
                                Rentable valtFordon = fordonsLista.get(returnVal - 1);
                                valtFordon.lämnaTillbaka();
                            } else {
                                System.out.println("Ogilyigt val!");
                            }
                            break;

                            case 4: // Avslutar programmet
                                System.out.println("Avslutar programmet...");
                                programKörs = false;
                                break;

                                default: // Felhanteraring för ogilyigt val.
                                    System.out.println("Ogiltigt val, försök igen.");
            }
        }
        scanner.close();
    }
}
