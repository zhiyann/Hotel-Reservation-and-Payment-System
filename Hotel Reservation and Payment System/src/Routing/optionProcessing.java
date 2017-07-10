/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Routing;

import Modules.*;

/**
 *
 * @author YAN
 */
public class optionProcessing {

    public static void goFromMainPage(int option) {

        switch (option) {
            case 1:
                registrationPage.initialize();
                break;
            case 2:
                printUserInformationPage.initialize();
                break;
            default:
                System.out.println("Error in processing Main Page.");
        }
    }

    public static void goFromRegistrationPage(int option) {

        switch (option) {
            case 0:
                mainPage.initialize();
                break;
            case 1:
                registrationPage.createStaff();
                registrationPage.initialize();
                break;
            case 2:
                registrationPage.createGuest();
                registrationPage.initialize();
                break;
            default:
                System.out.println("Error in processing Registration Page.");
        }
    }

    public static void goFromPrintUserInformationPage(int option) {

        switch (option) {
            case 0:
                mainPage.initialize();
                break;
            case 1:
                printUserInformationPage.printStaffInformation();
                printUserInformationPage.initialize();
                break;
            case 2:
                printUserInformationPage.printGuestInformation();
                printUserInformationPage.initialize();
                break;
            default:
                System.out.println("Error in processing Print User Information Page.");
        }
    }
}
