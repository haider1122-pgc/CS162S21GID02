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
     * to let the office class behaves singleton behavior
     *
     * @return Office
     */
    static Carrefour c = null;
    public static Carrefour getInstance() {
        if (c == null) {
            c = new Carrefour();
            return c;

        }
        return c;

    }
    //make the carrefour constructor private

    private Carrefour() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clientRequestForm c = new clientRequestForm();
        c.setVisible(true);
//       Email e =new Email();
//       e.sendEmail();
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

//        ClientForm cf = new ClientForm();
//        cf.setVisible(true);
//        ManagerForm w = new ManagerForm();
//        w.setVisible(true);

    }
    
}
