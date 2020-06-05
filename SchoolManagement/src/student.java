
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lihel
 */
public class student extends javax.swing.JFrame {

    /**
     * Creates new form student
     */
    public student() {
        initComponents();
        Connect();
        Load_Class();
        Load_Section(); 
        Student_Load();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;
    
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/schoolmanagement","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Load_Class(){
        try {
            pst = con.prepareStatement("select Distinct classname from class");
            rs = pst.executeQuery();
            txtclass.removeAllItems();
            
            while(rs.next()){
                txtclass.addItem(rs.getString("classname"));                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(exam.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void Load_Section(){
        try {
            pst = con.prepareStatement("select Distinct section from class");
            rs = pst.executeQuery();
            txtsection.removeAllItems();
            
            while(rs.next()){
                txtsection.addItem(rs.getString("section"));                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(exam.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtstname = new javax.swing.JTextField();
        txtpname = new javax.swing.JTextField();
        txtdob = new com.toedter.calendar.JDateChooser();
        txtgender = new javax.swing.JComboBox<>();
        txtphone = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtclass = new javax.swing.JComboBox<>();
        txtsection = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1106, 635));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("微软雅黑", 1, 36)); // NOI18N
        jLabel2.setText("Student Registation");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 10, 400, 60);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel3.setText("Student Name");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel4.setText("Parent Name");

        jLabel5.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel5.setText("Date of Birth");

        jLabel6.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel7.setText("Phone");

        jLabel8.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel9.setText("Class");

        jLabel10.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel10.setText("Section");

        txtstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstnameActionPerformed(evt);
            }
        });

        txtgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtclass, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtphone, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtdob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(txtpname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtstname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtsection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 70, 460, 450);

        jButton1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 540, 69, 29);

        jButton2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 540, 69, 29);

        jButton3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(210, 540, 90, 29);

        jButton4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(320, 540, 90, 29);

        jButton5.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(430, 540, 90, 29);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StID", "Stname", "Parentname", "Dob", "Gender", "Phone", "Address", "Class", "Section"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 70, 580, 450);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstnameActionPerformed

    
    public void Student_Load(){
        int c;
       
        try {
            pst = con.prepareStatement("select * from student");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            
            d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
                
                Vector v2 = new Vector();
                for(int i = 1; i <= c; i++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("stname"));
                    v2.add(rs.getString("pname"));
                    v2.add(rs.getString("dob"));
                    v2.add(rs.getString("gender"));
                    v2.add(rs.getString("phone"));
                    v2.add(rs.getString("address"));
                    v2.add(rs.getString("class"));
                    v2.add(rs.getString("section"));
                    

                }
                
                d.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String stname = txtstname.getText();
        String pname = txtpname.getText();
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        String date = df.format(txtdob.getDate());
        
        String gender = txtgender.getSelectedItem().toString();
        String phone = txtphone.getText();
        String address = txtaddress.getText();
        
        String classes = txtclass.getSelectedItem().toString();
        String section = txtsection.getSelectedItem().toString();
        
        
        try {
            pst = con.prepareStatement("insert into student(stname,pname,dob,gender,phone,address,class,section)values(?,?,?,?,?,?,?,?)");
            
            pst.setString(1, stname);
            pst.setString(2, pname);
            pst.setString(3, date);
            pst.setString(4, gender);
            pst.setString(5, phone);
            pst.setString(6, address);
            pst.setString(7, classes);
            pst.setString(8, section);


            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student addedddddddddd!");
            
            Student_Load();

        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            // TODO add your handling code here:
            d = (DefaultTableModel)jTable1.getModel();
            int selectIndex = jTable1.getSelectedRow();
            
            String id = d.getValueAt(selectIndex, 0).toString();
            txtstname.setText(d.getValueAt(selectIndex, 1).toString());
            txtpname.setText(d.getValueAt(selectIndex, 2).toString());
            //txtdate.(d.getValueAt(selectIndex, 3).toString());
            
            Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String)d.getValueAt(selectIndex, 3));
            txtdob.setDate(date);
            
            txtgender.setSelectedItem(d.getValueAt(selectIndex, 4).toString());
            txtphone.setText(d.getValueAt(selectIndex, 5).toString());
            txtaddress.setText(d.getValueAt(selectIndex, 6).toString());
            txtclass.setSelectedItem(d.getValueAt(selectIndex, 7).toString());
            txtsection.setSelectedItem(d.getValueAt(selectIndex, 8).toString());
            
             
            jButton1.setEnabled(false);
        } catch (ParseException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        d = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        String id = d.getValueAt(selectIndex, 0).toString();
        
        String stname = txtstname.getText();
        String pname = txtpname.getText();
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        String date = df.format(txtdob.getDate());
        
        String gender = txtgender.getSelectedItem().toString();
        String phone = txtphone.getText();
        String address = txtaddress.getText();
        
        String classes = txtclass.getSelectedItem().toString();
        String section = txtsection.getSelectedItem().toString();
        
        
        try {
            pst = con.prepareStatement("update student set stname = ?, pname = ?, dob = ?, gender = ?, phone = ?, address = ?, class = ?, section = ? where id = ?");
            
            pst.setString(1, stname);
            pst.setString(2, pname);
            pst.setString(3, date);
            pst.setString(4, gender);
            pst.setString(5, phone);
            pst.setString(6, address);
            pst.setString(7, classes);
            pst.setString(8, section);
            pst.setString(9, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student editedddddddddd!");
            Student_Load();

        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:
            d = (DefaultTableModel)jTable1.getModel();
            int selectIndex = jTable1.getSelectedRow();
            String id = d.getValueAt(selectIndex, 0).toString();                  
            pst = con.prepareStatement("delete from student where id = ?");
            pst.setString(1, id);            
            pst.executeUpdate();
            
            
            JOptionPane.showMessageDialog(this, "Student deletedddddddddd!");
            jButton1.setEnabled(true);
            
            txtstname.setText("");
            txtpname.setText("");
            txtgender.setSelectedIndex(-1);
            txtclass.setSelectedIndex(-1);
            txtphone.setText("");
            txtaddress.setText("");
            txtsection.setSelectedIndex(-1);
            Student_Load();
            jButton1.setEnabled(true);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txtstname.setText("");
        txtpname.setText("");
        txtgender.setSelectedIndex(-1);
        txtclass.setSelectedIndex(-1);
        txtphone.setText("");
        txtaddress.setText("");
        txtsection.setSelectedIndex(-1);
        Student_Load();
        jButton1.setEnabled(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JComboBox<String> txtclass;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JComboBox<String> txtgender;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtpname;
    private javax.swing.JComboBox<String> txtsection;
    private javax.swing.JTextField txtstname;
    // End of variables declaration//GEN-END:variables
}
