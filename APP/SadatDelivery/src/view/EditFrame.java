/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controler.CN_Customer;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static services.BuildTableModel.buildTableModel;
import services.DB;

/**
 *
 * @author dirac
 */
public class EditFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditFrame
     */
    public EditFrame() {
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_data = new javax.swing.JTable();
        tx_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        tx_customername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tx_customermail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tx_customerphone = new javax.swing.JTextField();
        tx_customeraddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tx_customerphone2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tx_customerregion = new javax.swing.JTextField();
        bt_edit = new javax.swing.JButton();
        bt_del = new javax.swing.JButton();
        jc_namesearch = new javax.swing.JCheckBox();
        jc_phonesearch = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        tx_empsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_empdata = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        tx_depsearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_depempdata = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tx_jobsearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_jobdata = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("تعديل البيانات");

        jt_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_data);

        tx_search.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tx_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_searchKeyPressed(evt);
            }
        });

        jLabel1.setText("بحث");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "تعديل البيانات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tx_customername.setEditable(false);
        tx_customername.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setText("الإسم");

        jLabel6.setText("بريد");

        tx_customermail.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setText("موبايل");

        tx_customerphone.setEditable(false);
        tx_customerphone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tx_customeraddress.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setText("العنوان");

        tx_customerphone2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel9.setText("موبايل 2");

        jLabel10.setText("المنطقة");

        tx_customerregion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        bt_edit.setText("تعديل");
        bt_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_editMouseClicked(evt);
            }
        });

        bt_del.setText("حذف");
        bt_del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_delMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(tx_customerphone2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tx_customerphone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(tx_customerregion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(bt_del)
                                .addGap(18, 18, 18)
                                .addComponent(bt_edit))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(tx_customeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(tx_customermail, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(tx_customername, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_customername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tx_customerphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tx_customerphone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_customermail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tx_customeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tx_customerregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_edit)
                    .addComponent(bt_del)))
        );

        jc_namesearch.setText("البحث بالاسم");
        jc_namesearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jc_namesearchMouseClicked(evt);
            }
        });

        jc_phonesearch.setText("البحث برقم الموبايل");
        jc_phonesearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jc_phonesearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(tx_search, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jc_namesearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jc_phonesearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_namesearch)
                    .addComponent(jc_phonesearch))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("العملاء", jPanel1);

        tx_empsearch.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tx_empsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_empsearchKeyPressed(evt);
            }
        });

        jLabel2.setText("بحث");

        jt_empdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jt_empdata);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "تعديل البيانات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel11.setText("الإسم");

        jLabel12.setText("الوظيفة");

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel13.setText("التلفون");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(tx_empsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(182, 182, 182))
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_empsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("الموظفين", jPanel2);

        tx_depsearch.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tx_depsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_depsearchKeyPressed(evt);
            }
        });

        jLabel3.setText("بحث");

        jt_depempdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jt_depempdata);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "تعديل البيانات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(tx_depsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(182, 182, 182))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_depsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("الإدارات", jPanel3);

        tx_jobsearch.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tx_jobsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_jobsearchKeyPressed(evt);
            }
        });

        jLabel4.setText("بحث");

        jt_jobdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jt_jobdata);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "تعديل البيانات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(tx_jobsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(182, 182, 182))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_jobsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("الوظائف", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setData(String sql, JTable jTable){
        Statement st;
                try {
                    st = DB.getConnection().createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    
                    jTable.setModel(buildTableModel(rs));
                    // JOptionPane.showMessageDialog(null, new JScrollPane(table));
                    rs.close();
                    st.close();
                } catch (Exception ex) {
                    Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    private void tx_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_searchKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {
            if(tx_search.getText().toString().equals("")){
                    String sql = "select region المنطقة,address العنوان,mail البريد,phone2  \"الموبايل الثاني\"  ,phone \"الموبايل الأول\",name الاسم from Customer";
                     setData(sql, jt_data);
            }
            if (jc_phonesearch.isSelected()) {
                
                String sql = "select region المنطقة,address العنوان,mail البريد,phone2  \"الموبايل الثاني\"  ,phone \"الموبايل الأول\",name الاسم from Customer"
                            + " where phone like '" + tx_search.getText().toString() + "'";
                    setData(sql, jt_data);
            } else if (jc_namesearch.isSelected()) {
                 
                    String sql = "select region المنطقة,address العنوان,mail البريد,phone2  \"الموبايل الثاني\"  ,phone \"الموبايل الأول\",name الاسم from Customer"
                            + " where lower(name) like lower('%" + tx_search.getText().toString() + "%')";
                    setData(sql, jt_data);
            }

        }
    }//GEN-LAST:event_tx_searchKeyPressed

    private void tx_empsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_empsearchKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            Statement st;
            try {
                st = DB.getConnection().createStatement();
                ResultSet rs = st.executeQuery("select region المنطقة,address العنوان,mail البريد,phone2  \"الموبايل الثاني\"  ,phone \"الموبايل الأول\",name الاسم from Customer");

                jt_empdata.setModel(buildTableModel(rs));
                // JOptionPane.showMessageDialog(null, new JScrollPane(table));
                
            } catch (Exception ex) {
                Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tx_empsearchKeyPressed

    private void tx_depsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_depsearchKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            Statement st;
            try {
                st = DB.getConnection().createStatement();
                ResultSet rs = st.executeQuery("select region المنطقة,address العنوان,mail البريد,phone2  \"الموبايل الثاني\"  ,phone \"الموبايل الأول\",name الاسم from Customer");

                jt_depempdata.setModel(buildTableModel(rs));
                // JOptionPane.showMessageDialog(null, new JScrollPane(table));
                
            } catch (Exception ex) {
                Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tx_depsearchKeyPressed

    private void tx_jobsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_jobsearchKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            Statement st;
            try {
                st = DB.getConnection().createStatement();
                ResultSet rs = st.executeQuery("select region المنطقة,address العنوان,mail البريد,phone2  \"الموبايل الثاني\"  ,phone \"الموبايل الأول\",name الاسم from Customer");

                jt_jobdata.setModel(buildTableModel(rs));
                // JOptionPane.showMessageDialog(null, new JScrollPane(table));
                
            } catch (Exception ex) {
                Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tx_jobsearchKeyPressed

    private void jc_phonesearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jc_phonesearchMouseClicked
        if (jc_phonesearch.isSelected()) {
            jc_namesearch.setSelected(false);
        }
    }//GEN-LAST:event_jc_phonesearchMouseClicked

    private void jc_namesearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jc_namesearchMouseClicked
        if (jc_namesearch.isSelected()) {
            jc_phonesearch.setSelected(false);
        }
    }//GEN-LAST:event_jc_namesearchMouseClicked

    private void jt_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_dataMouseClicked
       // System.out.println( jt_data.getSelectedColumn()+""+ jt_data.getValueAt(jt_data.getSelectedRow(), jt_data.getSelectedColumn()));
       String sql = "select * from dl.customer where phone = '"+jt_data.getValueAt(jt_data.getSelectedRow(), 4).toString()+"'";
       Statement st;
        try {
            st = DB.getConnection().createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 tx_customername.setText( rs.getString("name"));
        tx_customerphone.setText(rs.getString("phone"));
        tx_customerphone2.setText(rs.getString("phone2"));
        tx_customermail.setText(rs.getString("mail"));
        tx_customeraddress.setText(rs.getString("address"));
       tx_customerregion.setText(rs.getString("region"));
       
             }
        } catch (Exception ex) {
            Logger.getLogger(EditFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jt_dataMouseClicked

    private void bt_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_editMouseClicked
      String sql = "update dl.customer set phone2 = '"+tx_customerphone2.getText().toString()+"',"
              + " mail = '"+tx_customermail.getText().toString()+"',"
              + " address = '"+tx_customeraddress.getText().toString()+"',"
              + " region = '"+tx_customerregion.getText().toString()+"',"
              + " name = '"+tx_customername.getText().toString()+"' "
              + " where phone = '"+ tx_customerphone.getText().toString()+"'";
      Statement st;
        try {
            st = DB.getConnection().createStatement();
            if (!st.execute(sql)){
       JOptionPane.showMessageDialog(rootPane, "updated");
      
      }
        } catch (Exception ex) {
            Logger.getLogger(EditFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_bt_editMouseClicked

    private void bt_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_delMouseClicked
      String sql = "delete from dl.customer where phone = '"+ tx_customerphone.getText().toString()+"'";
     
      CN_Customer cu = new CN_Customer();
      String sqldel = "";
        try {
            int id = cu.getCustomerID(tx_customerphone.getText().toString());
            sqldel = "delete from dl.c_order where customer_id = "+id;
        } catch (Exception ex) {
            Logger.getLogger(EditFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = DB.getConnection().createStatement();
            int i= JOptionPane.showConfirmDialog(rootPane, "Are you shure you will delete this customer, also all orders related to him?!");
             if (i==0){
                 if (!st.execute(sql )&& !st.execute(sqldel)){
                  JOptionPane.showMessageDialog(rootPane, "Customer Deleted");
                 }
             }
        } catch (Exception ex) {
            Logger.getLogger(EditFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_bt_delMouseClicked

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
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_del;
    private javax.swing.JButton bt_edit;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JCheckBox jc_namesearch;
    private javax.swing.JCheckBox jc_phonesearch;
    private javax.swing.JTable jt_data;
    private javax.swing.JTable jt_depempdata;
    private javax.swing.JTable jt_empdata;
    private javax.swing.JTable jt_jobdata;
    private javax.swing.JTextField tx_customeraddress;
    private javax.swing.JTextField tx_customermail;
    private javax.swing.JTextField tx_customername;
    private javax.swing.JTextField tx_customerphone;
    private javax.swing.JTextField tx_customerphone2;
    private javax.swing.JTextField tx_customerregion;
    private javax.swing.JTextField tx_depsearch;
    private javax.swing.JTextField tx_empsearch;
    private javax.swing.JTextField tx_jobsearch;
    private javax.swing.JTextField tx_search;
    // End of variables declaration//GEN-END:variables
}