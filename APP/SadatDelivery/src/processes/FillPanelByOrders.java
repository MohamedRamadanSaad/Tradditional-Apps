/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processes;

import Controler.CN_Customer;
import java.awt.BorderLayout;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import services.ActionP;

/**
 *
 * @author dirac
 */
public class FillPanelByOrders {
    public void setTimeLine(String sign ,JPanel panel, String Phone,String date ) throws Exception {
        GetOrderByDate orders = new GetOrderByDate();
        int i = 0;
        int customer_ID =0;
        CN_Customer cu = new CN_Customer();
        
        if (!Phone.equalsIgnoreCase(""))
        customer_ID = cu.getCustomerID(Phone);
        
       
       
         Hashtable<String,Map<String , Object>> ordersMap= orders.getOrders(sign, date, customer_ID);
        // ordersMap.entrySet().forEach((entry) -> {
        for (Map.Entry<String, Map<String, Object>> entry : ordersMap.entrySet()) {
            JButton mainButton = new JButton("Buttn #" + i);
            JPanel sidePan = new JPanel();
            sidePan.setBackground(new java.awt.Color(204, 153, 255));
            mainButton.setBackground(new java.awt.Color(255, 255, 255));
            mainButton.setName("Order #" + ordersMap.get("Data"+i).get("C_Order_ID"));
            mainButton.setLayout(new BorderLayout());
            mainButton.add(sidePan, BorderLayout.EAST);
            JLabel customerName = new JLabel();
            customerName.setText("Customer : "+ordersMap.get("Data"+i).get("Customer"));
            JLabel orderDate = new JLabel();
            orderDate.setText("Date : " + ordersMap.get("Data"+i).get("DateOrderd"));
            orderDate.setAlignmentX(CENTER_ALIGNMENT);
            JPanel pandata = new JPanel();
            pandata.setLayout(new BorderLayout());
            pandata.add(orderDate, BorderLayout.BEFORE_FIRST_LINE);
            pandata.add(customerName, BorderLayout.AFTER_LAST_LINE);
            pandata.setBackground(new java.awt.Color(255, 255, 255));
            mainButton.add(pandata, BorderLayout.CENTER);
            JButton orderNo = new JButton("" + ordersMap.get("Data"+i).get("C_Order_ID"));
            orderNo.setName("OrderNo");
            orderNo.addActionListener(new ActionP());
            pandata.add(orderNo, BorderLayout.CENTER);
            mainButton.addActionListener(new ActionP());
            mainButton.setPreferredSize(new Dimension(100, 100));
            panel.add(mainButton);
            panel.revalidate();
            panel.repaint();
            i++;
              //System.out.println(entry.getKey() + "/" + entry.getValue());
        };
}
    
}
