/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class Login {
    
    private List<Client> clientList = new LinkedList<>();
    

    private Client loginClient = null; 
    
    private Login(){}
    static Login l = null;
    public static Login getInstance() {
        if (l == null) {
            l = new Login();
            return l;

        }
        return l;

    }
    
    //getters 

    public List<Client> getClientList() {
        
        return clientList;
    }

    public Client getLoginClient() {
        return loginClient;
    }
    
    //Setters

    
    void setLoginClient(String ID, String password) {
        Client c = new Client();
        c.setName("Nabeel");
        c.setAddress("Address");
        c.setEmail("n.y.562448@gmail.com");
        c.setGender('M');
        c.setClientId("N1");
        c.setClientPassword("n1");
        c.setShopID("01-1");
        clientList.add(c);
        for (Client client : clientList) {
            
            if ((client.getEmail().equals(ID) || client.getClientId().equalsIgnoreCase(ID)) && client.getClientPassword().equals(password)) {
                loginClient = client;
                
            }
        }
        
    }
    
    
}
