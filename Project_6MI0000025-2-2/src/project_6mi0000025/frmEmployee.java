/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_6mi0000025;

/**
 *
 * @author grade
 */
public class frmEmployee extends javax.swing.JFrame {

    /**
     * Creates new form frmEmployee
     */
    public frmEmployee() {
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

        pnlMain = new javax.swing.JPanel();
        tbpMain = new javax.swing.JTabbedPane();
        pnlEmployee = new javax.swing.JPanel();
        lblEmployee = new javax.swing.JLabel();
        txtName = new java.awt.TextField();
        txtSurname = new java.awt.TextField();
        txtExpiriance = new java.awt.TextField();
        txtPosition = new java.awt.TextField();
        btnDelete = new javax.swing.JToggleButton();
        btnSave = new javax.swing.JToggleButton();
        txtHours = new java.awt.TextField();
        txtSalary = new java.awt.TextField();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblExpiriance = new javax.swing.JLabel();
        lblHours = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        pnlMerchant = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfSales = new java.awt.TextField();
        btnDelete1 = new javax.swing.JToggleButton();
        btnSave1 = new javax.swing.JToggleButton();
        lblSales = new java.awt.Label();
        pnlResult = new javax.swing.JPanel();
        txfNameResult = new javax.swing.JTextField();
        btnNewEmp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(204, 204, 255));

        tbpMain.setBackground(new java.awt.Color(204, 204, 255));

        pnlEmployee.setBackground(new java.awt.Color(204, 255, 255));

        lblEmployee.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmployee.setText("Employee");
        lblEmployee.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtSurname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtExpiriance.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtPosition.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtHours.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtSalary.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblName.setText("Name");

        lblSurname.setText("Surname");

        lblPosition.setText("Position");

        lblExpiriance.setText("Expiriance");

        lblHours.setText("Hours");

        lblSalary.setText("Salary");

