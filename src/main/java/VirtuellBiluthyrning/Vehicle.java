package VirtuellBiluthyrning;

public abstract class Vehicle { // En abstrakt klass som representerar en generisk typ av fordon.

    // Egenskaper
    String fordonsmodell;
    protected String registeringsnummer;
    protected double hyraprisPerDag;

    // KOnstruktor
    public Vehicle(String fordonsmodell, String registeringsnummer, double hyraprisPerDag) {
        this.fordonsmodell = fordonsmodell;
        this.registeringsnummer = registeringsnummer;
        this.hyraprisPerDag = hyraprisPerDag;
    }

    //Getters och Setters

    public String getFordonsmodell() {
        return fordonsmodell;
    }

    public void setFordonsmodell(String fordonsmodell) {
        this.fordonsmodell = fordonsmodell;
    }

    public String getRegisteringsnummer() {
        return registeringsnummer;
    }

    public void setRegisteringsnummer(String registeringsnummer) {
        this.registeringsnummer = registeringsnummer;
    }

    public double getHyraprisPerDag() {
        return hyraprisPerDag;
    }

    public void setHyraprisPerDag(double hyraprisPerDag) {
        this.hyraprisPerDag = hyraprisPerDag;
    }

    // En abstrakt metod som måste implementeras av alla underklasser för att visa fordonets information.
    public abstract void displayInfo();

}
