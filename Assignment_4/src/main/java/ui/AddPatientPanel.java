/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Clinic;


import model.Patient;
import model.EncounterHistory;


/**
 *
 * @author Milind
 */
public class AddPatientPanel extends javax.swing.JPanel {
    Clinic clinic=Clinic.getInstance();
    
     
    

    /**
     * Creates new form AddPatientPanel
     */
    public AddPatientPanel() {
        
        initComponents();
        
        


        


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //public static void avalibleOptions(Patient patient) {
     
    public void getInitialContents() throws FileNotFoundException, IOException
    
    {
        
        Scanner s = new Scanner(new File("newfile.txt"));
        s.useDelimiter(",");
ArrayList<String> list = new ArrayList<String>();
while (s.hasNext()){
    list.add(s.next());
}
s.close();
System.out.println(list);
System.out.println(list.size());

        
        for(int i=0;i<list.size();i+=10)
        {
            System.out.println(i);
            int res=Integer.parseInt(list.get(i+6));
            
            System.out.println(res);
            int age=Integer.parseInt(list.get(i+1));
            int heart=Integer.parseInt(list.get(i+7));
                     int bp=Integer.parseInt(list.get(i+8));
                         int kg=Integer.parseInt(list.get(i+9));
            clinic.addnewPatienttoTheDirectory(list.get(i),age,list.get(i+2),list.get(i+3),list.get(i+4),list.get(i+5),res,heart,bp,kg);
        
        
        



    }}
    
    public void dispPatientDirectory(){
    ArrayList<Patient> patientDirectory=clinic.getList();
        DefaultTableModel tbl = (DefaultTableModel) jTablePatientDirectory.getModel();
         tbl.setRowCount(0);
        
              
            int num = patientDirectory.size();
            
            int y=0;
            for (int i = 0; i < num; i++) {
                Object[] row = new Object[10];
                row[0]=i+1;
                row[1]=patientDirectory.get(i).getPersonName();
                row[2]=patientDirectory.get(i).getMobileNumber();
                
                tbl.addRow(row);
                        
                System.out.println((i + 1) + ". " + patientDirectory.get(i).getPersonName() + "   " + patientDirectory.get(i).getMobileNumber());
            }

           
    }
    
    
    
     
     
     
     
    private int checkIfNumberALreadyExists(String mobileNumber) {
        ArrayList<Patient> patientDirectory=clinic.getList();
        for (int i = 0; i < patientDirectory.size(); i++) {

            {
                if (patientDirectory.get(i).getMobileNumber() == null ? mobileNumber == null : patientDirectory.get(i).getMobileNumber().equals(mobileNumber)) {
                   
                    return i;
                    
                    
                }
            }

        }
        return -1;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelVitalSigns = new javax.swing.JLabel();
        jLabelPatientRespi = new javax.swing.JLabel();
        jTextFieldPatientRespiRate = new javax.swing.JTextField();
        jLabelPatientHeart = new javax.swing.JLabel();
        jTextFieldPatientHeart = new javax.swing.JTextField();
        jLabelPatientBP = new javax.swing.JLabel();
        jTextFieldPatientBP = new javax.swing.JTextField();
        jLabelPatientWeight = new javax.swing.JLabel();
        jButtonSaveAddPatient = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePatientDirectory = new javax.swing.JTable();
        ShowPatientDirectory = new javax.swing.JButton();
        jButtonDeletePatient = new javax.swing.JButton();
        jTextFieldPatientWeight = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelPatientName = new javax.swing.JLabel();
        jTextFieldPatientName = new javax.swing.JTextField();
        jLabelPatientAge = new javax.swing.JLabel();
        jTextFieldPatientAge = new javax.swing.JTextField();
        jLabelPatientMobileNumber = new javax.swing.JLabel();
        jTextFieldPatientMobile = new javax.swing.JTextField();
        jLabelPatientResidenceHouse = new javax.swing.JLabel();
        jTextFieldPatientResidenceHouse = new javax.swing.JTextField();
        jLabelPatientResidenceCommu = new javax.swing.JLabel();
        jTextFieldPatientResidenceCommu = new javax.swing.JTextField();
        jLabelPatientResidenceZip = new javax.swing.JLabel();
        jTextFieldPatientResidenceZip = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabelVitalSigns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVitalSigns.setText("Enter Patient Vital Signs");

        jLabelPatientRespi.setText("Enter Respiratory Rate:");

        jLabelPatientHeart.setText("Enter Heart Rate:");

        jLabelPatientBP.setText("Enter Blood Pressure:");

        jTextFieldPatientBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPatientBPActionPerformed(evt);
            }
        });

        jLabelPatientWeight.setText("Enter Weight in Kg:");

        jButtonSaveAddPatient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSaveAddPatient.setText("ADD PATIENT");
        jButtonSaveAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveAddPatientActionPerformed(evt);
            }
        });

        jTablePatientDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Name", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablePatientDirectory);

        ShowPatientDirectory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ShowPatientDirectory.setText("DISPLAY PATIENT DIRECTORY");
        ShowPatientDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPatientDirectoryActionPerformed(evt);
            }
        });

        jButtonDeletePatient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonDeletePatient.setText("DELETE SELECTED PATIENT");
        jButtonDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletePatientActionPerformed(evt);
            }
        });

        jTextFieldPatientWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPatientWeightActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PATIENT PANEL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Enter Patient Details");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        jLabel3.setText("PATIENT DIRECTORY");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelPatientName.setText("Enter Name:");

        jLabelPatientAge.setText("Enter Age:");

        jLabelPatientMobileNumber.setText("Enter Mobile:");

        jLabelPatientResidenceHouse.setText("Enter House Address:");

        jLabelPatientResidenceCommu.setText("Enter Community:");

        jLabelPatientResidenceZip.setText("Enter Zip Code:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPatientHeart)
                            .addComponent(jLabelPatientBP)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPatientWeight, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPatientRespi, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPatientBP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPatientHeart, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPatientWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPatientRespiRate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 494, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ShowPatientDirectory)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(333, 333, 333))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(418, 418, 418))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelPatientAge)
                                    .addComponent(jLabelPatientName)
                                    .addComponent(jLabelPatientMobileNumber)
                                    .addComponent(jLabelPatientResidenceHouse)
                                    .addComponent(jLabelPatientResidenceCommu)
                                    .addComponent(jLabelPatientResidenceZip))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPatientMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPatientResidenceHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPatientResidenceCommu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPatientResidenceZip, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jButtonSaveAddPatient))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPatientName)
                            .addComponent(jTextFieldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPatientAge)
                            .addComponent(jTextFieldPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPatientMobileNumber)
                            .addComponent(jTextFieldPatientMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPatientResidenceHouse)
                            .addComponent(jTextFieldPatientResidenceHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPatientResidenceCommu)
                            .addComponent(jTextFieldPatientResidenceCommu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPatientResidenceZip)
                            .addComponent(jTextFieldPatientResidenceZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(jLabelVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPatientRespi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPatientRespiRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPatientHeart, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPatientHeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPatientBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPatientBP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPatientWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPatientWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ShowPatientDirectory)
                            .addComponent(jButtonDeletePatient))))
                .addGap(18, 18, 18)
                .addComponent(jButtonSaveAddPatient)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveAddPatientActionPerformed
        // TODO add your handling code here:
        
        
        
        try{
            
           Integer.parseInt(jTextFieldPatientAge.getText()); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter a number for age!");
            return;
        }
        
        try
        {
        String phNo=jTextFieldPatientMobile.getText();
        String PATTERN="^[0-9]{3}[0-9]{3}[0-9]{4}$";
        
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(phNo);
        if (!match.matches()){
            throw new Exception();
        }}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid 10 digit Mobile numberin format XXXXXXXXXX!");
            return;
            
        }
        
        try{
            if("".equals(jTextFieldPatientResidenceCommu.getText())){
             throw new Exception();
        }}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter patient's residence community!");
            return;
        }
        try{
        String zipCode=jTextFieldPatientResidenceZip.getText();
        String PATTERN="^[0-9]{5}";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(zipCode);
        
        if (!match.matches()){    
        {
            
            throw new Exception();
        }}}
       catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter valid 5 digit zip code!");
            return;
        }
        
        try{
            
           Integer.parseInt(jTextFieldPatientRespiRate.getText()); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter valid respiratory rate!");
            return;
        }
        try{
            
           Integer.parseInt(jTextFieldPatientHeart.getText()); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter valid heart rate!");
            return;
        }
        try{
            
           Integer.parseInt(jTextFieldPatientBP.getText()); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter valid blood pressure!");
            return;
        }
        try{
            
           Integer.parseInt(jTextFieldPatientWeight.getText()); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter valid weight!");
            return;
        }
        
        try{
        ArrayList<Patient> patientDirectory=clinic.getList();
        for(int i=0;i<patientDirectory.size();i++){
        if(jTextFieldPatientMobile.getText().equals(patientDirectory.get(i).getMobileNumber())){
            
            
        
            throw new Exception();
        }
        }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Mobile number already exists!");
            return;
        
        }
        int age=Integer.parseInt(jTextFieldPatientAge.getText());
        int respi=Integer.parseInt(jTextFieldPatientRespiRate.getText());
        int heart=Integer.parseInt(jTextFieldPatientHeart.getText());
        int bp=Integer.parseInt(jTextFieldPatientBP.getText());
        int kg= Integer.parseInt(jTextFieldPatientWeight.getText());
        clinic.addnewPatienttoTheDirectory(jTextFieldPatientName.getText(),age,jTextFieldPatientMobile.getText(),jTextFieldPatientResidenceCommu.getText(),jTextFieldPatientResidenceZip.getText(),
        jTextFieldPatientResidenceHouse.getText(),respi,heart,bp,kg);
        JOptionPane.showMessageDialog(null, "Patient registration successful!");
        
        jTextFieldPatientName.setText(null);
        jTextFieldPatientAge.setText(null);
        jTextFieldPatientMobile.setText(null);
        jTextFieldPatientResidenceHouse.setText(null);
        jTextFieldPatientResidenceZip.setText(null);
        jTextFieldPatientRespiRate.setText(null);
        jTextFieldPatientHeart.setText(null);
        jTextFieldPatientBP.setText(null);
        jTextFieldPatientWeight.setText(null);
        jTextFieldPatientResidenceCommu.setText(null);
        
        
       

        
        
        
    }//GEN-LAST:event_jButtonSaveAddPatientActionPerformed

    private void jTextFieldPatientBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPatientBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPatientBPActionPerformed

    private void ShowPatientDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPatientDirectoryActionPerformed
        // TODO add your handling code here:
        dispPatientDirectory();
        
        
        
    
    }//GEN-LAST:event_ShowPatientDirectoryActionPerformed

    private void jButtonDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletePatientActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbl = (DefaultTableModel) jTablePatientDirectory.getModel();
    int selectedRow = jTablePatientDirectory.getSelectedRow();
        if(selectedRow >= 0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the selected patient details?","Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                String mobile =(String) tbl.getValueAt(selectedRow, 2);
                if (checkIfNumberALreadyExists(mobile) != -1) {
                    ArrayList<Patient> patientDirectory=clinic.getList();
                    patientDirectory.remove(patientDirectory.get(checkIfNumberALreadyExists(mobile)));
                    dispPatientDirectory();
                    
                }
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row to delete", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_jButtonDeletePatientActionPerformed

    private void jTextFieldPatientWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPatientWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPatientWeightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ShowPatientDirectory;
    private javax.swing.JButton jButtonDeletePatient;
    private javax.swing.JButton jButtonSaveAddPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelPatientAge;
    private javax.swing.JLabel jLabelPatientBP;
    private javax.swing.JLabel jLabelPatientHeart;
    private javax.swing.JLabel jLabelPatientMobileNumber;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelPatientResidenceCommu;
    private javax.swing.JLabel jLabelPatientResidenceHouse;
    private javax.swing.JLabel jLabelPatientResidenceZip;
    private javax.swing.JLabel jLabelPatientRespi;
    private javax.swing.JLabel jLabelPatientWeight;
    private javax.swing.JLabel jLabelVitalSigns;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePatientDirectory;
    private javax.swing.JTextField jTextFieldPatientAge;
    private javax.swing.JTextField jTextFieldPatientBP;
    private javax.swing.JTextField jTextFieldPatientHeart;
    private javax.swing.JTextField jTextFieldPatientMobile;
    private javax.swing.JTextField jTextFieldPatientName;
    private javax.swing.JTextField jTextFieldPatientResidenceCommu;
    private javax.swing.JTextField jTextFieldPatientResidenceHouse;
    private javax.swing.JTextField jTextFieldPatientResidenceZip;
    private javax.swing.JTextField jTextFieldPatientRespiRate;
    private javax.swing.JTextField jTextFieldPatientWeight;
    // End of variables declaration//GEN-END:variables
}
