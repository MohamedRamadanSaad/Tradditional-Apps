/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


 

/**
 *
 * @author MR
 */
//@Entity
//@Table(name="Customer")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
//@DiscriminatorValue(value="HCustomer")
public class HCustomer {
    
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)  
//    @Column(name = "customer_ID")
    int customer_ID ;
//    @Column(name = "name")
    String name;
//    @Column(name = "phone")
    String phone;
 
   
   
    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
