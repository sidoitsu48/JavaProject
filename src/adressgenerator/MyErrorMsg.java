/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adressgenerator;

/**
 *
 * @author Martin Frick
 */
public class MyErrorMsg {
    private static String error;

    public static String errorZahl() {
        error = "Bitte Zahlen im Format [1-9] eingeben!";
        return error;
    }
    
    public static String errorMail() {
        error = "Bitte eine E-Mail-Adresse eingaben!";
        return error;
    }
}
