/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adressgenerator;

import static adressgenerator.MyErrorMsg.*;
import static adressgenerator.Stammdaten.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Martin Frick
 */
public class AdressFkt {

    int zahl;
    ArrayList<ArrayList<String>> adresse = new ArrayList<>();

    public AdressFkt(ArrayList<ArrayList<String>> item) {
        this.adresse = item;
    }

    public void neu() {
        System.out.println("Es werden neue Adressen generiert!");
        System.out.println("Geben sie eine Zahl ein!");
        Scanner nscan = new Scanner(System.in);
        try {
            zahl = nscan.nextInt();
            if (zahl < 0) {
                System.err.println("Bitte nur Zahlen größer 0 eingeben!");
                zahl = 0;
            }
            for (int i = 0; i < zahl; i++) {
                adresse.add(makeAddress());
            }
            System.out.println("Es wurden " + zahl + " Adressen generiert!");
        } catch (InputMismatchException e) {
            System.out.println(errorZahl());
        }
    }

    public void info() {
        System.out.println("Es werden alle Adressen angezeigt!");
        adresse.forEach(var -> {
            System.out.println(adresse.indexOf(var) + 1 + ": " + var);
        });
    }
    
    public void email() {
        System.out.println("Es werden alle E-Mails angezeigt!");
        adresse.forEach(var -> {
            System.out.println(adresse.indexOf(var) + 1 + ": " + getEmail(var));
        });
    }
    
    public boolean doppeltemail (String mail) {
        ArrayList<String> email = new ArrayList<>();
        email = opsuche(adresse);
        boolean b = false;
        if (mail.contains("@")) {
            for (int i = 0; i < email.size(); i++) {
                if (email.get(i).contains(mail)){
                    b = true;
                }
            }
//                if (b) {
//                    System.out.println("Doppelte E-Mails: -> " + mail);
//                } else {
//                    System.out.println("Keine doppelten E-Mails!");
//                }
        } else {
            System.err.println(errorMail());
        }
        return b;
    }
    
    public ArrayList<String> opsuche (ArrayList<ArrayList<String>> adresse) {
        ArrayList<String> adr = new ArrayList<>();
        adresse.forEach(var -> {
            adr.add(getEmail(var));
        });
        return adr;
    }
    
    public void emailsuche() {
        AdressFkt adr = new AdressFkt(adresse);
        System.out.println("Sie können nach doppelten E-Mail-Adressen suchen!");
        System.out.println("Geben sie eine E-Mail-Adresse ein!");
        Scanner escan = new Scanner(System.in);
        String ename = escan.next();
        if (adr.doppeltemail(ename)) {
            System.out.println("Doppelte E-Mails: -> " + ename);
        } else {
            System.out.println("Keine doppelten E-Mails!");
        }
    }
    
    public void suche() {
        ArrayList<ArrayList<String>> adr = new ArrayList<>();
        System.out.println("Sie können eine Zeichenfolge suchen!");
        System.out.println("Geben sie eine Zeichenfolge ein!");
        Scanner nscan1 = new Scanner(System.in);
        String nname = nscan1.next();
        adresse.stream().filter((item) -> (hasItem(item, nname))).forEach((item) -> {
            adr.add(item);
        });
        adr.forEach(item -> System.out.println(adr.indexOf(item) + 1 + ": " + item));
    }
    
    public void delete() {
        int azahl;
        int ezahl;

        System.out.println("Es werden Adressen gelöscht!");
        try {
            System.out.println("Geben sie den Beginn des Bereichs ein!");
            Scanner ascan = new Scanner(System.in);
            azahl = ascan.nextInt();
            System.out.println("Geben sie das Ende des Bereichs ein!");
            Scanner escan = new Scanner(System.in);
            ezahl = escan.nextInt();
            azahl = Math.abs(azahl) - 1;
            ezahl = Math.abs(ezahl) - 1;

            if (azahl > ezahl) {
                int h = azahl;
                azahl = ezahl;
                ezahl = h;
            }
            if (ezahl > adresse.size()) {
                ezahl = adresse.size() - 1;
                System.out.println(ezahl);
            }
            for (int i = ezahl; i >= azahl; i--) {
                adresse.remove(i);
            }
        } catch (InputMismatchException e) {
            System.err.println(errorZahl());
        }

    }
}
