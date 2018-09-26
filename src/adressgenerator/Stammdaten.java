/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adressgenerator;

import java.util.*;

/**
 *
 * @author Martin Frick
 */
public class Stammdaten implements AdressInterface {

    private String vorname;
    private String initial;
    private String nachname;
    private String strasse;
    private String stadt;
    private String email;
    private String telefon;
    private String plz;
    Random r = new Random();

    public String getVorname() {
        return VORNAMEN[r.nextInt(VORNAMEN.length)];
    }

    public String getInitial() {
        return INITIAL[r.nextInt(INITIAL.length)];
    }

    public String getNachname() {
        return NACHNAMEN[r.nextInt(NACHNAMEN.length)];
    }
    
    public String getStrasse() {
        String prefix = STRASSENPREFIX[r.nextInt(STRASSENPREFIX.length)];
        String suffix = STRASSENSUFFIX[r.nextInt(STRASSENSUFFIX.length)];
        String initial = ADRESSINITIAL[r.nextInt(ADRESSINITIAL.length)];
        String zusatz = ADRESSZUSATZ[r.nextInt(ADRESSZUSATZ.length)];
        int nummer = r.nextInt(130);
        return prefix + suffix + " " 
                + Integer.toString(nummer) + initial + " " + zusatz;
    }

    public String getStadt() {
        String prefix = ORTSPREFIX[r.nextInt(ORTSPREFIX.length)];
        String suffix = ORTSSUFFIX[r.nextInt(ORTSSUFFIX.length)];
        return prefix + suffix;
    }

    public String getTelefon() {
        String tel = "0";
        for (int i = 2; i < 11; i++) {
        tel = tel + Integer.toString(r.nextInt(9));
        if (i==3) {
            tel = tel + TELTRENNER[r.nextInt(TELTRENNER.length)];
            }
        }
    return tel;
    }

    public String getPlz() {
        String p = "";
        for (int i = 1; i < 6; i++) {
            p = p + Integer.toString(r.nextInt(9));
        }
        return p;
    }      

    public String getEmail(String vorname, String nachname) {
        Random r = new Random();
        String dname = DOMAINNAMES[r.nextInt(DOMAINNAMES.length)].toLowerCase();
        String dom = DOMAINS[r.nextInt(DOMAINS.length)].toLowerCase();
        return makeRegex(vorname) + "." + makeRegex(nachname) + "@" + dname + dom;
    }
    
    public static String makeRegex(String name) {
        if (name.matches("[a-zA-Z]+")) {
            return name.toLowerCase();
        }
        else {
            name = name.toLowerCase();
            name = name.replaceAll("ä", "ae");
            name = name.replaceAll("ö", "oe");
            name = name.replaceAll("ü", "ue");
            name = name.replaceAll("ß", "ss");
            name = name.replaceAll(" ", "");
            name = name.replaceAll("-", "");
            name = name.replaceAll("/", "");
            name = name.replaceAll("von ", "");
        }
        return name;
    }
    
    public static String makeName (String vornamen, String initial, String nachnamen) {
        return vornamen + initial + nachnamen;
    }

    
    public static ArrayList<String> makeAddress() {
        ArrayList<String> address = new ArrayList<>();
        Stammdaten name = new Stammdaten();
        String vorname = name.getVorname();
        String nachname = name.getNachname();
        
        address.add(makeName(name.getVorname(),name.getInitial(),name.getNachname()));
        address.add(name.getStrasse());
        address.add(name.getPlz()+ " " + name.getStadt());
        address.add(name.getTelefon());
        address.add(name.getEmail(vorname, nachname));
        return address;
    }
}