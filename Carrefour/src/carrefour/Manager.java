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
public class Manager extends Management {

    private String managerId;
    private String managerPassword;
    boolean test1;

    //getters
    /**
     * getter for manager id
     *
     * @return string
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * getter for manager password
     *
     * @return
     */
    public String getManagerPassword() {
        return managerPassword;
    }

    //setters 
    /**
     * setter foe manager Id
     *
     * @param managerId
     */
    public void setManagerId(String managerId) {

        boolean check1 = false, check = true;
        int size = managerId.length();
        if (managerId.charAt(0) == 'M') {
            if (managerId.charAt(1) == 'G') {
                if (managerId.charAt(2) == 'R') {
                    if (managerId.charAt(3) == '-') {
                        check1 = true;
                    }
                }
            }
        }
        if (check1 == true) {
            for (int i = 4; i <= size - 4; i++) {
                if ((managerId.charAt(i) >= 'a' && managerId.charAt(i) <= 'z') || (managerId.charAt(i) >= 'A' && managerId.charAt(i) <= 'Z')) {
                    check = false;
                    break;
                }
            }
        }
        if (check1 == true && check == true) {
            this.managerId = managerId;
            test1 = true;

        } else {

            test1 = false;

        }

    }

    /**
     * setter for manager password
     *
     * @param managerPassword
     */
    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;

    }

    /**
     * function to check whether the CEO id is valid or not
     *
     * @return
     */
    public boolean managerIdValidation() {

        return test1 == true;

    }
}
