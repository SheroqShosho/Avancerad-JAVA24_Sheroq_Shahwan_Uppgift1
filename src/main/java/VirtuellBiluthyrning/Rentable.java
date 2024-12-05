package VirtuellBiluthyrning;

public interface Rentable { // För specificera beteende för uthyrbara fordon.
    // Metoder
    void hyraUt();
    void lämnaTillbaka();
    double beräknaHyresKostnad(int antalDagar);
}
