/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adressgenerator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martin Frick Siegen
 */
public class Adressgenerator extends MyErrorMsg{

    public static void main(String[] args) {
        String eingabe;
        boolean check = true;
        ArrayList<ArrayList<String>> alladdress = new ArrayList<>();
        AdressFkt adresse = new AdressFkt(alladdress);

        while (check) {
            Menu start = new Menu();
            Scanner scan = new Scanner(System.in);
            eingabe=scan.next();
            switch(eingabe){
                case"n":
                    adresse.neu();
                    break;

                case"a":
                    adresse.info();
                    break;

                case"e":
                    adresse.email();
                    break;

                case"d":
                    adresse.emailsuche();
                    break;

                case "s":
                    adresse.suche();
                    break;

                case "l":
                    adresse.delete();
                    break;

                case "q":
                    check = false;
                    break;
            }            
        }
        System.out.println("Programm beendet!");
    }
    
}
