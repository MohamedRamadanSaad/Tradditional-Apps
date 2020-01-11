/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.swing.JOptionPane;
import services.DB;
import services.INF;
import services.Table;

/**
 *
 * @author dirac
 */
public class CN_Employee {
    Statement st;
    public boolean save(Map<String , Object >map) throws Exception{
         int id = INF.getNewID(Table.EMPLOYEE);
        String name = map.get("name").toString();
        String phone = map.get("phone").toString();
        String age = map.get("age").toString();
        String address = map.get("address").toString();
        String code = map.get("code").toString();
        int job_ID = Integer.parseInt( map.get("job_ID").toString());
         String sql = "insert into employee values ("+id+" , '"+name+"','"+phone+"','"+age+"'"
                + ", '"+address+"','"+code+"',"+job_ID+",sysdate,"+CN_Login.user_id+",'FR')";
        st = DB.getConnection().createStatement();
        boolean save ; 
        try{ 
            st.execute(sql);
            save = true;
        }catch(SQLException e  ){
            JOptionPane.showMessageDialog(null, "Name is saved before");
            save = false;
        }
        st.close();
        if(save){
            return true;
        }else {
            return false;
        }
    }
}
