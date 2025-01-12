/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.PatientController;
import Model.DBConnection;
import Model.DBPatient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL PC
 */
public class Patient extends javax.swing.JFrame {

     
    
    
    public Patient() {
        initComponents();
        DisplayPatients();
    }

    private void Reset(){
        PIdTb.setText("");
        PNameTb.setText("");
        PPhoneTb.setText("");
        PAddressTb.setText("");
        PGenderCb.setSelectedIndex(0);
        PAgeTb.setText("");
        PBloodTb.setText("");
        PDiseaseTb.setText("");
    }
    
    Connection conn;
    Statement stmt;
    ResultSet Rs = null;
    
    private void DisplayPatients(){
        try
        {
            stmt = DBConnection.getStatementConnection(); //create statment-> Statement statement = connection.createStatement();
            Rs = stmt.executeQuery("select * from hospital_information.parienttbl"); //executing a query via a Statement
            PatientTbl.setModel(DbUtils.resultSetToTableModel(Rs));
            DBConnection.closeCon(); //closed the connection.
        }
        catch(Exception e)
        {
            e.printStackTrace();
            //This is also can be used-> JOptionPane.showMessageDialog(null, "there is an error in try part of DispalyPatient method");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PatientLbl = new javax.swing.JLabel();
        DoctorLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PIdTb = new javax.swing.JTextField();
        PNameTb = new javax.swing.JTextField();
        PPhoneTb = new javax.swing.JTextField();
        PAddressTb = new javax.swing.JTextField();
        PAgeTb = new javax.swing.JTextField();
        PBloodTb = new javax.swing.JTextField();
        PDiseaseTb = new javax.swing.JTextField();
        PGenderCb = new javax.swing.JComboBox<>();
        PSaveBtn = new javax.swing.JButton();
        PResetBtn = new javax.swing.JButton();
        PEditBtn = new javax.swing.JButton();
        PDeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatientTbl = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        PPrintBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1342, 719));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hospital management Software");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(464, 464, 464)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, -1));

        PatientLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PatientLbl.setForeground(new java.awt.Color(102, 102, 255));
        PatientLbl.setText("Patient");
        getContentPane().add(PatientLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 78, -1, -1));

        DoctorLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DoctorLbl.setForeground(new java.awt.Color(102, 102, 255));
        DoctorLbl.setText("Doctor");
        DoctorLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorLblMouseClicked(evt);
            }
        });
        getContentPane().add(DoctorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 78, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 68, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 68, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(50, 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 106, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Hospital Information");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1181, 68, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Parient ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Phone");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 244, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Address");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 293, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Gender");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Age");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 396, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Blood Group");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 455, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Major Deisease Suffered Earlier");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 495, -1, -1));

        PIdTb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(PIdTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 137, 112, 32));

        PNameTb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(PNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 187, 112, 32));

        PPhoneTb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(PPhoneTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 241, 113, 31));

        PAddressTb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(PAddressTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 290, 113, 31));

        PAgeTb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(PAgeTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 397, 112, 31));

        PBloodTb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(PBloodTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 446, 112, 31));

        PDiseaseTb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(PDiseaseTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 528, 234, 33));

        PGenderCb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PGenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        PGenderCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGenderCbActionPerformed(evt);
            }
        });
        getContentPane().add(PGenderCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 347, 112, 31));

        PSaveBtn.setBackground(new java.awt.Color(255, 255, 255));
        PSaveBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PSaveBtn.setForeground(new java.awt.Color(51, 51, 255));
        PSaveBtn.setText("Save");
        PSaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PSaveBtnMouseClicked(evt);
            }
        });
        PSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(PSaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 585, 104, -1));

        PResetBtn.setBackground(new java.awt.Color(255, 255, 255));
        PResetBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PResetBtn.setForeground(new java.awt.Color(51, 51, 255));
        PResetBtn.setText("Reset");
        PResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PResetBtnMouseClicked(evt);
            }
        });
        getContentPane().add(PResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 585, 104, -1));

        PEditBtn.setBackground(new java.awt.Color(255, 255, 255));
        PEditBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PEditBtn.setForeground(new java.awt.Color(51, 51, 255));
        PEditBtn.setText("Edit");
        PEditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PEditBtnMouseClicked(evt);
            }
        });
        PEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PEditBtnActionPerformed(evt);
            }
        });
        getContentPane().add(PEditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 622, 104, -1));

        PDeleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        PDeleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PDeleteBtn.setForeground(new java.awt.Color(51, 51, 255));
        PDeleteBtn.setText("Delete");
        PDeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PDeleteBtnMouseClicked(evt);
            }
        });
        getContentPane().add(PDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 622, 104, -1));

        PatientTbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PatientTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientID", "Name", "Phone", "Address", "Gender", "Age", "Blood Group", "Major Disease Suffered Earlier"
            }
        ));
        PatientTbl.setRowHeight(27);
        PatientTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PatientTbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 255, 993, 398));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 255));
        jLabel15.setText("Patient List");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 225, -1, -1));

        PPrintBtn.setBackground(new java.awt.Color(255, 255, 255));
        PPrintBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PPrintBtn.setForeground(new java.awt.Color(51, 51, 255));
        PPrintBtn.setText("Print");
        PPrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PPrintBtnMouseClicked(evt);
            }
        });
        getContentPane().add(PPrintBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 671, 104, 32));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Windows-Turn-Off-icon.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 671, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back5.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you want to close the application","Select",JOptionPane.YES_NO_OPTION);
        
        if(a == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void DoctorLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorLblMouseClicked
        new DoctorA().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DoctorLblMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new HospitalInformation().setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    
    
    private void PSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSaveBtnActionPerformed
       
       if(PIdTb.getText().isEmpty()|| PNameTb.getText().isEmpty() || PPhoneTb.getText().isEmpty() || PAddressTb.getText().isEmpty() ||PGenderCb.getSelectedIndex() == -1 || PAgeTb.getText().isEmpty() || PBloodTb.getText().isEmpty() || PDiseaseTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
           
           try{
               stmt = DBConnection.getStatementConnection();
               
               Integer PId = Integer.valueOf(PIdTb.getText());
               String PName = PNameTb.getText();
               String PPhone = PPhoneTb.getText();
               String PAddress = PAddressTb.getText();
               String PGender = PGenderCb.getSelectedItem().toString();
               Integer PAge = Integer.valueOf(PAgeTb.getText());
               String PBlood = PBloodTb.getText();
               String PDisease = PDiseaseTb.getText();
               
               PatientController.patient(PId, PName, PPhone, PAddress, PGender, PAge, PBlood, PDisease);
               
               JOptionPane.showMessageDialog(this, "Book saved");
               
               DisplayPatients();
               Reset();
               
               
           } 
           catch(Exception e){
               e.printStackTrace();
           }
        }
       
    }//GEN-LAST:event_PSaveBtnActionPerformed

    private void PResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PResetBtnMouseClicked
        Reset();
    }//GEN-LAST:event_PResetBtnMouseClicked

    private void PSaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PSaveBtnMouseClicked
        
    }//GEN-LAST:event_PSaveBtnMouseClicked

    private void PGenderCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGenderCbActionPerformed
        //String title = (String) PGenderCb.getSelectedItem();
    }//GEN-LAST:event_PGenderCbActionPerformed

    private void PatientTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientTblMouseClicked
        DefaultTableModel model = (DefaultTableModel)PatientTbl.getModel();
        int MyIndex = PatientTbl.getSelectedRow();
        PIdTb.setText(model.getValueAt(MyIndex, 0).toString());
        PNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        PPhoneTb.setText(model.getValueAt(MyIndex, 2).toString());
        PAddressTb.setText(model.getValueAt(MyIndex, 3).toString());
        PGenderCb.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
        PAgeTb.setText(model.getValueAt(MyIndex, 5).toString());
        PBloodTb.setText(model.getValueAt(MyIndex, 6).toString());
        PDiseaseTb.setText(model.getValueAt(MyIndex, 7).toString());
    }//GEN-LAST:event_PatientTblMouseClicked

    private void PEditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PEditBtnMouseClicked
        
        if(PIdTb.getText().isEmpty()|| PNameTb.getText().isEmpty() || PPhoneTb.getText().isEmpty() || PAddressTb.getText().isEmpty() ||PGenderCb.getSelectedIndex() == -1 || PAgeTb.getText().isEmpty() || PBloodTb.getText().isEmpty() || PDiseaseTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
           try{
               stmt = DBConnection.getStatementConnection();
               String BId = PIdTb.getText();
               String Query = "Update hospital_information.parienttbl set Name = '"+PNameTb.getText()+"',Phone = '"+PPhoneTb.getText()+"',Address = '"+PAddressTb.getText()+"', Gender = '"+PGenderCb.getSelectedItem()+"',Age = '"+PAgeTb.getText()+"',Blood_Group = '"+PBloodTb.getText()+"',Major_Disease = '"+PDiseaseTb.getText()+"' where Patient_ID = "+BId;
               stmt.executeUpdate(Query);
               
               JOptionPane.showMessageDialog(this, "Patient Updated");
               DisplayPatients();
               Reset();
           } 
           catch(Exception e){
               e.printStackTrace();
           }
        }
        
    }//GEN-LAST:event_PEditBtnMouseClicked

    private void PDeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PDeleteBtnMouseClicked
        if(PIdTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
           try{
               stmt = DBConnection.getStatementConnection();
               String BId = PIdTb.getText();
               String Query = "Delete from hospital_information.parienttbl where Patient_ID="+BId;
               stmt.executeUpdate(Query);
               
               JOptionPane.showMessageDialog(this, "Patient Deleted");
               DisplayPatients();
               Reset();
           } 
           catch(Exception e){
               e.printStackTrace();
           }
        }
    }//GEN-LAST:event_PDeleteBtnMouseClicked

    private void PPrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPrintBtnMouseClicked
        try 
        {
            PatientTbl.print();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PPrintBtnMouseClicked

    private void PEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PEditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PEditBtnActionPerformed

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseEntered

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoctorLbl;
    private javax.swing.JTextField PAddressTb;
    private javax.swing.JTextField PAgeTb;
    private javax.swing.JTextField PBloodTb;
    private javax.swing.JButton PDeleteBtn;
    private javax.swing.JTextField PDiseaseTb;
    private javax.swing.JButton PEditBtn;
    private javax.swing.JComboBox<String> PGenderCb;
    private javax.swing.JTextField PIdTb;
    private javax.swing.JTextField PNameTb;
    private javax.swing.JTextField PPhoneTb;
    private javax.swing.JButton PPrintBtn;
    private javax.swing.JButton PResetBtn;
    private javax.swing.JButton PSaveBtn;
    private javax.swing.JLabel PatientLbl;
    private javax.swing.JTable PatientTbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}