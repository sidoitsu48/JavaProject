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
import com.AdressenDB.*;
import adressgenerator.Stammdaten;
import static adressgenerator.Stammdaten.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class AdressWindow extends javax.swing.JFrame {

    /**
     * Creates new form AdressWindow
     */
    public AdressWindow() {
        initComponents();
        JCheckInDB.setSelected(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jStrasseField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPLZField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jStadtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTelefonField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jEmailField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMakeAdresse = new javax.swing.JButton();
        JCheckInDB = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adressen-Generator");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 27, -1, -1));

        jNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jNameField.setText("Name");
        jPanel1.add(jNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 75, 361, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 51, -1, -1));

        jStrasseField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jStrasseField.setText("Strasse");
        jPanel1.add(jStrasseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 140, 361, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Straße:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 116, -1, -1));

        jPLZField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPLZField.setText("PLZ");
        jPanel1.add(jPLZField, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 205, 83, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Postleitzahl:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 181, -1, -1));

        jStadtField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jStadtField.setText("Stadt");
        jPanel1.add(jStadtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 205, 260, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Stadt:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 181, -1, -1));

        jTelefonField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTelefonField.setText("Telefonnummer");
        jPanel1.add(jTelefonField, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 270, 114, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Telefonnummer:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 246, -1, -1));

        jEmailField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jEmailField.setText("E-Mail Adresse");
        jPanel1.add(jEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 335, 361, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("E-Mail Adresse:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 311, -1, -1));

        jMakeAdresse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMakeAdresse.setText("Generiere Adresse");
        jPanel1.add(jMakeAdresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 376, -1, -1));

        JCheckInDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JCheckInDB.setText("In Datenbank speichern?");
        jPanel1.add(JCheckInDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 376, -1, -1));

        jTabbedPane1.addTab("Adressen Generieren", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 840, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdressWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdressWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdressWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdressWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdressWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JCheckInDB;
    private javax.swing.JTextField jEmailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jMakeAdresse;
    private javax.swing.JTextField jNameField;
    private javax.swing.JTextField jPLZField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jStadtField;
    private javax.swing.JTextField jStrasseField;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTelefonField;
    // End of variables declaration//GEN-END:variables
}
