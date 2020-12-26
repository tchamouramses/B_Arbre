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
public interface b_arbres_fonctions_suppression {
    public int plusGrandeValeur(B_Arbre arbre);
    public int positionCleDansNoeudRacine(B_Arbre arbre, int cle);
    public int positionPouvantContenirValeur(B_Arbre arbre, int valeur);
    public boolean frere(B_Arbre arbre, int valeur);
    
    //les methodes ne sont pas toutes ajoutées
}
