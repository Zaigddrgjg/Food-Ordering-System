/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system;



import java.sql.Connection;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author sanan
 */
  
public class user_panel extends javax.swing.JFrame {
    /**
     * Creates new form user_panel
     */
    public user_panel() {
        initComponents();
        Connect();
          this.setLocationRelativeTo(null);
        
        
      
         }
    Connection conn;
    PreparedStatement pst1;
    ResultSet rss;
    
    
    
    private void Connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/main_menu", "root", "");  
            } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(user_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    DefaultTableModel model = new DefaultTableModel();
    
    
       
    
    public void sales() 
    {
            int lastid = 0;
            try {
            
            int rows = jTable1.getRowCount();

            String query1 = "insert into sales_product(prodname,price,qty,total,sub_total,payment,balance)values(?,?,?,?,?,?,?)";
    
            pst1 = conn.prepareStatement(query1);

    
            String prodname = " ";
             int price;
             int qty ;
            int total = 0;
            String sub = txtsub.getText();
            String pay = txtpay.getText();
            String bal = txtbal.getText();
            
            
            for(int i=0;i<jTable1.getRowCount();i++)
            {
                   prodname = (String)jTable1.getValueAt(i, 0);
                   price = (int)jTable1.getValueAt(i, 1);
                   qty = (int)jTable1.getValueAt(i, 2);
                   total = (int)jTable1.getValueAt(i, 3);
                   
                   
                   
                    pst1.setString(1, prodname);
                    pst1.setInt(2, price);
                    pst1.setInt(3, qty);
                    pst1.setInt(4, total);
                    pst1.setString(5,sub);
                    pst1.setString(6, pay);
                    pst1.setString(7, bal);
                    
            pst1.executeUpdate();
                    
            }
                     
            
    
    pst1.addBatch();
    JOptionPane.showMessageDialog(this,"Sales Complete");
       
        
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(user_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        chk1 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        chk5 = new javax.swing.JCheckBox();
        chk6 = new javax.swing.JCheckBox();
        txt1 = new javax.swing.JSpinner();
        txt2 = new javax.swing.JSpinner();
        txt3 = new javax.swing.JSpinner();
        txt4 = new javax.swing.JSpinner();
        txt5 = new javax.swing.JSpinner();
        txt6 = new javax.swing.JSpinner();
        chk7 = new javax.swing.JCheckBox();
        txt7 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        ordbtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtbal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 33, 33));
        jPanel1.setForeground(java.awt.Color.white);
        jPanel1.setToolTipText("");

        jLabel3.setBackground(java.awt.Color.black);
        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 48)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("   Food Ordering System");

        jSeparator1.setForeground(java.awt.Color.white);
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(36, 33, 33));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white, 5));
        jPanel2.setForeground(java.awt.Color.white);

        chk1.setBackground(new java.awt.Color(36, 33, 33));
        chk1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        chk1.setForeground(java.awt.Color.white);
        chk1.setText("Sandwich");
        chk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1ActionPerformed(evt);
            }
        });

        chk2.setBackground(new java.awt.Color(36, 33, 33));
        chk2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        chk2.setForeground(java.awt.Color.white);
        chk2.setText("Gobi Rice");
        chk2.setToolTipText("");
        chk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2ActionPerformed(evt);
            }
        });

        chk3.setBackground(new java.awt.Color(36, 33, 33));
        chk3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        chk3.setForeground(java.awt.Color.white);
        chk3.setText("Pizza");
        chk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3ActionPerformed(evt);
            }
        });

        chk4.setBackground(new java.awt.Color(36, 33, 33));
        chk4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        chk4.setForeground(java.awt.Color.white);
        chk4.setText("Burger");
        chk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4ActionPerformed(evt);
            }
        });

        chk5.setBackground(new java.awt.Color(36, 33, 33));
        chk5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        chk5.setForeground(java.awt.Color.white);
        chk5.setText("Coke");
        chk5.setToolTipText("");
        chk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk5ActionPerformed(evt);
            }
        });

        chk6.setBackground(new java.awt.Color(36, 33, 33));
        chk6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        chk6.setForeground(java.awt.Color.white);
        chk6.setText("Pepsi");
        chk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk6ActionPerformed(evt);
            }
        });

        chk7.setBackground(new java.awt.Color(36, 33, 33));
        chk7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        chk7.setForeground(java.awt.Color.white);
        chk7.setText("Noodles");
        chk7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk7ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("MENU");

        jLabel13.setBackground(java.awt.Color.black);
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("₹ 30");

        jLabel20.setBackground(java.awt.Color.black);
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(java.awt.Color.white);
        jLabel20.setText("₹ 50");

        jLabel21.setBackground(java.awt.Color.black);
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(java.awt.Color.white);
        jLabel21.setText("₹ 90");

        jLabel22.setBackground(java.awt.Color.black);
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(java.awt.Color.white);
        jLabel22.setText("₹ 50");

        jLabel23.setBackground(java.awt.Color.black);
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(java.awt.Color.white);
        jLabel23.setText("₹ 20");

        jLabel24.setBackground(java.awt.Color.black);
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(java.awt.Color.white);
        jLabel24.setText("₹ 20");

        jLabel25.setBackground(java.awt.Color.black);
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(java.awt.Color.white);
        jLabel25.setText("₹ 30");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk3)
                            .addComponent(chk4)
                            .addComponent(chk5)
                            .addComponent(chk6)
                            .addComponent(chk7))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chk2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(chk1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk3)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk4)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk5)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk6)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk7)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTable1.setBackground(java.awt.Color.gray);
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        jTable1.setForeground(java.awt.Color.white);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Price", "Qty", "Total"
            }
        ));
        jTable1.setGridColor(java.awt.Color.white);
        jScrollPane1.setViewportView(jTable1);

        addbtn.setBackground(java.awt.Color.white);
        addbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        ordbtn.setBackground(java.awt.Color.white);
        ordbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ordbtn.setText("ORDER");
        ordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordbtnActionPerformed(evt);
            }
        });

        jLabel10.setBackground(java.awt.Color.black);
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Sub Total :");

        txtpay.setBackground(new java.awt.Color(36, 33, 33));
        txtpay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpay.setForeground(java.awt.Color.white);
        txtpay.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white, 2));
        txtpay.setDisabledTextColor(java.awt.Color.white);
        txtpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayActionPerformed(evt);
            }
        });

        jLabel11.setBackground(java.awt.Color.black);
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Pay :");

        txtsub.setEditable(false);
        txtsub.setBackground(new java.awt.Color(36, 33, 33));
        txtsub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsub.setForeground(java.awt.Color.white);
        txtsub.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white, 2));
        txtsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubActionPerformed(evt);
            }
        });

        jLabel12.setBackground(java.awt.Color.black);
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Balance :");

        txtbal.setEditable(false);
        txtbal.setBackground(new java.awt.Color(36, 33, 33));
        txtbal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbal.setForeground(java.awt.Color.white);
        txtbal.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white, 2));
        txtbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(ordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel10))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );

        jSeparator1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleParent(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        int sum = 0;
        int price;
        int qty;
        int tot = 0;
        
        if(chk1.isSelected())
        {
            String Sandwich = chk1.getText();
            price = 50;
            qty = Integer.parseInt(txt1.getValue().toString());
            
            tot = price * qty;
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
             Sandwich,
             price,
             qty,
             tot
            });  
        }
        
         if(chk2.isSelected())
        {
            String GobiRice  = chk2.getText();
            price = 30;
            qty = Integer.parseInt(txt2.getValue().toString());
            
            tot = price * qty;
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
            GobiRice,
             price,
             qty,
             tot
            
            });  
        }
        
           if(chk3.isSelected())
        {
            String Pizza   = chk3.getText();
            price = 90;
            qty = Integer.parseInt(txt3.getValue().toString());
            
            tot = price * qty;
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
             Pizza,
             price,
             qty,
             tot
           
            });  
        }
        
         if(chk4.isSelected())
        {
            String Burger   = chk4.getText();
            price = 50;
            qty = Integer.parseInt(txt4.getValue().toString());
            
            tot = price * qty;
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
             Burger,
             price,
             qty,
             tot
            
            });  
        }
        
        if(chk5.isSelected())
        {
            String Coke   = chk5.getText();
            price = 20;
            qty = Integer.parseInt(txt5.getValue().toString());
            
            tot = price * qty;
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
            Coke,
             price,
             qty,
             tot
            
            });  
        }
        
        if(chk6.isSelected())
        {
            String Pepsi   = chk6.getText();
            price = 20;
            qty = Integer.parseInt(txt6.getValue().toString());
            
            tot = price * qty;
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
            Pepsi,
             price,
             qty,
             tot
            
            });  
        }
        if(chk7.isSelected())
        {
            String Noodles   = chk7.getText();
            price = 30;
            qty = Integer.parseInt(txt7.getValue().toString());
            
            tot = price * qty;
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
            Noodles,
             price,
             qty,
             tot
            
            });  
        }
        
        
        for(int i=0; i <jTable1.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            
        }
        
        txtsub.setText(Integer.toString(sum));
        
     JOptionPane.showMessageDialog(this,"ENTER THE AMOUNT TO PAY");
    
        
        
      
    }//GEN-LAST:event_addbtnActionPerformed

    private void ordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordbtnActionPerformed
        // TODO add your handling code here:
        
        
          int sub,pay,bal;
         sub = Integer.parseInt(txtsub.getText());
         pay = Integer.parseInt(txtpay.getText());
         
         bal = pay - sub;
         
         txtbal.setText(String.valueOf(bal));
  
        sales();
       
    }//GEN-LAST:event_ordbtnActionPerformed

    private void txtpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayActionPerformed

    private void txtsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubActionPerformed

    private void txtbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalActionPerformed

    private void chk7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk7ActionPerformed

    private void chk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk6ActionPerformed

    private void chk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk5ActionPerformed

    private void chk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk4ActionPerformed

    private void chk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk3ActionPerformed

    private void chk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk2ActionPerformed

    private void chk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_chk1ActionPerformed

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
            java.util.logging.Logger.getLogger(user_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new user_panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chk5;
    private javax.swing.JCheckBox chk6;
    private javax.swing.JCheckBox chk7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton ordbtn;
    private javax.swing.JSpinner txt1;
    private javax.swing.JSpinner txt2;
    private javax.swing.JSpinner txt3;
    private javax.swing.JSpinner txt4;
    private javax.swing.JSpinner txt5;
    private javax.swing.JSpinner txt6;
    private javax.swing.JSpinner txt7;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtpay;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables
}
