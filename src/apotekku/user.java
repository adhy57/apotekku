/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apotekku;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class user extends javax.swing.JFrame {

    /**
     * Creates new form user
     */
    public user() {
        initComponents();
        setLocationRelativeTo(this);
        aktif(false);
        setTombol(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtno = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        btcari = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btbaru = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        btubah = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Admin");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA USER");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(100, 0, 139, 32);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel2.setText("Id");

        jLabel3.setText("Nama");

        jLabel4.setText("User ID");

        jLabel5.setText("Password");

        btcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotekku/images/Find.png"))); // NOI18N
        btcari.setToolTipText("Cari user");
        btcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btcari))
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btcari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btbaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotekku/images/Create.png"))); // NOI18N
        btbaru.setToolTipText("Buat user baru");
        btbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbaruActionPerformed(evt);
            }
        });

        btbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotekku/images/Refresh.png"))); // NOI18N
        btbatal.setToolTipText("Batal");
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });

        btubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotekku/images/Modify.png"))); // NOI18N
        btubah.setToolTipText("Edit / Update data user");
        btubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btubahActionPerformed(evt);
            }
        });

        btsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotekku/images/document_save.png"))); // NOI18N
        btsimpan.setToolTipText("Simpan");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotekku/images/Forward.png"))); // NOI18N
        btkeluar.setToolTipText("Keluar");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btubah, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btbaru, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btkeluarActionPerformed

    private void btcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcariActionPerformed
        // TODO add your handling code here:
        String id = txtno.getText();
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection(
"jdbc:mysql://localhost:3306/rumahbersalin", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="SELECT * FROM admin WHERE id like '"+id+"'";
 ResultSet rs = statement.executeQuery(sql);
if (rs.next())
{
aktif(true);
setTombol(false);
txtnama.setText(rs.getString(2));
txtuser.setText(rs.getString(3));
txtpass.setText(rs.getString(4));
JOptionPane.showMessageDialog(null, "Data ditemukan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
}
else
{
JOptionPane.showMessageDialog(null, "Data tidak ditemukan ","Insert Data",JOptionPane.INFORMATION_MESSAGE);
}
statement.close();
koneksi.close();
}
catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
{
JOptionPane.showMessageDialog(null, "Eror:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
} 
    }//GEN-LAST:event_btcariActionPerformed

    private void btbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbaruActionPerformed
aktif(true);
setTombol(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btbaruActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        // TODO add your handling code here:
        String id = txtno.getText();
String nama = txtnama.getText();
String user_id = txtuser.getText();
String password = txtpass.getText();
{
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection(
"jdbc:mysql://localhost:3306/rumahbersalin", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="insert into admin values('"+id+"','"+nama+"','"+user_id+"','"+password+"')";
int executeUpdate = statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "Data berhasil disimpan..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
aktif(true);
txtno.setText("");
txtnama.setText("");
txtuser.setText("");
txtpass.setText("");
//txtnpm.setFocusable(rootPaneCheckingEnabled);
koneksi.close();
}
catch (     ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
{
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}
    }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void btubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btubahActionPerformed
        // TODO add your handling code here:
        String id = txtno.getText();
String nama = txtnama.getText();
String user_id = txtuser.getText();
String password = txtpass.getText();
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection(
"jdbc:mysql://localhost:3306/rumahbersalin", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="UPDATE admin SET NAMA='"+nama+"',USER_ID='"+user_id+"',PASSWORD='"+password+"' WHERE id LIKE '"+id+"'";
statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "Data berhasil diedit..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
koneksi.close();
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) {
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}
    }//GEN-LAST:event_btubahActionPerformed

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
        // TODO add your handling code here:
txtno.setText("");
txtnama.setText("");
txtuser.setText("");
txtpass.setText("");
    }//GEN-LAST:event_btbatalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new user().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbaru;
    private javax.swing.JButton btbatal;
    private javax.swing.JButton btcari;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton btubah;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

    private void aktif(boolean x) {
      txtnama.setEditable(x);
      txtuser.setEditable(x);
      txtpass.setEditable(x);
      txtno.requestFocus();
    }

    private void setTombol(boolean t) {
     btbaru.setEnabled(t);
     btsimpan.setEnabled(!t);
     btubah.setEnabled(!t);
     btbatal.setEnabled(!t);
    }
}
