package VirtuellBiluthyrning;

public class Car extends Vehicle implements Rentable{ // Subklass av Vehicle implementerar Rentable.

    // Privat egenskap
    private int antalSäten;

    // Konstruktor
    public Car(String fordonsmodell, String registeringsnummer, double hyraprisPerDag, int antalSäten) {
        super(fordonsmodell, registeringsnummer, hyraprisPerDag);
        this.antalSäten = antalSäten;
    }

    // Getters och Setters

    public int getAntalSäten() {
        return antalSäten;
    }

    public void setAntalSäten(int antalSäten) {
        this.antalSäten = antalSäten;
    }

    // Implementerar abstrakta metoden från Vehicle för att visa bilens information.
    @Override
    public void displayInfo() {
        System.out.println("Bil model:  " + getFordonsmodell());
        System.out.println("Registeringsnummer: " + getRegisteringsnummer());
        System.out.println("Hyra pris per dag: " + getHyraprisPerDag() + " SEK/per dag");
        System.out.println("Antal Sätte: " + getAntalSäten());
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
