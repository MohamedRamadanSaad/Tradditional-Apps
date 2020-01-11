/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.reportParameters;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import services.FillComboBox;
import services.INF;
import services.JasperReportStarter;
import services.Reports;

/**
 *
 * @author dirac
 */
public class OrderByDocStatus extends javax.swing.JFrame {

    /**
     * Creates new form OrderByDocStatus
     */
   
    FillComboBox fill ;
   
    public OrderByDocStatus() throws Exception {
        initComponents();
        fill= new FillComboBox();
        fill.fillCBWithNothingChoise(cb_Customer, "name", "Customer");
       this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        docStatus = new javax.swing.ButtonGroup();
        jr_PR = new javax.swing.JRadioButton();
        jr_CO = new javax.swing.JRadioButton();
        jr_DL = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dt_from = new com.github.lgooddatepicker.components.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        dt_to = new com.github.lgooddatepicker.components.DatePicker();
        jLabel5 = new javax.swing.JLabel();
        cb_Customer = new javax.swing.JComboBox<>();
        jr_All = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("حالة التقرير");
        setResizable(false);

        docStatus.add(jr_PR);
        jr_PR.setText("غير مكتملة");

        docStatus.add(jr_CO);
        jr_CO.setText("مكتملة");

        docStatus.add(jr_DL);
        jr_DL.setText("ملغي");

        jButton1.setText("عرض التقرير");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("تقرير تحليلي للأوردرات");

        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("حالة التقرير:");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("تاريخ من :");

        jLabel4.setText("تاريخ إلي :");
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setText("العميل :");

        docStatus.add(jr_All);
        jr_All.setSelected(true);
        jr_All.setText("الكل");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dt_from, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cb_Customer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(dt_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jr_All)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jr_DL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jr_PR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jr_CO)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dt_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dt_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cb_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jr_PR)
                    .addComponent(jr_CO)
                    .addComponent(jr_DL)
                    .addComponent(jr_All))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
        try {
            buildParameters();
        } catch (Exception ex) {
            Logger.getLogger(OrderByDocStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(OrderByDocStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderByDocStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderByDocStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderByDocStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new OrderByDocStatus().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(OrderByDocStatus.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }
    public void buildParameters() throws Exception{

        HashMap<String ,Object> para = new HashMap(); 
         if(dt_from.getDateStringOrEmptyString().equalsIgnoreCase("") ||dt_to.getDateStringOrEmptyString().equalsIgnoreCase("")){
               JOptionPane.showMessageDialog(null, "يجب إدخال تاريخ من و إلي");
               return ;
           }else {
              java.sql.Date  dateFrom = java.sql.Date.valueOf(dt_from.getDate());
              java.sql.Date  dateto = java.sql.Date.valueOf(dt_to.getDate());
               para.put("DateFrom", dateFrom);
               para.put("DateTo", dateto);
              
           }
           if (!cb_Customer.getSelectedItem().toString().equalsIgnoreCase("--")){
               INF inf =new INF();
               para.put("Customer_ID", inf.getIDFor("Customer", cb_Customer.getSelectedItem().toString()) );
           }
           
           jr_CO.setActionCommand("CO");
           jr_PR.setActionCommand("PR");
           jr_DL.setActionCommand("DL");
           jr_All.setActionCommand(null);
           para.put("DocStatus", docStatus.getSelection().getActionCommand());
           JasperReportStarter  rs = new JasperReportStarter();
               rs.setParameter(para);
               rs.openReport(Reports.orderCosts);
        }

    
    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> cb_Customer;
    private javax.swing.ButtonGroup docStatus;
    private com.github.lgooddatepicker.components.DatePicker dt_from;
    private com.github.lgooddatepicker.components.DatePicker dt_to;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jr_All;
    private javax.swing.JRadioButton jr_CO;
    private javax.swing.JRadioButton jr_DL;
    private javax.swing.JRadioButton jr_PR;
    // End of variables declaration                   
}
