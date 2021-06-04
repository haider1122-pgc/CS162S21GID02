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
    private String shopId;
    private String clientType;
    private String shopType;
    
    //getters

    /**
     * getter for shopId
     * @return string
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * getter for clientType
     * @return string
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * getter for shop type
     * @return string
     */
    public String getShopType() {
        return shopType;
    }
    
    //setters

    /**
     * setter for shop id
     * @param shopId 
     */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    /**
     * setter for client type
     * @param clientType 
     */
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    /**
     * setter for shop type
     * @param shopType 
     */
    public void setShopType(String shopType) {
        this.shopType = shopType;
    }
    
    
}
