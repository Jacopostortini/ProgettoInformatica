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
public class Covid extends Personaggio {
    
    public Covid(int esperienza) {
        super(esperienza);
        this.schieramento = "male";
    }

    @Override
    public int getForza() {
        if (this.esperienza<5){
            return this.esperienza*2+30;
        }
        else{
            return this.esperienza*3+70; //Il covid l'ho paragonato agli Orchi del gioco originale
        }
    }
    
    
}
