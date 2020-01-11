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
//@DiscriminatorValue(value="HCustomerContact")
public class HCustomerContact extends HCustomer {

//    @Column(name = "address")
    String address;
//    @Column(name = "mail")
    String mail;
    public String getAddress() {
        return address;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String Mail) {
        this.mail = Mail;
    }
    
    
}
