/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MR
 */
public class DB {

    private static Connection conn;
    private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static String USERNAME = "dl";
    private static String PASSWORD = "bc4j";
   
    private DB() {
    }

    public static Connection getConnection() throws Exception {
        if (conn == null) {
            try {
                 Class.forName("oracle.jdbc.OracleDriver").newInstance(); //"com.oracle.jdbc.Driver"
                conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "There is no Databade Found please Contact Administrator ..");
            }        
        }else {
               return conn;
               }

        return conn;
    }

    public void Close(PreparedStatement st , ResultSet rs) throws SQLException{
        if (st!=null){
            st.close();
        }
        if(rs !=null){
            rs.close();
        }
    }
}

