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
public class Eroe extends Personaggio {
    
    String nome;
    int energiaVitale;
    String schieramento;

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergiaVitale() {
        return energiaVitale;
    }

    public void setEnergiaVitale(int energiaVitale) {
        this.energiaVitale = energiaVitale;
    }

    public String getSchieramento() {
        return schieramento;
    }

    public void setSchieramento(String schieramento)throws Exception {
        if(schieramento.equals("bene") || schieramento.equals("male")) this.schieramento = schieramento;
        else throw new Exception("Schieramento non valido");
    }
    
    

    @Override
    public int getForza() {
        return this.esperienza*50+energiaVitale*50;
    }
    
}