        javax.swing.GroupLayout pnlEmployeeLayout = new javax.swing.GroupLayout(pnlEmployee);
        pnlEmployee.setLayout(pnlEmployeeLayout);
        pnlEmployeeLayout.setHorizontalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExpiriance)
                            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addGap(177, 177, 177)
                                .addComponent(btnSave))
                            .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlEmployeeLayout.createSequentialGroup()
                                    .addComponent(lblSalary)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlEmployeeLayout.createSequentialGroup()
                                    .addComponent(lblHours)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtExpiriance, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(pnlEmployeeLayout.createSequentialGroup()
                                            .addComponent(lblPosition)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEmployeeLayout.createSequentialGroup()
                                            .addComponent(lblSurname)
                                            .addGap(15, 15, 15)
                                            .addComponent(txtSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(pnlEmployeeLayout.createSequentialGroup()
                                            .addComponent(lblName)
                                            .addGap(32, 32, 32)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(112, 112, 112))
        );
        pnlEmployeeLayout.setVerticalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(21, 21, 21)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSurname))
                .addGap(18, 18, 18)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPosition)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExpiriance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExpiriance))
                .addGap(21, 21, 21)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHours))
                .addGap(21, 21, 21)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        tbpMain.addTab("EMPLYEE", pnlEmployee);

        pnlMerchant.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Merchant");

        txfSales.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        lblSales.setText("Sales");

        javax.swing.GroupLayout pnlMerchantLayout = new javax.swing.GroupLayout(pnlMerchant);
        pnlMerchant.setLayout(pnlMerchantLayout);
        pnlMerchantLayout.setHorizontalGroup(
            pnlMerchantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMerchantLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(pnlMerchantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMerchantLayout.createSequentialGroup()
                        .addComponent(btnDelete1)
                        .addGap(177, 177, 177)
                        .addComponent(btnSave1))
                    .addGroup(pnlMerchantLayout.createSequentialGroup()
                        .addComponent(lblSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(txfSales, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        pnlMerchantLayout.setVerticalGroup(
            pnlMerchantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMerchantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMerchantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(pnlMerchantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        tbpMain.addTab("MERCHANT", pnlMerchant);

        pnlResult.setBackground(new java.awt.Color(255, 255, 204));

        txfNameResult.setEditable(false);
        txfNameResult.setBackground(new java.awt.Color(255, 255, 204));
        txfNameResult.setText("\n\n\n\n");
        txfNameResult.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfNameResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNameResultActionPerformed(evt);
            }
        });

        btnNewEmp.setText("New Employee");
        btnNewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlResultLayout = new javax.swing.GroupLayout(pnlResult);
        pnlResult.setLayout(pnlResultLayout);
        pnlResultLayout.setHorizontalGroup(
            pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultLayout.createSequentialGroup()
                .addGroup(pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResultLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnNewEmp))
                    .addGroup(pnlResultLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txfNameResult, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnlResultLayout.setVerticalGroup(
            pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txfNameResult, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNewEmp)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tbpMain.addTab("RESULT", pnlResult);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpMain)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtSurname.setText("");
        txtExpiriance.setText("");
        txtPosition.setText("");
        txtHours.setText("");
        txtSalary.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText(); 
        String surname = txtSurname.getText();
        String expiriance = txtExpiriance.getText();
        String position = txtPosition.getText();
        String hours = txtHours.getText();
        String salary = txtSalary.getText();
        
        if("Merchant".equals(position) || "merchant".equals(position)){
        Merchant newMrch = new Merchant();
        newMrch.setName(name);
        newMrch.setSurname(surname);
        newMrch.setExpiriance(Integer.parseInt(expiriance));
        newMrch.setPosition(position);
        String sales = txtPosition.getText();
        tbpMain.setSelectedIndex(1);
        newMrch.setSales(Double.parseDouble(sales));
        }else{
        RegularStaff newEmp = new RegularStaff();
        newEmp.setName(name);
        newEmp.setSurname(surname);
        newEmp.setExpiriance(Integer.parseInt(expiriance));
        newEmp.setPosition(position);
        newEmp.setHours(Integer.parseInt(hours));
        newEmp.setSalary(Double.parseDouble(salary));
        newEmp.pay();
        tbpMain.setSelectedIndex(2);
        txfNameResult.setText(newEmp.toString());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        txfSales.setText("");
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        String name = txtName.getText(); 
        String surname = txtSurname.getText();
        String expiriance = txtExpiriance.getText();
        String position = txtPosition.getText();
        String hours = txtHours.getText();
        String salary = txtSalary.getText();
        
        Merchant newMrch = new Merchant();
        String sales = txfSales.getText();
        newMrch.setName(name);
        newMrch.setSurname(surname);
        newMrch.setExpiriance(Integer.parseInt(expiriance));
        newMrch.setPosition(position);
        newMrch.setSales(Double.parseDouble(sales));
        newMrch.pay();
        tbpMain.setSelectedIndex(2);
        txfNameResult.setText(newMrch.toString());
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnNewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewEmpActionPerformed
        // TODO add your handling code here:
        txtName.setText(""); 
        txtSurname.setText("");
        txtExpiriance.setText("");
        txtPosition.setText("");
        txtHours.setText("");
        txtSalary.setText("");
        txfSales.setText("");
        tbpMain.setSelectedIndex(0);
    }//GEN-LAST:event_btnNewEmpActionPerformed

    private void txfNameResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNameResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNameResultActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        RegularStaff newEmp = new RegularStaff() {};

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDelete;
    private javax.swing.JToggleButton btnDelete1;
    private javax.swing.JButton btnNewEmp;
    private javax.swing.JToggleButton btnSave;
    private javax.swing.JToggleButton btnSave1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblExpiriance;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSalary;
    private java.awt.Label lblSales;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JPanel pnlEmployee;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMerchant;
    private javax.swing.JPanel pnlResult;
    private javax.swing.JTabbedPane tbpMain;
    private javax.swing.JTextField txfNameResult;
    private java.awt.TextField txfSales;
    private java.awt.TextField txtExpiriance;
    private java.awt.TextField txtHours;
    private java.awt.TextField txtName;
    private java.awt.TextField txtPosition;
    private java.awt.TextField txtSalary;
    private java.awt.TextField txtSurname;
    // End of variables declaration//GEN-END:variables
}