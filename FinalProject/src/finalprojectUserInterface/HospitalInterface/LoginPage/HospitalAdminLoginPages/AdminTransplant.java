/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.HospitalInterface.LoginPage.HospitalAdminLoginPages;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.Hospital.Hospital;
import finalprojectBackend.Organization.DonationAssignment;
import finalprojectUserInterface.MainJFrameForm;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author supriyaa
 */
public class AdminTransplant extends javax.swing.JPanel {

    /**
     * Creates new form AdminTransplant
     */
    MainJFrameForm MainLPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    Hospital hospital;

    public AdminTransplant(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, Hospital h) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.hospital = h;
        populateTable(hospital.getEnterpriseName().toLowerCase());
    }
    
    private void populateTable(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonationAssignment d : operatingSystem.getDonationAssignmentList()) {

            if (d.getDonEnterprise().getEnterpriseName().toLowerCase().equals(name)) {
                Object[] row = new Object[8];
                row[0] = d.getType();
                row[1] = d.getbGroup();
                row[2] = d.getDonationEntityName();
                row[3] = d.getDonationStatus();
                try {
                    row[4] = d.getDonEnterprise().getEnterpriseName();
                } catch (Exception e) {

                }

                try {
                    row[5] = d.getRecEnterprise().getEnterpriseName();
                } catch (Exception e) {

                }
                try {
                    row[6] = d.getRecPatient().getPersonName();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonPatient().getPersonName();
                } catch (Exception e) {

                }

                model.addRow(row);
            }
            try {
                if (d.getRecEnterprise().getEnterpriseName().toLowerCase().equals(name)) {
                    Object[] row = new Object[8];
                    row[0] = d.getType();
                    row[1] = d.getbGroup();
                    row[2] = d.getDonationEntityName();
                    row[3] = d.getDonationStatus();
                    try {
                        row[4] = d.getDonEnterprise().getEnterpriseName();
                    } catch (Exception e) {

                    }

                    try {
                        row[5] = d.getRecEnterprise().getEnterpriseName();
                    } catch (Exception e) {

                    }
                    try {
                        row[6] = d.getRecPatient().getPersonName();
                    } catch (Exception e) {

                    }
                    try {
                        row[7] = d.getDonPatient().getPersonName();
                    } catch (Exception e) {

                    }

                    model.addRow(row);
                }
            } catch (Exception e) {

            }

        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        TransplantTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Blood group", "Entity name", "Status", "Donor Enterprise", "Receiver Enterprise", "Patient Name", "Donar name"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 871, 249));

        TransplantTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TransplantTitle.setText("Manage Transplants");
        jPanel1.add(TransplantTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/413051.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1330, 920));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1258, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TransplantTitle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
