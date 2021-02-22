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
public class Scienziato extends Personaggio {
    
    public Scienziato(int esperienza) {
        super(esperienza);
        this.schieramento = "bene";
    }

    @Override
    public int getForza() {
        if(this.esperienza<5){
            return this.esperienza*3+20;
        }
        else {
            return this.esperienza*2+80; //Gli scienziati li ho paragonati agli Elfi del gioco originale
        }
    }
    
}
