/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sources;

import java.util.ArrayList;
import Sources.Epargne;

/**
 *
 * @author spmy
 */
public class user {
    private String name;
    private int id;
    private ArrayList<Courant> listCourant;
    private ArrayList<Epargne> listEpargne;
    
    public user(int id, String name) {
        this.id = id;
        this.name = name;
        this.listCourant = new ArrayList<>();
        this.listEpargne = new ArrayList<>();
    }

    public void addAccount(account ac){
   if (ac instanceof Courant) listCourant.add((Courant) ac);
   else if (ac instanceof Epargne) listEpargne.add((Epargne) ac);
   
    }
    public String getName(){return this.name;}
    public  ArrayList<Courant> getListCourant(){return this.listCourant;}
     public  ArrayList<Epargne> getListEpargne(){return this.listEpargne;}
}

