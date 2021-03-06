/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletest;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Merlin
 */
public class AddTable extends javax.swing.JFrame {
    
    boolean DataCorrect=false;
    boolean AddFinshed=false;
    String[] textFieldInputs;
    String[] textFieldDefaultText; //Enthält die Beschreibungen der Eingabefelder, um zu prüfen, ob der Inhalt beim ersten Mal bearbeiten geläscht werden soll.
    public AddTable() {
        this.textFieldDefaultText = new String[]{"EAN", "Artikelname","Artikelbeschreibung","VK Preis in EUR","Bestand"};
        this.textFieldInputs = new String[5];
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lHeadline = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        tfEAN = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfBeschreibung = new javax.swing.JTextField();
        tfVkPreis = new javax.swing.JTextField();
        tfBestand = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Artikel hinzufügen");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        lHeadline.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lHeadline.setText("Artikel hinzufügen");

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        tfEAN.setText("EAN");
        tfEAN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEANFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEANFocusLost(evt);
            }
        });

        tfName.setText("Artikelname");
        tfName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNameFocusLost(evt);
            }
        });

        tfBeschreibung.setText("Artikelbeschreibung");
        tfBeschreibung.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfBeschreibungFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBeschreibungFocusLost(evt);
            }
        });

        tfVkPreis.setText("VK Preis in EUR");
        tfVkPreis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfVkPreisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfVkPreisFocusLost(evt);
            }
        });

        tfBestand.setText("Bestand");
        tfBestand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfBestandFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBestandFocusLost(evt);
            }
        });

        jLabel1.setLabelFor(tfEAN);
        jLabel1.setText("EAN");

        jLabel3.setText("Artikelname");

        jLabel4.setText("Artikelbeschreibung");

        jLabel5.setText("VK Preis in EUR");

        jLabel6.setText("Bestand");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEAN, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfBeschreibung, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfBestand, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(56, 56, 56)
                                .addComponent(tfVkPreis, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lHeadline)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lHeadline)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBeschreibung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVkPreis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBestand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(91, 91, 91)
                .addComponent(btnClose))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("Artikelnummer, die vom Scanner erkannt werden soll es handelt sich um eine Zahl, ohne Trennzeichen wie , oder .");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        //Auf Änderung der Felder prüfen.
        if (tfEAN.getText().equals(textFieldDefaultText[0])){
            tfEAN.setBackground(Color.red);
            DataCorrect=false;
        }
        if (tfName.getText().equals(textFieldDefaultText[1])){
            tfName.setBackground(Color.red);
            DataCorrect=false;
        }
        if (tfBeschreibung.getText().equals(textFieldDefaultText[2])){
            tfBeschreibung.setBackground(Color.red);
            DataCorrect=false;
        }
        if (tfVkPreis.getText().equals(textFieldDefaultText[3])){
            tfVkPreis.setBackground(Color.red);
            DataCorrect=false;
        }
        if (tfBestand.getText().equals(textFieldDefaultText[4])){
            tfBestand.setBackground(Color.red);
            DataCorrect=false;
        }
        
        
        //Nochmal checken ob etwas falsch ist, wenn der Bestand richtig ist reicht die Varabile Data Correct nicht aus.
        if (tfEAN.getBackground()==Color.RED){
            DataCorrect=false;
        }
        if (tfName.getBackground()==Color.RED){
            DataCorrect=false;
        }
        if (tfBeschreibung.getBackground()==Color.RED){
            DataCorrect=false;
        }
        if (tfVkPreis.getBackground()==Color.RED){
            DataCorrect=false;
        }
        if (tfBestand.getBackground()==Color.RED){
            DataCorrect=false;
        }
        
        if(DataCorrect){
        //Benutzereingaben in das Array schreiben
        textFieldInputs[0]=tfEAN.getText();
        textFieldInputs[1]=tfName.getText();
        textFieldInputs[2]=tfBeschreibung.getText();
        textFieldInputs[3]=tfVkPreis.getText();
        textFieldInputs[4]=tfBestand.getText();
        
        //Zurücksetzten der Felder auf Defaultwerte
        tfEAN.setText(textFieldDefaultText[0]);
        tfName.setText(textFieldDefaultText[1]);
        tfBeschreibung.setText(textFieldDefaultText[2]);
        tfVkPreis.setText(textFieldDefaultText[3]);
        tfBestand.setText((textFieldDefaultText[4]));
        AddFinshed=true;
        this.setVisible(false);
        }
        else{
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
            "Some data is missing or incorect.",
            "Look for the red fields!",
            JOptionPane.WARNING_MESSAGE);
        }
       
        
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tfEANFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEANFocusGained
        if(textFieldDefaultText[0].equals(tfEAN.getText())){
            tfEAN.setText("");
        }
    }//GEN-LAST:event_tfEANFocusGained

    private void tfNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNameFocusGained
        if(textFieldDefaultText[1].equals(tfName.getText())){
            tfName.setText("");
        }
    }//GEN-LAST:event_tfNameFocusGained

    private void tfBeschreibungFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBeschreibungFocusGained
        if(textFieldDefaultText[2].equals(tfBeschreibung.getText())){
            tfBeschreibung.setText("");
        }
    }//GEN-LAST:event_tfBeschreibungFocusGained

    private void tfVkPreisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfVkPreisFocusGained
        if(textFieldDefaultText[3].equals(tfVkPreis.getText())){
            tfVkPreis.setText("");
        }
    }//GEN-LAST:event_tfVkPreisFocusGained

    private void tfBestandFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBestandFocusGained
        if(textFieldDefaultText[4].equals(tfBestand.getText())){
            tfBestand.setText("");
        }
    }//GEN-LAST:event_tfBestandFocusGained

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        
    }//GEN-LAST:event_formWindowLostFocus

    private void tfEANFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEANFocusLost
        try {
            if(Integer.valueOf(tfEAN.getText())>0 
           && Integer.valueOf(tfEAN.getText())<100000)
            {
                DataCorrect=true;
                tfEAN.setBackground(Color.white);
            }
            else{
                tfEAN.setBackground(Color.red);
                DataCorrect=false;
        }
        } catch (Exception e) {
            tfEAN.setBackground(Color.red);
        }
        
    }//GEN-LAST:event_tfEANFocusLost

    private void tfNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNameFocusLost
        try {
            if(tfName.getText().equals(""))
            {
                tfName.setBackground(Color.red);
                DataCorrect=false;
            }
            else{
                DataCorrect=true;
                tfName.setBackground(Color.white);
            }
        } catch (Exception e) {
            tfName.setBackground(Color.red);
        }
    }//GEN-LAST:event_tfNameFocusLost

    private void tfBeschreibungFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBeschreibungFocusLost
        try {
            if(tfBeschreibung.getText().equals(""))
            {
                tfBeschreibung.setBackground(Color.red);
                DataCorrect=false;
            }
            else{
                DataCorrect=true;
                tfBeschreibung.setBackground(Color.white);
            }
        } catch (Exception e) {
            tfBeschreibung.setBackground(Color.red);
        }
    }//GEN-LAST:event_tfBeschreibungFocusLost

    private void tfVkPreisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfVkPreisFocusLost
        try {
            if(0<=Double.valueOf(tfVkPreis.getText()) )
            {
                DataCorrect=true;
                tfVkPreis.setBackground(Color.white);
            }
            else{
                tfVkPreis.setBackground(Color.red);
                DataCorrect=false;
        }
        } catch (Exception e) {
            if(tfVkPreis.getText().contains(",")){
                tfVkPreis.setText(tfVkPreis.getText().replace(',', '.'));
            }
            else{
                tfVkPreis.setBackground(Color.red);
            }
            
        }
    }//GEN-LAST:event_tfVkPreisFocusLost

    private void tfBestandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBestandFocusLost
        try {
            if(Integer.valueOf(tfBestand.getText())>0 
           && Integer.valueOf(tfBestand.getText())<100000)
            {
                DataCorrect=true;
                tfBestand.setBackground(Color.white);
            }
            else{
                tfBestand.setBackground(Color.red);
                DataCorrect=false;
        }
        } catch (Exception e) {
            tfBestand.setBackground(Color.red);
        }
    }//GEN-LAST:event_tfBestandFocusLost

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lHeadline;
    private javax.swing.JTextField tfBeschreibung;
    private javax.swing.JTextField tfBestand;
    private javax.swing.JTextField tfEAN;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfVkPreis;
    // End of variables declaration//GEN-END:variables
}
