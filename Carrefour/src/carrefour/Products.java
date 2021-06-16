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
public class Products {
    private String productName;
    private String productId;
    private int quantity;
    private double price;
    private String company;
    private double gst;
    
    
 /**
  * 
  * @param productName
  * @param quantity
  * @param price
  * @param company
  * @param shop
  * @param pNum 
  */
    
    
    
    public Products(String productName, int quantity, double price, String company, String shop , String pNum) {
        this.productName = productName;
        this.productId = ("P-" + shop + "-"+ pNum).replaceAll("\\s+", "");
        this.quantity = quantity;
        this.price = price;
        this.company = company;
    }
    /**
     * 
     * @return 
     */
    public String getProductName() {
        return productName;
    }
    /**
     * 
     * @return 
     */
    public String getCompany() {
        return company;
    }
    /**
     * 
     * @return 
     */
    public String getProductId() {
        return productId;
    }

/**
 * getter for quantity
 * @return int
 */
    public int getQuantity() {
        return quantity;
    }
/**
 * getter for price
 * @return int
 */
    public double getPrice() {
        return price;
    }
/**
 * getter for company
 * @return string
 */
    public String getCompaney() {
        return company;
    }
    /**
     * 
     * @return 
     */
    public double getGst() {
        return gst;
    }
    
    //setters

    
/**
 * setter for quantity
 * 
 * 
 * @param quantity 
 */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
/**
 * setter for price
 * @param price 
 */
    public void setPrice(int price) {
        this.price = price;
    }

    
    
}
