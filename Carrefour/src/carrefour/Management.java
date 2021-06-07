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
public class Management extends Person {

    private String designation;
    private int salary;

    //getters
    /**
     * getter for designation
     *
     * @return string
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * getter for salary
     *
     * @return
     */
    public int getSalary() {
        
        return salary;
    }

    //setters
    /**
     * setter for designation
     *
     * @param designation
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * setter for salary
     *
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
