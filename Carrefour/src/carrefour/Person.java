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
    private Date dob;


    //creating getters for all data members
    /**
     * getter for name
     *
     * @return String
     */
    public Person()
    {}

    public Person(String name, String fatherName, String cnic, char gender, String email, String phone, String address, String country, Date dob) {
        this.name = name;
        this.fatherName = fatherName;
        this.cnic = cnic;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.country = country;
        this.dob = dob;
        
    }
    
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
        this.name = name;
    }
    
    /**
     * setter for CNIC
     *
     * @param cnic
     */
    public void setCnic(String cnic) {
        this.cnic = cnic;
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
        this.email = email;
    }

    /**
     * setter for phone number
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
   
    
    
    
    
    ///////// Validators
    
    public boolean nameValidator(String name)
    {
        if(name.length()<=50)
        {
            for(int i = 0; i < name.length(); i++)
            {
                if (!((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) == ' '))) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    
    /**
     * 
     * @param number
     * @return 
     */
    public boolean numberValidator(String number)
    {
        for (int i = 0; i < number.length(); i++) {
            if (!(phone.charAt(i) >= '0' && phone.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
        
    }
    /**
     * Overloading
     * @param number
     * @param size
     * @return 
     */
    public boolean numberValidator(String number, int size)
    {
        if (number.length() == size) {
            for (int i = 0; i < number.length(); i++) {
                if (!(phone.charAt(i) >= '0' && phone.charAt(i) <= '9')) {
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public boolean emailValidator(String email)
    {
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
            if (email.charAt(index) == '.' || email.charAt(index+1) == '.') {
                check = false;
            }
        }
        return check;
    }
    
    
            

}
