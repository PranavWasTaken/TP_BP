/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import ui.DBConnection;

/**
 *
 * @author Pranav
 */
public class SignUpFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignUpFrame
     */
    Connection con = null;
    PreparedStatement pre= null;
    ResultSet res= null;
    public SignUpFrame() {
        initComponents();
        con=DBConnection.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        CmbxDrpBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Drug Management System ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel3)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel5.setText("User-Id:");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel6.setText("Password :");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel9.setText("Type :");

        CmbxDrpBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Patient" }));
        CmbxDrpBox.setSelectedIndex(-1);
        CmbxDrpBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbxDrpBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel7.setText("Email-Id :");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel8.setText("Name:");

        jButton1.setText("Log-in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Signup");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CmbxDrpBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(235, 235, 235))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CmbxDrpBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmbxDrpBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbxDrpBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbxDrpBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginFrame l = new LoginFrame();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Name = txtName.getText();
        String EmailId = txtEmailId.getText();
        String UserId = txtUserId.getText();
        String Password = txtPassword.getText();
        String Type = CmbxDrpBox.getItemAt(CmbxDrpBox.getSelectedIndex());
        if(validateSignUpFeilds())
        {
            try {
                Connection con =DBConnection.connect();
                String sql = "INSERT INTO users(`name`, `emailId`, `userId`, `password`, `type`) VALUES (?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1,Name);
                pst.setString(2,EmailId);
                pst.setString(3,UserId);
                pst.setString(4,Password);
                pst.setString(5,Type);
                int rowcnt = pst.executeUpdate();
                if(rowcnt > 0){
                    if(Type.equals("Doctor")){
                        String sqld = "INSERT INTO doctor(`name`, `emailId`, `userId`, `password`, `type`) VALUES (?,?,?,?,?)";
                        PreparedStatement pstd = con.prepareStatement(sqld);
                        pstd.setString(1,Name);
                        pstd.setString(2,EmailId);
                        pstd.setString(3,UserId);
                        pstd.setString(4,Password);
                        pstd.setString(5,Type);
                        pstd.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Doctor Inserted Succesfully");
                        clearfeilds();
                    }
                    else if(Type.equals("Patient")){
                        String sqlp = "INSERT INTO patient(`name`, `emailId`, `userId`, `password`, `type`) VALUES (?,?,?,?,?)";
                        PreparedStatement pstp = con.prepareStatement(sqlp);
                        pstp.setString(1,Name);
                        pstp.setString(2,EmailId);
                        pstp.setString(3,UserId);
                        pstp.setString(4,Password);
                        pstp.setString(5,Type);
                        pstp.execute();
                        JOptionPane.showMessageDialog(this, " Patient Inserted Succesfully");
                        clearfeilds();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Insertion Failed ");
                }
            } catch(Exception e ){
                e.printStackTrace();
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Invalid Input");
            clearfeilds();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpFrame().setVisible(true);
            }
        });
    }
  public void clearfeilds(){
        txtName.setText("");
        txtEmailId.setText("");
        txtUserId.setText("");
        CmbxDrpBox.setSelectedIndex(-1);
    }
      public boolean validateSignUpFeilds(){
        boolean isValidated = true;
        String Name = txtName.getText();
        String EmailId = txtEmailId.getText();
        String UserId = txtUserId.getText();
        String Password = txtPassword.getText();
        // check for blank value
        
       if( Name.equals("") || EmailId.equals("") || UserId.equals("") || Password.equals(""))
        {
            isValidated = false;
        }
        
        return isValidated;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbxDrpBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
