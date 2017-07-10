/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.util.Scanner;

/**
 *
 * @author YAN
 */
public class guest extends user {

    private String creditCard;
    private String privileged;
    private int guestId;
    private static int guestCount = 1;

    public static int getGuestCount() {
        return guestCount;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getPrivileged() {
        return privileged;
    }

    public void setPrivileged(String privileged) {
        this.privileged = privileged;
    }

    public void createGuest() {

        String value;
        Scanner w = new Scanner(System.in);

        do {
            System.out.print("Enter your Credit Card: ");
            value = w.nextLine();
            if (value.equals("")) {
                System.out.println("*---------------------------------*");
                System.out.println("|  Please enter your Credit Card. |");
                System.out.println("*---------------------------------*");
            }
        } while (value.equals(""));
        setGuestId(guestCount);
        setCreditCard(value);
        guestCount++;
        System.out.println("Guest " + this.getName() + " is created successfully!");
        System.out.println("");
    }
}
