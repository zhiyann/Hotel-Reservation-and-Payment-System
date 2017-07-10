/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author YAN
 */
public class user {

    private String name;
    private String address;
    private String country;
    private String gender;
    private String identityNumber;
    private String nationality;
    private String identity;
    private int contactNumber;
    public static ArrayList<user> userDB = new ArrayList<>();

    public static ArrayList<? extends user> getUserDB() {
        return userDB;
    }

    public static void setUserDB(user u) {
        userDB.add(u);
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void createUser() {

        Scanner w = new Scanner(System.in);
        String value;

        do {
            System.out.print("Enter your Name: ");
            value = w.nextLine();
            if (value.equals("")) {
                System.out.println("*---------------------------*");
                System.out.println("|  Please enter your Name.  |");
                System.out.println("*---------------------------*");
            }
        } while (value.equals(""));
        setName(value);

        do {
            System.out.print("Enter your Gender (Male/Female): ");
            value = w.nextLine();
            if (value.equals("") || !(value.equalsIgnoreCase("female") || value.equalsIgnoreCase("male"))) {
                System.out.println("*---------------------------------------*");
                System.out.println("|  Please enter either male or female.  |");
                System.out.println("*---------------------------------------*");
            }
        } while (value.equals("") || !(value.equalsIgnoreCase("female") || value.equalsIgnoreCase("male")));
        setGender(value);

        do {
            System.out.print("Enter your Contact Number (8XXXXXXX/9XXXXXXX): ");
            value = w.nextLine();
            if (value.equals("") || Integer.parseInt(value) < 80000000 || Integer.parseInt(value) > 99999999) {
                System.out.println("*-------------------------------------*");
                System.out.println("|  Please enter your Contact Number.  |");
                System.out.println("*-------------------------------------*");
            }
        } while (value.equals("") || Integer.parseInt(value) < 80000000 || Integer.parseInt(value) > 99999999);
        setContactNumber(Integer.parseInt(value));

        do {
            System.out.print("Enter your Address: ");
            value = w.nextLine();
            if (value.equals("")) {
                System.out.println("*------------------------------*");
                System.out.println("|  Please enter your Address.  |");
                System.out.println("*------------------------------*");
            }
        } while (value.equals(""));
        setAddress(value);

        do {
            System.out.print("Enter your Country: ");
            value = w.nextLine();
            if (value.equals("")) {
                System.out.println("*------------------------------*");
                System.out.println("|  Please enter your Country.  |");
                System.out.println("*------------------------------*");
            }
        } while (value.equals(""));
        setCountry(value);

        do {
            System.out.print("Enter your Identity Type (Passport/Driving License): ");
            value = w.nextLine();
            if (value.equals("") || !(value.equalsIgnoreCase("passport") || value.equalsIgnoreCase("driving license"))) {
                System.out.println("*----------------------------------------------------*");
                System.out.println("|  Please enter either passport or driving license.  |");
                System.out.println("*----------------------------------------------------*");
            }
        } while (value.equals("") || !(value.equalsIgnoreCase("passport") || value.equalsIgnoreCase("driving license")));
        setIdentity(value);

        do {
            System.out.print("Enter your Identity Number: ");
            value = w.nextLine();
            if (value.equals("")) {
                System.out.println("*--------------------------------------*");
                System.out.println("|  Please enter your Identity Number.  |");
                System.out.println("*--------------------------------------*");
                System.out.println("");
            }
        } while (value.equals(""));
        setIdentityNumber(value);

        do {
            System.out.print("Enter your Nationality: ");
            value = w.nextLine();
            if (value.equals("")) {
                System.out.println("*----------------------------------*");
                System.out.println("|  Please enter your Nationality.  |");
                System.out.println("*----------------------------------*");
            }
        } while (value.equals(""));
        setNationality(value);
    }
}
