/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotekku.util;

import apotekku.model.Obat;
import apotekku.model.ObatKeluar;
import apotekku.model.Penjualan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adhyaksa57
 */
public class DBobatKeluar {
    private Connection conn = null;
    private boolean isConnect = false;

    public DBobatKeluar() {
        connect();
        initDB();
    }    
    
    private void connect() {
        try {
            // db parameters
            String url = Config.DB_URL;
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
            isConnect = true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            isConnect = false;
        }
    }
    
    private void initDB() {
//        try(Statement stmt = conn.createStatement()) {
//            stmt.execute(sql_insert_trigger);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
    
    public List<Obat> getStockObat(){
        List<Obat> dataObat = new ArrayList<Obat>();
        String sql = "SELECT id, kode, nama, min_stock, stock, harga, satuan \n"
                + "FROM obat WHERE hapus = 0 AND stock <= min_stock";

        try (Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
//                System.out.println(rs.getInt("id") +  "\t" + 
//                                   rs.getString("nama") + "\t");
                Obat obat = new Obat();
                obat.setID(rs.getInt("id"));
                obat.setNama(rs.getString("nama"));
                obat.setKode(rs.getString("kode"));
                obat.setMin_stock(rs.getInt("min_stock"));
                obat.setStock(rs.getInt("stock"));
                obat.setHarga(rs.getInt("harga"));
                obat.setSatuan(rs.getString("satuan"));
                dataObat.add(obat);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dataObat;
    }
    
    public List<ObatKeluar> getDataObat(){
        List<ObatKeluar> dataObat = new ArrayList<ObatKeluar>();
        String sql = "SELECT tbl_order.tanggal ,o_detail.id_obat, o_detail.id, o_detail.id_order, o_detail.harga_jual, o_detail.jumlah, o_detail.total, \n" +
"       obat.kode, obat.nama"+
"	FROM tbl_order_detail as o_detail\n" +
"	LEFT JOIN tbl_order ON o_detail.id_order = tbl_order.id\n" +
"	LEFT JOIN obat ON o_detail.id_obat= obat.id";

        try (Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
//                System.out.println(rs.getInt("id") +  "\t" + 
//                                   rs.getString("nama") + "\t");
                ObatKeluar obat = new ObatKeluar();
                obat.setID(rs.getInt("id"));
                obat.setNama(rs.getString("nama"));
                obat.setKode(rs.getString("kode"));
                obat.setTanggal(rs.getString("tanggal"));
//                obat.setMin_stock(rs.getInt("min_stock"));
//                obat.setStock(rs.getInt("stock"));
                obat.setHarga(rs.getInt("harga_jual"));
                obat.setJumlah(rs.getInt("jumlah"));
                obat.setTotal(rs.getInt("total"));
//                obat.setSatuan(rs.getString("satuan"));
                dataObat.add(obat);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dataObat;
    }
}
