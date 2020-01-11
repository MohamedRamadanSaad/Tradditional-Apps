/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.OrderReview;

/**
 *
 * @author dirac
 */
public class ActionP implements ActionListener {

    public ActionP() {
    }

    @Override
    public void actionPerformed(ActionEvent e) { 
        
         System.err.println(e.getActionCommand().toString()); 
        if( e.toString().contains("OrderNo")){
            System.out.println(removeWord("Order #", e.getActionCommand().toString()));
            OrderReview r = new OrderReview();
             try {
                 r.setOrderNo(e.getActionCommand().toString());
             } catch (Exception ex) {
                 Logger.getLogger(ActionP.class.getName()).log(Level.SEVERE, null, ex);
             }
            r.setVisible(true);
        }
    }
    
    private String removeWord(String unwanted, String sentence)
        {
        StringTokenizer st = new StringTokenizer(sentence);
        String remainder = "";

        while(st.hasMoreTokens())
        {
        String temp = st.nextToken();

        if(!temp.equals(unwanted))
        {
        remainder += temp+" ";
        }
        }

        return remainder.trim();
        }
    
   
}
