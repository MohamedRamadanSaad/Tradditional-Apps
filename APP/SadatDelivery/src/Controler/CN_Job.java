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
 * @author MR
 */
public class CN_Job {
    Statement st ;
    public boolean save(String name ) throws Exception{
       st = DB.getConnection().createStatement();
       int job_id = INF.getNewID(Table.JOB);
       String sql = "insert into job values ("+job_id+",'"+name+"',sysdate,"+CN_Login.user_id+")";
       if (!st.execute(sql)){
           return true;
       }else {
           return false;
       }
}
}
