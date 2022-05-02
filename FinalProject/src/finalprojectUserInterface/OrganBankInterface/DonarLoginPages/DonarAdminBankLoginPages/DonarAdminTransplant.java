/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.OrganBankInterface.DonarLoginPages.DonarAdminBankLoginPages;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.DonorBank.DonorBank;
import finalprojectBackend.Organization.DonationAssignment;
import finalprojectUserInterface.MainJFrameForm;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author supriyaa
 */
public class DonarAdminTransplant extends javax.swing.JPanel {

    /**
     * Creates new form DonarAdminTransplant
     */
    MainJFrameForm MainLPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    DonorBank donorBank;
    
    public DonarAdminTransplant(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, DonorBank donbank) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.donorBank = donbank;
        populateTable(donbank.getEnterpriseName().toLowerCase());
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

        setBackground(new java.awt.Color(255, 204, 204));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1041, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(76, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(185, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
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
                    row[6] = d.getRecPatient().getUserName();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonPatient().getUserName();
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
                        row[6] = d.getRecPatient().getUserName();
                    } catch (Exception e) {

                    }
                    try {
                        row[7] = d.getDonPatient().getUserName();
                    } catch (Exception e) {

                    }

                    model.addRow(row);
                }
            } catch (Exception e) {

            }

        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
