/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import java.util.Date;

/**
 *
 * @author Haider
 */
class Person {

    //declearing datamembers
    private String name;
    private String fatherName;
    private String cnic;
    private char gender;
    private String email;
    private String phone;
    private String address;
    private String country;
    private String city;
    private Date dob;
    protected boolean t1, t2, t3, t4, t5;

    //creating getters for all data members
    /**
     * getter for name
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * getter for father name
     *
     * @return String
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * getter for CNIC
     *
     * @return String
     */
    public String getCnic() {
        return cnic;
    }

    /**
     * getter for gender
     *
     * @return char
     */
    public char getGender() {
        return gender;
    }

    /**
     * getter for email
     *
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * getter for phone number
     *
     * @return String
     */
    public String getPhone() {
        return phone;
    }

    /**
     * getter for address
     *
     * @return String
     */
    public String getAddress() {
        return address;
    }

    /**
     * getter for country
     *
     * @return String
     */
    public String getCountry() {
        return country;
    }

    /**
     * getter for city
     *
     * @return String
     */
    public String getCity() {
        return city;
    }

    /**
     * getter for date of birth
     *
     * @return String
     */
    public Date getDob() {
        return dob;
    }

    //////////////////////////////////////////////////////////////////////////////creating setters for data members
    /**
     * setter for name
     *
     * @param name
     */
    public void setName(String name) {
        boolean flag = true;
        if (name.length() <= 50) {
            for (int i = 0; i < name.length(); i++) {
                if (!((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) == ' '))) {
                    flag = false;
                }

            }
        }
        if (flag == true) {
            this.name = name;
            t1 = true;

        } else {

            t1 = false;
        }
    }

    /**
     * setter for father name
     *
     * @param fatherName
     */
    public void setFatherName(String fatherName) {
        boolean flag = true;
        if (fatherName.length() <= 50) {
            for (int i = 0; i < fatherName.length(); i++) {
                if (!((fatherName.charAt(i) >= 'a' && fatherName.charAt(i) <= 'z') || (fatherName.charAt(i) >= 'A' && fatherName.charAt(i) <= 'Z') || (fatherName.charAt(i) == ' '))) {
                    flag = false;
                }

            }
        }
        if (flag == true) {
            this.fatherName = fatherName;
            t2 = true;

        } else {

            t2 = false;
        }

    }

    /**
     * setter for CNIC
     *
     * @param cnic
     */
    public void setCnic(String cnic) {
        int size = cnic.length();

        boolean check = true;
        if (size == 13) {
            for (int i = 0; i < size; i++) {
                if (!(cnic.charAt(i) >= '0' && cnic.charAt(i) <= '9')) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                this.cnic = cnic;
                t3 = true;
            } else {
                t3 = false;
            }

        } else {
            t3 = false;
        }
    }

    /**
     * setter for gender
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * setter for email
     *
     * @param email
     */
    public void setEmail(String email) {
        int size = email.length();
        int index = 0;
        boolean check = true;
        if (email.charAt(0) == '@') {
            check = false;
        } else {
            for (int i = 1; i < size; i++) {
                if (email.charAt(i) == '@') {
                    index = i;
                    break;
                }
            }
            if (email.charAt(index) == '.') {
                check = false;
            }
        }
        if (check == true) {
            this.email = email;
            t4 = true;
        } else {
            t4 = false;

        }
    }

    /**
     * setter for phone number
     *
     * @param phone
     */
    public void setPhone(String phone) {
        int size = phone.length();

        boolean check = true;
        if (size == 11) {
            for (int i = 0; i < size; i++) {
                if (!(phone.charAt(i) >= '0' && phone.charAt(i) <= '9')) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                this.phone = phone;
                t5 = true;
            } else {
                t5 = false;
            }

        } else {
            t5 = false;
        }
    }

    /**
     * setter for address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * setter for country
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * setter for city
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * setter for dob
     *
     * @param dob
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    //function to test whether all data is validated or not
    /**
     * function to validate that all the data is authentic
     *
     * @return Boolean
     */
    public boolean validation() {
        //JOptionPane.showMessageDialog(null,t1+"\n"+t2+"\n"+t3+"\n"+t4+"\n"+t5+"\n");
        return t1 == true && t2 == true && t3 == true && t4 == true && t5 == true;

    }

}
