
package internal;

import configuration.dbconnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;
import samplegui.ortega.sform;
import samplegui.ortega.studentForm;

public class userPage extends javax.swing.JInternalFrame {


    public userPage() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        search.setOpaque(false);
        search.setBackground(new Color(255,244,194));
    }
    
    public void displayData(){
        
        
        try{
            
        dbconnector dbc = new dbconnector();
        ResultSet rs = dbc.getData("SELECT *FROM tbl_students");
        student_table.setModel(DbUtils.resultSetToTableModel(rs));
                
        }catch(SQLException ex){
            System.out.println("Error Message: " +ex);
            
        }
        
        
    }

    Color navcolor = new Color(155, 119, 84);
    Color headcolor = new Color(255, 244, 194);
    Color bodycolor = new Color(229, 211, 179);
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        delete = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        search1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        s_name = new javax.swing.JTextField();
        s_dept = new javax.swing.JTextField();
        s_address = new javax.swing.JTextField();
        s_contact = new javax.swing.JTextField();
        s_status = new javax.swing.JTextField();
        display = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(656, 428));

        jPanel1.setBackground(new java.awt.Color(255, 244, 194));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(student_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 420, 260));

        jPanel2.setBackground(new java.awt.Color(155, 119, 84));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 170, 50));

        delete.setBackground(new java.awt.Color(155, 119, 84));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DELETE");
        delete.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 70, 30));

        edit.setBackground(new java.awt.Color(155, 119, 84));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EDIT");
        edit.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 70, 30));

        header.setBackground(new java.awt.Color(229, 211, 179));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MEMBERS");
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search.setOpaque(false);
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 150, 30));

        search1.setBackground(new java.awt.Color(155, 119, 84));
        search1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search1MouseExited(evt);
            }
        });
        search1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SEARCH");
        search1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 70, 30));

        add.setBackground(new java.awt.Color(155, 119, 84));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD");
        add.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 5, 60, 20));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 30));
        jPanel1.add(s_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 30));
        jPanel1.add(s_dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, 30));
        jPanel1.add(s_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 30));
        jPanel1.add(s_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, 30));
        jPanel1.add(s_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 30));

        display.setText("Display");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
    delete.setBackground(headcolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
    delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
    edit.setBackground(headcolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
    edit.setBackground(navcolor);
    }//GEN-LAST:event_editMouseExited

    private void search1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseEntered
    search1.setBackground(headcolor);
    }//GEN-LAST:event_search1MouseEntered

    private void search1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseExited
    search1.setBackground(navcolor);
    }//GEN-LAST:event_search1MouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
    add.setBackground(headcolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
    add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
    sform sf = new sform();
    sf.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_addMouseClicked

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
    
        displayData();
        
    }//GEN-LAST:event_displayActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
    dbconnector dbc = new dbconnector();

        dbc.insertData("INSERT INTO tbl_students (s_name, s_dept, s_address, s_contact, s_status) "

                + "VALUES ('"+s_name.getText()+"', '"+s_dept.getText()+"','"+s_address.getText()+"','"+s_contact.getText()+"','"+s_status.getText()+"')");

        displayData();
    }//GEN-LAST:event_saveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JPanel delete;
    private javax.swing.JButton display;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField s_address;
    private javax.swing.JTextField s_contact;
    private javax.swing.JTextField s_dept;
    private javax.swing.JTextField s_name;
    private javax.swing.JTextField s_status;
    private javax.swing.JButton save;
    private javax.swing.JTextField search;
    private javax.swing.JPanel search1;
    private javax.swing.JTable student_table;
    // End of variables declaration//GEN-END:variables
}
