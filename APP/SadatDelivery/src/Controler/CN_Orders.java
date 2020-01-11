
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import services.DB;
import services.INF;
import services.Table;

/**
 *
 * @author dirac
 */
public class CN_Orders {

    Statement st;

    public boolean save(Hashtable<String, Map> ht) throws Exception {
        Map master = ht.get("master");
        int c_order_id = INF.getNewID(Table.C_ORDER);

        int Customer_ID = Integer.parseInt(master.get("Customer_ID").toString());
        String dateordered = master.get("dateordered").toString();
        int createdby = Integer.parseInt(master.get("createdby").toString());
        int driver_ID = Integer.parseInt(master.get("driver_ID").toString());
        int amtpurchase = Integer.parseInt(master.get("amtpurchase").toString());
        int amtservice = Integer.parseInt(master.get("amtservice").toString());
        int grandtotal = Integer.parseInt(master.get("grandtotal").toString());
        String sql = "insert into c_order values (" + c_order_id + "," + Customer_ID + ",to_date('" + dateordered + "','hh24:mi yyyy-mm-dd')"
                + ", " + CN_Login.user_id + ", " + amtpurchase + "," + amtservice + "," + grandtotal + ", sysdate,'PR'," + driver_ID + ")";
        st = DB.getConnection().createStatement();
        if (!st.execute(sql)) {
            System.out.println("Controler.CN_Orders.save()");
        }
        st.close();
        Map lines = ht.get("lines");
        for (Object line : lines.keySet()) {
            int c_orderline_id = INF.getNewID(Table.C_ORDERLINE);
            String item = lines.get(line).toString();
            int ln = Integer.parseInt(line.toString());
            System.out.println(lines.get(line));
            String sql2 = "insert into c_orderline values (" + c_orderline_id + "," + c_order_id + "," + ln + ",'" + item + "',0,'Desc',sysdate)";
            st = DB.getConnection().createStatement();
            if (!st.execute(sql2)) {
                System.out.println("Controler.CN_Orders.save()");
            }
        }
        return false;
    }

    public Hashtable<String, Map> getOrder(String OrderNo) throws Exception {
        Hashtable<String, Map> data = new Hashtable<>();
        Map master = new HashMap();
        Map lines = new HashMap();
        int ID = Integer.parseInt(OrderNo);
        String sql = " select * from dl.ordermasterdata_RV rv where rv.c_Order_id = " + ID;
        String sql2 = "Select * from dl.C_orderline ol where ol.c_Order_ID = " + ID;
        Statement st = DB.getConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            master.put("customer", rs.getString("customer"));
            master.put("phone", rs.getString("phone"));
            master.put("address", rs.getString("address"));
            master.put("username", rs.getString("username"));
            master.put("driver", rs.getString("driver"));
            master.put("amtpurchase", rs.getString("amtpurchase"));
            master.put("amtservice", rs.getString("amtservice"));
            master.put("grandtotal", rs.getString("grandtotal"));
            master.put("dateo", rs.getString("dateo"));
            master.put("timeo", rs.getString("timeo"));
            master.put("docstatus", rs.getString("docstatus"));
        }
        ResultSet rs2 = st.executeQuery(sql2);
        while (rs2.next()) {
            lines.put(rs2.getString("line"), rs2.getString("item"));

        }

        data.put("master", master);
        data.put("lines", lines);
        return data;
    }

    public boolean update(Hashtable<String, Map> ht) throws Exception {
        Map master = ht.get("master");
        int c_order_id = Integer.parseInt(master.get("C_Order_ID").toString());

        int Customer_ID = Integer.parseInt(master.get("Customer_ID").toString());
        String dateordered = master.get("dateordered").toString();
        String docstatus = master.get("docstatus").toString();
        int driver_ID = Integer.parseInt(master.get("driver_ID").toString());
        int amtpurchase = Integer.parseInt(master.get("amtpurchase").toString());
        int amtservice = Integer.parseInt(master.get("amtservice").toString());
        int grandtotal = Integer.parseInt(master.get("grandtotal").toString());
        //String sql = "update  c_order values ("+c_order_id+","+Customer_ID+",to_date('"+dateordered+"','hh24:mi yyyy-mm-dd')"
        //       + ", "+CN_Login.user_id+", "+amtpurchase+","+amtservice+","+grandtotal+", sysdate,'PR',"+driver_ID+")"; ;
        String sql = "update  c_order set  \n"
                + "Customer_ID = " + Customer_ID + ",\n"
                + "dateordered = to_date('" + dateordered + "','hh24:mi yyyy-mm-dd'),\n"
                + "createdby=" + CN_Login.user_id + ",\n"
                + "amtpurchase=" + amtpurchase + ",\n"
                + "amtservice=" + amtservice + ",\n"
                + "grandtotal=" + grandtotal + ",\n"
                + "DOCSTATUS ='" + docstatus + "',\n"
                + "driver_ID= " + driver_ID + "\n"
                + "where c_order_id =" + c_order_id + "\n";

        st = DB.getConnection().createStatement();
        if (!st.execute(sql)) {
            System.out.println("Controler.CN_Orders.update()");
        }
        st.close();
        st = DB.getConnection().createStatement();
        String del = " delete from c_orderline where c_order_id = "+c_order_id ; 
        st.execute(del);
        st.close();
        Map lines = ht.get("lines");
        for (Object line : lines.keySet()) {
            int c_orderline_id = INF.getNewID(Table.C_ORDERLINE);
            String item = lines.get(line).toString();
            int ln = Integer.parseInt(line.toString());
            System.out.println(lines.get(line));
            String sql2 = "insert into c_orderline values (" + c_orderline_id + "," + c_order_id + "," + ln + ",'" + item + "',0,'Desc',sysdate)";
            st = DB.getConnection().createStatement();
            if (!st.execute(sql2)) {
                System.out.println("Controler.CN_Orders.update()");
            }
        }
        return false;
    }

}
