package com.addressbook;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
        ArrayList<Contacts> book = new ArrayList<>();
        static Scanner sc = new Scanner(System.in);
        public void addDetails()
        {

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

        public void editDetails() {

                System.out.println("Confirm your first name to edit details: ");
                String name = sc.next();

                for (int i = 0; i < book.size(); i++) {
                        if (book.get(i).getFirstname().equals(name)) {
                                System.out.println("Select form below to change: ");
                                System.out.println(
                                        "\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
                                int e = sc.nextInt();

                                switch (e) {
                                        case 1:
                                                System.out.println("Enter first name");
                                                book.get(i).setFirstname(sc.next());
                                                break;
                                        case 2:
                                                System.out.println("Enter Last name");
                                                book.get(i).setLastname(sc.next());
                                                break;
                                        case 3:
                                                System.out.println("Enter address");
                                                book.get(i).setAddress(sc.next());
                                                break;
                                        case 4:
                                                System.out.println("Enter city");
                                                book.get(i).setCity(sc.next());
                                                break;
                                        case 5:
                                                System.out.println("Enter state");
                                                book.get(i).setState(sc.next());
                                                break;
                                        case 6:
                                                System.out.println("Enter email");
                                                book.get(i).setEmail(sc.next());
                                                break;
                                        case 7:
                                                System.out.println("Enter Zip");
                                                book.get(i).setZip(sc.nextInt());
                                                break;
                                        case 8:
                                                System.out.println("Enter phone number");
                                                book.get(i).setPhonenumber(sc.nextInt());
                                                break;
                                }

                                System.out.println(book);

                        } else
                                System.out.println("Enter valid First name");
                }

        }
        public static void main(String[] args) {
                System.out.println("Welcome to Address Book Program in AddressBookMain");

                AddressBookMain details = new AddressBookMain();
                details.addDetails();
        }
}
