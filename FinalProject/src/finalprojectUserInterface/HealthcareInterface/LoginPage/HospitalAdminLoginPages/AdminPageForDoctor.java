/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.HealthcareInterface.LoginPage.HospitalAdminLoginPages;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.Hospital.Hospital;
import finalprojectBackend.Enterprise.Hospital.Doc;
import finalprojectUserInterface.MainJFrameForm;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author girish
 */
public class AdminPageForDoctor extends javax.swing.JPanel {

    /**
     * Creates new form AdminPageForDoctor
     */
    MainJFrameForm MainLPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    Hospital hospital;

    public AdminPageForDoctor(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, Hospital h) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.hospital = h;
        populateDoctorTable();
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
        tb1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "User Name", "Speacility", "Address"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 97, 820, 209));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Manage Doctor");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 22, -1, -1));

        btDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 130, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/413051.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        String doctorUName = model.getValueAt(selectedRow, 1).toString();
        System.out.println(" doctor uname: " + doctorUName);
        operatingSystem.deleteDoctorUser(doctorUName);
        dB4OUtility.storeSystem(operatingSystem);
        populateDoctorTable();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void populateDoctorTable() {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);

        for (Doc d : operatingSystem.getDoctorDirectory()) {

            if (d.getHospitalName().equals(hospital.getEnterpriseName())) {
                Object[] row = new Object[5];
                row[0] = d.getPersonName();
                row[1] = d.getUserName();
                row[2] = d.getDocSpeciality();
                row[3] = d.getAddress();
                model.addRow(row);

            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
