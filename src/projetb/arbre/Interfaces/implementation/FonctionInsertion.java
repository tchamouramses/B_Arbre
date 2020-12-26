/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetb.arbre.Interfaces.implementation;

import projetb.arbre.Interfaces.b_arbres_functions_insertion;
import projetb.arbre.Models.B_Arbre;
import projetb.arbre.Models.Noeud;

/**
 *
 * @author NGT
 */
public class FonctionInsertion implements b_arbres_functions_insertion{

    @Override
    public B_Arbre creerFeuille(B_Arbre arbre, int valeur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estUneFeuille(Noeud n) {
        return n.isFeuille();
    }

    @Override
    public B_Arbre eclatement(B_Arbre arbre, int ordre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int positionInsertion(B_Arbre arbre, int valeur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertCleNoeud(Noeud n, int valeur, int position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertArbreNoeud(Noeud noeud, Noeud arbre, int position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public B_Arbre initBArbre() {
        B_Arbre b = new B_Arbre();
        b.setRacine(null);
        b.setMax_cle(0);
        return b;
    }
    
    
}
