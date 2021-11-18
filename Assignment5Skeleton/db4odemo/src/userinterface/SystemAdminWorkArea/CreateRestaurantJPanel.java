/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 12013
 */
public class CreateRestaurantJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
//    public String restLogo;
    /**
     * Creates new form CreateRetaurantJPanel
     */
    public CreateRestaurantJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtManagerName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbPriceRating = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 204, 255));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Restaurant");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Restaurant Name :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Manager Name :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Contact Number :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Address :");

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Username :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Password :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Price Rating :");

        cmbPriceRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "$", "$$", "$$$" }));
        cmbPriceRating.setToolTipText("Enter the Price Rating for the restaurant\nSelect \n$-- Cheap\n$$$ - Expensive");
        cmbPriceRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPriceRatingActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Insert Logo :");

        btnUpload.setText("Upload Logo");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpload)
                                .addGap(103, 103, 103)
                                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbPriceRating, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbPriceRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(btnUpload)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCreate))
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageRestaurantJPanel mr = (ManageRestaurantJPanel) component;
        mr.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if(txtRestaurantName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtPhoneNumber.getText().isEmpty() || 
                txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() || txtManagerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty!");
            return;
        }

        String restaurantName = txtRestaurantName.getText();
        String managerName = txtManagerName.getText();
        String restRating = cmbPriceRating.getSelectedItem().toString();
        String restLogo = lblLogo.getText();

        boolean flag ;

        flag = restaurantName.matches("^[a-zA-Z]+$");



        flag = managerName.matches("^[a-zA-Z]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Manager name cannot have numbers!");
            return;
        }
        
        

        String phoneNumber = txtPhoneNumber.getText();

       
        flag = phoneNumber.matches("^[0-9]{3}-[0-9]{3}-[0-9]{4}$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Enter valid phone number in format XXX-XXX-XXXX!");
            return;
        }
        
        for(Restaurant restaurant : restaurantDirectory.getRestaurantDirectory()) {
            if(restaurant.getPhoneNumber().equals(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone number already exist!");
                return;
            }
        }


        String address = txtAddress.getText();
        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        
       

        for(UserAccount account : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exist!");
                return;
            }
        }

        
        System.out.println("Eco" + ecoSystem.getRestaurantDirectory().getRestaurantDirectory().size());
        ecoSystem.getRestaurantDirectory().newRestaurant(restaurantName, address, managerName, phoneNumber, restRating, restLogo);
        
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(restaurantName);
        UserAccount userAccount = ecoSystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new AdminRole());

        JOptionPane.showMessageDialog(null, "Restaurant details saved successfully!");
        txtRestaurantName.setText("");
        txtAddress.setText("");
        txtManagerName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtPhoneNumber.setText("");
        cmbPriceRating.setSelectedIndex(0);
        lblLogo.setText("");
        
        
        

    }//GEN-LAST:event_btnCreateActionPerformed
    String getAbsolutePath;
    
    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:

        JFileChooser chooseFile = new JFileChooser();
        chooseFile.showOpenDialog(null);
        File f = chooseFile.getSelectedFile();
        getAbsolutePath = f.getAbsolutePath();
        String restLogo = getAbsolutePath;
        lblLogo.setText(restLogo);
        
    }//GEN-LAST:event_btnUploadActionPerformed

    private void cmbPriceRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPriceRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPriceRatingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpload;
    private javax.swing.JComboBox<String> cmbPriceRating;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
