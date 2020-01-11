/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MR
 */
public class INF {
    
    public static int getNewID(String tableName) throws SQLException, Exception{
        String IDName= tableName+"_ID";
        String sql = "Select nvl(max("+IDName+"),0) ID from "+tableName;
        int id;
        PreparedStatement ps =DB.getConnection().prepareStatement(sql);
        ResultSet rs= ps.executeQuery();
      
        if(rs.next())
        id= rs.getInt("ID")+1;
        else 
        id=1;
        
        return id;
    }
    public static int getIDFor(String Table,String  columnValue ) throws SQLException, Exception{
        String columnName = ""+Table+"_ID";
        String sql = "select "+Table+"_ID from dl."+Table+" where name = '"+columnValue+"'";
        Statement st = DB.getConnection().createStatement();
        int id = 0;
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            id = rs.getInt(columnName);
        }
        return id ;
    }
}
