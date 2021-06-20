/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Haider
 */
public class Manager extends Management {

    private String managerId;
    private String managerPassword;
    
    floor f = floor.getInstance();
    Login login = Login.getInstance();
   
    
    boolean test1;

    //getters
    /**
     * getter for manager id
     *
     * @return string
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * getter for manager password
     *
     * @return
     */
    public String getManagerPassword() {
        return managerPassword;
    }

    //setters 
    /**
     * setter foe manager Id
     *
     * @param managerId
     */
    public void setManagerId(String managerId) {

        boolean check1 = false, check = true;
        int size = managerId.length();
        if (managerId.charAt(0) == 'M') {
            if (managerId.charAt(1) == 'G') {
                if (managerId.charAt(2) == 'R') {
                    if (managerId.charAt(3) == '-') {
                        check1 = true;
                    }
                }
            }
        }
        if (check1 == true) {
            for (int i = 4; i <= size - 4; i++) {
                if ((managerId.charAt(i) >= 'a' && managerId.charAt(i) <= 'z') || (managerId.charAt(i) >= 'A' && managerId.charAt(i) <= 'Z')) {
                    check = false;
                    break;
                }
            }
        }
        if (check1 == true && check == true) {
            this.managerId = managerId;
            test1 = true;

        } else {

            test1 = false;

        }

    }

    /**
     * setter for manager password
     *
     * @param managerPassword
     */
    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;

    }

    /**
     * function to check whether the manager id is valid or not
     *
     * @return boolean
     */
    public boolean managerIdValidation() {

        return test1 == true;

    }
    
    
    //Methods
    public boolean addShop(Shops s)
    {
        if(f.addShop(s))
        {
            return true;
            
        }
        return false;
    }
    public boolean deleteShop(Shops s)
    {
        if(f.deleteShop(s))
        {
            return true;
            
        }
        return false;
    }
    public boolean updateShop(Shops s)
    {
        if(f.updateShop(s))
        {
            return true;
            
        }
        return false;
    }
    
    
    //Staff Methods
    
    
    @SuppressWarnings({"unchecked", "unchecked"})
    public boolean addWorkers(workers w)
    {
        if (login.addWorkers(w)) {
            return true;
        }
        return false;
    }
    public boolean editWorkers(workers w)
    {
        if(login.editWorkets(w))
        {
            return true;
        }
        return false;
        
    }
    public boolean deleteWorkers(workers w)
    {
        if(login.deleteWorker(w))
        {
            return true;
        }
        return false;
        
    }
    
    
    
    public boolean addCashier(Cashier w)
    {
        if (login.addCashier(w)) {
            return true;
        }
        return false;
    }
    public boolean editCashier(Cashier w)
    {
        if(login.editCashier(w))
        {
            return true;
        }
        return false;
        
    }
    public boolean deleteCashier(Cashier w)
    {
        if(login.deletCashier(w))
        {
            return true;
        }
        return false;
        
    }
    
    
}
