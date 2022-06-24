package Sources;
import javax.swing.JOptionPane;

abstract class account {
    protected String number;
    protected int solde;
    protected double interest;
    
    protected String type;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setInterest(double interes) {
        if (interes <=100) this.interest = interes;
    }

     public String getType() {
        return this.type;
    }
       public double getInterest() {
        return this.interest;
    }
   
    public String getNumber() {
        return this.number;
    }

    public int getSolde() {
        return this.solde;
    }

    public double calculInterest() {
        return (this.interest / this.solde) * 100;
    }

    public void deposit(int add) {
        if (add > 0)
            this.solde += add;
    }

    public void withdraw(int add) {
        if (add > 0)
            if (this.solde - add < 0)
                JOptionPane.showConfirmDialog(null,"Fonds insuffisant");
            else
                this.solde -= add;
    }
    
    protected account( String number, int solde, double interest) {
        this.number = number;
        this.interest = interest;
        this.solde = solde;
    }

  
}
