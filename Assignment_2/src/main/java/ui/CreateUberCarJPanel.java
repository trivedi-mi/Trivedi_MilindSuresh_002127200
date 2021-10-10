/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.UberCar;
import model.UberCarList;
import java.lang.Exception;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Milind
 */
public class CreateUberCarJPanel extends javax.swing.JPanel {
    private JPanel jPanelCreate;
    private UberCarList listCar;
    private UberCar car;
    

    /**
     * Creates new form CreateUberCarJPanel
     */
    public CreateUberCarJPanel(JPanel jPanelCreate , UberCarList listCar) {
        initComponents();
        this.jPanelCreate = jPanelCreate;
        this.listCar = listCar;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelBrandName = new javax.swing.JLabel();
        jLabelModelNumber = new javax.swing.JLabel();
        jLabelManufactureYear = new javax.swing.JLabel();
        jLabelMinSeats = new javax.swing.JLabel();
        jLabelMaxSeats = new javax.swing.JLabel();
        jLabelCarAvailability = new javax.swing.JLabel();
        jCheckBoxCarAvailabilty = new javax.swing.JCheckBox();
        jLabelCarSerialNumber = new javax.swing.JLabel();
        jLabelCarCity = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jTextFieldBrand = new javax.swing.JTextField();
        jTextFieldModelNum = new javax.swing.JTextField();
        jTextFieldYearOfManu = new javax.swing.JTextField();
        jTextFieldMinimumSeats = new javax.swing.JTextField();
        jTextFieldMaximumSeats = new javax.swing.JTextField();
        jTextFieldSerialNumber = new javax.swing.JTextField();
        jTextFieldCity = new javax.swing.JTextField();
        JLabelMainCertiValid = new javax.swing.JLabel();
        jDateChooserValid = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(153, 255, 204));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitle.setText("Register Car With Uber");

        jLabelBrandName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelBrandName.setText("Brand Name*:");

        jLabelModelNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelModelNumber.setText("Model Number:");

        jLabelManufactureYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelManufactureYear.setText("Year of Manufacture(YYYY):");

        jLabelMinSeats.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMinSeats.setText("Minimum Seats:");

        jLabelMaxSeats.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMaxSeats.setText("Maximum Seats:");

        jLabelCarAvailability.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCarAvailability.setText("Car Availability:");

        jCheckBoxCarAvailabilty.setText("Click for Yes");

        jLabelCarSerialNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCarSerialNumber.setText("Serial Number*:");

        jLabelCarCity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCarCity.setText("City:");

        jButtonSave.setText("REGISTER");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        JLabelMainCertiValid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLabelMainCertiValid.setText("Maintenance Certificate Valid Till*:");

