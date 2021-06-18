/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import javax.swing.JOptionPane;

/**
 *
 * @author Haider
 */
public class Client extends Person {

    private String clientId;
    private String clientPassword;
    //list of shops add here
    private String shopID;
    private int rent;
    private int gst;
    private int shopTax;
    private int amount;
    floor f = floor.getInstance();
    private Shops shop = f.getShop(shopID);
    
    
    //getters
    /**
     * getter for client id
     *
     * @return string
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * getter for client password
     *
     * @return string
     */
    public String getClientPassword() {
        return clientPassword;
    }

    /**
     * getter for rent
     *
     * @return integer
     */
    public int getRent() {
        return rent;
    }

    /**
     * getter for gst
     *
     * @return integer
     */
    public int getGst() {
        return gst;
    }

    /**
     * getter for shop tax
     *
     * @return integer
     */
    public int getShopTax() {
        return shopTax;
    }

    /**
     * getter for amount
     *
     * @return
     */
    public int getAmount() {
        return amount;
    }

    //setters
    /**
     * setter for client id
     *
     * @param clientId
     */
    public void setClientId(String clientId) {
        boolean check1 = false, check = true;
        int size = clientId.length();
        if (clientId.charAt(0) == 'C') {
            if (clientId.charAt(1) == 'L') {
                if (clientId.charAt(2) == 'T') {
                    if (clientId.charAt(3) == '-') {
                        check1 = true;
                    }
                }
            }
        }
        if (check1 == true) {
            for (int i = 4; i <= size - 4; i++) {
                if ((clientId.charAt(i) >= 'a' && clientId.charAt(i) <= 'z') || (clientId.charAt(i) >= 'A' && clientId.charAt(i) <= 'Z')) {
                    check = false;
                    break;
                }
            }
        }
//        if (check1 == true && check == true) {
//            this.clientId = clientId;
//            test1= true;
//
//        } else {
//
//            test1 = false;
//
//        }
        
        
    }

    /**
     * setter for client password
     *
     * @param clientPassword
     */
    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    /**
     * setter for rent
     *
     * @param rent
     */
    public void setRent(int rent) {
        this.rent = rent;
    }

    /**
     * setter for gst
     *
     * @param gst
     */
    public void setGst(int gst) {
        this.gst = gst;
    }

    /**
     * setter for shop tax
     *
     * @param shopTax
     */
    public void setShopTax(int shopTax) {
        this.shopTax = shopTax;
    }

    /**
     * setter for amount
     *
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * function to check whether the client id is valid or not
     *
     * @return
     */
//    public boolean clientIdValidation() {
//
//        return test1 == true;
//
//    }
    
    
    //Methods
    
    public void addProduct(Products p)
    {
        shop.products.add(p);
        JOptionPane.showMessageDialog(null, "Product Added Successfully", "Adding Product", 2);
    }
            
}
