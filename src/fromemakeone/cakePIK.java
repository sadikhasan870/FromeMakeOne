/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromemakeone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 12
 */
public class cakePIK extends javax.swing.JFrame {

    /**
     * Creates new form cakePIK
     */
    public cakePIK() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        fruthButton = new java.awt.Button();
        coffieButton = new java.awt.Button();
        blackForestButton = new java.awt.Button();
        PineappleButton = new java.awt.Button();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        bananaButton = new java.awt.Button();
        lemonButton = new java.awt.Button();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab1", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab2", jPanel5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 248, 151));

        button1.setBackground(new java.awt.Color(251, 248, 151));
        button1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button1.setLabel("All cakes");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        fruthButton.setBackground(new java.awt.Color(251, 248, 151));
        fruthButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fruthButton.setLabel("fruth cake");
        fruthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruthButtonActionPerformed(evt);
            }
        });

        coffieButton.setBackground(new java.awt.Color(251, 248, 151));
        coffieButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        coffieButton.setLabel("Coffie Cake");
        coffieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coffieButtonActionPerformed(evt);
            }
        });

        blackForestButton.setBackground(new java.awt.Color(251, 248, 151));
        blackForestButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        blackForestButton.setLabel("Black-forest-cake");
        blackForestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackForestButtonActionPerformed(evt);
            }
        });

        PineappleButton.setBackground(new java.awt.Color(251, 248, 151));
        PineappleButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PineappleButton.setLabel("pineapple-cake");
        PineappleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PineappleButtonActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(251, 248, 151));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(251, 248, 151));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(dtm);
        jScrollPane1.setViewportView(jTable1);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 240, 550, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fromemakeone/w540 h 220.jpg"))); // NOI18N
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 220));

        exit.setBackground(new java.awt.Color(255, 204, 204));
        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel8.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 110, 40));

        bananaButton.setBackground(new java.awt.Color(251, 248, 151));
        bananaButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bananaButton.setLabel("Banana-cake");
        bananaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bananaButtonActionPerformed(evt);
            }
        });

        lemonButton.setBackground(new java.awt.Color(251, 248, 151));
        lemonButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lemonButton.setLabel("Lemon-cake");
        lemonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonButtonActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(251, 248, 151));

        jLabel3.setBackground(new java.awt.Color(251, 248, 151));
        jLabel3.setText("jLabel2");

        jLabel4.setBackground(new java.awt.Color(251, 248, 151));
        jLabel4.setText("jLabel2");

        jLabel5.setBackground(new java.awt.Color(251, 248, 151));
        jLabel5.setText("jLabel2");

        jLabel6.setBackground(new java.awt.Color(251, 248, 151));
        jLabel6.setText("jLabel2");

        jLabel7.setBackground(new java.awt.Color(251, 248, 151));
        jLabel7.setText("jLabel2");

        jLabel8.setBackground(new java.awt.Color(251, 248, 151));
        jLabel8.setText("jLabel2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(blackForestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PineappleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(coffieButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fruthButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bananaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lemonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(fruthButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(coffieButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(blackForestButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(PineappleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(bananaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(lemonButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String pnams;
    String pids;
    String stocks;
    String unitps;

    //class make korlam
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/inventory";
    Connection con;
    Statement stm;
    PreparedStatement pprds;
    String sqls;//quary rakha hoba
    DefaultTableModel dtm = new DefaultTableModel();
    ResultSet rs;

    public void myDrive() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "12345");

        } catch (ClassNotFoundException cnf) {
            System.out.println(cnf);
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }

    }
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        myDrive();
        try {
            sqls = "select product_id,product_name,stock,unit_price from product";

            stm = con.createStatement();
            rs = stm.executeQuery(sqls);
            Vector<String> header = new Vector<String>();
            header.add("Product Id");
            header.add("Product name");
            header.add("Stock");
            header.add("Unit price");
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> row = new Vector<Object>();
                row.add(rs.getString("product_id"));
                row.add(rs.getString("product_name"));
                row.add(rs.getString("stock"));
                row.add(rs.getString("unit_price"));
                data.add(row);
            }
            dtm.setDataVector(data, header);
        } catch (SQLException exp) {
            System.out.println("exp");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void fruthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruthButtonActionPerformed
        // TODO add your handling code here:
        myDrive();
        try {
            sqls = "select product_id,product_name,stock,unit_price from product where product_name='frute cake'";

            stm = con.createStatement();
            rs = stm.executeQuery(sqls);
            Vector<String> header = new Vector<String>();
            header.add("Product Id");
            header.add("Product name");
            header.add("Stock");
            header.add("Unit price");
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> row = new Vector<Object>();
                row.add(rs.getString("product_id"));
                row.add(rs.getString("product_name"));
                row.add(rs.getString("stock"));
                row.add(rs.getString("unit_price"));
                data.add(row);
            }
            dtm.setDataVector(data, header);
        } catch (SQLException exp) {
            System.out.println("exp");
        }
        // TODO add your handling code here:


    }//GEN-LAST:event_fruthButtonActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:

        System.exit(0);


    }//GEN-LAST:event_exitActionPerformed

    private void coffieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coffieButtonActionPerformed

        myDrive();
        try {
            sqls = "select product_id,product_name,stock,unit_price from product where product_name='Coffie Cake'";

            stm = con.createStatement();
            rs = stm.executeQuery(sqls);
            Vector<String> header = new Vector<String>();
            header.add("Product Id");
            header.add("Product name");
            header.add("Stock");
            header.add("Unit price");
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> row = new Vector<Object>();
                row.add(rs.getString("product_id"));
                row.add(rs.getString("product_name"));
                row.add(rs.getString("stock"));
                row.add(rs.getString("unit_price"));
                data.add(row);
            }
            dtm.setDataVector(data, header);
        } catch (SQLException exp) {
            System.out.println("exp");
        }


    }//GEN-LAST:event_coffieButtonActionPerformed

    private void blackForestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackForestButtonActionPerformed

        myDrive();
        try {
            sqls = "select product_id,product_name,stock,unit_price from product where product_name='Black- forest - cake'";

            stm = con.createStatement();
            rs = stm.executeQuery(sqls);
            Vector<String> header = new Vector<String>();
            header.add("Product Id");
            header.add("Product name");
            header.add("Stock");
            header.add("Unit price");
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> row = new Vector<Object>();
                row.add(rs.getString("product_id"));
                row.add(rs.getString("product_name"));
                row.add(rs.getString("stock"));
                row.add(rs.getString("unit_price"));
                data.add(row);
            }
            dtm.setDataVector(data, header);
        } catch (SQLException exp) {
            System.out.println("exp");
        }
    }//GEN-LAST:event_blackForestButtonActionPerformed

    private void PineappleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PineappleButtonActionPerformed

        myDrive();
        try {
            sqls = "select product_id,product_name,stock,unit_price from product where product_name='pineapple-cake'";

            stm = con.createStatement();
            rs = stm.executeQuery(sqls);
            Vector<String> header = new Vector<String>();
            header.add("Product Id");
            header.add("Product name");
            header.add("Stock");
            header.add("Unit price");
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> row = new Vector<Object>();
                row.add(rs.getString("product_id"));
                row.add(rs.getString("product_name"));
                row.add(rs.getString("stock"));
                row.add(rs.getString("unit_price"));
                data.add(row);
            }
            dtm.setDataVector(data, header);
        } catch (SQLException exp) {
            System.out.println("exp");
        }
    }//GEN-LAST:event_PineappleButtonActionPerformed

    private void bananaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bananaButtonActionPerformed

        myDrive();
        try {
            sqls = "select product_id,product_name,stock,unit_price from product where product_name='Banana - cakeS'";

            stm = con.createStatement();
            rs = stm.executeQuery(sqls);
            Vector<String> header = new Vector<String>();
            header.add("Product Id");
            header.add("Product name");
            header.add("Stock");
            header.add("Unit price");
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> row = new Vector<Object>();
                row.add(rs.getString("product_id"));
                row.add(rs.getString("product_name"));
                row.add(rs.getString("stock"));
                row.add(rs.getString("unit_price"));
                data.add(row);
            }
            dtm.setDataVector(data, header);
        } catch (SQLException exp) {
            System.out.println("exp");
        }


    }//GEN-LAST:event_bananaButtonActionPerformed

    private void lemonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonButtonActionPerformed
        myDrive();
        try {
            sqls = "select product_id,product_name,stock,unit_price from product where product_name='Lemon - cake'";

            stm = con.createStatement();
            rs = stm.executeQuery(sqls);
            Vector<String> header = new Vector<String>();
            header.add("Product Id");
            header.add("Product name");
            header.add("Stock");
            header.add("Unit price");
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> row = new Vector<Object>();
                row.add(rs.getString("product_id"));
                row.add(rs.getString("product_name"));
                row.add(rs.getString("stock"));
                row.add(rs.getString("unit_price"));
                data.add(row);
            }
            dtm.setDataVector(data, header);
        } catch (SQLException exp) {
            System.out.println("exp");
        }

    }//GEN-LAST:event_lemonButtonActionPerformed

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
            java.util.logging.Logger.getLogger(cakePIK.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cakePIK.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cakePIK.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cakePIK.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cakePIK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button PineappleButton;
    private java.awt.Button bananaButton;
    private java.awt.Button blackForestButton;
    private java.awt.Button button1;
    private java.awt.Button coffieButton;
    private javax.swing.JButton exit;
    private java.awt.Button fruthButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private java.awt.Button lemonButton;
    // End of variables declaration//GEN-END:variables
}
