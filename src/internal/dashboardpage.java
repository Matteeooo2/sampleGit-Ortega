package internal;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class dashboardpage extends javax.swing.JInternalFrame {

    
    public dashboardpage() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
    }
    Color navcolor = new Color(155, 119, 84);
    Color headcolor = new Color(255, 244, 194);
    Color bodycolor = new Color(229, 211, 179);
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        settings = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        users = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        books = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(760, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(229, 211, 179));
        jPanel4.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(155, 119, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel1);
        jPanel1.setBounds(450, 0, 120, 120);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("LIBRARY BOOK TRACKER");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 10, 300, 30);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 120));

        jPanel5.setBackground(new java.awt.Color(255, 244, 194));
        jPanel5.setLayout(null);

        settings.setBackground(new java.awt.Color(155, 119, 84));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internal/icons8-gear-64.png"))); // NOI18N
        settings.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 70));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SETTINGS");
        settings.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 20));

        jPanel5.add(settings);
        settings.setBounds(450, 50, 130, 120);

        users.setBackground(new java.awt.Color(155, 119, 84));
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internal/icons8-select-users-64.png"))); // NOI18N
        users.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE USERS");
        users.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 20));

        jPanel5.add(users);
        users.setBounds(30, 50, 130, 120);

        books.setBackground(new java.awt.Color(155, 119, 84));
        books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booksMouseExited(evt);
            }
        });
        books.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internal/icons8-books-64.png"))); // NOI18N
        books.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 70));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BOOKS");
        books.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 20));

        jPanel5.add(books);
        books.setBounds(170, 50, 130, 120);

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
        reports.setBounds(310, 50, 130, 120);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 600, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
    users.setBackground(bodycolor);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
    users.setBackground(navcolor);
    }//GEN-LAST:event_usersMouseExited

    private void booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseEntered
    books.setBackground(bodycolor);
    }//GEN-LAST:event_booksMouseEntered

    private void booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseExited
    books.setBackground(navcolor);
    }//GEN-LAST:event_booksMouseExited

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
    reports.setBackground(bodycolor);
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
    reports.setBackground(navcolor);
    }//GEN-LAST:event_reportsMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
    settings.setBackground(bodycolor);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
    settings.setBackground(navcolor);
    }//GEN-LAST:event_settingsMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel books;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel reports;
    private javax.swing.JPanel settings;
    private javax.swing.JPanel users;
    // End of variables declaration//GEN-END:variables
}
