/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import javax.swing.UIManager;

/**
 *
 * @author Windows 10
 */
public class Carrefour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ManagerForm m = new ManagerForm();
//        m.setVisible(true);
        try{
        // TODO code application logic here
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        }catch(Exception ex)
        {
            System.out.println("Hellp1");
        }
        ManagerForm cf = new ManagerForm();
        cf.setVisible(true);
    }
    
}
