/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Haider
 */
public class Shops {
    
    private String shopName;
    private String shopId;
    private String area;
    private String shopType;
    private String floorNumber;
    private String shopNumber;
    private double shopRent;
    private double tax;
    private boolean availableStatus = false;
    private boolean usingStatus = false;
    
    
    List<Products> products = new ArrayList<Products>();
    
  
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
    public Shops(String shopNumber, String floorNumber,String area, String shopType, double rent, double tax) {
        if (floorNumber.equalsIgnoreCase("ground")) {
            floorNumber = "0";
        }
        this.shopId = floorNumber + "-" + shopNumber;
        this.shopNumber = shopNumber;
        this.floorNumber = floorNumber;
        this.shopRent = rent;
        this.tax = tax;
        this.area = area;
        this.shopType = shopType;
        this.availableStatus = true;
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
    public boolean addProduct(Products p)
    {
        
        if(products.add(p))
        {
            return true;
        }
        return false;
        
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the shopType
     */
    public String getShopType() {
        return shopType;
    }

    /**
     * @param shopType the shopType to set
     */
    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * @return the availableStatus
     */
    public boolean isAvailableStatus() {
        return availableStatus;
    }

    /**
     * @param availableStatus the availableStatus to set
     */
    public void setAvailableStatus(boolean availableStatus) {
        this.availableStatus = availableStatus;
    }
    
    
    
   
    
    
}
