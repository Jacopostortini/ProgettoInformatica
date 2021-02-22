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
public class Influenza extends Personaggio {
    
    public Influenza(int esperienza) {
        super(esperienza);
        this.schieramento = "male";
    }

    @Override
    public int getForza() {
        return this.esperienza*4+20; //L'esperienza dell'influenza l'ho inventata io e l'ho impostata come la più debole visto che i componenti del male nel gioco sono 3 e noi ne abbiamo messi 4
        
    }
    
}
