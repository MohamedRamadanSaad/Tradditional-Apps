/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import processes.Permission;
import services.DB;
import services.INF;
import services.Table;



/**
 *
 * @author dirac
 */
public class CN_Permission {
   public void save() throws Exception{
       int permission_ID = INF.getNewID(Table.PERMISSION);
       String sql = "insert into permission values("+permission_ID+","
               + "'"+Permission.ADD_CUSTOMER+"',"
               + "'"+Permission.CUSTOMER_SEARCH+"',"
               + "'"+Permission.CREATE_ORDER+"',"
               + "'"+Permission.ADD_EMPLOYEE+"',"
               + "'"+Permission.ADD_JOBDEP+"',"
               + "'"+Permission.TIMELINE+"',"
               + "'"+Permission.ORDER_REVIEW+"',"
               + "'"+Permission.ADD_USER+"',"
               + "'"+Permission.ADD_PERMISSION+"',"
               + "'"+Permission.BACKUP+"',"
               + "'"+Permission.REP1+"',"
               + "'"+Permission.REP2+"',"
               + "'"+Permission.REP3+"',"
               + "'"+Permission.REP4+"',"
               + "'"+Permission.REP5+"',"
               + "'"+Permission.REP6+"',"
               + "'"+Permission.Name+"'"
               + ")";
       Statement st = DB.getConnection().createStatement();
       st.execute(sql);
   }
   
   public Permission getRole() throws SQLException{
       String sql ="select per.* from a_user us "
               + "left join permission per on us.permission_id = per.permission_ID "
               + "where us.a_user_id = "+CN_Login.user_id;
       Statement st = null;
        ResultSet rs = null ;
        Permission permission = new Permission();
       try {
           st = DB.getConnection().createStatement();
           rs = st.executeQuery(sql);
           while(rs.next()){
               permission.ADD_CUSTOMER = rs.getString("ADDCUSTOMER");
               permission.CUSTOMER_SEARCH = rs.getString("CUSTOMERSEARCH");
               permission.CREATE_ORDER = rs.getString("CREATEORDER");
               permission.ADD_EMPLOYEE = rs.getString("ADDEMPLOYEE");
               permission.ADD_JOBDEP = rs.getString("ADDJOPDEP");
               permission.TIMELINE = rs.getString("TIMELINE");
               permission.ORDER_REVIEW = rs.getString("ORDERREVIEW");
               permission.ADD_USER = rs.getString("ADDUSER");
               permission.ADD_PERMISSION = rs.getString("ADDPERMISSION");
               permission.BACKUP = rs.getString("BACKUP");
               permission.REP1 = rs.getString("rep1");
               permission.REP2 = rs.getString("rep2");
               permission.REP3 = rs.getString("rep3");
               permission.REP4 = rs.getString("rep4");
               permission.REP5 = rs.getString("rep5");
               permission.REP6 = rs.getString("rep6");
               
           }
       } catch (Exception ex) {
           Logger.getLogger(CN_Permission.class.getName()).log(Level.SEVERE, null, ex);
       }finally {
           st.close();
           rs.close();
       }
       return permission;
   }
           
}
