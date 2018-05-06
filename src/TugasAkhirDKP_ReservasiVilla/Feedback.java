package TugasAkhirDKP_ReservasiVilla;

import javax.swing.JOptionPane;

public class Feedback extends javax.swing.JFrame {
public int layanann;
    public Feedback() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtkembali = new javax.swing.JButton();
        opini = new javax.swing.JButton();
        layanan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtkembali.setText("Kembali Ke Menu Utama");
        txtkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(txtkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 210, 40));

        opini.setText("Submit");
        opini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opiniActionPerformed(evt);
            }
        });
        getContentPane().add(opini, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 375, 210, 40));
        getContentPane().add(layanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 70, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\msi\\Desktop\\Praktikum DKP\\Dokumen\\Project TA DKP\\Feedback.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkembaliActionPerformed
                FormVilla menu=new FormVilla(); //mendeklarasikan form home sebagai variabel menu, menu disini hanya nama, jadi bebas sebenarnya
                menu.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_txtkembaliActionPerformed

    private void opiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opiniActionPerformed
       
        try{
        layanann = Integer.parseInt(layanan.getText());
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Invalid Input, Please Check Again", " ", JOptionPane.ERROR_MESSAGE);
        }
        
        if (layanann==1) {
                JOptionPane.showMessageDialog(null, "Terimakasih atas feedback Anda mengenai layanan kami yang SANGAT BAIK :D", " ", JOptionPane.OK_OPTION);
                System.exit(0);
        }
        else if (layanann==2) {
                JOptionPane.showMessageDialog(null, "Terimakasih atas feedback Anda mengenai layanan kami yang BAIK :)", " ", JOptionPane.OK_OPTION);
                System.exit(0);
        }
        else if (layanann==3) {
                JOptionPane.showMessageDialog(null, "Terimakasih atas feedback Anda mengenai layanan kami yang CUKUP BAIK :|", " ", JOptionPane.OK_OPTION);
                System.exit(0);
        }
        else if (layanann==4) {
                JOptionPane.showMessageDialog(null, "Kami akan segera memperbaiki layanan kami yang menurut Anda KURANG :(", " ", JOptionPane.OK_OPTION);
                System.exit(0);
        }
        else if (layanann==5) {
                JOptionPane.showMessageDialog(null, "Kami akan segera memperbaiki layanan kami yang menurut Anda SANGAT KURANG :'(", " ", JOptionPane.OK_OPTION);
                System.exit(0);
        }
    }//GEN-LAST:event_opiniActionPerformed

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField layanan;
    private javax.swing.JButton opini;
    private javax.swing.JButton txtkembali;
    // End of variables declaration//GEN-END:variables
}
