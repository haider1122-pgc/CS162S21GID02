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
public class Staff extends Management{
    private String staffId;
    boolean test1;
    
    //getter

    /**
     * getter for staff id
     * @return string
     */
    public String getStaffId() {
        return staffId;
    }
    //setter

    /**
     * setter for staff id
     * @param staffId 
     */
    public void setStaffId(String staffId) {
        boolean check1 = false, check = true;
        int size = staffId.length();
        if (staffId.charAt(0) == 'S') {
            if (staffId.charAt(1) == 'T') {
                if (staffId.charAt(2) == 'F') {
                    if (staffId.charAt(3) == '-') {
                        check1 = true;
                    }
                }
            }
        }
        if (check1 == true) {
            for (int i = 4; i <= size - 4; i++) {
                if ((staffId.charAt(i) >= 'a' && staffId.charAt(i) <= 'z') || (staffId.charAt(i) >= 'A' && staffId.charAt(i) <= 'Z')) {
                    check = false;
                    break;
                }
            }
        }
        if (check1 == true && check == true) {
            this.staffId = staffId;
            test1= true;

        } else {

            test1 = false;

        }
        
        
    }
     /**
     * function to check whether the staff id is valid or not
     *
     * @return
     */
    public boolean staffIdValidation() {

        return test1 == true;

    }
    
    
}
