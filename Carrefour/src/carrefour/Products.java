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
    private String productId;
    private String shopId;
    private int quantity;
    private int price;
    private String companey;
    private int gst;
    boolean test1;
    
    //getters
/**
 * getter for product id
 * @return string
 */
    public String getProductId() {
        return productId;
    }
/**
 * getter for shop id
 * @return 
 */
    public String getShopId() {
        return shopId;
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
    public int getPrice() {
        return price;
    }
/**
 * getter for companey
 * @return string
 */
    public String getCompaney() {
        return companey;
    }

    public int getGst() {
        return gst;
    }
    
    //setters

    /**
     * setter for id
     * @param productId 
     */
    public void setProductId(String productId) {
         boolean check1 = false, check = true;
        int size = productId.length();
        if (productId.charAt(0) == 'S') {
            if (productId.charAt(1) == 'T') {
                if (productId.charAt(2) == 'F') {
                    if (productId.charAt(3) == '-') {
                        check1 = true;
                    }
                }
            }
        }
        if (check1 == true) {
            for (int i = 4; i <= size - 4; i++) {
                if ((productId.charAt(i) >= 'a' && productId.charAt(i) <= 'z') || (productId.charAt(i) >= 'A' && productId.charAt(i) <= 'Z')) {
                    check = false;
                    break;
                }
            }
        }
        if (check1 == true && check == true) {
            this.productId = productId;
            test1= true;

        } else {

            test1 = false;

        }
        
        
    }
/**
 * setter for shop id
 * @param shopId 
 */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
/**
 * setter for quantity
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
/**
 * setter for companey
 * @param companey 
 */
    public void setCompaney(String companey) {
        this.companey = companey;
    }
/**
 * setter for gst
 * @param gst 
 */
    public void setGst(int gst) {
        this.gst = gst;
    }
    /**
     * function to check whether the shop id is valid or not
     *
     * @return
     */
    public boolean staffIdValidation() {

        return test1 == true;

    }
    
}
