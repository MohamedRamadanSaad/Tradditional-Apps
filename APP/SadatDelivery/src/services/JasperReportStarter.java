/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import view.MainApplication;

/**
 *
 * @author dirac
 */
public class JasperReportStarter {

    
    String jrxmlFileName = "";
    String jasperFileName = "";
    HashMap hm;
   
    public void initializeReportPath(String report){
         if (report.equalsIgnoreCase(Reports.DailyPurchase)) {
            jrxmlFileName = "C:/Report/DailyPurchase.jrxml";
            jasperFileName = "C:/Report/DailyPurchase.jasper";
        } else if (report.equalsIgnoreCase(Reports.customers)) {
            jrxmlFileName = "C:/Report/customers.jrxml";
            jasperFileName = "C:/Report/customers.jasper";
        } else if (report.equalsIgnoreCase(Reports.orderCosts)) {
            jrxmlFileName = "C:/Report/orderCosts/orderCosts.jrxml";
            jasperFileName = "C:/Report/orderCosts/orderCosts.jasper";
        } else if (report.equalsIgnoreCase(Reports.openOrders)) {
            jrxmlFileName = "C:/Report/openOrders/openOrders.jrxml";
            jasperFileName = "C:/Report/openOrders/openOrders.jasper";
        }
    }


    public void setParameter(HashMap<String, Object> para) {
        hm = new HashMap();
        hm = para;
    }

    public void openReport(String reportName) {
       initializeReportPath(reportName);
        try {
            startReport();
        } catch (Exception ex) {
            Logger.getLogger(MainApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void startReport() throws JRException, Exception {
        //  JasperCompileManager.compileReportToFile(jrxmlFileName);
        JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, hm, DB.getConnection());
        JasperViewer.viewReport(jprint, false);
    }

}
