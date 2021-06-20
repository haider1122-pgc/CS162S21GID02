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
public class clientRequest  extends Request{
    private String ShopID;
    private String aboutShop;

    
   
/**
 * 
 * @param aboutShop 
 */
    public void setAboutShop(String aboutShop) {
        this.aboutShop = aboutShop;
    }

    /**
     * @return the ShopID
     */
    public String getShopID() {
        return ShopID;
    }

    /**
     * @param ShopID the ShopID to set
     */
    public void setShopID(String ShopID) {
        this.ShopID = ShopID;
    }

    /**
     * @return the aboutShop
     */
    public String getAboutShop() {
        return aboutShop;
    }
}
