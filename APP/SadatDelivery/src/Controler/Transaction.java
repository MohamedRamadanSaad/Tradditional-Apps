/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.util.Map;

/**
 *
 * @author MR
 */
public interface Transaction {
 public boolean save ();
 public Map search();
 public int getID();
}
