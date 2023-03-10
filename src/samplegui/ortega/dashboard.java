package samplegui.ortega;

import java.awt.Color;
import internal.*;
import internal.dashboardpage;
import javax.swing.JOptionPane;

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
        account = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        maindesk = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        account.setBackground(new java.awt.Color(155, 119, 84));
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ACCOUNT");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        account.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 110, 18));

        navbar.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 130, 40));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 130, 420);

        header.setBackground(new java.awt.Color(255, 244, 194));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        header.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 20, 30));

        close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 20, 30));

        jPanel1.add(header);
        header.setBounds(130, 0, 630, 50);

        maindesk.setBackground(new java.awt.Color(229, 211, 179));

        javax.swing.GroupLayout maindeskLayout = new javax.swing.GroupLayout(maindesk);
        maindesk.setLayout(maindeskLayout);
        maindeskLayout.setHorizontalGroup(
            maindeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        maindeskLayout.setVerticalGroup(
            maindeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jPanel1.add(maindesk);
        maindesk.setBounds(130, 50, 630, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
    account.setBackground(bodycolor);
    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
    account.setBackground(navcolor);
    }//GEN-LAST:event_accountMouseExited

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
    settingsPage st = new settingsPage();
    maindesk.add(st).setVisible(true);
    }//GEN-LAST:event_accountMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
    int a = JOptionPane.showConfirmDialog(null, "Confirm Exit?");
    if(a == JOptionPane.YES_OPTION){
        System.exit(0);
    }
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered

    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited

    }//GEN-LAST:event_closeMouseExited

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
    private javax.swing.JPanel account;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashpanel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane maindesk;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel reportpanel;
    private javax.swing.JPanel userpanel;
    // End of variables declaration//GEN-END:variables
}
