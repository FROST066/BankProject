package Sources;

import java.util.ArrayList;

public class Courant extends account {
  protected ArrayList<Loan> listLoan;
  
    public Courant(String number, int solde, double interest) {
        super( number, solde, interest);
        this.type="Compte Courant";
    }
     public ArrayList<Loan> getlistLoan() {
        return this.listLoan;
    }

public void payLoan(int refer) {
        if (refer < listLoan.size())
            listLoan.get(refer).rembourser();
    }

    public boolean isReimbursed(int refer) {
        if (refer < this.listLoan.size())
            return (this.listLoan.get(refer).getAmount() == 0);
        else
            return false;
    }

    public void virer(int valeur, account co) {
        if (valeur < this.solde) {
            co.deposit(valeur);
            this.solde -= valeur;
        }
    }
    
       public void addLoan(Loan l) {
        listLoan.add(l);
    }

       
      public void presentLoans() {
        for (int i = 0; i < this.listLoan.size(); i++)
            listLoan.get(i).presentLoan();
    }
}
