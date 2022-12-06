package com.addressbook;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
        public void addDetails()
        {
                ArrayList<Contacts> book = new ArrayList<>();
                Scanner sn = new Scanner(System.in);
                Contacts details = new Contacts();
                System.out.println("Enter The FirstName Name Of Person");
                details.setFirstname(sn.nextLine());
                System.out.println("Enter The LastName Of Person");
                details.setLastname(sn.nextLine());
                System.out.println("Enter the Address of The Person ");
                details.setAddress(sn.nextLine());
                System.out.println("Enter the CityName of The Person");
                details.setCity(sn.nextLine());
                System.out.println("Enter The StateName Of The Person  ");
                details.setState(sn.nextLine());
                System.out.println("Enter The Email Of the Person");
                details.setEmail(sn.nextLine());
                System.out.println("Enter The Zip Address Of The Person");
                details.setZip(sn.nextInt());
                System.out.println("Enter The PhoneNumber Of The Person");
                details.setPhonenumber(sn.nextInt());
                sn.close();

                book.add(details);
                System.out.println(book);
        }
        public static void main(String[] args) {
                System.out.println("Welcome to Address Book Program in AddressBookMain");

                AddressBookMain details = new AddressBookMain();
                details.addDetails();
        }
}
