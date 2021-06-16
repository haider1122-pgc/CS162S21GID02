/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Haider
 */
public class Shops {
    
    private String shopName;
    private String shopId;
    private String floorNumber;
    private String shopNumber;
    private double shopRent;
    private double tax;
    
    
    Set<Products> products = new HashSet<Products>();
    
  
    /**
     * 
     */
    public Shops() {
    }
    /**
     * 
     * @param shopNumber
     * @param floorNumber
     * @param rent 
     */
    public Shops(String shopNumber, String floorNumber, int rent) {
        this.shopId = floorNumber + " " + shopNumber;
        this.shopNumber = shopNumber;
        this.floorNumber = floorNumber;
        this.shopRent = rent;
    }
    /**
     * 
     * @param shopName 
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    /**
     * 
     * @return 
     */
    public String getShopName() {
        return shopName;
    }
    
    
    /**
     * 
     * @return 
     */
    public String getShopNumber() {
        return shopNumber;
    }
    
    
    
    /**
     * 
     * @return string
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * 
     * @return int
     */
    public String getFloorNumber() {
        return floorNumber;
    }

    /**
     * 
     * @return int
     */
    public double getShopRent() {
        return shopRent;
    }

    /**
     * 
     * @return int
     */
    public double getTax() {
        return tax;
    }

   
    
    //  Methods 
    
    
    
    
   
    
    
}
