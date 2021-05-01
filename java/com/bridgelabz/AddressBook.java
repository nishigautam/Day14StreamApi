package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * the below method is for adding the contact into address book
 */
public class AddressBook implements AddressBookAdd {
    List<PersonDetail> contact = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    /**
     * UC2 : to add contact of a person in Address Book.
     */
    @Override
    public void addContact() {
        System.out.println("Enter Firstname:");
        String firstname = input.nextLine();

        System.out.println("Enter Lastname:");
        String lastname = input.nextLine();
        /**
         * UC6: refactor the add contact function
         * to check no duplicate firstname or lastname exists.
         */
        for(int check = 0; check < contact.size(); check++) {
            if(contact.get(check).getFirstname().equalsIgnoreCase(firstname)) {
                if(contact.get(check).getLastname().equalsIgnoreCase(lastname)) {
                    System.out.println("Name Already Exist.! Please try again.. : ");
                    return;
                }
            }
        }

        System.out.println("Enter Address:");
        String address = input.nextLine();

        System.out.println("Enter City:");
        String city = input.nextLine();

        System.out.println("Enter State:");
        String state = input.nextLine();

        System.out.println("Enter ZipCode:");
        int zipcode = input.nextInt();

        System.out.println("Enter PhoneNumber:");
        String phoneNumber = input.nextLine();

        PersonDetail personDetail = new PersonDetail(firstname, lastname, address, city, state, zipcode, phoneNumber);
        contact.add(personDetail);
        System.out.println(" Firstname=" + firstname + ", Lastname=" + lastname + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode +
                ", PhoneNumber=" + phoneNumber);
        System.out.println("Contact Added Successfully");
    }


    /**
     * UC3: performing the operation for edit contact for the existing contact.
     *
     * @param firstname
     *
     */
    @Override
    public void editContact(String firstname) {
        for (int i = 0; i < contact.size(); ++i) {
            if( contact.get(i).getFirstname().equalsIgnoreCase(firstname)) {
                PersonDetail personDetail = contact.get(i);
                System.out.println(personDetail.getFirstname() + "Edit your detail :");
                System.out.println(personDetail.getFirstname() + "Edit your Address :");
                input.next();
                String address = input.nextLine();
                personDetail.setAddress();
                System.out.println( personDetail.getFirstname() + " " + "Edit your city :");
                input.next();
                String city = input.nextLine();
                personDetail.setCity();
                System.out.println( personDetail.getFirstname() + " "  + "Edit your State :");
                input.next();
                String state = input.nextLine();
                personDetail.setState();
                System.out.println( personDetail.getFirstname() + " " + "Edit your zipcode :");
                input.next();
                int zipcode = input.nextInt();
                personDetail.setZipcode(zipcode);
                System.out.println( personDetail.getFirstname() + " " + "Edit your Phone Number :");
                input.next();
                String phoneNumber = input.nextLine();
                personDetail.setPhoneNumber();
                System.out.println( personDetail.getFirstname() + " " + "AddressBook Updated Successfully.!");
            }
        }
    }

    /**
     * UC4: performing the operation for delete contact from the existing contact.
     *
     */
    @Override
    public void deleteContact(String firstname) {
        for (int i = 0; i < contact.size(); i++) {
            if(contact.get(i).getFirstname().equalsIgnoreCase(firstname)) {
                PersonDetail personDetail = contact.get(i);
                contact.remove(personDetail);
                System.out.println("Contact Deleted Successfully.!");
            }
        }
    }

    /**
     * UC8: Search a person in a city or state accross the multiple AddressBook
     *
     * @param firstname
     */
    @Override
    public void searchPersonByCity(String firstname) {
        List<PersonDetail> personList = contact.stream().filter(person1 -> person1.getFirstname().equalsIgnoreCase(firstname)).collect(Collectors.toList());
        personList.stream().forEach(System.out::println);
    }

    @Override
    public void searchPersonByState(String firstname) {
        List<PersonDetail> personList = contact.stream().filter(person1 -> person1.getFirstname().equalsIgnoreCase(firstname)).collect(Collectors.toList());
        personList.stream().forEach(System.out::println);
    }

    /**
     * UC9: View a person by city or state accross the multiple AddressBook
     *
     * @param city and state
     */
    @Override
    public void viewByCity(String city) {
        List<PersonDetail> personList = contact.stream().filter(person1 -> person1.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
        personList.stream().forEach(System.out::println);
        Map<String, PersonDetail> map = personList.stream().collect(Collectors.toMap(PersonDetail::getFirstname, personDetail -> personDetail));
        System.out.println();
    }

    @Override
    public void viewByState(String state) {
        List<PersonDetail> personList = contact.stream().filter(person1 -> person1.getState().equalsIgnoreCase(state)).collect(Collectors.toList());
        personList.stream().forEach(System.out::println);
        Map<String, PersonDetail> map = personList.stream().collect(Collectors.toMap(PersonDetail::getFirstname, personDetail -> personDetail));
        System.out.println();
    }

    /**
     *
     * @param = display the contact which has been added or updated.
     *
     */
    public void display() {
        for ( PersonDetail personDetail : contact ) {
            System.out.println(personDetail);
        }
    }
}