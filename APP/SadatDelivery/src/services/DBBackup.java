/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dirac
 */
public class DBBackup {
    String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    String time = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
    Random rand = new Random();
    int  n = rand.nextInt(10000) + 1;
    String  path = "Backup_" + date +"ran"+n ;
    String  log = "log_file"+ date+"ran"+n;
    
    public boolean startBackup(){
        //CREATE OR REPLACE DIRECTORY tmp AS 'D:/temp';
        //GRANT read, write ON DIRECTORY tmp TO dl;
        boolean state=false;
        Process p=null;
        try {
            Runtime runtime = Runtime.getRuntime();
            String command = "expdp dl/bc4j@localhost schemas=dl directory=tmp dumpfile="+path+".dmp logfile="+log+".log";
             p=runtime.exec(command);

            int processComplete = p.waitFor();
            if (processComplete==0) {
                state= true ;
            }else{
                state=  false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return state;
    }
}
