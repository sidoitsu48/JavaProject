/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AdressenDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author martin
 */
public class DBinoutAdr extends AdrDBConnect {
    
    private Connection con;
    private PreparedStatement stm;
    
    public List<AdrDBAccess> getDBAdr() {
        
        List<AdrDBAccess> listAdr = new ArrayList<>();
        
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            con = AdrDBConnect();
            if (con == null) {
                return null;
            }
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT name, strasse, plz, stadt, telefon, email FROM adressen order by adrindex");

            while (rs.next()) {
                AdrDBAccess adr = new AdrDBAccess();

                adr.setName(rs.getString("name"));
                adr.setStrasse(rs.getString("strasse"));
                adr.setPlz(rs.getString("plz"));
                adr.setStadt(rs.getString("stadt"));
                adr.setTelefon(rs.getString("telefon"));
                adr.setEmail(rs.getString("email"));
                
                listAdr.add(adr);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdrDBAccess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
            }
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (Exception e) {
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
        return listAdr;
    }
    
    public boolean setDBAdr (AdrDBAccess adr) {
        
        con = AdrDBConnect();
        stm = null;
        boolean stored = false;
        try {

            if (con == null) {
                return false;
            }

            //stm = con.prepareStatement("INSERT INTO menu (foodno,name,price,datum) VALUES(?,?,?,CURRENT_TIMESTAMP)");
            stm = con.prepareStatement("INSERT INTO adressen (name,strasse,plz,stadt,telefon,email) VALUES(?,?,?,?,?,?)");
            // stm.setInt(1, f.getFoodNo());
            stm.setString(1, adr.getName().trim());
            stm.setString(2, adr.getStrasse().trim());
            stm.setString(3, adr.getPlz().trim());
            stm.setString(4, adr.getStadt().trim());
            stm.setString(5, adr.getTelefon().trim());
            stm.setString(6, adr.getEmail().trim());
            
            int rows = stm.executeUpdate();
            con.commit();
            stored = rows == 1;
        } catch (SQLException ex) {
            Logger.getLogger(AdrDBAccess.class.getName()).log(Level.SEVERE, null, ex);
            stored = false;
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (Exception e) {
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
        return stored;

    }
}
