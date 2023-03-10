package internal;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import configuration.connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class userPage extends javax.swing.JInternalFrame {
 

    public userPage() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
     
        try {
                connection dbc = new connection();
                Connection conn = dbc.getConnection();
                Statement stmt = (Statement) conn.createStatement();
                String qry = "SELECT * FROM tbl_books";
                ResultSet rs = stmt.executeQuery(qry);
                while (rs.next()){
                    String col1 = rs.getString("b_id");
                    String col2 = rs.getString("b_name");                    
                    String col3 = rs.getString("b_status");
                    String col4 = rs.getString("b_author");
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.addRow(new Object[]{col1, col2, col3, col4});
                }
                    rs.close();
                    stmt.close();
                    conn.close();
                }catch (SQLException ex){
                    System.out.println("Error: " + ex.getMessage());
                }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(760, 240));

        jPanel1.setBackground(new java.awt.Color(229, 211, 179));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THIS IS USER PAGE!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 280, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][][] {
            },
            new String [] {
                "Book ID", "Name", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 710, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
