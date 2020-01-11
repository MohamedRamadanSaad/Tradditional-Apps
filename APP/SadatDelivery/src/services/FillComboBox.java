/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author MR
 */
public class FillComboBox {
     Statement st; 
    
    public int Count(String column , String Table ,String where) throws SQLException, Exception{
      st= DB.getConnection().createStatement();
        int output=0;
       String inWhere =where ;
       if(where.equals("")){
           inWhere = "";
       }else if (where != ""){
           inWhere = " where  "+where;
       }
       st =  DB.getConnection().createStatement();
       String sql = "select Count("+column+") cn from "+Table+" "+inWhere+"";
       ResultSet rs = st.executeQuery(sql);
       while(rs.next()){
           output = rs.getInt("cn");
       }
       rs.close();
       st.close();
       return output;
   }
    public void fillCB(JComboBox CB ,String column, String Table) throws SQLException, Exception{
        Statement st= DB.getConnection().createStatement();
        String sql = "select "+column+" from "+Table+" ";
        
        int i = 0;
        // know wich table i will get from it 
        
        Object [] output= new Object[this.Count(column, Table,"")];
        ResultSet rs= st.executeQuery(sql);
        while(rs.next()){
            try {
                output[i]= rs.getString(column); 
            }catch(Exception e){
                 output[i]= rs.getInt(column); 
            }
            i++;
        }
         CB.removeAllItems();
         CB.setModel(new DefaultComboBoxModel(output));
        
    }
   public void fillCBWithNothingChoise(JComboBox CB ,String column, String Table) throws SQLException, Exception{
        Statement st= DB.getConnection().createStatement();
        String sql = "select "+column+" from "+Table+" ";
        
        int i = 0;
        // know wich table i will get from it 
        
        Object [] output= new Object[this.Count(column, Table,"")+1];
        ResultSet rs= st.executeQuery(sql);
        output[i] = "--";
        i++;
        while(rs.next()){
            try {
                output[i]= rs.getString(column); 
            }catch(Exception e){
                 output[i]= rs.getInt(column); 
            }
            i++;
        }
         CB.removeAllItems();
         CB.setModel(new DefaultComboBoxModel(output));
        
    }
    public void fillCBWhere(JComboBox CB ,String column, String Table,String where) throws SQLException, Exception{
        Statement st= DB.getConnection().createStatement();
        String wherein = where.equalsIgnoreCase("")?"":"where "+where;
        String sql = "select "+column+" from "+Table+" "+wherein;
        
        int i = 0;
        // know wich table i will get from it 
        
        Object [] output= new Object[this.Count(column, Table,where)];
        ResultSet rs= st.executeQuery(sql);
        while(rs.next()){
            try {
                output[i]= rs.getString(column); 
            }catch(Exception e){
                 output[i]= rs.getInt(column); 
            }
            i++;
        }
        CB.removeAllItems();
         CB.setModel(new DefaultComboBoxModel(output));
        
    }
}
