/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.HCustomer;
import Model.HCustomerContact;
import java.sql.PreparedStatement;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import services.DB;
import services.INF;
import services.Table;

/**
 *
 * @author MR
 */
public class CCustomer  {
    
    public boolean saveCustomer(Map<String,Object> mp) throws Exception{
        boolean status = false;
        String sql = "insert into Customer values(?,?,?,?,?,?,?,sysdate,?,?,?)";
        PreparedStatement ps = DB.getConnection().prepareStatement(sql);
        ps.setInt(1, INF.getNewID(Table.CUSTOMER));
        ps.setString(2, (String) mp.get("Name"));
        ps.setString(3, (String) mp.get("Phone"));
        ps.setString(4, (String) mp.get("Address"));
        ps.setString(5, (String) mp.get("Mail"));
        ps.setInt(6, 100/*(int) mp.get("CreatedBy")*/);
        ps.setInt(7,100 /*(int) mp.get("UpdatedBy")*/);
        
        ps.setString(9, (String) mp.get("Description"));
        ps.setString(10,(String)mp.get("Note"));
        ps.setString(11, mp.get("Gender").toString());
        try{
        ps.executeQuery();
        status = true;
        }catch(Exception e){
            e.printStackTrace();
            status = false;
            return status;
        }
        return status;
    }
    
    public static void main(String []args){
         CCustomer cu = new CCustomer();
         cu.useInheritanceConfigWithAnnotation();
    }
    
    public void useConfigFileWitoutAnnotation()
    {
        Configuration cfg=new Configuration();
         cfg.configure("hibernate.cfg.xml");  
          SessionFactory factory=cfg.buildSessionFactory();  
          Session session=factory.openSession();
          Transaction t=session.beginTransaction();
          HCustomer cu = new HCustomer();
          cu.setCustomer_ID(2);
          cu.setPhone("0123456");
          cu.setName("Test Annotation");
          session.persist(cu);
          t.commit();
          session.close();
          System.out.println("successfully saved");  
          
    }
    public void useConfigWithAnnootation(){
          Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();  
           Transaction t=session.beginTransaction(); 
           HCustomer cu = new HCustomer();
          cu.setCustomer_ID(5);
          cu.setPhone("0123456");
          cu.setName("Test Annotation without id");
          session.persist(cu);
          t.commit();
          session.close();
          System.out.println("successfully saved");  
    
    }
    public void useInheritanceConfigWithoutAnnotation(){
       Session session=new Configuration().configure("hibernate.cfg.xml")  
                        .buildSessionFactory().openSession();  
          Transaction t=session.beginTransaction();
          HCustomerContact co = new HCustomerContact();
        //  co.setCustomer_ID(0);
          co.setName("Table Per Hierarchy using Annotation Subclass");
          co.setPhone("01097168654");
          co.setAddress("sadat city");
          co.setMail("m.ramadansaad@gmail.com");
          
          HCustomer cu = new HCustomer();
         // cu.setCustomer_ID(0);
          cu.setName("Table Per Hierarchy using Annotation Main class");
          cu.setPhone("10000");
          session.saveOrUpdate(cu);
          session.saveOrUpdate(co);
          t.commit();
          session.close();
          System.out.println("Saved Successfully");
          System.exit(0);
    }
    
    public void useInheritanceConfigWithAnnotation(){
        AnnotationConfiguration cfg=new AnnotationConfiguration();  
         Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
      
        Transaction t=session.beginTransaction(); 
        HCustomerContact co = new HCustomerContact();
          co.setCustomer_ID(1);
          co.setName("Table Per Hierarchy using Annotation Subclass");
          co.setPhone("01097168654");
          co.setAddress("sadat city");
          co.setMail("m.ramadansaad@gmail.com");
          session.saveOrUpdate(co);
         System.out.println() ;
          
//          HCustomer cu = new HCustomer();
//          cu.setCustomer_ID(4);
//          cu.setName("Table Per Hierarchy using Annotation Main class");
//          cu.setPhone("10000");
//          session.saveOrUpdate(cu);
          
          t.commit();
          session.close();
          System.out.println("Saved Successfully");
          System.exit(0);
    }
}
