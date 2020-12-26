/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetb.arbre.Models;

/**
 *
 * @author NGT
 */
public class B_Arbre {
    private Noeud racine;
    private int max_cle;

    public B_Arbre() {
    }

    public B_Arbre(Noeud racine, int max_cle) {
        this.racine = racine;
        this.max_cle = max_cle;
    }

    public Noeud getRacine() {
        return racine;
    }

    public void setRacine(Noeud racine) {
        this.racine = racine;
    }

    public int getMax_cle() {
        return max_cle;
    }

    public void setMax_cle(int max_cle) {
        this.max_cle = max_cle;
    }
    
    
}
