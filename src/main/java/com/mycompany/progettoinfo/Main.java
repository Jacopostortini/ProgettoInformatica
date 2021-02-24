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
public class Main {
    
    public static void main(String args[]){
        int forzaBene = 0;
        int forzaMale = 0;
        MainForm form = new MainForm(forzaBene, forzaMale);
        FormArmateDelMale formMale = new FormArmateDelMale (forzaMale, form);
        FormArmateDelBene formBene = new FormArmateDelBene(forzaBene, formMale); 
        formBene.setVisible(true);
        
       
    }
    
}
