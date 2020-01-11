/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processes;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.DB;

/**
 *
 * @author dirac
 */
public class GetOrderByDate {
  
    public Hashtable<String,Map<String , Object>> getOrders(String sign ,String dateOrdered ,int customer_ID){
        Hashtable<String,Map<String , Object>> orders = new Hashtable<>() ;
        Map<String ,Object> data;
        String SqlDate;
        if (dateOrdered.equalsIgnoreCase("sysdate")){
             SqlDate = "to_date(to_char(" + dateOrdered + ",'yyyy-mm-dd'),'yyyy-mm-dd')";
        }else {
             SqlDate = "to_date(to_char(TO_DATE ('" + dateOrdered + "', 'yyyy-mm-dd'),'yyyy-mm-dd'),'yyyy-mm-dd')";
        }
       
        String where =" " ;
        if (customer_ID !=0)
           where = " and  customer_id = "+customer_ID ;
       
         String sql = "Select o.*,cu.name Customer , to_char(dateordered, 'yyyy-mm-dd') dt "
            + "from dl.C_order o "
                 + " left join dl.customer cu on cu.customer_id = o.customer_id "
            + "where to_date(to_char(dateordered,'yyyy-mm-dd'),'yyyy-mm-dd')"
            + " "+sign+" "+SqlDate+"" 
            + where+" order by dateordered";
          Statement st= null;
          ResultSet rs = null;
        try {
           st= DB.getConnection().createStatement();
           rs = st.executeQuery(sql);
           int i=0;
           while (rs.next()){
               data = new HashMap<>();
               int c_Order_ID = rs.getInt("C_Order_ID");
               String dateO =rs.getString("dt");
               String Customer = rs.getString("Customer");
               data.put("C_Order_ID", c_Order_ID);
               data.put("DateOrderd", dateO);
               data.put("Customer",Customer);
               orders.put("Data"+i, data);
               i++;
           }
           
        } catch (Exception ex) {
            Logger.getLogger(GetOrderByDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orders;
    }
   
}
