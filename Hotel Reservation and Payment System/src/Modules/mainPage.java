/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

import Routing.optionProcessing;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author YAN
 */
public class mainPage {

    public static void initialize() {

        int option = -1;
        String userOptionChecker;
        int userOption = 0;
        String pattern = "\\d+";
        BufferedReader br;
        Scanner w = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("              Main Page              ");
        System.out.println("-------------------------------------");

        System.out.println("Please select the module:");
        try {
            br = new BufferedReader(new FileReader("./files/Main Page.txt"));
            String contentLine = br.readLine();
            while (contentLine != null) {
                System.out.println(contentLine);
                contentLine = br.readLine();
                option++;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        do {
            System.out.print("Your option: ");
            userOptionChecker = w.next();
            if (Integer.parseInt(userOptionChecker) > option || userOptionChecker.equals("") || Integer.parseInt(userOptionChecker) < 0) {
                System.out.println("*----------------------------------------*");
                System.out.println("|  Please enter only available options.  |");
                System.out.println("*----------------------------------------*");
            }
            if (Integer.parseInt(userOptionChecker) == 0) {
                System.out.println("");
                System.out.println("************** WARNING **************");
                System.out.println("**          Shutting Down          **");
                System.out.println("*************************************");
                break;
            }
            userOption = Integer.parseInt(userOptionChecker);
            System.out.println("");
            optionProcessing.goFromMainPage(userOption);
        } while (userOption < 0 || userOption > option);
    }
}
