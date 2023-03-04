
package internal;

import java.awt.Color;


public class settingsPage extends javax.swing.JInternalFrame {


    public settingsPage() {
        initComponents();
    }

    Color navcolor = new Color(155, 119, 84);
    Color headcolor = new Color(255, 244, 194);
    Color bodycolor = new Color(229, 211, 179);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        logout = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(760, 240));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(229, 211, 179));
        jPanel4.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(155, 119, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("USER NAME");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 90, 310, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internal/icons8-user-64.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 80));

        jPanel4.add(jPanel1);
        jPanel1.setBounds(440, 0, 130, 140);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ACCOUNT SETTINGS");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 0, 300, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("ACCOUNT NAME:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 40, 300, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("POSITION:");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 60, 300, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("EMAIL:");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(10, 80, 300, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("ADDRESS:");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(10, 110, 300, 20);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 140));

        jPanel5.setBackground(new java.awt.Color(255, 244, 194));
        jPanel5.setLayout(null);

        logout.setBackground(new java.awt.Color(155, 119, 84));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internal/icons8-logout-rounded-64.png"))); // NOI18N
        logout.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 70));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LOGOUT");
        logout.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 20));

        jPanel5.add(logout);
        logout.setBounds(400, 60, 130, 120);

        profile.setBackground(new java.awt.Color(155, 119, 84));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });
        profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EDIT PROFILE");
        profile.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internal/icons8-writer-male-64.png"))); // NOI18N
        profile.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 80));

        jPanel5.add(profile);
        profile.setBounds(80, 60, 130, 120);

        reports.setBackground(new java.awt.Color(155, 119, 84));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });
        reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internal/icons8-reports-58.png"))); // NOI18N
        reports.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 70));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("WEEKLY REPORTS");
        reports.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 20));

        jPanel5.add(reports);
        reports.setBounds(240, 60, 130, 120);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 600, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
    logout.setBackground(bodycolor);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
    logout.setBackground(navcolor);
    }//GEN-LAST:event_logoutMouseExited

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
    profile.setBackground(bodycolor);
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
    profile.setBackground(navcolor);
    }//GEN-LAST:event_profileMouseExited

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
    reports.setBackground(bodycolor);
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
    reports.setBackground(navcolor);
    }//GEN-LAST:event_reportsMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel profile;
    private javax.swing.JPanel reports;
    // End of variables declaration//GEN-END:variables
}
