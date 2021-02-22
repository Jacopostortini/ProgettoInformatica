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
    
    public Anziano(int esperienza) {
        super(esperienza);
        this.schieramento = "bene";
    }
    
    @Override
    public int getForza() {
        return this.esperienza*3+10; //Gli anziani li ho paragonati agli Hobbit del gioco originale
    }
    
}
