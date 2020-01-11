/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controler.CN_Customer;
import Controler.CN_Login;
import Controler.CN_Orders;
import Controler.Log;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import services.FillComboBox;
import services.INF;
import services.Table;

/**
 *
 * @author MR
 */
public class CreateOrder extends javax.swing.JInternalFrame {

    /**
     * Creates new form CreateOrder
     */
    FillComboBox fill = new FillComboBox();

    public CreateOrder() throws Exception {
        initComponents();
        String where = "status = 'FR' ";
        fill.fillCBWhere(jc_driver, "name", Table.EMPLOYEE, where);
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
        jPanel5 = new javax.swing.JPanel();
        bt_save = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tx_Phone_Search = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tx_name = new javax.swing.JTextField();
        tx_address = new javax.swing.JTextField();
        tx_phone = new javax.swing.JTextField();
        tx_user = new javax.swing.JTextField();
        jc_driver = new javax.swing.JComboBox<>();
        jc_NewCustomer = new javax.swing.JCheckBox();
        dtpicker = new com.github.lgooddatepicker.components.DateTimePicker();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tx_description = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tx_grandtotal = new javax.swing.JTextField();
        tx_service = new javax.swing.JTextField();
        tx_AmtPurchase = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("إنشاء أوردر");

        jPanel1.setLayout(new java.awt.BorderLayout());

        bt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Save-icon.png"))); // NOI18N
        bt_save.setText("حفظ");
        bt_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_saveMouseClicked(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/erase-128.png"))); // NOI18N
        jButton2.setText("إلغاء");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/calcc.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("إنشاء أوردر");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("رقم الموبايل");

        tx_Phone_Search.setBackground(new java.awt.Color(240, 240, 240));
        tx_Phone_Search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tx_Phone_Search.setForeground(new java.awt.Color(0, 0, 153));
        tx_Phone_Search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx_Phone_Search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        tx_Phone_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_Phone_SearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(tx_Phone_Search, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(tx_Phone_Search))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("إسم العميل");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("إسم الكابتن");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("القائم بأعمال الشحن");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("هاتف العميل");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("عنوان العميل");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("التاريخ");

        tx_name.setEditable(false);
        tx_name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tx_address.setEditable(false);
        tx_address.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tx_phone.setEditable(false);
        tx_phone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tx_user.setEditable(false);
        tx_user.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tx_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jc_driver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jc_NewCustomer.setText("إنشاء أوردر لعميل غير مسجل");
        jc_NewCustomer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jc_NewCustomerItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tx_address)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tx_phone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jc_driver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tx_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tx_user)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dtpicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jc_NewCustomer)
                .addGap(131, 131, 131))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jc_NewCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc_driver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane1.setName("JI_CreateOrder"); // NOI18N

        tx_description.setColumns(20);
        tx_description.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        tx_description.setRows(5);
        tx_description.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(tx_description);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ملاحظات :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("إجمالي المشتريات");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("خدمة التوصيل");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("الإجمالي");

        tx_grandtotal.setEditable(false);
        tx_grandtotal.setBackground(new java.awt.Color(0, 0, 0));
        tx_grandtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tx_grandtotal.setForeground(new java.awt.Color(0, 255, 0));
        tx_grandtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx_grandtotal.setText("0");
        tx_grandtotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tx_grandtotalMouseClicked(evt);
            }
        });

        tx_service.setBackground(new java.awt.Color(0, 0, 0));
        tx_service.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tx_service.setForeground(new java.awt.Color(0, 255, 0));
        tx_service.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx_service.setText("0");

        tx_AmtPurchase.setBackground(new java.awt.Color(0, 0, 0));
        tx_AmtPurchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tx_AmtPurchase.setForeground(new java.awt.Color(0, 255, 0));
        tx_AmtPurchase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx_AmtPurchase.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(tx_grandtotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tx_service)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_AmtPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(79, 79, 79))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tx_grandtotal)
                    .addComponent(tx_service, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(tx_AmtPurchase, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jc_NewCustomerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc_NewCustomerItemStateChanged
        // TODO add your handling code here:
        if (jc_NewCustomer.isSelected()) {
            tx_Phone_Search.setText(null);
            tx_name.setText(null);
            tx_name.setEditable(true);
            tx_address.setText(null);
            tx_address.setEditable(true);
            tx_phone.setText(null);
            tx_phone.setEditable(true);
            tx_user.setText(CN_Login.username);
        } else {
            tx_name.setText(null);
            tx_address.setText(null);
            tx_phone.setText(null);
            tx_name.setEditable(false);
            tx_address.setEditable(false);
            tx_phone.setEditable(false);
            tx_user.setText("");
        }
    }//GEN-LAST:event_jc_NewCustomerItemStateChanged

    private void tx_Phone_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_Phone_SearchKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            CN_Customer cu = new CN_Customer();
            try {
                Map map = new HashMap();
                map = cu.search(tx_Phone_Search.getText().toString());
                if (!map.isEmpty()) {
                    tx_name.setText(map.get("name").toString());
                    tx_phone.setText(map.get("phone").toString());
                   String region =  (map.get("region").toString().equals("null"))?"":map.get("region").toString();
                    tx_address.setText(map.get("address").toString() + " - "+region );
                    tx_user.setText(CN_Login.username);
                } else {
                    JOptionPane.showMessageDialog(null, "Phone number is not found");
                    tx_name.setText("");
                    tx_phone.setText("");
                    tx_address.setText("");
                }
            } catch (Exception ex) {
                Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tx_Phone_SearchKeyPressed

    private void bt_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_saveMouseClicked
        Map master = new HashMap();
        Map newCustomer = new HashMap();
        Map lines = new HashMap();
        Hashtable<String, Map> ht = new Hashtable<>();
        CN_Orders or = new CN_Orders();
        CN_Customer co = new CN_Customer();
        int lineNo = 1;
        int driver_ID = 0;
        String dateTime = "";
        try{
        String date = dtpicker.getTimePicker().getTime().toString();
        String time = dtpicker.getDatePicker().getDate().toString();
        dateTime = date + " " + time;
        }catch(Exception ex){
            Logger.getLogger(CreateOrder.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "يجب وضع قيم للتاريخ و الوقت") ;
            return;
        }
        
        if (!tx_name.getText().toString().equals("")) {
            if (!jc_NewCustomer.isSelected()) {

                try {
                    driver_ID = INF.getIDFor(Table.EMPLOYEE, jc_driver.getSelectedItem().toString());
                } catch (Exception ex) {
                    Logger.getLogger(CreateOrder.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    master.put("Customer_ID", co.getCustomerID(tx_Phone_Search.getText().toString()));
                    master.put("dateordered", dateTime);
                    master.put("createdby", CN_Login.user_id);
                    master.put("driver_ID", driver_ID);
                    master.put("amtpurchase", tx_AmtPurchase.getText().toString());
                    master.put("amtservice", tx_service.getText().toString());
                    master.put("grandtotal", tx_grandtotal.getText().toString());
                } catch (Exception ex) {
                    Logger.getLogger(CreateOrder.class.getName()).log(Level.SEVERE, null, ex);
                }

                for (String line : tx_description.getText().split("\\n")) {
                    lines.put(lineNo, line);
                    lineNo = lineNo + 1;
                };
                ht.put("master", master);
                ht.put("lines", lines);

                try {
                    or.save(ht);
                    JOptionPane.showMessageDialog(null, "Order Created");
                    this.setClosed(true);
                } catch (Exception ex) {
                    Logger.getLogger(CreateOrder.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                if (!tx_name.getText().toString().equals("") && !tx_phone.getText().toString().equals("")) {
                    newCustomer.put("name", tx_name.getText().toString());
                    newCustomer.put("phone", tx_phone.getText().toString());
                    newCustomer.put("address", tx_address.getText().toString());
                    newCustomer.put("mail", "");
                    newCustomer.put("region", "");
                    newCustomer.put("phone2", "");
                    try {
                        if (!co.save(newCustomer))
                            return;
                        master.put("Customer_ID", co.getCustomerID(tx_phone.getText().toString()));
                        master.put("dateordered", dateTime);
                        master.put("createdby", CN_Login.user_id);
                        master.put("driver_ID", driver_ID);
                        master.put("amtpurchase", tx_AmtPurchase.getText().toString());
                        master.put("amtservice", tx_service.getText().toString());
                        master.put("grandtotal", tx_grandtotal.getText().toString());

                        for (String line : tx_description.getText().split("\\n")) {
                            lines.put(lineNo, line);
                            lineNo = lineNo + 1;
                        };
                        ht.put("master", master);
                        ht.put("lines", lines);
                        or.save(ht);
                        JOptionPane.showMessageDialog(null, "Order Created");
                        Log.saveLog("Order Created");
                        this.setClosed(true);
                    } catch (Exception ex) {
                        Logger.getLogger(CreateOrder.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "لا يمكن حفظ الاوردر ,يجب ملئ اسم و رقم موبايل العميل");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "لا يمكن حفظ الاوردر , يرجي مراجعة البيانات");
        }
    }//GEN-LAST:event_bt_saveMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CreateOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void tx_grandtotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tx_grandtotalMouseClicked
        int AMT = Integer.parseInt(tx_AmtPurchase.getText().toString());
        int service = Integer.parseInt(tx_service.getText().toString());
        tx_grandtotal.setText("" + (AMT + service));

    }//GEN-LAST:event_tx_grandtotalMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Runtime runtime = Runtime.getRuntime();
        Process p=null;   
        String command = "calc";
        try {
            p=runtime.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(CreateOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_save;
    private com.github.lgooddatepicker.components.DateTimePicker dtpicker;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jc_NewCustomer;
    private javax.swing.JComboBox<String> jc_driver;
    private javax.swing.JTextField tx_AmtPurchase;
    private javax.swing.JTextField tx_Phone_Search;
    private javax.swing.JTextField tx_address;
    private javax.swing.JTextArea tx_description;
    private javax.swing.JTextField tx_grandtotal;
    private javax.swing.JTextField tx_name;
    private javax.swing.JTextField tx_phone;
    private javax.swing.JTextField tx_service;
    private javax.swing.JTextField tx_user;
    // End of variables declaration//GEN-END:variables
}
