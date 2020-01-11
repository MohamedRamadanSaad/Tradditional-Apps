/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import services.DB;
import services.INF;
import services.Table;

/**
 *
 * @author dirac
 */
public class CN_Customer {
    Statement st;
   
    public boolean save(Map<String , Object> map) throws Exception{
        int id = INF.getNewID(Table.CUSTOMER);
        String name = map.get("name").toString();
        String phone = map.get("phone").toString();
        String mail = map.get("mail").toString();
        String address = map.get("address").toString();
        String region = map.get("region").toString();
        String phone2 = map.get("phone2").toString();
        String sql = "insert into dl.customer values ("+id+" , '"+name+"','"+phone+"','"+mail+"'"
                + ", '"+address+"','"+region+"',sysdate,"+CN_Login.user_id+", '"+phone2+"')";
        st = DB.getConnection().createStatement();
        boolean save ; 
        try{ 
            st.execute(sql);
            save = true;
        }catch(SQLException e  ){
            JOptionPane.showMessageDialog(null, "Phone is saved before");
            save = false;
            
        }
        st.close();
        if(save){
            return true;
        }else {
            return false;
        }
    }
    
    public Map search(String phone) throws Exception{
        Map map = new HashMap();
        String sql = "select * from customer where phone = '"+phone+"'";
        st = DB.getConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
        map.put("name", rs.getString("name"));
        map.put("phone", rs.getString("phone"));
        map.put("mail", rs.getString("mail")+"");
        map.put("address", rs.getString("address")+"");
        map.put("region", rs.getString("region")+"");
        }
        return map;
       // String sql 
    }
    
    public int getCustomerID(String phone) throws Exception{
        String sql = "select customer_ID from dl.customer where phone = '"+phone+"'";
        int id=0 ;
        st = DB.getConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
        id = rs.getInt("customer_ID");
        }
        return id;
    }
}
