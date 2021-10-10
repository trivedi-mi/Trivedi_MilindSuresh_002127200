/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import model.UberCar;
import model.UberCarList;

/**
 *
 * @author Milind
 */
public class ViewUberCarCatalogJPanel extends javax.swing.JPanel {
    private JPanel jPanel2;
    private UberCar car;
    private UberCarList carList;

    /**
     * Creates new form ViewUberCarCatalogJPanel
     */
    ViewUberCarCatalogJPanel(JPanel jPanel2, UberCar car, UberCarList carList) {
        initComponents();
        
         this.jPanel2 = jPanel2;
          this.car = car; 
        this.carList = carList;
       
       
        populateCarDetails();
        jButtonSave.setEnabled(false);
        jButtonUpdate.setEnabled(true);
    }
    
    ViewUberCarCatalogJPanel(JPanel jPane, UberCar result) {
        initComponents();
        
         this.jPanel2 = jPanel2;
          this.car = car; 
        this.carList = carList;
       
       
        populateCarDetails();
        jButtonSave.setEnabled(false);
        jButtonUpdate.setEnabled(true);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void populateCarDetails(){
        System.out.println("Populate");
        System.out.println(car.getBrand());
        jTextFieldBrand.setText(car.getBrand());
        jTextFieldModelNum.setText(car.getModelNumber());
        jTextFieldYearOfManu.setText(Integer.toString(car.getManufacturedYear()));
        jTextFieldMinimumSeats.setText(Integer.toString(car.getMinSeats()));
        jTextFieldMaximumSeats.setText(Integer.toString(car.getMaxSeats()));
        jTextFieldSerialNumber.setText(car.getSerialNumber());
        jTextFieldCity.setText(car.getAvailableCity());
        jCheckBoxCarAvailabilty.setSelected(car.isAvailable());
        jCheckBoxMaintenanceCertificate.setSelected(car.isMaintenanceCertificate());
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
        jLabelMaintenanceCertificate = new javax.swing.JLabel();
        jCheckBoxMaintenanceCertificate = new javax.swing.JCheckBox();
        jButtonSave = new javax.swing.JButton();
        jTextFieldBrand = new javax.swing.JTextField();
        jTextFieldModelNum = new javax.swing.JTextField();
        jTextFieldYearOfManu = new javax.swing.JTextField();
        jTextFieldMinimumSeats = new javax.swing.JTextField();
        jTextFieldMaximumSeats = new javax.swing.JTextField();
        jTextFieldSerialNumber = new javax.swing.JTextField();
        jTextFieldCity = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitle.setText("View Uber Car Details");

        jLabelBrandName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelBrandName.setText("Brand Name:");

        jLabelModelNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelModelNumber.setText("Model Number:");

        jLabelManufactureYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelManufactureYear.setText("Year of Manufacture:");

        jLabelMinSeats.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMinSeats.setText("Minimum Seats:");

        jLabelMaxSeats.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMaxSeats.setText("Maximum Seats:");

        jLabelCarAvailability.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCarAvailability.setText("Is Car Available?");

        jCheckBoxCarAvailabilty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBoxCarAvailabilty.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBoxCarAvailabilty.setEnabled(false);

        jLabelCarSerialNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCarSerialNumber.setText("Serial Number:");

        jLabelCarCity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCarCity.setText("City:");

        jLabelMaintenanceCertificate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMaintenanceCertificate.setText("Maintenance Certificate Valid?");

        jCheckBoxMaintenanceCertificate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxMaintenanceCertificate.setEnabled(false);

        jButtonSave.setText("SAVE");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jTextFieldBrand.setEditable(false);
        jTextFieldBrand.setBackground(new java.awt.Color(240, 240, 240));

        jTextFieldModelNum.setEditable(false);

        jTextFieldYearOfManu.setEditable(false);

        jTextFieldMinimumSeats.setEditable(false);

        jTextFieldMaximumSeats.setEditable(false);

        jTextFieldSerialNumber.setEditable(false);
        jTextFieldSerialNumber.setBackground(new java.awt.Color(240, 240, 240));

        jTextFieldCity.setEditable(false);

        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonBack.setText("BACK");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelMaintenanceCertificate)
                            .addComponent(jLabelCarCity)
                            .addComponent(jLabelCarSerialNumber)
                            .addComponent(jLabelModelNumber)
                            .addComponent(jLabelBrandName)
                            .addComponent(jLabelManufactureYear)
                            .addComponent(jLabelMinSeats)
                            .addComponent(jLabelMaxSeats)
                            .addComponent(jLabelCarAvailability))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBoxMaintenanceCertificate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxCarAvailabilty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldBrand)
                            .addComponent(jTextFieldModelNum)
                            .addComponent(jTextFieldYearOfManu)
                            .addComponent(jTextFieldMinimumSeats)
                            .addComponent(jTextFieldMaximumSeats)
                            .addComponent(jTextFieldSerialNumber)
                            .addComponent(jTextFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 101, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonBack, jButtonSave, jButtonUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelTitle)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCarSerialNumber)
                    .addComponent(jTextFieldSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMaintenanceCertificate)
                    .addComponent(jCheckBoxMaintenanceCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonSave))
                .addGap(52, 52, 52))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonBack, jButtonSave, jButtonUpdate});

    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        
        
        jTextFieldModelNum.setEditable(true);
        
        jTextFieldMinimumSeats.setEditable(true);
        jTextFieldMaximumSeats.setEditable(true);
       
        jTextFieldCity.setEditable(true);
        jCheckBoxCarAvailabilty.setEnabled(true);
        jCheckBoxMaintenanceCertificate.setEnabled(true);
        jButtonSave.setEnabled(true);
        jButtonUpdate.setEnabled(false);
        carList.setCurrentDate(new Date());
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        
        car.setBrand(jTextFieldBrand.getText());
        car.setModelNumber(jTextFieldModelNum.getText());
        car.setManufacturedYear(Integer.parseInt(jTextFieldYearOfManu.getText()));
        car.setMinSeats(Integer.parseInt(jTextFieldMinimumSeats.getText()));
        car.setMaxSeats(Integer.parseInt(jTextFieldMaximumSeats.getText()));
        car.setSerialNumber(jTextFieldSerialNumber.getText());
        car.setAvailableCity(jTextFieldCity.getText());
        car.setMaintenanceCertificate(jCheckBoxMaintenanceCertificate.isSelected());
        car.setAvailable(jCheckBoxCarAvailabilty.isSelected());
        jButtonSave.setEnabled(false);
        jButtonUpdate.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Car details updated successfully");
        carList.setCurrentDate(new Date());
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        jPanel2.remove(this);
        CardLayout layout = (CardLayout) jPanel2.getLayout();
        layout.previous(jPanel2);
    }//GEN-LAST:event_jButtonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JCheckBox jCheckBoxCarAvailabilty;
    private javax.swing.JCheckBox jCheckBoxMaintenanceCertificate;
    private javax.swing.JLabel jLabelBrandName;
    private javax.swing.JLabel jLabelCarAvailability;
    private javax.swing.JLabel jLabelCarCity;
    private javax.swing.JLabel jLabelCarSerialNumber;
    private javax.swing.JLabel jLabelMaintenanceCertificate;
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
