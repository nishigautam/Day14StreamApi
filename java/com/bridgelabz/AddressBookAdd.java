package com.bridgelabz;

public interface AddressBookAdd {
    /**
     * created interface for every cases in AddressBook to perform operation.
     */
    public void addContact();
    public void editContact(String firstname);
    public void deleteContact(String firstname);
    public void searchPersonByCity(String firstname);
    public void searchPersonByState(String firstname);
    public void viewByCity(String city);
    public  void viewByState(String state);
}