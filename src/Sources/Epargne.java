package Sources;
public class Epargne extends account {
    public Epargne( String number, int solde, double interest) {
        super( number, solde, interest);
        this.type="Compte Epargne";
    }
}
