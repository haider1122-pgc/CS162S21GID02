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
public class Cashier extends Staff {

    private int counterNo;
    private String login;
    private String password;
    //getters

    /**
     * getter for counter no
     *
     * @return int
     */
    public int getCounterNo() {
        return counterNo;
    }

    /**
     * getter for login
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     * getter for pass
     *
     * @return
     */
    public String getPassword() {
        return password;
    }
    //setters

    /**
     * setter for counter no
     *
     * @param counterNo
     */
    public void setCounterNo(int counterNo) {
        this.counterNo = counterNo;
    }

    /**
     * setter for login
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * setter for password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
