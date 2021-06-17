/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.UIManager;

/**
 *
 * @author Windows 10
 */
public class Carrefour {
    //declerations of lists
    private final LinkedList<Manager> mgr = new LinkedList<>();
    private final LinkedList<Client> client = new LinkedList<>();
    private final LinkedList<CEO> ceo = new LinkedList<>();
    private final LinkedList<workers> wkr = new LinkedList<>();
    private final LinkedList<Cashier> cshr = new LinkedList<>();
    private final ArrayList<managerRequest> mgrReq = new ArrayList<>();
    private final ArrayList<clientRequest> cltReq = new ArrayList<>();
    private final ArrayList<floor> flr = new ArrayList<>();
    private final Queue <Shops> shop = new PriorityQueue<>();
    private final LinkedList<Products> pro = new LinkedList<>();
    
    

    //getter for lists
    public LinkedList<Manager> getMgr() {
        return mgr;
    }

    public LinkedList<Client> getClient() {
        return client;
    }

    public LinkedList<CEO> getCeo() {
        return ceo;
    }

    public LinkedList<workers> getWkr() {
        return wkr;
    }

    public LinkedList<Cashier> getCshr() {
        return cshr;
    }

    public ArrayList<managerRequest> getMgrReq() {
        return mgrReq;
    }

    public ArrayList<clientRequest> getCltReq() {
        return cltReq;
    }

    public ArrayList<floor> getFlr() {
        return flr;
    }

    public Queue<Shops> getShop() {
        return shop;
    }

    public LinkedList<Products> getPro() {
        return pro;
    }
    
    
    
    
    
    
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
//        clientRequestForm c = new clientRequestForm();
 //       c.setVisible(true);
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

        ClientForm cf = new ClientForm();
        cf.setVisible(true);
//        ManagerForm w = new ManagerForm();
//        w.setVisible(true);

    }
    
}
