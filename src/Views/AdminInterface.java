/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.AdminController;
import Controllers.ClientController;
import Models.Client;
import Views.AdminPanels.a_panel;
import Views.AdminPanels.c_panel;
import Views.AdminPanels.o_panel;
import Views.AdminPanels.s_panel;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP OMEN
 */
public class AdminInterface extends javax.swing.JFrame {

    /**
     * Creates new form AdminInterface
     */
    
    
            c_panel cpanel;
            s_panel spanel;
            a_panel apanel;
            o_panel opanel;
            GridBagLayout layout = new GridBagLayout();
            GridBagConstraints c;

    public AdminInterface() {
        
        initComponents();
         panel_overlay.setOpaque(false);
        DynamicPanel.setOpaque(false);
        //Clients Panel
        cpanel = new c_panel();
        cpanel.setOpaque(false);
        DynamicPanel.setLayout(layout);
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(cpanel, c);
        cpanel.setOpaque(false);
        //Stock Panel
          spanel = new s_panel();
        spanel.setOpaque(false);
        DynamicPanel.setLayout(layout);
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(spanel, c);
        spanel.setOpaque(false);
        
        
        //Admin Panel
          apanel = new a_panel();
        apanel.setOpaque(false);
        DynamicPanel.setLayout(layout);
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(apanel, c);
        apanel.setOpaque(false);
        //order panel
        opanel = new o_panel();
                DynamicPanel.setLayout(layout);
         c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(opanel, c);
        opanel.setOpaque(false);
        
        
     
        //
        cpanel.setVisible(false);
        spanel.setVisible(false);
         apanel.setVisible(false);
         opanel.setVisible(false);

     

        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_overlay = new javax.swing.JPanel();
        logoutc = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutc.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP OMEN\\Desktop\\Projectsrc\\logoutt.png")); // NOI18N
        logoutc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutcMouseClicked(evt);
            }
        });
        panel_overlay.add(logoutc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP OMEN\\Desktop\\Projectsrc\\clientss.png")); // NOI18N
        jButton2.setText("\n\n\nView Clients");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel_overlay.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 70));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP OMEN\\Desktop\\Projectsrc\\diet.png")); // NOI18N
        jButton3.setText("Restaurant Stock");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel_overlay.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 200, 70));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP OMEN\\Desktop\\Projectsrc\\boss.png")); // NOI18N
        jButton4.setText("   View Admins");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel_overlay.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, 70));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP OMEN\\Desktop\\Projectsrc\\choices.png")); // NOI18N
        jButton5.setText("   View Orders");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel_overlay.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 200, 70));

        DynamicPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_overlay.add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1180, 590));

        getContentPane().add(panel_overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 810));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP OMEN\\Desktop\\Projectsrc\\bck.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                  spanel.setVisible(false);
                 apanel.setVisible(false);
          opanel.setVisible(false);
           cpanel.ShowClients();
                                 cpanel.setVisible(true);
                                 

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         apanel.setVisible(false);
          opanel.setVisible(false);
          cpanel.setVisible(false);
          spanel.ShowDrink();;
          spanel.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cpanel.setVisible(false);
         spanel.setVisible(false);
          opanel.setVisible(false);
         apanel.ShowAdmins();
         apanel.setVisible(true);
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cpanel.setVisible(false);
         spanel.setVisible(false);
         apanel.setVisible(false);
         opanel.setVisible(true);
         opanel.ShowOrders();
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void logoutcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutcMouseClicked
        // TODO add your handling code here:
          Login l1 = new Login();
                DragListener drag1 = new DragListener();
                l1.addMouseListener( drag1 );
                l1.addMouseMotionListener( drag1 );
                l1.setLocationRelativeTo(null) ;
                l1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_logoutcMouseClicked

    
    
    

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            AdminInterface Ai = new AdminInterface();
                DragListener drag1 = new DragListener();
                Ai.addMouseListener( drag1 );
                Ai.addMouseMotionListener( drag1 );
                Ai.setLocationRelativeTo(null) ;
                Ai.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoutc;
    private javax.swing.JPanel panel_overlay;
    // End of variables declaration//GEN-END:variables
}
