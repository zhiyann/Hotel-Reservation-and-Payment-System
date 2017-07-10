/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author YAN
 */
public class staff extends user {

    private static int employeeCount = 1;
    private int employeeId;

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void createStaff() {
        setEmployeeId(this.employeeCount);
        this.employeeCount++;
        System.out.println("Staff " + this.getName() + " is created successfully!");
        System.out.println("");
    }
}
