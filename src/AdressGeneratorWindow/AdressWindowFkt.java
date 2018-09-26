/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdressGeneratorWindow;

/**
 *
 * @author martin
 */

import adressgenerator.Stammdaten;
import static adressgenerator.Stammdaten.*;
import java.util.*;
import javax.swing.*;

public class AdressWindowFkt extends javax.swing.JFrame {
    
    ArrayList<String> adresse = new ArrayList<>();

    public AdressWindowFkt() {
        this.adresse = makeAddress();
    }
    
    public void AnzeigeAdresse() {
        Stammdaten name = new Stammdaten();
        
    }

}