        jDateChooserValid.setDateFormatString("dd-MMM-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jButtonSave))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelTitle)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelCarCity)
                                .addComponent(jLabelCarSerialNumber)
                                .addComponent(jLabelModelNumber)
                                .addComponent(jLabelBrandName)
                                .addComponent(jLabelManufactureYear)
                                .addComponent(jLabelMinSeats)
                                .addComponent(jLabelMaxSeats)
                                .addComponent(jLabelCarAvailability)
                                .addComponent(JLabelMainCertiValid))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckBoxCarAvailabilty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldBrand)
                                .addComponent(jTextFieldModelNum)
                                .addComponent(jTextFieldYearOfManu)
                                .addComponent(jTextFieldMinimumSeats)
                                .addComponent(jTextFieldMaximumSeats)
                                .addComponent(jTextFieldSerialNumber)
                                .addComponent(jTextFieldCity)
                                .addComponent(jDateChooserValid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelTitle)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCarSerialNumber)
                    .addComponent(jTextFieldSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBrandName)
                    .addComponent(jTextFieldBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModelNumber)
                    .addComponent(jTextFieldModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelManufactureYear)
                    .addComponent(jTextFieldYearOfManu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMinSeats)
                    .addComponent(jTextFieldMinimumSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMaxSeats)
                    .addComponent(jTextFieldMaximumSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxCarAvailabilty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCarAvailability))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCarCity)
                    .addComponent(jTextFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelMainCertiValid)
                    .addComponent(jDateChooserValid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButtonSave)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private int FindExpiration(String dateMain) throws ParseException  {
        // To compare Expiration
        int flag=0;
         
        
           
            
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
      //Date date1 = sdf.parse("2009-12-31");
      Date date1 = sdf.parse(dateMain);
      Date date2 = new Date();

      

      if (dateMain.equals(sdf.format(date2))) {
          System.out.println("Date1 is equal Date2");
         
          
      }

      else if (date1.after(date2)) {
          System.out.println("Date1 is after Date2");
                    

      }

      else if (date1.before(date2)) {
          System.out.println("Date1 is before Date2");
          flag=1;
                    

      }

  
            
            
        return flag;
    }
    private int YearManufactureValidate(String inputYear) throws ParseException  {
        //Function to calculate age from date of birth
        int flag=0;
         
        
           
            
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
      
      Date date1 = sdf.parse(inputYear);
      Date date2 = new Date();

      

      if (inputYear.equals(sdf.format(date2))) {
          flag=1;
          System.out.println("Date1 is equal Date2");
          
          
      }

      else if (date1.after(date2)) {
          System.out.println("Date1 is after Date2");
                   

      }

      else if (date1.before(date2)) {
          System.out.println("Date1 is before Date2");
          flag=1;
                    
      }

  
            
            
        return flag;
    }
    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        System.out.println(jTextFieldBrand.getText());
        int manufacturedYear=0;
        String validateManu=jTextFieldYearOfManu.getText();
        int manuflag=0;
        
        
        int compareFlag=0;
        int minSeats=0;
        int maxSeats=0;
        Boolean maintenanceCertificate;
        
        
        
        String serialNumber =jTextFieldSerialNumber.getText(); 
        if(jTextFieldSerialNumber.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Serial number is mandatory");
            return;
        }
        String brand=jTextFieldBrand.getText();
        if(jTextFieldBrand.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Brand name is mandatory");
            return;
        }
        String serialNum=jTextFieldSerialNumber.getText();
        Boolean available = jCheckBoxCarAvailabilty.isSelected();
        try{
            if(!"".equals(jTextFieldYearOfManu.getText())){
           Integer.parseInt(jTextFieldYearOfManu.getText()); 
        }}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter numeric value for manufactured year");
            return;
        }
        try{
        if(!"".equals(jTextFieldYearOfManu.getText())){
            manuflag=YearManufactureValidate(jTextFieldYearOfManu.getText());
            System.out.println(manuflag);
            if(manuflag ==0){
             throw new Exception();
            }
         manufacturedYear = Integer.parseInt(jTextFieldYearOfManu.getText());
        }}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Year of manufacture cannot not be more than current year");
            return;
            
        }
        try{
            if(!"".equals(jTextFieldMinimumSeats.getText())){
           Integer.parseInt(jTextFieldMinimumSeats.getText()); 
        }}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter numeric value for minimum seats");
            return;
        }
        if(!"".equals(jTextFieldMinimumSeats.getText())){
        minSeats = Integer.parseInt(jTextFieldMinimumSeats.getText());
        }
        try{
            if(!"".equals(jTextFieldMaximumSeats.getText())){
           Integer.parseInt(jTextFieldMaximumSeats.getText()); 
        }}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter numeric value for maximum seats");
            return;
        }
        if(!"".equals(jTextFieldMaximumSeats.getText())){
         maxSeats = Integer.parseInt(jTextFieldMaximumSeats.getText());
        }
        
        String dateInsert  = ((JTextField)jDateChooserValid.getDateEditor().getUiComponent()).getText();
        
        if(dateInsert.equals("")){
        JOptionPane.showMessageDialog(null, "Maintenance expiration Date is mandatory");
            return;
        }
        try {
            compareFlag=FindExpiration(dateInsert);
            System.out.println(compareFlag);
        } catch (ParseException ex) {
            Logger.getLogger(CreateUberCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
         
        
        for(UberCar car : listCar.getCarList()){
            Object[] row = new Object[10];
            
            
            
            if(car.getSerialNumber().equals(serialNum)){
                throw new Exception();
                  
            }
            else{
            serialNum = jTextFieldSerialNumber.getText();}
        }}
        catch(Exception e){
          JOptionPane.showMessageDialog(null, "Serial Number already registered");
          return;
        }
        //String serialNum = jTextFieldSerialNumber.getText();
        String modelNum = jTextFieldModelNum.getText();
        String availableCity = jTextFieldCity.getText();
        if(compareFlag == 1){
        maintenanceCertificate = false;
        }
        else{
        maintenanceCertificate = true;
        
        }

         
        UberCar car = listCar.addCar(brand, manufacturedYear, minSeats, maxSeats, serialNum, modelNum, availableCity, maintenanceCertificate,available);
        car.setBrand(brand);
        car.setAvailable(available);
        car.setManufacturedYear(manufacturedYear);
        car.setMinSeats(minSeats);
        car.setMaxSeats(maxSeats);
        car.setSerialNumber(serialNum);
        car.setModelNumber(modelNum);
        car.setAvailableCity(availableCity);
        car.setMaintenanceCertificate(maintenanceCertificate);
        car.setAvailable(available);
        JOptionPane.showMessageDialog(null, "Car Registered successfully");
        listCar.setCurrentDate(new Date());
        jTextFieldBrand.setText("");
        jCheckBoxCarAvailabilty.setText("");
        jTextFieldYearOfManu.setText("");
        jTextFieldMinimumSeats.setText("");
        jTextFieldMaximumSeats.setText("");
        jTextFieldSerialNumber.setText("");
        jTextFieldModelNum.setText("");
        jTextFieldCity.setText("");
        ((JTextField)jDateChooserValid.getDateEditor().getUiComponent()).setText("");
        
        jCheckBoxCarAvailabilty.setSelected(false);
        
        
        
    }//GEN-LAST:event_jButtonSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelMainCertiValid;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JCheckBox jCheckBoxCarAvailabilty;
    private com.toedter.calendar.JDateChooser jDateChooserValid;
    private javax.swing.JLabel jLabelBrandName;
    private javax.swing.JLabel jLabelCarAvailability;
    private javax.swing.JLabel jLabelCarCity;
    private javax.swing.JLabel jLabelCarSerialNumber;
    private javax.swing.JLabel jLabelManufactureYear;
    private javax.swing.JLabel jLabelMaxSeats;
    private javax.swing.JLabel jLabelMinSeats;
    private javax.swing.JLabel jLabelModelNumber;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField jTextFieldBrand;
    private javax.swing.JTextField jTextFieldCity;
    private javax.swing.JTextField jTextFieldMaximumSeats;
    private javax.swing.JTextField jTextFieldMinimumSeats;
    private javax.swing.JTextField jTextFieldModelNum;
    private javax.swing.JTextField jTextFieldSerialNumber;
    private javax.swing.JTextField jTextFieldYearOfManu;
    // End of variables declaration//GEN-END:variables
}
