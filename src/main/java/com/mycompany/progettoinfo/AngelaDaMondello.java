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
public class AngelaDaMondello extends Personaggio {
    
    public AngelaDaMondello(int esperienza) {
        super(esperienza);
        this.schieramento = "male";
    }

    @Override
    public int getForza() {
        return this.esperienza*5+40; //Angela Da Mondello l'ho paragonata ai Sudroni del gioco originale
    }
    
    
}
