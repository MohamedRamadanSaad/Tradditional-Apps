/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.sql.Statement;
import javafx.scene.control.Tab;
import services.DB;
import services.INF;
import services.Table;

/**
 *
 * @author MR
 */
public class CN_Department {
     Statement st ;
    public boolean save(String name ) throws Exception{
       st = DB.getConnection().createStatement();
       int department_id = INF.getNewID(Table.DEPARTMENT);
       String sql = "insert into department values ("+department_id+",'"+name+"',sysdate,"+CN_Login.user_id+")";
       if (!st.execute(sql)){
           return true;
       }else {
           return false;
       }
        
    }
}
