/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.AdressenDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author martin
 */
public class AdrDBConnect {
    
    
    /**
     * Holt eine Datenbankverbindung.
     * @return SQL Connection oder null wenn Fehler.
     */
    public Connection AdrDBConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adressendb","root", "");
           
           
            con.setAutoCommit(false);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(AdrDBConnect.class.getName()).log(Level.SEVERE, null, ex);
       
        }  catch (ClassNotFoundException ex) {
            Logger.getLogger(AdrDBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AdrDBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AdrDBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
}
