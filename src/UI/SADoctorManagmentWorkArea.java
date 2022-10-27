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
import Model.Address;
import Model.City;
import Model.Community;
import Model.Doctor;
import Model.Hospital;
import Model.House;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author kashishdesai
 */
public class SADoctorManagmentWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SADoctorManagmentWorkArea
     */
    
     DoctorDirectory doctorDirectory;
    EncounterHistory encounterHistory;
    HospitalDirectory hospitalDirectory;
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;

//    public SADoctorManagmentWorkArea() {
//        initComponents();
//    }

    public SADoctorManagmentWorkArea(DoctorDirectory doctorDirectory, EncounterHistory encounterHistory, HospitalDirectory hospitalDirectory, PatientDirectory patientDirectory, PersonDirectory personDirectory) {
        initComponents();
        
        this.doctorDirectory = doctorDirectory;
        this.encounterHistory = encounterHistory;
        this.hospitalDirectory = hospitalDirectory;
        this.patientDirectory = patientDirectory;
        this.personDirectory = personDirectory;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDegree = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtHospital = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        btnCreateDoctor = new javax.swing.JButton();
        txtHouse = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDateofBirth = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtHospitalCommuntyName = new javax.swing.JTextField();
        txtHospitalCityName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setText("Community:");

        jLabel5.setText("House:");

        jLabel6.setText("Date of Birth:");

        jLabel7.setText("Phone:");

        txtHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalActionPerformed(evt);
            }
        });

        jLabel8.setText("Gender:");

        jLabel9.setText("Degree:");

        jLabel10.setText("Hospital Name:");

        txtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityActionPerformed(evt);
            }
        });

        btnCreateDoctor.setText("Create");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("Password:");

        jLabel3.setText("City:");

        jLabel11.setText("Hospital City Name:");

        jLabel12.setText("Hospital Community Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(241, 241, 241)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel12)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateDoctor)
                    .addComponent(txtName)
                    .addComponent(txtGender, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtHouse, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtDegree)
                    .addComponent(txtHospital)
                    .addComponent(txtDateofBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHospitalCommuntyName)
                    .addComponent(txtHospitalCityName))
                .addContainerGap(426, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtDateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtHospitalCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtHospitalCommuntyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnCreateDoctor)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalActionPerformed

    private void txtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        
        String name =txtName.getText();
        String password = txtPassword.getText();
        String city= txtCity.getText();
        String community = txtCommunity.getText();
        String house = txtHouse.getText();
        
        Date dob= txtDateofBirth.getDate();
        long phone = Long.parseLong(txtPhone.getText());
        String gender = txtGender.getText();
        String degree = txtDegree.getText();
        String hospital = txtHospital.getText();
        String hospitalCityName = txtHospitalCityName.getText();
        String hospitalCommunityName = txtHospitalCommuntyName.getText();
        
        
        City cityName = new City(city);
        Community CommunityName= new Community(community);
        House HouseName = new House(house);
        
                
                
        
        
       Address a = new Address(cityName, CommunityName, HouseName);
       
       
        Hospital h = new Hospital(hospital, hospitalCityName, hospitalCommunityName);
       

        
       
        
        if(!hospitalDirectory.getHospitalDirectory().isEmpty())
        {
            int match =0;
            for( Hospital hos : hospitalDirectory.getHospitalDirectory())
                
            {
                
                if(hos == h)
                {
                    match++;
                }
                
            }
            
            if(match!=0)
            {
                Hospital hospi = hospitalDirectory.addHospital();
                hospi.setHospitalCity(h.getHospitalName());
                hospi.setHospitalName(h.getHospitalName());
                hospi.setHospitalCommunity(h.getHospitalCommunity());
              
               
            }
            
            
        }
        
        else{
            Hospital hospi = hospitalDirectory.addHospital();
                hospi.setHospitalCity(h.getHospitalName());
                hospi.setHospitalName(h.getHospitalName());
                hospi.setHospitalCommunity(h.getHospitalCommunity());
            
            
        }
        
        Doctor d = doctorDirectory.addDoctor();
        
        d.setName(name);
        d.setPassword(password);
        d.setAddress(a);
        d.setDob(dob);
        d.setPhone(phone);
        d.setGender(gender);
        d.setDegree(degree);
        d.setHospital(h);
        
        
        JOptionPane.showMessageDialog(this, "Doctor is Created");
        
                
        
        
//        
//        h.setHospitalCity(hospitalCityName);
//        h.setHospitalName(hospital);
//        h.setHospitalCommunity(hospitalCommunityName);
//        
                
                
        
    }//GEN-LAST:event_btnCreateDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private com.toedter.calendar.JDateChooser txtDateofBirth;
    private javax.swing.JTextField txtDegree;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtHospitalCityName;
    private javax.swing.JTextField txtHospitalCommuntyName;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
