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
    
    private String shopId;
    private String floorNumber;
    private int shopRent;
    private int tax;
    private int arae;
    private String shopType;
    
  
    /**
     * 
     */
    public Shops() {
    }
    /**
     * 
     * @param shopId
     * @param shopType
     * @param floor
     * @param area
     * @param rent
     * @param tax 
     */
    public Shops(String shopId,String shopType,String floor,int area,int rent,int tax) {
        this.shopId=shopId;
        this.shopType=shopType;
        this.arae=area;
        this.floorNumber=floor;
        this.shopRent=rent;
        this.tax=tax;
        
      
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
    public int getShopRent() {
        return shopRent;
    }

    /**
     * 
     * @return int
     */
    public int getTax() {
        return tax;
    }

    /**
     * 
     * @return int
     */
    public int getArae() {
        return arae;
    }

    /**
     * 
     * @return string
     */
    public String getShopType() {
        return shopType;
    }
    
    
    
    
    
    
   
    
    
}
