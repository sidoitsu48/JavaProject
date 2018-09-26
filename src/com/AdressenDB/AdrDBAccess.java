/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AdressenDB;

import java.util.ArrayList;

/**
 *
 * @author martin
 */
public class AdrDBAccess {
    
    private String name;
    private String strasse;
    private String stadt;
    private String email;
    private String telefon;
    private String plz;
    
    public AdrDBAccess (ArrayList<String> adresse) {
        this.name = adresse.get(0);
        this.strasse = adresse.get(1); 
        this.plz = adresse.get(2);
        this.stadt = adresse.get(3);
        this.telefon = adresse.get(4);
        this.email = adresse.get(5);
    }
    
    public AdrDBAccess() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }
    
}
