/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoinfo;

/**
 *
 * @author tonma
 */
public class Adulto extends Personaggio {
    
    public Adulto(int esperienza) {
        super(esperienza);
        this.schieramento = "bene";
    }

    @Override
    public int getForza() {
        return this.esperienza*6+30; //Gli adulti li ho paragonati agli Uomini del gioco originale
    }
    
    
    
}
