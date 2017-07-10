/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

import Routing.optionProcessing;
import User.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author YAN
 */
public class printUserInformationPage {

    public static void initialize() {
        int option = -1;
        int userOption;

        BufferedReader br;
        Scanner w = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("        Print Information Page       ");
        System.out.println("-------------------------------------");

        System.out.println("Please select the module:");
        try {
            br = new BufferedReader(new FileReader("./files/Print User Information.txt"));
            String contentLine = br.readLine();
            while (contentLine != null) {
                System.out.println(contentLine);
                contentLine = br.readLine();
                option++;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        String pattern = "[0-9]+";
        do {
            System.out.print("Your option: ");
            userOption = w.nextInt();
            if (!(userOption < 0 || userOption > option)) {
                System.out.println("");
                optionProcessing.goFromPrintUserInformationPage(userOption);
            } else {
                System.out.println("*----------------------------------------*");
                System.out.println("|  Please enter only available options.  |");
                System.out.println("*----------------------------------------*");
            }
        } while (userOption < 0 || userOption > option);
    }

    public static void printStaffInformation() {
        System.out.println("-------------------------------------");
        System.out.println("          Staff Information          ");
        System.out.println("-------------------------------------");
        for (user u : user.getUserDB()) {
            if (u instanceof staff) {
                staff s = (staff) u;
                System.out.println("Staff ID " + s.getEmployeeId() + ":");
                System.out.println("Name: " + s.getName());
                System.out.println("Gender: " + s.getGender());
                System.out.println("Contact Number: " + s.getContactNumber());
                System.out.println("Address: " + s.getAddress());
                System.out.println("Country: " + s.getCountry());
                System.out.println("Identity Type: " + s.getIdentity());
                System.out.println("Identity Number: " + s.getIdentityNumber());
                System.out.println("Nationality: " + s.getNationality());
                System.out.println("");
            }
        }
    }

    public static void printGuestInformation() {
        System.out.println("-------------------------------------");
        System.out.println("          Guest Information          ");
        System.out.println("-------------------------------------");
        for (user u : user.getUserDB()) {
            if (u instanceof guest) {
                guest g = (guest) u;
                System.out.println("Guest ID " + g.getGuestId() + ":");
                System.out.println("Name: " + g.getName());
                System.out.println("Credit Card: " + g.getCreditCard());
                System.out.println("Gender: " + g.getGender());
                System.out.println("Contact Number: " + g.getContactNumber());
                System.out.println("Address: " + g.getAddress());
                System.out.println("Country: " + g.getCountry());
                System.out.println("Identity Type: " + g.getIdentity());
                System.out.println("Identity Number: " + g.getIdentityNumber());
                System.out.println("Nationality: " + g.getNationality());
                System.out.println("");
            }
        }

    }
}
