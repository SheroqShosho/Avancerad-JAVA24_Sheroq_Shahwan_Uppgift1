package VirtuellBiluthyrning;

public class SUV extends Vehicle implements Rentable { // Subklass av Vehicle implementerar Rentable.

    // Privat egenskap
    private String gasTyp;

    // Konstruktor
    public SUV(String fordonsmodell, String registeringsnummer, double hyraprisPerDag, String gasTyp) {
        super(fordonsmodell, registeringsnummer, hyraprisPerDag);
        this.gasTyp = gasTyp;
    }

    // Getters och Setters

    public String getGasTyp() {
        return gasTyp;
    }

    public void setGasTyp(String gasTyp) {
        this.gasTyp = gasTyp;
    }

    // Implementerar abstrakta metoden från Vehicle för att visa bilens information.
    @Override
    public void displayInfo() {
        System.out.println("SUV model: " + getFordonsmodell());
        System.out.println("Registeringsnummer: " + getRegisteringsnummer());
        System.out.println("Hyra pris per dag: " + getHyraprisPerDag() + " SEK/per dag");
        System.out.println("Gas typ: " + getGasTyp());

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
