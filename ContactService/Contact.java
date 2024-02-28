package com.myclass;

public class Contact {
    private final String contactID; 
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address){
        //requirement 1
        if(contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("invalid contact ID");
        }
        //requirement 2
        if(firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("invalid firstname");
        }
        //requirement 3
        if(lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("invalid lastname");
        }
        //requirement 4
        if(phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("invalid phone #");
        }
        //requirement 5
        if(address == null || address.length() > 30) {
            throw new IllegalArgumentException("invalid address");
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }
    

    //Getters and Setters
    public String getContactID() {
        return contactID;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("invalid first name");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("invalid last name");
        }
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("invalid phone number");
        }
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("invalid address");
        }
        this.address = address;
    }
}

