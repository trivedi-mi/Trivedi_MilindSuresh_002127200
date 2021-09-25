/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author Milind
 */
public class ViewJPanel extends javax.swing.JPanel {
    byte[] image;
    String imagePath="";
    ImageIcon myImage;

    /**
     * Creates new form ViewJPanel
     */
    Person person;
    public ViewJPanel(Person person) {
        initComponents();
        this.person=person;
        displayInfo();
    }
    public ImageIcon seticon(String m , byte[] image)
    {
        if(m  != null){
        myImage=new ImageIcon(m);
        
        }else{
        myImage=new ImageIcon(image);
        }
        Image img1=myImage.getImage();
        Image img2=img1.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        return i;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        lblTtile = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        lblPhNo = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        lblMedRecNo = new javax.swing.JLabel();
        lblHealthPlanNo = new javax.swing.JLabel();
        lblBkAccNo = new javax.swing.JLabel();
        lblLicNo = new javax.swing.JLabel();
        lblLicDoi = new javax.swing.JLabel();
        lblVehicleNo = new javax.swing.JLabel();
        lblLinkedInId = new javax.swing.JLabel();
        lblDevAdd = new javax.swing.JLabel();
        lblIpAdd = new javax.swing.JLabel();
        lblRetinalNo = new javax.swing.JLabel();
        lblFingerIdenNo = new javax.swing.JLabel();
        lblLocId = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtPhNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSsn = new javax.swing.JTextField();
        txtMedRecNo = new javax.swing.JTextField();
        txtHealthPlanNo = new javax.swing.JTextField();
        txtBkAccNo = new javax.swing.JTextField();
        txtLicNo = new javax.swing.JTextField();
        txtLicDoi = new javax.swing.JTextField();
        txtVehicleNo = new javax.swing.JTextField();
        txtDevAdd = new javax.swing.JTextField();
        txtLinkedInAdd = new javax.swing.JTextField();
        txtIpAdd = new javax.swing.JTextField();
        txtRetinalNo = new javax.swing.JTextField();
        txtFingerIdenNo = new javax.swing.JTextField();
        txtLocalIdNo = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblFaxNo = new javax.swing.JLabel();
        txtFaxNo = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        lblImageDisp = new javax.swing.JLabel();

        lblTtile.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        lblTtile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTtile.setText("Display");
        lblTtile.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblFirstName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFirstName.setText("*First Name:");

        lblLastName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLastName.setText("Last Name:");

        lblStreet.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblStreet.setText("Street Address:");

        lblCity.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCity.setText("City:");

        lblState.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblState.setText("State:");

        lblZip.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblZip.setText("*Zip:");

        lblPhNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPhNo.setText("*Phone Number:");

        lblDob.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDob.setText("*Date of birth:");

        lblEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEmail.setText("*Email:");

        lblSsn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSsn.setText("SSN:");

        lblMedRecNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMedRecNo.setText("Medical Record Number:");

        lblHealthPlanNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblHealthPlanNo.setText("Health Plan Number:");

        lblBkAccNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblBkAccNo.setText("Bank Account Number:");

        lblLicNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLicNo.setText("License Number:");

        lblLicDoi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLicDoi.setText("License Date Of Issue:");

        lblVehicleNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVehicleNo.setText("Vehicle Number:");

        lblLinkedInId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLinkedInId.setText("LinkedIn Id:");

        lblDevAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDevAdd.setText("Device Address:");

        lblIpAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIpAdd.setText("IP Address:");

        lblRetinalNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRetinalNo.setText("Retinal Identification Number:");

        lblFingerIdenNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFingerIdenNo.setText("Fingerprint Identification Number:");

        lblLocId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLocId.setText("Local Id Number:");

        txtRetinalNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetinalNotxtRetinalNo5txtRetinalNoActionPerformed(evt);
            }
        });

        txtFingerIdenNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFingerIdenNotxtFingerIdenNo10txtFingerIdenNoActionPerformed(evt);
            }
        });

        txtLocalIdNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalIdNotxtFingerIdenNo11txtFingerIdenNo1ActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAge.setText("Age:");

        lblFaxNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFaxNo.setText("Fax Number:");

        lblImage.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblImage.setText("Image:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFirstName)
                    .addComponent(lblLastName)
                    .addComponent(lblStreet)
                    .addComponent(lblCity)
                    .addComponent(lblState)
                    .addComponent(lblZip)
                    .addComponent(lblPhNo)
                    .addComponent(lblDob)
                    .addComponent(lblEmail)
                    .addComponent(lblSsn)
                    .addComponent(lblMedRecNo)
                    .addComponent(lblHealthPlanNo)
                    .addComponent(lblBkAccNo)
                    .addComponent(lblLicNo)
                    .addComponent(lblLicDoi)
                    .addComponent(lblVehicleNo)
                    .addComponent(lblDevAdd)
                    .addComponent(lblLinkedInId)
                    .addComponent(lblIpAdd)
                    .addComponent(lblRetinalNo)
                    .addComponent(lblFingerIdenNo)
                    .addComponent(lblLocId)
                    .addComponent(lblAge)
                    .addComponent(lblFaxNo)
                    .addComponent(lblImage))
                .addGap(33, 33, 33)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLocalIdNo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtFingerIdenNo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtRetinalNo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtIpAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtLinkedInAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtDevAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtVehicleNo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtLicDoi, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtLicNo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtBkAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtHealthPlanNo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtMedRecNo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtSsn, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtPhNo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtZip, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtDob)
                    .addComponent(txtAge)
                    .addComponent(txtFaxNo)
                    .addComponent(lblImageDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 653, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTtile, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(lblTtile)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreet)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHealthPlanNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHealthPlanNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBkAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBkAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLicNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLicDoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDevAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDevAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedInId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLinkedInAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRetinalNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRetinalNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFingerIdenNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFingerIdenNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocalIdNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImageDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1155, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRetinalNotxtRetinalNo5txtRetinalNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetinalNotxtRetinalNo5txtRetinalNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRetinalNotxtRetinalNo5txtRetinalNoActionPerformed

    private void txtFingerIdenNotxtFingerIdenNo10txtFingerIdenNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFingerIdenNotxtFingerIdenNo10txtFingerIdenNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFingerIdenNotxtFingerIdenNo10txtFingerIdenNoActionPerformed

    private void txtLocalIdNotxtFingerIdenNo11txtFingerIdenNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalIdNotxtFingerIdenNo11txtFingerIdenNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalIdNotxtFingerIdenNo11txtFingerIdenNo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBkAccNo;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDevAdd;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFaxNo;
    private javax.swing.JLabel lblFingerIdenNo;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHealthPlanNo;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblImageDisp;
    private javax.swing.JLabel lblIpAdd;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLicDoi;
    private javax.swing.JLabel lblLicNo;
    private javax.swing.JLabel lblLinkedInId;
    private javax.swing.JLabel lblLocId;
    private javax.swing.JLabel lblMedRecNo;
    private javax.swing.JLabel lblPhNo;
    private javax.swing.JLabel lblRetinalNo;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTtile;
    private javax.swing.JLabel lblVehicleNo;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBkAccNo;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDevAdd;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFaxNo;
    private javax.swing.JTextField txtFingerIdenNo;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHealthPlanNo;
    private javax.swing.JTextField txtIpAdd;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLicDoi;
    private javax.swing.JTextField txtLicNo;
    private javax.swing.JTextField txtLinkedInAdd;
    private javax.swing.JTextField txtLocalIdNo;
    private javax.swing.JTextField txtMedRecNo;
    private javax.swing.JTextField txtPhNo;
    private javax.swing.JTextField txtRetinalNo;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtVehicleNo;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

