/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_05_payroll_class;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 */
public class JAVA_PRG_06_05_Payroll_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strTemp1;
        
        Scanner scrKeyboard = new Scanner(System.in);
        Payroll employee1 = new Payroll();
        
        System.out.println("Please enter the employee's name: ");
        strTemp1 = scrKeyboard.nextLine();
        employee1.setName(strTemp1);
        
        System.out.println("Please enter the employee's ID number: ");
        strTemp1 = scrKeyboard.nextLine();
        employee1.setIDNumber(Integer.parseInt(strTemp1));
        
        System.out.println("Please enter the employee's payrate: ");
        strTemp1 = scrKeyboard.nextLine();
        employee1.setPayrate(Double.parseDouble(strTemp1));
        
        System.out.println("Please enter the hours worked by this employee: ");
        strTemp1 = scrKeyboard.nextLine();
        employee1.setHoursWorked(Double.parseDouble(strTemp1));
        
        System.out.println("This employee's gross pay is calculated to be: $"
                + employee1.getGrossPay());
        
    }
    
}
