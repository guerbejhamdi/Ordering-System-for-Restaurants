/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.AdminPanels;

import Controllers.ClientController;
import Controllers.StockController;
import Models.Client;
import Models.Stock;
import Views.AdminInterface;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP OMEN
 */
public class s_panel extends javax.swing.JPanel {

    /**
     * Creates new form s_panel
     */
    public s_panel() {
        initComponents();
        panel_stock.setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_stock = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_drinks = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_price = new javax.swing.JTextField();
        tf_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_qty = new javax.swing.JTextField();

        panel_stock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt_drinks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "qty", "price"
            }
        ));
        jt_drinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_drinksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_drinks);

        panel_stock.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 400, 300));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Price");
        panel_stock.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Update Drink");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_stock.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 130, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 0));
        jButton2.setText("Remove Drink");
        panel_stock.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Drinks Stock");
        panel_stock.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");
        panel_stock.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));
        panel_stock.add(tf_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 170, -1));

        tf_id.setEnabled(false);
        panel_stock.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantity");
        panel_stock.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));
        panel_stock.add(tf_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_drinksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_drinksMouseClicked
        // TODO add your handling code here:

        System.out.println( this.jt_drinks.getSelectedRow());
        int i = this.jt_drinks.getSelectedRow();
        DefaultTableModel    model =  (DefaultTableModel)this.jt_drinks.getModel();
        tf_id.setText(model.getValueAt(i, 0).toString());
        tf_qty.setText(model.getValueAt(i, 2).toString());
        tf_price.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jt_drinksMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        StockController sc= new StockController();
        //AdminInterface ai = new AdminInterface();
        sc.executeChange(tf_qty, tf_price, tf_id);
        this.ShowDrink();
        JOptionPane.showMessageDialog(null,"Drink Updated");
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    
         public void ShowDrink()
   {
       StockController sc = new StockController();
       ArrayList<Stock> blist = sc.getDrinksList();
       DefaultTableModel model = (DefaultTableModel)jt_drinks.getModel();
       model.setRowCount(0);

       Object[] row = new Object[4];
       for(int i = 0; i < blist.size(); i++)
       {
           row[0] = blist.get(i).getId();
           row[1] = blist.get(i).getBoissonName();
           row[2] = blist.get(i).getQty();
           row[3] = blist.get(i).getPrice();

       
           
           model.addRow(row);
       }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jt_drinks;
    private javax.swing.JPanel panel_stock;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_qty;
    // End of variables declaration//GEN-END:variables
}