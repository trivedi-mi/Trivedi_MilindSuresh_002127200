/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;


import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DeliveryManDirectory deliveryManDirectory;
    private OrderDirectory orderDirectory;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
   public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, DeliveryManDirectory deliveryManDirectory, OrderDirectory orderDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.orderDirectory = business.getOrderDirectory();
        this.deliveryManDirectory = business.getDeliveryManDirectory();
        populateTable();
        populateDeliveryTable();
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Order order : business.getOrderDirectory().getOrderDirectory()) {
            if (order.getDeliveryMan() != null && order.getDeliveryMan().equals(userAccount.getEmployee().getName()) && order.getOrderStatus().equalsIgnoreCase("Delivery Man Assigned")) {
//            if (order.getDeliveryMan().equals(userAccount.getEmployee().getName())){
//            if (order.getOrderStatus() != null && order.getOrderStatus().equals("Delivery Man Assigned")) {
                Object[] row = new Object[7];
                row[0] = order;
                row[1] = order.getMessage();
                row[2] = order.getOrderStatus();
                row[3] = order.getCustomer().getName();
                row[4] = order.getCustomer().getHomeAddress();
                row[5] = order.getRestaurant().getRestaurantName();
                row[6] = order.getRestaurant().getAddress();
                model.addRow(row);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void populateDeliveryTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();
        model.setRowCount(0);
        for (Order order : business.getOrderDirectory().getOrderDirectory()) {
            if (order.getDeliveryMan() != null && order.getDeliveryMan().equals(userAccount.getEmployee().getName()) && (order.getOrderStatus().equalsIgnoreCase("Order Picked Up")|| order.getOrderStatus().equalsIgnoreCase("Delivered")) ) {
                Object[] row = new Object[6];
                row[0] = order;
                row[1] = order.getCustomer().getName();
                row[2] = order.getCustomer().getHomeAddress();
                row[3] = order.getRestaurant().getRestaurantName();
                row[4] = order.getRestaurant().getAddress();
                row[5] = order.getOrderStatus();
                model.addRow(row);
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnPickUp = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Message", "Status", "Customer", "Customer Address", "Restaurant", "Restaurant Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 1060, 110));

        btnPickUp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPickUp.setText("Pick Up Order");
        btnPickUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickUpActionPerformed(evt);
            }
        });
        add(btnPickUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        processJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        processJButton.setText("Complete Delivery");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 190, -1));

        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, -1, -1));

        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer", "Customer Address", "Restaurant", "Restaurant Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDeliveryMan);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 1060, 180));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delivery Executive Dashboard");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 20, 1190, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel2.setText("My Orders");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 330, 30));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setText("My Orders Pending for Pickup");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPickUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickUpActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Select a row to continue");
            return;
        }

        Order order = (Order) workRequestJTable.getValueAt(selectedRow,0);
        //        order.setDeliveryMan(userAccount.getEmployee().getName());
        order.setOrderStatus("Order Picked up");
        populateTable();
        populateDeliveryTable();

    }//GEN-LAST:event_btnPickUpActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = tblDeliveryMan.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }

        Order order = (Order) tblDeliveryMan.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Delivered")) {
            JOptionPane.showMessageDialog(null, "Already Delivered.");
            return;
        }
        order.setOrderStatus("Delivered");
        //orderDirectory.getOrderDirectory().remove(order);

        JOptionPane.showMessageDialog(null, "The Order is delivered! Enjoy your food!");
        populateDeliveryTable();

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        populateDeliveryTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPickUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable tblDeliveryMan;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
