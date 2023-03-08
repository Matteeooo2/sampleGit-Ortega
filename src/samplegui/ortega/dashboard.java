package samplegui.ortega;

import java.awt.Color;
import internal.*;
import internal.dashboardpage;

public class dashboard extends javax.swing.JFrame {


    public dashboard() {
        initComponents();
    }
    
    Color navcolor = new Color(155, 119, 84);
    Color headcolor = new Color(255, 244, 194);
    Color bodycolor = new Color(229, 211, 179);


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        userpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dashpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        reportpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        settings = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        maindesk = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(229, 211, 179));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(155, 119, 84));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userpanel.setBackground(new java.awt.Color(155, 119, 84));
        userpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpanelMouseExited(evt);
            }
        });
        userpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER PAGE");
        userpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 110, 18));

        navbar.add(userpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 130, 40));

        dashpanel.setBackground(new java.awt.Color(155, 119, 84));
        dashpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpanelMouseExited(evt);
            }
        });
        dashpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        dashpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 110, 18));

        navbar.add(dashpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 130, 40));

        reportpanel.setBackground(new java.awt.Color(155, 119, 84));
        reportpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportpanelMouseExited(evt);
            }
        });
        reportpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REPORTS");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        reportpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 110, 18));

        navbar.add(reportpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 130, 40));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 130, 380);

        header.setBackground(new java.awt.Color(255, 244, 194));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settings.setBackground(new java.awt.Color(255, 244, 194));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samplegui/ortega/icons8-engineering-32.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        settings.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        header.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 50, 40));

        jPanel1.add(header);
        header.setBounds(130, 0, 590, 30);

        maindesk.setBackground(new java.awt.Color(229, 211, 179));
        maindesk.setPreferredSize(new java.awt.Dimension(760, 420));

        javax.swing.GroupLayout maindeskLayout = new javax.swing.GroupLayout(maindesk);
        maindesk.setLayout(maindeskLayout);
        maindeskLayout.setHorizontalGroup(
            maindeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        maindeskLayout.setVerticalGroup(
            maindeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel1.add(maindesk);
        maindesk.setBounds(130, 30, 590, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanelMouseEntered
    dashpanel.setBackground(bodycolor);
    }//GEN-LAST:event_dashpanelMouseEntered

    private void dashpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanelMouseExited
    dashpanel.setBackground(navcolor);
    }//GEN-LAST:event_dashpanelMouseExited

    private void userpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpanelMouseEntered
    userpanel.setBackground(bodycolor);
    }//GEN-LAST:event_userpanelMouseEntered

    private void userpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpanelMouseExited
    userpanel.setBackground(navcolor);
    }//GEN-LAST:event_userpanelMouseExited

    private void reportpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpanelMouseEntered
    reportpanel.setBackground(bodycolor);
    }//GEN-LAST:event_reportpanelMouseEntered

    private void reportpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpanelMouseExited
    reportpanel.setBackground(navcolor);
    }//GEN-LAST:event_reportpanelMouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void userpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpanelMouseClicked
    userPage up = new userPage();
    maindesk.add(up).setVisible(true);
    
    }//GEN-LAST:event_userpanelMouseClicked

    private void dashpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanelMouseClicked
    dashboardpage dbp = new dashboardpage();
    maindesk.add(dbp).setVisible(true);
    
    }//GEN-LAST:event_dashpanelMouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
    
    }//GEN-LAST:event_jLabel4MouseEntered

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
    
    }//GEN-LAST:event_settingsMouseClicked

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
    settings.setBackground(bodycolor);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
    settings.setBackground(headcolor);
    }//GEN-LAST:event_settingsMouseExited

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashpanel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane maindesk;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel reportpanel;
    private javax.swing.JPanel settings;
    private javax.swing.JPanel userpanel;
    // End of variables declaration//GEN-END:variables
}
