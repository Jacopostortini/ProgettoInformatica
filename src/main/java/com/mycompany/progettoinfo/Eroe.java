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
    
    private String nome;
    private int energiaVitale;

    public Eroe(int esperienza, String nome, int energiaVitale, String schieramento) {
        super(esperienza);
        this.nome = nome;
        this.energiaVitale = energiaVitale;
        this.schieramento = schieramento;
    }

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

    @Override
    public int getForza() {
        return this.esperienza*50+this.energiaVitale*50;
    }
    
}
