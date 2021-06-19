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
public class managerRequest extends Request {
    
    private String aboutYourself;
    private String experience;
    private String previousWorkPlace;
    
    //getter setters
    
    //getter

    
    /**
     * getter for experience
     * @return string
     */
    public String getExperience() {
        return experience;
    }

    /**
     * getter for previous work place
     * @return string
     */
    public String getPreviousWorkPlace() {
        return previousWorkPlace;
    }
    
    //setters

    /**
     * setter for experiences
     * @param experience 
     */
    public void setExperience(String experience) {
        this.experience = experience;
    }

    /**
     * setter for previous workplace
     * @param previousWorkPlace 
     */
    public void setPreviousWorkPlace(String previousWorkPlace) {
        this.previousWorkPlace = previousWorkPlace;
    }

    /**
     * @return the aboutYourself
     */
    public String getAboutYourself() {
        return aboutYourself;
    }

    /**
     * @param aboutYourself the aboutYourself to set
     */
    public void setAboutYourself(String aboutYourself) {
        this.aboutYourself = aboutYourself;
    }
    
    
    
}
