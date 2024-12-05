package VirtuellBiluthyrning;

public class Truck extends Vehicle implements Rentable{ // Subklass av Vehicle implementerar Rentable.

    // Privat egenskap
    private double lastkapictet;

    // Konstruktor
    public Truck(String fordonsmodell, String registeringsnummer, double hyraprisPerDag, double lastkapictet) {
        super(fordonsmodell, registeringsnummer, hyraprisPerDag);
        this.lastkapictet = lastkapictet;
    }

    // Getters och Setters

    public double getLastkapictet() {
        return lastkapictet;
    }

    public void setLastkapictet(double lastkapictet) {
        this.lastkapictet = lastkapictet;
    }

    // Implementerar abstrakta metoden från Vehicle för att visa bilens information.
    @Override
    public void displayInfo() {
        System.out.println("Bil model:  " + getFordonsmodell());
        System.out.println("Registeringsnummer: " + getRegisteringsnummer());
        System.out.println("Hyra pris per dag: " + getHyraprisPerDag() + " SEK/per dag");
        System.out.println("Lastkapictet: " + getLastkapictet() + " kg");

    }

    // Implementerar metoden från Rentable för att hyra ut fordon.
    @Override
    public void hyraUt() {
        System.out.println("Fordonet " + getFordonsmodell() + " har hyrts ut.");
    }

    //Implementerar metoden från Rentable för att lämna tillbaka fordon.
    @Override
    public void lämnaTillbaka() {
        System.out.println("Fordonet " + getFordonsmodell() + " har lämnats tillbaka.");
    }

    // Implementerar metoden från Rentable för att beräkna hyrkostnaden.
    @Override
    public double beräknaHyresKostnad(int antalDagar) {
        return antalDagar * getHyraprisPerDag();
    }
}
