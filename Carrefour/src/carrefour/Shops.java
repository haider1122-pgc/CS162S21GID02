/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

/**
 *
 * @author Haider
 */
public class Shops {
    
    private String shopNumber;
    private String floorNumber;
    private String shopId;
    private int shopRent;
    
  
    /**
     * 
     */
    public Shops() {
    }
    /**
     * 
     * @param shopNumber
     * @param floorNumber
     * @param shopRent 
     */
    public Shops(String shopNumber, String floorNumber, int shopRent) {
        this.shopNumber = shopNumber;
        this.floorNumber = floorNumber;
        this.shopRent = shopRent;
        this.shopId = floorNumber +" "+ shopNumber;
      
    }
    
    /**
     * 
     * @param shopRent 
     */
    ///////////////////Setter (According to oop thinking)
    public void setShopRent(int shopRent) {
        this.shopRent = shopRent;
    }

    
    /////////////////Getters
    /**
     * 
     * @return 
     */
    public String getFloorNumber() {
        return floorNumber;
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
     * @return 
     */
    public int getShopRent() {
        return shopRent;
    }
    
    /**
     * 
     * @return 
     */
    public String getShopId() {
        return shopId;
    }
    
    
   
    
    
    
    
    
    
    
    
   
    
    
}
