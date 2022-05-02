/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.OrganBankInterface;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.DonorBank.DonorUser;
import finalprojectBackend.Enterprise.DonorBank.DonorBank;
import finalprojectUserInterface.MainJFrameForm;
import finalprojectUserInterface.OrganBankInterface.DonarLoginPages.DonarBankAdminLogin;
import finalprojectUserInterface.OrganBankInterface.DonarLoginPages.DonarLogin;
import javax.swing.JOptionPane;
/**
 *
 * @author supriyaa
 */
public class DonarBankLandingPage extends javax.swing.JPanel {

    /**
     * Creates new form DonarBankLandingPage
     */
    MainJFrameForm MainLPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    
    public DonarBankLandingPage(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DonarjLabel1 = new javax.swing.JLabel();
        RoleLabel = new javax.swing.JLabel();
        RoleCmb = new javax.swing.JComboBox<>();
        UsernameLabel = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        PassTxt = new javax.swing.JPasswordField();
        Login_btn = new javax.swing.JButton();
        Signinbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(2000, 2000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DonarjLabel1.setBackground(new java.awt.Color(0, 0, 0));
        DonarjLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DonarjLabel1.setForeground(new java.awt.Color(255, 255, 255));
        DonarjLabel1.setText("DONATION BANK");
        jPanel1.add(DonarjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        RoleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RoleLabel.setForeground(new java.awt.Color(255, 255, 255));
        RoleLabel.setText("Role:");
        jPanel1.add(RoleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 70, 20));

        RoleCmb.setEditable(true);
        RoleCmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RoleCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Donor","Donor Admin"}));
        RoleCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleCmbActionPerformed(evt);
            }
        });
        jPanel1.add(RoleCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 197, 30));

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("Username:");
        jPanel1.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));
        jPanel1.add(UsernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 197, 30));

        passwordLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordLbl.setText("Password:");
        jPanel1.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));
        jPanel1.add(PassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 197, 30));

        Login_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Login_btn.setText("Login");
        Login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 150, 30));

        Signinbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Signinbtn.setText("Sign Up");
        Signinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Signinbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/Blood-donation-one-more-time-scaled.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(2500, 2000));
        jLabel2.setMinimumSize(new java.awt.Dimension(2048, 1365));
        jLabel2.setPreferredSize(new java.awt.Dimension(2500, 1700));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RoleCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleCmbActionPerformed
        // TODO add your handling code here:
        System.out.println(RoleCmb.getSelectedItem().toString());
        if (RoleCmb.getSelectedItem().toString() == "Admin") {
            Signinbtn.setEnabled(false);
        } else {
            Signinbtn.setEnabled(true);
        }
    }//GEN-LAST:event_RoleCmbActionPerformed

    private void Login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_btnActionPerformed
        // TODO add your handling code here:
        
        try {
            if (RoleCmb.getSelectedItem().toString() == "Donor Admin") {
            DonorBank donbank = (DonorBank) operatingSystem.loginAuthentication(UsernameTxt.getText(), PassTxt.getText());
            if(donbank == null){
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }else{
                DonarBankAdminLogin ap = new DonarBankAdminLogin(MainLPage, dB4OUtility, operatingSystem, donbank);
                MainLPage.setContentPane(ap);
                MainLPage.invalidate();
                MainLPage.validate();
                return;
            }
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Donor Bank does not exist. Try again");
        }
        

        try {
            if (RoleCmb.getSelectedItem().toString() == "Donor") {
            DonorUser don = (DonorUser) operatingSystem.loginAuthentication(UsernameTxt.getText(), PassTxt.getText());
            if(don == null){
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }else{
                DonarLogin ap = new DonarLogin(MainLPage, dB4OUtility, operatingSystem, don);
                MainLPage.setContentPane(ap);
                MainLPage.invalidate();
                MainLPage.validate();
                return;
            }
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Donor does not exist. Try again");
        }
    }//GEN-LAST:event_Login_btnActionPerformed

    private void SigninbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninbtnActionPerformed
        // TODO add your handling code here:

        if (RoleCmb.getSelectedItem().toString() == "Donor") {
            DonarBankSignUp signdon = new DonarBankSignUp(MainLPage, dB4OUtility, operatingSystem);
            MainLPage.setContentPane(signdon);
            MainLPage.invalidate();
            MainLPage.validate();
        }

        if (RoleCmb.getSelectedItem().toString() == "Donor Admin") {
            DonarBankAdminSignUp s = new DonarBankAdminSignUp(MainLPage, dB4OUtility, operatingSystem);
            MainLPage.setContentPane(s);
            MainLPage.invalidate();
            MainLPage.validate();
        }
    }//GEN-LAST:event_SigninbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DonarjLabel1;
    private javax.swing.JButton Login_btn;
    private javax.swing.JPasswordField PassTxt;
    private javax.swing.JComboBox<String> RoleCmb;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JButton Signinbtn;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passwordLbl;
    // End of variables declaration//GEN-END:variables
}
