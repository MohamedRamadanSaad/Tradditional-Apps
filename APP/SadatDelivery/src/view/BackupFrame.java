/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controler.Log;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import services.DBBackup;

/**
 *
 * @author dirac
 */
public class BackupFrame extends javax.swing.JFrame {

    /**
     * Creates new form BackipFrame
     */
    public BackupFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_backup = new javax.swing.JLabel();
        bt_backup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Backup");

        lb_backup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_backup.setText("إضغط الزر لبدء عملية النسخ الإحتياطي");

        bt_backup.setText("بدء النسخ");
        bt_backup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_backupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_backup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lb_backup)
                .addGap(18, 18, 18)
                .addComponent(bt_backup)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_backupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_backupMouseClicked
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter the password:");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "Permission",
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        String passwordSTR = "";
        if (option == 0) // pressing OK button
        {
            char[] password = pass.getPassword();
            passwordSTR = new String(password);

        }

        if (passwordSTR.equals("admin123")) {
            new Thread(new Runnable() {
                public void run() {
                    System.err.println("Start Backup...");
                    DBBackup db = new DBBackup();

                    try {
                        boolean state = db.startBackup();

                        if (state == true) {
                            JOptionPane.showMessageDialog(null, "Database Backup successfully");
                            lb_backup.setText("تم نسخ البيانات بنجاح");
                            Log.saveLog("DataBase Backuped");
                        } else {
                            JOptionPane.showMessageDialog(null, "Database Backup failed");
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Database Backup failed");
                    }
                }
            }).start();

            new Thread(new Runnable() {
                public void run() {
                    lb_backup.setText("من فضلك إنتظر يتم نسخ البيانات ...");
                }
            }).start();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Wrong password");
        }
    }//GEN-LAST:event_bt_backupMouseClicked

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
            java.util.logging.Logger.getLogger(BackupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackupFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_backup;
    private javax.swing.JLabel lb_backup;
    // End of variables declaration//GEN-END:variables
}
