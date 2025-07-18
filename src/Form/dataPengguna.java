/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Koneksi.koneksi;
import helper.PasswordUtil;
import java.awt.Color;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NANRC
 */
public class dataPengguna extends javax.swing.JPanel {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form dataBarang1
     */
    public dataPengguna() {
        initComponents();
        kosong();
        aktif();
        datatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panel_custom11 = new Form.Panel_custom1();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JTextField();
        btn_simpan = new Form.customButton();
        btn_ubah = new Form.customButton();
        btn_hapus = new Form.customButton();
        btn_batal = new Form.customButton();
        btn_cari = new Form.customButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        t_cari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        panel_custom11.setBackground(new java.awt.Color(0, 102, 102));
        panel_custom11.setForeground(new java.awt.Color(204, 204, 255));
        panel_custom11.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        panel_custom11.setText("Data Pengguna");

        javax.swing.GroupLayout panel_custom11Layout = new javax.swing.GroupLayout(panel_custom11);
        panel_custom11.setLayout(panel_custom11Layout);
        panel_custom11Layout.setHorizontalGroup(
            panel_custom11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_custom11Layout.setVerticalGroup(
            panel_custom11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("Username");

        jLabel3.setText("Password");

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Save.png"))); // NOI18N
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Edit.png"))); // NOI18N
        btn_ubah.setText("UBAH");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Trash.png"))); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Cancel1.png"))); // NOI18N
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Search.png"))); // NOI18N
        btn_cari.setText("CARI");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUser);

        t_cari.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        t_cari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_cariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_cariFocusLost(evt);
            }
        });
        t_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cariActionPerformed(evt);
            }
        });
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_cariKeyPressed(evt);
            }
        });

        jLabel6.setText("Id User");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_custom11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(21, 21, 21))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(txt_id)
                            .addComponent(txt_user))
                        .addGap(451, 451, 451)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(btn_ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel_custom11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
        );

        add(jPanel2, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void t_cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            datatable();
        }
    }//GEN-LAST:event_t_cariKeyPressed

    private void t_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cariActionPerformed
        datatable();
    }//GEN-LAST:event_t_cariActionPerformed

    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        int bar = tblUser.getSelectedRow();
        String a = tblUser.getValueAt(bar,0).toString();
        String b = tblUser.getValueAt(bar,1).toString();
        String c = tblUser.getValueAt(bar,2).toString();
       
        txt_id.setText(a);
        txt_user.setText(b);
        txt_pass.setText(c);      
    }//GEN-LAST:event_tblUserMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null,"hapus","konfirmasi dialog",JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql = "delete from user where Id_user ='"+txt_id.getText()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"data berhasil dihapus");
                kosong();
                txt_id.requestFocus();
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null,"data gagal dihapus"+e);
            }
            datatable();
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        try {
        String sql = "UPDATE user SET username=?, password=? WHERE id_user=?";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, txt_user.getText().trim());
        stat.setString(2, PasswordUtil.hashPassword(txt_pass.getText().trim()));
        stat.setString(3, txt_id.getText().trim());

        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil diubah");

        kosong();
        datatable();
        txt_id.requestFocus();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Data gagal diubah: " + e.getMessage());
    }           
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
    String sql = "INSERT INTO user (username, password) VALUES (?, ?)";

    try {
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, txt_user.getText().trim());
        stat.setString(2, PasswordUtil.hashPassword(txt_pass.getText().trim()));

        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");

        kosong();
        datatable();
        txt_user.requestFocus();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Data gagal disimpan: " + e.getMessage());
    }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
    String keyword = t_cari.getText().trim(); // Pastikan ada JTextField txt_cari

    // Kolom header JTable
    Object[] kolom = {"ID", "Username", "Password"};
    tabmode = new DefaultTableModel(null, kolom);
    tblUser.setModel(tabmode);

    // Query cari username
    String sql = "SELECT * FROM user WHERE id_user LIKE ? OR username LIKE ?";

    try {
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, "%" + keyword + "%");
        pst.setString(2, "%" + keyword + "%");

        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            String[] data = {
                rs.getString("id_user"),
                rs.getString("username"),
                rs.getString("password")
            };
            tabmode.addRow(data);
        }

        rs.close();
        pst.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Pencarian gagal: " + e.getMessage());
    }
    }//GEN-LAST:event_btn_cariActionPerformed

    private void t_cariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_cariFocusGained
        
    }//GEN-LAST:event_t_cariFocusGained

    private void t_cariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_cariFocusLost
       
    }//GEN-LAST:event_t_cariFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Form.customButton btn_batal;
    private Form.customButton btn_cari;
    private Form.customButton btn_hapus;
    private Form.customButton btn_simpan;
    private Form.customButton btn_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Form.Panel_custom1 panel_custom11;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    private void kosong() {
        txt_id.setEnabled(false);
        txt_id.setText("");
        txt_user.setText("");
        txt_pass.setText("");
    }

    private void aktif() {
        txt_id.requestFocus();
    }

    private void datatable() {
    Object[] Baris = {"Id User", "Username", "Password"};
    tabmode = new DefaultTableModel(null, Baris);
    tblUser.setModel(tabmode); // pindahkan di awal agar tidak terlambat menampilkan
    
    String cariitem = t_cari.getText().trim(); // hilangkan spasi kosong

    try {
        String sql = "SELECT * FROM user WHERE Id_User LIKE ? OR username LIKE ? ORDER BY Id_User ASC";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, "%" + cariitem + "%");
        stat.setString(2, "%" + cariitem + "%");
        
        ResultSet hasil = stat.executeQuery();
        while (hasil.next()) {
            tabmode.addRow(new Object[]{
                hasil.getString("Id_User"),
                hasil.getString("Username"),
                hasil.getString("Password"),
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Data gagal dipanggil: " + e.getMessage());
    }
}
}