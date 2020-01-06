/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import hotel.managment.DBConnManager;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author MaC
 */

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    private DBConnManager dbConnManager = null; 
     
    public Login() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        btn_changepass = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(16, 21, 30));
        jPanel3.setAutoscrolls(true);
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(88, 200, 197));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOGIN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, 50));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 310));

        jPanel1.setBackground(new java.awt.Color(23, 31, 44));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        txt_user.setBackground(new java.awt.Color(23, 31, 44));
        txt_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setBorder(null);
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 300, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        txt_pass.setBackground(new java.awt.Color(23, 31, 44));
        txt_pass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(255, 255, 255));
        txt_pass.setBorder(null);
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 340, -1));

        btn_login.setBackground(new java.awt.Color(88, 200, 197));
        btn_login.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.setAutoscrolls(true);
        btn_login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_login.setBorderPainted(false);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 121, 39));

        btn_close.setBackground(new java.awt.Color(88, 200, 197));
        btn_close.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 116, 39));

        btn_changepass.setBackground(new java.awt.Color(88, 200, 197));
        btn_changepass.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        btn_changepass.setText("Change Password");
        btn_changepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changepassActionPerformed(evt);
            }
        });
        jPanel1.add(btn_changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 340, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 340, 10));

        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("USER-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 490, 310));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-minimize-window-35.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-close-window-35.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        JOptionPane.showMessageDialog(null,log());
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changepassActionPerformed
        
       
        ChangePass cp = new ChangePass();
        cp.setVisible(true);
        
    }//GEN-LAST:event_btn_changepassActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
           setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
            this.dispose(); 
    }//GEN-LAST:event_jLabel6MouseClicked
    
    static int xx,yy;
    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jPanel3MouseDragged

    public String log(){
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        String result; 
        
        try{
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "SELECT * FROM login WHERE username = '" + "USER-" + txt_user.getText() + "' and password = '" + String.valueOf(txt_pass.getPassword())+"' ";
            
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                result = "Access Granted !";
            }
            else
            {
                result = "Access Denied!";
            }
        }
        catch(SQLException ex)
        {
            result = ex + "  The entered student ID cannot be found.";  
            
        }
        
        return result;
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_changepass;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
