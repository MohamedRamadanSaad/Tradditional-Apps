/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.sql.Statement;
import services.DB;
import services.INF;
import services.Table;

/**
 *
 * @author dirac
 */
public class CN_User {
    public void save(String username,String password,int employee_ID,int permission_ID) throws Exception{
        int a_User_ID = INF.getNewID(Table.A_USER);
        String sql = "Insert into A_User values ("
                + ""+a_User_ID+","
                + "'"+username+"',"
                + "'"+password+"',"
                + ""+employee_ID+","
                + ""+CN_Login.user_id+","
                + " sysdate ,"
                + ""+permission_ID+""
                + ")";
         Statement st = DB.getConnection().createStatement();
         st.execute(sql);
    }
}
