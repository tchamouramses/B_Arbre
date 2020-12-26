/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetb.arbre.Models;

import java.util.List;

/**
 *
 * @author NGT
 */
public class Noeud {
    private List<Integer> cles;
    private boolean feuille;
    private List<Noeud> sous_arbre;

    public Noeud() {
    }

    public Noeud(List<Integer> cles, boolean feuille, List<Noeud> sous_arbre) {
        this.cles = cles;
        this.feuille = feuille;
        this.sous_arbre = sous_arbre;
    }

    public List<Integer> getCles() {
        return cles;
    }

    public void setCles(List<Integer> cles) {
        this.cles = cles;
    }

    public boolean isFeuille() {
        return feuille;
    }

    public void setFeuille(boolean feuille) {
        this.feuille = feuille;
    }

    public List<Noeud> getSous_arbre() {
        return sous_arbre;
    }

    public void setSous_arbre(List<Noeud> sous_arbre) {
        this.sous_arbre = sous_arbre;
    }
    
}
