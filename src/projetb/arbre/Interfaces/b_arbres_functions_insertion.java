/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetb.arbre.Interfaces;

import projetb.arbre.Models.B_Arbre;
import projetb.arbre.Models.Noeud;

/**
 *
 * @author NGT
 */
public interface b_arbres_functions_insertion {
    
    public B_Arbre creerFeuille(B_Arbre arbre, int valeur);
    public boolean estUneFeuille(Noeud n);
    public B_Arbre eclatement(B_Arbre arbre, int ordre);
    public int positionInsertion(B_Arbre arbre, int valeur);
    public boolean insertCleNoeud(Noeud n, int valeur, int position);
    public boolean insertArbreNoeud(Noeud noeud, Noeud arbre, int position);
    public B_Arbre initBArbre();
    
}

