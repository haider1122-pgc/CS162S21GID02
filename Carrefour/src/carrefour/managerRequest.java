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
public class managerRequest {
    private String education;
    private String experience;
    private String previousWorkPlace;
    
    //getter setters
    
    //getter

    /**
     * getter for education
     * @return string
     */
    public String getEducation() {
        return education;
    }

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
     * setter for education
     * @param education 
     */
    public void setEducation(String education) {
        this.education = education;
    }

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
    
    
    
}
