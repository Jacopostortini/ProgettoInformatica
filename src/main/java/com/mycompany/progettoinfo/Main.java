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
        MainForm form = new MainForm();
        FormArmateDelMale formMale = new FormArmateDelMale(form);
        FormArmateDelBene formBene = new FormArmateDelBene(formMale); 
        form.setFormBene(formBene);
        form.setFormMale(formMale);
        formBene.setVisible(true);
        
       
    }
    
}
