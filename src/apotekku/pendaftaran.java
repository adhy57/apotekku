/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apotekku;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author user
 */
public class pendaftaran extends javax.swing.JFrame {
java.util.Date tglsekarang = new java.util.Date();
    private SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    //diatas adalah pengaturan format penulisan, bisa diubah sesuai keinginan.
    private String tanggal = smpdtfmt.format(tglsekarang);
    /**
     * Creates new form pendaftaran
     */
    public pendaftaran() {
        initComponents();
        setLocationRelativeTo(this);
        aktif(false);
        setJam();
        tgl.setText(tanggal);
    }
public final void setJam(){
ActionListener taskPerformer = new ActionListener() {

            @Override
public void actionPerformed(ActionEvent evt) {
String nol_jam = "", nol_menit = "",nol_detik = "";

java.util.Date dateTime = new java.util.Date();
int nilai_jam = dateTime.getHours();
int nilai_menit = dateTime.getMinutes();
int nilai_detik = dateTime.getSeconds();

if(nilai_jam <= 9) nol_jam= "0";
if(nilai_menit <= 9) nol_menit= "0";
if(nilai_detik <= 9) nol_detik= "0";

String jam = nol_jam + Integer.toString(nilai_jam);
String menit = nol_menit + Integer.toString(nilai_menit);
String detik = nol_detik + Integer.toString(nilai_detik);

lblwktu.setText(jam+":"+menit+":"+detik+"");
}
};
new Timer(1000, taskPerformer).start();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        txtrekmed = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtala = new javax.swing.JTextField();
        txttlp = new javax.swing.JTextField();
        btcari = new javax.swing.JButton();
        cmbpem = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btsimpan = new javax.swing.JButton();
        btbaru = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblwktu = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Pendaftaran");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PENDAFTARAN");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(120, 10, 170, 26);

        jLabel2.setText("No. Daftar");

        jLabel3.setText("No Rekam Medik");

        jLabel4.setText("Nama Pasien");

        jLabel5.setText("Alamat");

        jLabel6.setText("No. Telepon");

        jLabel7.setText("Pemeriksaan");

        txtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoActionPerformed(evt);
            }
        });
        txtno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnoKeyReleased(evt);
            }
        });

        btcari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btcari.setText("Cari");
        btcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcariActionPerformed(evt);
            }
        });

        cmbpem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "== :::: PILIH TINDAKAN ::::==", "KB", "IMUNISASI", "PERIKSA KEHAMILAN", "PERSALINAN ", "PEMERIKSAAN ANAK" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnama)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtrekmed, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btcari, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                    .addComponent(txtala)
                    .addComponent(txttlp)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbpem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtrekmed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbpem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btsimpan.setText("Daftar");
        btsimpan.setToolTipText("Daftar Periksa");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btbaru.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btbaru.setText("Pasien Baru");
        btbaru.setToolTipText("Buat Pasien Baru");
        btbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbaruActionPerformed(evt);
            }
        });

        bthapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bthapus.setText("Batal Daftar");
        bthapus.setToolTipText("Batal Pendaftaran");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Keluar");
        jButton5.setToolTipText("Keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bthapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bthapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Tanggal :");

        tgl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tgl.setText("Tanggal");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("Jam :");

        lblwktu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblwktu.setText("Jam");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgl)
                .addGap(75, 75, 75)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblwktu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tgl)
                    .addComponent(jLabel10)
                    .addComponent(lblwktu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcariActionPerformed
        // TODO add your handling code here:
        String no_rm = txtrekmed.getText();
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection(
"jdbc:mysql://localhost:3306/rumahbersalin", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="SELECT * FROM pasien WHERE no_rm like '"+no_rm+"'";
 ResultSet rs = statement.executeQuery(sql);
if (rs.next())
{
txtnama.setText(rs.getString(2));
txtala.setText(rs.getString(7));
txttlp.setText(rs.getString(8));
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

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        // TODO add your handling code here:
        String no_daftar = txtno.getText();
String tanggal = tgl.getText();
String jam = lblwktu.getText();
String no_rm = txtrekmed.getText();
String nama = txtnama.getText();
String periksa = (String) cmbpem.getSelectedItem();
{
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection(
"jdbc:mysql://localhost:3306/rumahbersalin", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="insert into daftar values('"+no_daftar+"','"+tanggal+"','"+jam+"','"+no_rm+"','"+nama+"','"+periksa+"')";
int executeUpdate = statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "Anda Telah Terdaftar..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
txtno.setText("");
txtrekmed.setText("");
txtnama.setText("");
txtala.setText("");
txttlp.setText("");
cmbpem.setSelectedItem("");
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

    private void btbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbaruActionPerformed
new pasien().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btbaruActionPerformed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        // TODO add your handling code here:
txtno.setText("");
txtrekmed.setText("");
txtnama.setText("");
txtala.setText("");
txttlp.setText("");
cmbpem.setSelectedItem("");
    }//GEN-LAST:event_bthapusActionPerformed

    private void txtnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoKeyReleased
        // TODO add your handling code here:

   }//GEN-LAST:event_txtnoKeyReleased

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumahbersalin", "root", "");
            Statement statement = (Statement) koneksi.createStatement();
            String sql = "SELECT * FROM daftar order by no_daftar";
            ResultSet rs = statement.executeQuery(sql);
            if (rs.first() == false) {
                txtno.setText("000001");
            } else {
                rs.last();
                int no = rs.getInt(1) + 1;
                String cno=String.valueOf(no);
                int pjg_cno=cno.length();
                for (int i=0;i<3-pjg_cno;i++)
                {
                cno="0"+cno;
                }
                txtno.setText("000"+cno);

            }
            statement.close();
            koneksi.close();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Eror:" + e, "Gagal", JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
        }
    }//GEN-LAST:event_txtnoActionPerformed

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
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new pendaftaran().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbaru;
    private javax.swing.JButton btcari;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btsimpan;
    private javax.swing.JComboBox cmbpem;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblwktu;
    private javax.swing.JLabel tgl;
    private javax.swing.JTextField txtala;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtrekmed;
    private javax.swing.JTextField txttlp;
    // End of variables declaration//GEN-END:variables

    private void aktif(boolean x) {
      txtnama.setEditable(x);
      txtala.setEditable(x);
      txttlp.setEditable(x);
      txtno.requestFocus();
    }

   
}