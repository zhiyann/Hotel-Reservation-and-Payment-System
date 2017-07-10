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
import java.util.Scanner;

/**
 *
 * @author YAN
 */
public class registrationPage {

    public static void initialize() {
        int option = -1;
        int userOption;

        BufferedReader br;
        Scanner w = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("        User Registration Page       ");
        System.out.println("-------------------------------------");

        System.out.println("Please select the module:");
        try {
            br = new BufferedReader(new FileReader("./files/User Registration.txt"));
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
                optionProcessing.goFromRegistrationPage(userOption);
            } else {
                System.out.println("*----------------------------------------*");
                System.out.println("|  Please enter only available options.  |");
                System.out.println("*----------------------------------------*");
            }
        } while (userOption < 0 || userOption > option);
    }

    public static void createStaff() {
        System.out.println("Staff Registration");
        staff s = new staff();
        s.createUser();
        s.createStaff();
        user.setUserDB(s);
    }

    public static void createGuest() {
        System.out.println("Guest Registration");
        guest g = new guest();
        g.createUser();
        g.createGuest();
        user.setUserDB(g);
    }
}
