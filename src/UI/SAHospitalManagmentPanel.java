/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Directories.DoctorDirectory;
import Directories.EncounterHistory;
import Directories.HospitalDirectory;
import Directories.PatientDirectory;
import Directories.PersonDirectory;
import Model.Doctor;
import Model.Hospital;
import Model.Patient;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kashishdesai
 */
public class SAHospitalManagmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form SAHospitalManagmentPanel
     */
    
      DoctorDirectory doctorDirectory;
    EncounterHistory encounterHistory;
    HospitalDirectory hospitalDirectory;
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;

    public SAHospitalManagmentPanel(DoctorDirectory doctorDirectory, EncounterHistory encounterHistory, HospitalDirectory hospitalDirectory, PatientDirectory patientDirectory, PersonDirectory personDirectory) {
        initComponents();
        this.doctorDirectory = doctorDirectory;
        this.encounterHistory = encounterHistory;
        this.hospitalDirectory = hospitalDirectory;
        this.patientDirectory = patientDirectory;
        this.personDirectory = personDirectory;
        
        
        populateHospitalTable();
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
        tblViewHospitals = new javax.swing.JTable();
        txtHospitalName = new javax.swing.JTextField();
        txtHospitalCity = new javax.swing.JTextField();
        txtHospitalCommunity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCreateHospital = new javax.swing.JButton();
        btnUpdateHospital = new javax.swing.JButton();
        btnViewHospital = new javax.swing.JButton();
        btnDeleteHospital = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        tblViewHospitals.setBackground(new java.awt.Color(242, 242, 242));
        tblViewHospitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital Name", "City", "Community"
            }
        ));
        jScrollPane1.setViewportView(tblViewHospitals);

        txtHospitalCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalCityActionPerformed(evt);
            }
        });

        txtHospitalCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalCommunityActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Hospital Name :");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Hospital City:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Hospital Community:");

        btnCreateHospital.setText("Create");
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });

        btnUpdateHospital.setText("Update");
        btnUpdateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHospitalActionPerformed(evt);
            }
        });

        btnViewHospital.setText("View");
        btnViewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalActionPerformed(evt);
            }
        });

        btnDeleteHospital.setText("Delete");
        btnDeleteHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreateHospital)
                        .addGap(26, 26, 26)
                        .addComponent(btnUpdateHospital))
                    .addComponent(txtHospitalName)
                    .addComponent(txtHospitalCity)
                    .addComponent(txtHospitalCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(425, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewHospital)
                .addGap(49, 49, 49)
                .addComponent(btnDeleteHospital)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewHospital)
                    .addComponent(btnDeleteHospital))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateHospital)
                    .addComponent(btnUpdateHospital))
                .addGap(0, 152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospitalCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalCityActionPerformed

    private void txtHospitalCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalCommunityActionPerformed

    private void btnUpdateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHospitalActionPerformed
        
        
        
        int selectedRowIndex = tblViewHospitals.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) tblViewHospitals.getModel();
       Hospital h= (Hospital) model.getValueAt(selectedRowIndex, 0); 
       
       
       
       h.setHospitalCity(txtHospitalCity.getText());
       h.setHospitalName(txtHospitalName.getText());
       
       h.setHospitalCommunity(txtHospitalCommunity.getText());
       
       JOptionPane.showMessageDialog(this, "Hospital information is updated.");
       
       populateHospitalTable();
       
       txtHospitalCity.setText("");
       txtHospitalCommunity.setText("");
       txtHospitalName.setText("");
       
       
    }//GEN-LAST:event_btnUpdateHospitalActionPerformed

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
        
        
        
        String hospitalName = txtHospitalName.getText();
        String hospitalCityName = txtHospitalCity.getText();
        String hospitalCommunityName = txtHospitalCommunity.getText();
        
        Hospital hospital = hospitalDirectory.addHospital();
        
        
        hospital.setHospitalName(hospitalName);
        hospital.setHospitalCity(hospitalCityName);
        hospital.setHospitalCommunity(hospitalCommunityName);
        
        JOptionPane.showMessageDialog(this, "Hospital is Created");
        
        populateHospitalTable();
        
        
          txtHospitalCity.setText("");
       txtHospitalCommunity.setText("");
       txtHospitalName.setText("");
        
        
        
        
        
        
    }//GEN-LAST:event_btnCreateHospitalActionPerformed

    private void btnViewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalActionPerformed
        int selectedRowIndex = tblViewHospitals.getSelectedRow();
        
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to Update");
            return;
        }
        
         DefaultTableModel model = (DefaultTableModel) tblViewHospitals.getModel();
        Hospital h = (Hospital) model.getValueAt(selectedRowIndex, 0);
        
        
        txtHospitalCity.setText(h.getHospitalCity());
        txtHospitalName.setText(h.getHospitalName());
        txtHospitalCommunity.setText(h.getHospitalCommunity());
        
        
    }//GEN-LAST:event_btnViewHospitalActionPerformed

    private void btnDeleteHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHospitalActionPerformed
        int selectedRowIndex = tblViewHospitals.getSelectedRow();
        
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblViewHospitals.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);
        
       hospitalDirectory.removeHospital(selectedHospital);
        
        JOptionPane.showMessageDialog(this, "Hospital is Deleted");
        
       populateHospitalTable();
    }//GEN-LAST:event_btnDeleteHospitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JButton btnDeleteHospital;
    private javax.swing.JButton btnUpdateHospital;
    private javax.swing.JButton btnViewHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewHospitals;
    private javax.swing.JTextField txtHospitalCity;
    private javax.swing.JTextField txtHospitalCommunity;
    private javax.swing.JTextField txtHospitalName;
    // End of variables declaration//GEN-END:variables

    private void populateHospitalTable() {
        
        
                DefaultTableModel model = (DefaultTableModel) tblViewHospitals.getModel();
                  
                model.setRowCount(0);
                
                for(Hospital h : hospitalDirectory.getHospitalDirectory())
                {
                    Object[] row = new Object[3];
                    row[0]=h;
                    row[1]=h.getHospitalCity();
                    row[2]=h.getHospitalCommunity();
                    
                    
                    model.addRow(row);
                    
                    
                }
        
        
    }
}
