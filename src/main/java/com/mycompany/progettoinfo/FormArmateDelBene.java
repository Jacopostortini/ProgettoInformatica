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
public class FormArmateDelBene extends javax.swing.JFrame {
    
    private int numeroArmateTotali = 10;
    private int numeroEroiTotali = 2;
    private int numeroEsperienza = 1;
    private int forzaTotale;
    private String[] nomiEroi = {"Vaccino", "Immune", "Giulio Tarro"};

    /**
     * Creates new form Main
     */
    public FormArmateDelBene(int forzaTotale) {
        initComponents();
        this.forzaTotale = forzaTotale;
    }

    public int calcolaForza(int bam, int ad, int anz, int sc, int numEroi){
        Bambino bambino = new Bambino(numeroEsperienza);
        Adulto adulto = new Adulto(numeroEsperienza);
        Anziano anziano = new Anziano(numeroEsperienza);
        Scienziato scienziato = new Scienziato(numeroEsperienza);
        Eroe[] eroi = new Eroe[numEroi];
        int forzaEroi = 0;
        for(Eroe e : eroi){
            e = new Eroe(numeroEsperienza, nomiEroi[(int)(Math.random()*3)], (int)(Math.random()*11+1), "bene");
            forzaEroi += e.getForza();
        }
        int forza = bambino.getForza()*bam+adulto.getForza()*ad+anziano.getForza()*anz+scienziato.getForza()*sc+forzaEroi;
        return forza;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numeroBambini = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numeroAdulti = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numeroAnziani = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numeroScienziati = new javax.swing.JTextField();
        armateTotali = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        eroiTotali = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        esperienza = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        compraEsperienza = new javax.swing.JButton();
        consegnaButton = new javax.swing.JButton();
        errore = new javax.swing.JLabel();
        vendiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inserire il numero di bambini");

        jLabel2.setText("Inserire il numero di adulti");

        jLabel3.setText("Inserire il numero di anziani");

        jLabel4.setText("Inserire il numero di scienziati");

        armateTotali.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        armateTotali.setText("10");

        jLabel6.setText("Armate totali disponibili:");

        jLabel7.setText("Numero di eroi");

        eroiTotali.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        eroiTotali.setText("2");

        jLabel9.setText("Le tue armate hanno un'esperienza di:");

        esperienza.setText("1");

        jLabel8.setText("/10");

        compraEsperienza.setText("Compra esperienza");
        compraEsperienza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraEsperienzaActionPerformed(evt);
            }
        });

        consegnaButton.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        consegnaButton.setText("Consegna formazione");
        consegnaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consegnaButtonActionPerformed(evt);
            }
        });

        vendiButton.setText("Vendi esperienza");
        vendiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numeroBambini, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(numeroAdulti)
                            .addComponent(numeroAnziani)
                            .addComponent(numeroScienziati))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(armateTotali))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(59, 59, 59)
                                .addComponent(eroiTotali))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(consegnaButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(esperienza)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(52, 52, 52)
                                .addComponent(compraEsperienza)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(vendiButton)))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errore)
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroBambini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(numeroAdulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(armateTotali)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(numeroAnziani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel7)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(numeroScienziati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(eroiTotali)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(esperienza)
                    .addComponent(jLabel8)
                    .addComponent(compraEsperienza)
                    .addComponent(vendiButton))
                .addGap(59, 59, 59)
                .addComponent(consegnaButton)
                .addGap(18, 18, 18)
                .addComponent(errore)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compraEsperienzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraEsperienzaActionPerformed
        if(this.numeroEsperienza<10){
            this.numeroEsperienza++;
            this.esperienza.setText(this.numeroEsperienza+"");
            this.numeroEroiTotali = this.numeroEsperienza < 3 ? 2 : (this.numeroEsperienza<7 ? 1 : 0);
            this.eroiTotali.setText(this.numeroEroiTotali+"");
            this.numeroArmateTotali = 11-this.numeroEsperienza;
            this.armateTotali.setText(this.numeroArmateTotali+"");
        }
    }//GEN-LAST:event_compraEsperienzaActionPerformed

    private void consegnaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consegnaButtonActionPerformed
        try{
            int bambiniInseriti = Integer.parseUnsignedInt(numeroBambini.getText());
            int adultiInseriti = Integer.parseUnsignedInt(numeroAdulti.getText());
            int anzianiInseriti = Integer.parseUnsignedInt(numeroAnziani.getText());
            int scienziatiInseriti = Integer.parseUnsignedInt(numeroScienziati.getText());
            if(bambiniInseriti+adultiInseriti+anzianiInseriti+scienziatiInseriti <= this.numeroArmateTotali){
                this.setVisible(false);
                this.forzaTotale = calcolaForza(bambiniInseriti, adultiInseriti, anzianiInseriti, scienziatiInseriti, numeroEroiTotali);
            } else {
                errore.setText("Le tue armate superano il numero consentito");
                return;
            }
        } catch (Exception e){
            errore.setText("Devi inserire solo dei numeri positivi");
            return;
        }
       
    }//GEN-LAST:event_consegnaButtonActionPerformed

    private void vendiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendiButtonActionPerformed
        if(this.numeroEsperienza>1){
            this.numeroEsperienza--;
            this.esperienza.setText(this.numeroEsperienza+"");
            this.numeroEroiTotali = this.numeroEsperienza < 3 ? 2 : (this.numeroEsperienza<7 ? 1 : 0);
            this.eroiTotali.setText(this.numeroEroiTotali+"");
            this.numeroArmateTotali = 11-this.numeroEsperienza;
            this.armateTotali.setText(this.numeroArmateTotali+"");
        }
    }//GEN-LAST:event_vendiButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel armateTotali;
    private javax.swing.JButton compraEsperienza;
    private javax.swing.JButton consegnaButton;
    private javax.swing.JLabel eroiTotali;
    private javax.swing.JLabel errore;
    private javax.swing.JLabel esperienza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numeroAdulti;
    private javax.swing.JTextField numeroAnziani;
    private javax.swing.JTextField numeroBambini;
    private javax.swing.JTextField numeroScienziati;
    private javax.swing.JButton vendiButton;
    // End of variables declaration//GEN-END:variables
}
