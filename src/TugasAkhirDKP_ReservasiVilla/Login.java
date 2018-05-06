package TugasAkhirDKP_ReservasiVilla;

import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        account = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        Login = new javax.swing.JToggleButton();
        Cancel = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        account.setText("ACCOUNT SIGN IN");
        getContentPane().add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        username.setText("Username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 106, 60, 30));

        password.setText("Password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 156, 60, 30));

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 122, 45));

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 119, 45));
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 221, 30));
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 221, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\msi\\Desktop\\Praktikum DKP\\Dokumen\\Project TA DKP\\Login.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
            if(txtusername.getText().equals("admin")) // admin = username yang akan digunakan
            {
            if(txtpassword.getText().equals("admin")) // admin = password
            {
                //menuju form lain. Contoh disini adalah form home.
                FormVilla menu=new FormVilla(); //mendeklarasikan form home sebagai variabel menu, menu disini hanya nama, jadi bebas sebenarnya
                menu.setVisible(true); //memanggil form home
                this.setVisible(false);
                
            }else
            {
                //Jika password salah
                JOptionPane.showMessageDialog(null,"Incorrect Password","Error",JOptionPane.ERROR_MESSAGE);//memanggil message dialog
                txtpassword.setText("");//mengosongkan password field
                txtpassword.requestFocus();//mengganti fokus ke password field
            }
            }
            /*
            Jika ingin menambahkan username dan password lain, bisa ditambahkan else if disini
            dengan script sama seperti if di atas.       
            */
            else
            {
            //jika username salah
            JOptionPane.showMessageDialog(null,"User ID And Password is Invalid","Error",JOptionPane.ERROR_MESSAGE);
            txtusername.setText("");//mengosongkan text field
            txtpassword.setText("");//mengosongkan password field
            txtusername.requestFocus();//mengganti fokus ke password field
            }
    }//GEN-LAST:event_LoginActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
    this.dispose(); //menutup form login
    }//GEN-LAST:event_CancelActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JToggleButton Login;
    private javax.swing.JLabel account;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
