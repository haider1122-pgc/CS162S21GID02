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
    private double purchasingPrice;
    private double sellingPrice;
    private String company;
    private double gst;
    
    
 /**
  * 
  * @param productName
  * @param quantity
  * @param purchasingPrice
  * @param company
  * @param shop
  * @param pNum 
  */
    
    
    
    public Products(String productName, int quantity, double purchasingPrice,double sellingPrice, String company, String shopid , String pNum) {
        this.productName = productName;
        this.productId = ("P-" + shopid + "-"+ pNum).replaceAll("\\s+", "");
        this.quantity = quantity;
        this.purchasingPrice = purchasingPrice;
        this.sellingPrice = sellingPrice;
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
 * getter for purchasingPrice
 * @return int
 */
    public double getPrice() {
        return purchasingPrice;
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
 * setter for purchasingPrice
 * @param purchasingPrice 
 */
    public void setPrice(int purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    
    
}
