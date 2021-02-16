/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoinfo;

/**
 *
 * @author jacopo
 */
public class Anziano extends Personaggio{

    @Override
    public int getForza() {
        //non so come deve essere calcolata la forza in funzione dell'esperienza però 
        //qui ci va il calcolo che è diverso per ogni razza o eroe
        return this.esperienza*100;
    }
    
}
