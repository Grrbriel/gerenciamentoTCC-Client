/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciamentotcc;

import View.Login;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gabriel
 */
public class GerenciamentoTCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Object t = javax.swing.UIManager.getInstalledLookAndFeels();
//        try {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(GerenciamentoTCC.class.getName()).log(Level.SEVERE, null, ex);
//        }
        FlatLightLaf.setup();
        Login login = new Login();
        login.setVisible(true);
    }
    
}
