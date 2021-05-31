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
public class CEO extends Person {

    private String ceoId;
    private String ceoPassword;
    boolean test;

    //getters
    /**
     * getter for CEO id
     *
     * @return String
     */
    public String getCeoId() {
        return ceoId;
    }

    /**
     * getter for CEO Password
     *
     * @return String
     */
    public String getCeoPassword() {
        return ceoPassword;
    }

    //setters
    /**
     * setter for CEO Id
     *
     * @param ceoId
     */
    public void setCeoId(String ceoId) {
        boolean check1 = false, check = true;
        int size = ceoId.length();
        if (ceoId.charAt(0) == 'C') {
            if (ceoId.charAt(1) == 'E') {
                if (ceoId.charAt(2) == 'O') {
                    if (ceoId.charAt(3) == '-') {
                        check1 = true;
                    }
                }
            }
        }
        if (check1 == true) {
            for (int i = 4; i <= size - 4; i++) {
                if ((ceoId.charAt(i) >= 'a' && ceoId.charAt(i) <= 'z') || (ceoId.charAt(i) >= 'A' && ceoId.charAt(i) <= 'Z')) {
                    check = false;
                    break;
                }
            }
        }
        if (check1 == true && check == true) {
            this.ceoId = ceoId;
            test = true;

        } else {

            test = false;

        }
        this.ceoId = ceoId;
    }

    /**
     * setter for CEO Password
     *
     * @param ceoPassword
     */
    public void setCeoPassword(String ceoPassword) {
        this.ceoPassword = ceoPassword;
    }

    /**
     * function to check whether the CEO id is valid or not
     *
     * @return
     */
    public boolean ceoIdValidation() {

        return test == true;

    }

}
