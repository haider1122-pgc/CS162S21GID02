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
public class floor {
     private String floorName;
     private int floorNumber;
     private int noShops;
     
     //getters
/**
 * getter for floor name
 * @return string
 */
    public String getFloorName() {
        return floorName;
    }
/**
 * getter for floor number
 * @return int
 */
    public int getFloorNumber() {
        return floorNumber;
    }
/**
 * getter for floor no of shops
 * @return int
 */
    public int getNoShops() {
        return noShops;
    }
     
    //setters
/**
 * setter for floor name
 * @param floorName 
 */
    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }
/**
 * setter for floor number
 * @param floorNumber 
 */
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
/**
 * setter for floor no of shops
 * @param noShops 
 */
    public void setNoShops(int noShops) {
        this.noShops = noShops;
    }
    
    
}
