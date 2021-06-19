/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import java.util.Date;

/**
 * @author Haider
 */
 abstract class Request extends Person{
     
    private Date joiningDate;
    private String prospactive;
    private String username;
    private String password;

    /**
     * @return the joiningDate
     */
    public Date getJoiningDate() {
        return joiningDate;
    }

    /**
     * @param joiningDate the joiningDate to set
     */
    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    /**
     * @return the prospactive
     */
    public String getProspactive() {
        return prospactive;
    }

    /**
     * @param prospactive the prospactive to set
     */
    public void setProspactive(String prospactive) {
        this.prospactive = prospactive;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
