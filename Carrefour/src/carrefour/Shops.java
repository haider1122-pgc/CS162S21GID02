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
    private String shopType;
    private int shopArea;
    private int shopRent;
    private int shopTax;
    boolean test1;
   //getters

    /**
     * getter for shop id
     * @return string
     */
    public String getShopId() {
        return shopId;
    }
/**
 * getter for shopType
 * @return string
 */
    public String getShopType() {
        return shopType;
    }
/**
 * getter for shop area
 * @return int
 */
    public int getShopArea() {
        return shopArea;
    }
/**
 * getter for shop rent
 * @return int
 */
    public int getShopRent() {
        return shopRent;
    }
/**
 * getter for shop tax
 * @return int
 */
    public int getShopTax() {
        return shopTax;
    }
    
    //setters
/**
 * setter for shop id
 * @param shopId 
 */
    public void setShopId(String shopId) {
         boolean check1 = false, check = true;
        int size = shopId.length();
        if (shopId.charAt(0) == 'S') {
            if (shopId.charAt(1) == 'H') {
                if (shopId.charAt(2) == 'O') {
                    if (shopId.charAt(3) == '-') {
                        check1 = true;
                    }
                }
            }
        }
        if (check1 == true) {
            for (int i = 4; i <= size - 4; i++) {
                if ((shopId.charAt(i) >= 'a' && shopId.charAt(i) <= 'z') || (shopId.charAt(i) >= 'A' && shopId.charAt(i) <= 'Z')) {
                    check = false;
                    break;
                }
            }
        }
        if (check1 == true && check == true) {
            this.shopId = shopId;
            test1= true;

        } else {

            test1 = false;

        }
        
        
    }
/**
 * setter for shop type
 * @param shopType 
 */
    public void setShopType(String shopType) {
        this.shopType = shopType;
    }
/**
 * setter for shop area
 * @param shopArea 
 */
    public void setShopArea(int shopArea) {
        this.shopArea = shopArea;
    }
/**
 * setter for shop rent
 * @param shopRent 
 */
    public void setShopRent(int shopRent) {
        this.shopRent = shopRent;
    }
/**
 * setter for shop tax
 * @param shopTax 
 */
    public void setShopTax(int shopTax) {
        this.shopTax = shopTax;
    }
    
    /**
     * function to check whether the shop id id is valid or not
     *
     * @return
     */
    public boolean staffIdValidation() {

        return test1 == true;

    }
    
}
