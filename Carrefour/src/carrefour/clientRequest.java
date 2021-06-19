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
    private double rent;
    private String aboutShop;

    
    /**
     * 
     * @param rent 
     */
    public void setRent(double rent) {
        this.rent = rent;
    }
/**
 * 
 * @param aboutShop 
 */
    public void setAboutShop(String aboutShop) {
        this.aboutShop = aboutShop;
    }
}
