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
public class Bambini extends Personaggio {

    @Override
    public int getForza() {
        return this.esperienza*4+20; //I bambini li ho paragonati ai Nani del gioco originale
    }
    
}
