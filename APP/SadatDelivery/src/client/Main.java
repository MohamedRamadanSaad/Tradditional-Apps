/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;


import java.sql.SQLException;
import view.FRLogInForm;


/**
 *
 * @author MR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, Exception {
        FRLogInForm login = new FRLogInForm();
        login.setVisible(true);
    }
    
}
