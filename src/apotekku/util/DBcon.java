/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotekku.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql_table_user);
            stmt.execute(sql_insert_admin);
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
}
