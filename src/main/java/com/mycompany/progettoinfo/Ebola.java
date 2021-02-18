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
public class Ebola extends Personaggio {

    @Override
    public int getForza() {
        return this.esperienza*5+50; //L'ebola l'ho paragonata agli Urukhai del gioco originale
    }
    
}
