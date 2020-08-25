/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.AdminWorkArea;

import Buisness.Enterprise.Enterprise;
import Buisness.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class AdminWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJpanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private UserAccount account;
    public AdminWorkAreaJpanel(JPanel container, Enterprise enterprise,UserAccount account) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.account = account;
        valueJlable.setText(enterprise.getName());
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        valueJlable = new javax.swing.JLabel();
        btnOrg = new javax.swing.JButton();
        btnEmp = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Enterprise : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        valueJlable.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        valueJlable.setText("<value>");
        add(valueJlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        btnOrg.setText("Manage Organization");
        btnOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgActionPerformed(evt);
            }
        });
        add(btnOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 220, 40));

        btnEmp.setText("Manage Employee");
        btnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpActionPerformed(evt);
            }
        });
        add(btnEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 220, 40));

        btnUser.setBackground(new java.awt.Color(255, 255, 255));
        btnUser.setText("Manage User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 220, 40));

        jPanel1.setBackground(new java.awt.Color(15, 58, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 70));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Admin Work Area");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-businessman.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(385, 385, 385))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
      
        ManageTransplantEmployee manageOrganizationJPanel = new ManageTransplantEmployee(container, enterprise.getOrganizationdirectory());
        container.add("manageTransplantEmployee", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
        
    }//GEN-LAST:event_btnEmpActionPerformed

    private void btnOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgActionPerformed
        
        ManageTransplantOrganization manageOrganizationJPanel = new ManageTransplantOrganization(container, enterprise);
        container.add("manageTransplantOrganization", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_btnOrgActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        
        ManageTransplantUser manageOrganizationJPanel = new ManageTransplantUser(container, enterprise,account);
        container.add("manageTransplantUser", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_btnUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmp;
    private javax.swing.JButton btnOrg;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel valueJlable;
    // End of variables declaration//GEN-END:variables
}