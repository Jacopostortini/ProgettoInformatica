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
public abstract class Personaggio {
    
    protected int esperienza;
    protected String schieramento;

    public int getEsperienza() {
        return esperienza;
    }

    public void setEsperienza(int esperienza) {
        this.esperienza = esperienza;
    }

    public String getSchieramento() {
        return schieramento;
    }

    public void setSchieramento(String schieramento) throws Exception{
        if(schieramento.equals("bene") || schieramento.equals("male")) this.schieramento = schieramento;
        else throw new Exception("Schieramento non valido");
    }
   
    
    public abstract int getForza();
}
