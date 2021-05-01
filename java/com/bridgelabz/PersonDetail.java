package com.bridgelabz;



public class PersonDetail {
    /**
     * assigning all the details giving its value
     *
     * creating contact details inside AddressBook
     */
    public String firstname;
    public String lastname;
    public String address;
    public String city;
    public String state;
    public int zipcode;
    public String phoneNumber;

    /**
     * assigning variables to each details
     * @param firstname
     * @param lastname
     * @param address
     * @param city
     * @param state
     * @param zipcode
     * @param phoneNumber
     */
    public PersonDetail(String firstname, String lastname, String address, String city,
                        String state, int zipcode, String phoneNumber ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
    }

    /**
     * display the contact created in address book.
     */
    public void printAddressBook() {
        System.out.println("First Name:" + this.firstname);
        System.out.println("Last Name:" + this.lastname);
        System.out.println("Address:" + this.address);
        System.out.println("State:" + this.state);
        System.out.println("City:" + this.city);
        System.out.println("Zipcode:" + this.zipcode);
        System.out.println("Phone Number:" + this.phoneNumber);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname() {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname() {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState() {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "AddressBook [" + "firstname=" + firstname + ", lastname=" + lastname +
                ", city=" + city + ", state=" + state + ", zipcode=" + zipcode +
                ", phoneNumber=" + phoneNumber + "]";
    }
}