private void displayInfo() {
        
     txtFirstName.setText(person.getFirstName());
     txtLastName.setText(person.getLastName());
     txtStreet.setText(person.getStreet());
     txtCity.setText(person.getCity());
     txtState.setText(person.getState());
     txtZip.setText(Integer.toString(person.getZip()));
     txtPhNo.setText(person.getPhoneNo());
     txtDob.setText(person.getDob());
     txtAge.setText(Integer.toString(person.getAge()));
     txtFaxNo.setText(person.getFaxNumber());
     txtEmail.setText(person.getEmail());
     txtSsn.setText(person.getSsn());
     txtMedRecNo.setText(person.getMedRecNo());
     txtHealthPlanNo.setText(person.getHealthPlanNo());
     txtBkAccNo.setText(person.getBankAccount());
     txtLicNo.setText(person.getLicenseNo());
     txtLicDoi.setText(person.getLicenseDOI());
     txtVehicleNo.setText(person.getVehicleNo());
     txtDevAdd.setText(person.getDeviceAdd());
     txtLinkedInAdd.setText(person.getLinkedInId());
     txtIpAdd.setText(person.getIpAdd());
     txtRetinalNo.setText(person.getRetinalIdenNo());
     txtFingerIdenNo.setText(person.getFingerIdenNo());
     txtLocalIdNo.setText(person.getLocalIdNo());
     lblImageDisp.setIcon(display(person.getUploadPath()));
     
     
     
    }

private Icon display(String logo) {
        ImageIcon ic = new ImageIcon(logo);
        Image originalImage = ic.getImage();
        Image scaledImage = originalImage.getScaledInstance(350, 175, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(scaledImage);
        return image;
        
    }
}

