/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.DB;
import services.INF;
import view.MainApplication;

/**
 *
 * @author dirac
 */
public class CN_Login {
   public static int user_id;
   public static String username;
    public boolean login(String userName , String password) throws Exception{
        Connection con =  DB.getConnection();
        String sql = "select a_user_id,username from a_user where username = '"+userName+"' and  password ='"+password+"'" ;
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            user_id = rs.getInt("a_user_ID");
            username=rs.getString("username");
            return true;
        }else {
            return false;
        }
    }
   
}
