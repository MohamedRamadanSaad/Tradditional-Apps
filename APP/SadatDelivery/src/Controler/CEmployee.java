/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import services.HibernateUtil;

/**
 *
 * @author MR
 */
public class CEmployee {
    
    public static void main(String[] args) {
        
       Session session=new Configuration().configure("hibernate.cfg.xml")  
                        .buildSessionFactory().openSession();  
          Transaction txn=session.beginTransaction();
        try { 
        txn.begin();
        Employee e = new Employee();
        e.setName("محمد رمضان");
        e.setAge("25");
        session.persist(e);
        txn.commit();
        session.close();           
        } catch(Exception e) {
        if(txn != null) { 
            txn.rollback(); }
            e.printStackTrace();
        } finally {
             if(session != null) { session.close(); 
        
        }}
 
    }
}
