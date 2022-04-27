/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.DonarBankInterface;

/**
 *
 * @author supriyaa
 */
public class DonarBankLandingPage extends javax.swing.JPanel {

    /**
     * Creates new form DonarBankLandingPage
     */
    MainFrameForm mainScreen;
    private DB4OUtil dB4OUtil;
    private EcoSystem ecoSystem;

    public MainDonorBankPage(MainFrameForm mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem) {
        initComponents();
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DonarjLabel1.setBackground(new java.awt.Color(255, 255, 255));
        DonarjLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DonarjLabel1.setForeground(new java.awt.Color(255, 255, 255));
        DonarjLabel1.setText("DONOR BANK");
        jPanel1.add(DonarjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        RoleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RoleLabel.setForeground(new java.awt.Color(255, 255, 255));
        RoleLabel.setText("Role:");
        jPanel1.add(RoleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 70, 20));

        RoleCmb.setEditable(true);
        RoleCmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RoleCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Donor","Donor Admin"}));
        RoleCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleCmbActionPerformed(evt);
            }
        });
        jPanel1.add(RoleCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 197, -1));

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("Username:");
        jPanel1.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));
        jPanel1.add(UsernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 197, -1));

        passwordLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordLbl.setText("Password:");
        jPanel1.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));
        jPanel1.add(PassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 197, -1));

        Login_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Login_btn.setText("Login");
        Login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 140, 30));

        Signinbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Signinbtn.setText("Sign Up");
        Signinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Signinbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 470, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/supriyaa/Downloads/donarblood2.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1200, 1080));
        jLabel2.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        if (RoleCmb.getSelectedItem().toString() == "Donor Admin") {
            DonorBank donbank = (DonorBank) ecoSystem.loginCheck(UsernameTxt.getText(), PassTxt.getText());
            if(donbank == null){
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }else{
                DonorBankAdminLogin ap = new DonorBankAdminLogin(mainScreen, dB4OUtil, ecoSystem, donbank);
                mainScreen.setContentPane(ap);
                mainScreen.invalidate();
                mainScreen.validate();
                return;
            }
        }

        if (RoleCmb.getSelectedItem().toString() == "Donor") {
            Donor don = (Donor) ecoSystem.loginCheck(UsernameTxt.getText(), PassTxt.getText());
            if(don == null){
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }else{
                DonorLogin ap = new DonorLogin(mainScreen, dB4OUtil, ecoSystem, don);
                mainScreen.setContentPane(ap);
                mainScreen.invalidate();
                mainScreen.validate();
                return;
            }
        }

        //        if (cmb_Role.getSelectedItem().toString() == "Doctor") {
            //            Customer c = system.loginCustomer(txtUsername.getText(), txtPassword.getText());
            //            if (c == null) {
                //                JOptionPane.showMessageDialog(this, "Incorrect credential");
                //            } else {
                //                CustomerMainPage custmp = new CustomerMainPage(system, dB4OUtil, c);
                //                this.setContentPane(custmp);
                //                this.invalidate();
                //                this.validate();
                //                return;
                //            }
            //
            //        }
        //        if (cmb_Role.getSelectedItem().toString() == "Nurse") {
            //            Restaurant r = system.loginResaturant(txtUsername.getText(), txtPassword.getText());
            //
            //            if (r == null) {
                //                JOptionPane.showMessageDialog(this, "Incorrect credential");
                //            } else {
                //                RestaurantMainPage restmp = new RestaurantMainPage(system, dB4OUtil, r);
                //                this.setContentPane(restmp);
                //                this.invalidate();
                //                this.validate();
                //                return;
                //            }
            //
            //        }
        //
        //        if (cmb_Role.getSelectedItem().toString() == "Patient") {
            //            DeliveryMan r = system.loginDeliveryMan(txtUsername.getText(), txtPassword.getText());
            //
            //            if (r == null) {
                //                JOptionPane.showMessageDialog(this, "Incorrect credential");
                //            } else {
                //                DeliverManMainPage delimp = new DeliverManMainPage(system, dB4OUtil, r);
                //                this.setContentPane(delimp);
                //                this.invalidate();
                //                this.validate();
                //                return;
                //            }
            //
            //        }
        //
        //        if (cmb_Role.getSelectedItem().toString() == "Hospital Admin") {
            //            if (txtUsername.getText().matches("a") && txtPassword.getText().matches("a")) {
                //                AdminPage adminpg = new AdminPage(system, dB4OUtil);
                //                this.setContentPane(adminpg);
                //                this.invalidate();
                //                this.validate();
                //                return;
                //            } else {
                //                JOptionPane.showMessageDialog(this, "Incorrect credential");
                //            }
            //        }
    }//GEN-LAST:event_Login_btnActionPerformed

    private void SigninbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninbtnActionPerformed
        // TODO add your handling code here:

        if (RoleCmb.getSelectedItem().toString() == "Donor") {

            SignUpDonor signdon = new SignUpDonor(mainScreen, dB4OUtil, ecoSystem);
            //
            //            //suc.setVisible(true);
            mainScreen.setContentPane(signdon);
            ////            //             this.add(s);
            ////
            mainScreen.invalidate();
            mainScreen.validate();

        }

        if (RoleCmb.getSelectedItem().toString() == "Donor Admin") {
            // System.out.println("Hospital");
            SignUpDonorAdmin s = new SignUpDonorAdmin(mainScreen, dB4OUtil, ecoSystem);

            //suc.setVisible(true);
            mainScreen.setContentPane(s);
            //             this.add(s);

            mainScreen.invalidate();
            mainScreen.validate();

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
