package Sources;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Loan {
    private int amount, mensuality;
    private Courant compte;
    public void presentLoan() {
        JOptionPane.showConfirmDialog(null,"\nMontant: " + this.amount + "\nMensualite: " + this.mensuality);
    }

    public void setAmount() {
        int str= (int) JOptionPane.showInputDialog(null,"Label","Titre", 0, new ImageIcon("ExternalFiles/depot2.png"), null,this.amount);
        if (str>=0) this.amount = amount;
    }

    public void setMensuality(int mensuality) {
        this.mensuality = mensuality;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getMensulity() {
        return this.mensuality;
    }

    public Loan(int amount, Courant compte) {
        this.amount = (amount * 110) / 100; //10% en plus pour l'interet sur le pret
        this.mensuality = (amount * 10) / 100;//10% du montant a rembourser par defaut
        this.compte = compte;
    }

    public void rembourser() {
        if (this.amount==0)
            JOptionPane.showConfirmDialog(null,"Vous avez deja rembourse cet emprumt");
        else if (this.compte.getSolde() < this.mensuality)
            JOptionPane.showConfirmDialog(null,"Fonds insuffisant pour rembourser cet emprunt");
        else {
            this.compte.withdraw(this.mensuality);
            this.amount -= this.mensuality;
        }
    }
}
