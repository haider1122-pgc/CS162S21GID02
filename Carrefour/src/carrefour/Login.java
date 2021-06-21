/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Windows 10
 */
public class Login {
    
    private List<Client> clientList = new LinkedList<>();
    
    
    private Set<clientRequest> clientRequestSet = new HashSet<>();
    private Set<managerRequest> managerRequestsSet = new HashSet<>();
    private List<workers> workers = new ArrayList<>();
    private List<Cashier> cashiers = new LinkedList<>();
    
    

    private Object loginPerson = null; 
    
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

    public Object getLoginPerson() {
        return loginPerson;
    }

    public List<Cashier> getCashiers() {
        return cashiers;
    }

    public Set<clientRequest> getClientRequestSet() {
        return clientRequestSet;
    }

    public List<workers> getWorkers() {
        return workers;
    }
    
    
    
    
    //Setters
    
    public Set<clientRequest> getClientRequestList() {
        return clientRequestSet;
    }

    public void setCashiers (List<Cashier> cashiers) {
        this.cashiers = cashiers;
    }

    public void setWorkers(List<workers> workers) {
        this.workers = workers;
    }
    

    
    public void setLoginPerson(String ID, String password) {
        Client c = new Client();
        c.setName("Nabeel");
        c.setAddress("Address");
        c.setEmail("n.y.562448@gmail.com");
        c.setGender('M');
        c.setClientId("N1");
        c.setClientPassword("n1");
        c.setShopID("1-01");
        clientList.add(c);
        clientRequest cr = new clientRequest();
        cr.setName("Haider");
        cr.setEmail("haider137");
        cr.setUsername("h1");
        cr.setPassword("h1");
        clientRequestSet.add(cr);
        
        for (Client client : clientList) {
            
            if ((client.getEmail().equals(ID) || client.getClientId().equalsIgnoreCase(ID)) && client.getClientPassword().equals(password)) {
                loginPerson = client;
                
                
            }
        }
        for (clientRequest request : clientRequestSet) {
            if ((request.getEmail().equals(ID) || request.getUsername().equals(ID)) && request.getPassword().equals(password)) {
                loginPerson = request;
            }
        }
        
    }
     
    public boolean addClientRequest(clientRequest c)
    {
        System.out.println("1");
        if(clientRequestSet.add(c))
        {
            System.out.println("1");
            return true ;
        }
        return false;
    }
    public boolean addManagerRequest(managerRequest m)
    {
       
        if (managerRequestsSet.add(m)) {
            return true;
        }
        return false;
    }
    
    
    
    public boolean saveClientRequest() throws IOException
    {
        boolean flag = false;
        FileWriter save = new FileWriter("D:\\2nd Semester\\OOP\\OOP Final Project\\CS162S21GID02\\Carrefour\\Database\\Requests\\ClientRequest\\request.txt");
        for (clientRequest request : clientRequestSet) {
            save.write(request.getName()+ "," );
            save.write(request.getEmail()+ "," );
            save.write(request.getUsername()+ "," );
            save.write(request.getPassword()+ "," );
            save.write(/*request.getShopID()*/"ID"+ "," );
            System.out.println("3");
            
            request.setJoiningDate(new Date());
            DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = dateFormat.format(request.getJoiningDate());
            
            save.write(date+ "\n" );
            System.out.println("3");
            saveParagraph("D:\\2nd Semester\\OOP\\OOP Final Project\\CS162S21GID02\\Carrefour\\Database\\Requests\\ClientRequest\\about", request.getUsername()+".txt", request.getAboutShop());
            saveParagraph("D:\\2nd Semester\\OOP\\OOP Final Project\\CS162S21GID02\\Carrefour\\Database\\Requests\\ClientRequest\\objective", request.getUsername()+".txt", request.getProspactive());
            flag = true;
        }
        save.flush();
        save.close();
        
        
        return flag;
    }
    
    public void saveParagraph(String path, String fileName ,String paragraph) throws IOException
    {
        path = path + "\\" + fileName;
        FileWriter save = new FileWriter(path);
        save.write(paragraph);
        save.flush();
        save.close();
        
    }
    
    // Staff Methods
    
    public boolean addWorkers(workers w)
    {
        if(workers.add(w))
        {
            return true;
        }
        return false;
    }
    public boolean editWorkets(workers w)
    {
        int index = 0;
        for (workers worker : workers) {
            if(worker.getStaffId().equals(w.getStaffId()))
            {
                workers.set(index, w);
                return true;
            }
            index++;
        }
        return false;
        
    }
    public boolean deleteWorker(workers w)
    {
        if (workers.remove(w)) {
            return true;
        }
        return false;
    }
    
    
    public boolean addCashier(Cashier w)
    {
        if(cashiers.add(w))
        {
            return true;
        }
        return false;
    }
    public boolean editCashier(Cashier w)
    {
        int index = 0;
        for (Cashier worker : cashiers) {
            if(worker.getStaffId().equals(w.getStaffId()) && worker.getLogin().equals(w.getLogin()))
            {
                cashiers.set(index, w);
                return true;
            }
            index++;
        }
        return false;
        
    }
    public boolean deletCashier(Cashier w)
    {
        if (cashiers.remove(w)) {
            return true;
        }
        return false;
    }
    
    
    
}
