/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotekku.util;

import apotekku.model.Obat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adhyaksa57
 */
public class DBcon {
    private Connection conn = null;
    private boolean isConnect = false;

    public DBcon() {
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
    
    private void initDB(){       
        // SQL statement for creating a new table
        String sql_table_user = "CREATE TABLE IF NOT EXISTS user (\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	username text NOT NULL,\n"
                + "	password text NOT NULL,\n"
                + "	level INTEGER NOT NULL DEFAULT 2\n"
                + ");";
        String sql_insert_admin = "INSERT OR IGNORE INTO user(id, username, password,level) \n"
                +"VALUES(1, 'admin', 'apotek456', 1) \n";
        String sql_table_obat = "CREATE TABLE IF NOT EXISTS obat (\n"
                +"id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE,\n"
                +"kode	TEXT UNIQUE,\n"
                +"nama	TEXT,\n"
                +"min_stock	INTEGER,\n"
                +"stock INTEGER DEFAULT 0,\n"
                +"hapus	INTEGER DEFAULT 0,\n"
                +"harga	INTEGER,\n"
                +"satuan TEXT\n"
                +");";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql_table_user);
            stmt.execute(sql_insert_admin);
            stmt.execute(sql_table_obat);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean login(String username, String password){
        boolean result = false;
        String sql = "SELECT id, username, level \n"
            + "FROM user WHERE username = ? AND password = ?";
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
            
            // set the value
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            ResultSet rs  = pstmt.executeQuery();
            
            // loop through the result set
            while (rs.next()) {
                result =  true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }    
    
    public List<Obat> getDataObat(){
        List<Obat> dataObat = new ArrayList<Obat>();
        String sql = "SELECT id, kode, nama, min_stock, stock, harga, satuan \n"
                +"FROM obat WHERE hapus = 0";
        
        try (Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
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
    /***
     * Menghapus data obat
     * @param id
     * @return 
     */
    public Boolean deleteObat(int id){
        String sql = "DELETE FROM obat WHERE id = ?";
        Boolean result = true;
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // set the corresponding param
            pstmt.setInt(1, id);
            // execute the delete statement
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            result = false;
        }
        return result;
    }
    
    public Boolean insertObat(Obat obat){
        String sql = "INSERT INTO obat (nama, kode, min_stock, harga, satuan) \n"
                +"VALUES(?,?,?,?,?)";
        Boolean result = true;
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // set the corresponding param
            pstmt.setString(1, obat.getNama());
            pstmt.setString(2, obat.getKode());
            pstmt.setInt(3, obat.getMin_stock());
            pstmt.setInt(4, obat.getHarga());
            pstmt.setString(5, obat.getSatuan());
            // execute the delete statement
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            result = false;
        }
        return result;
    }
    
    public Boolean getObatByKode(Obat obat){
        String sql = "SELECT id FROM obat WHERE kode = ?";
        Boolean result = true;
        
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)) {
            // set the corresponding param
            pstmt.setString(1, obat.getKode());
            
            ResultSet rs  = pstmt.executeQuery();
            int row = 0;
            while (rs.next()) {
                row++;
            }
            if(row>0){
                result = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            result = false;
        }
        return result;
    }
    
    
}
