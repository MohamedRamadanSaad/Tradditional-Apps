/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import static Controler.CN_Login.user_id;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.DB;
import services.INF;

/**
 *
 * @author dirac
 */
public class Log {
     public static void saveLog(String Description){
       int id =0;
        try {
           id= INF.getNewID("log");
       } catch (Exception ex) {
           Logger.getLogger(CN_Login.class.getName()).log(Level.SEVERE, null, ex);
       }
        String sql = "insert into log values ("+id+","
                + ""+user_id+" ,"
                + " sysdate,"
                + "'"+Description+"')";
       try {
           DB.getConnection().createStatement().executeQuery(sql);
       } catch (Exception ex) {
           Logger.getLogger(CN_Login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
