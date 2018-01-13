/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_05_payroll_class;

/**
 *
 * @author bluebackdev
 */
public class Payroll {
    String strName;
    
    int intIDNumber;
    
    double dblPayrate;
    double dblHoursWorked;
    
    /**
     * Constructor takes two parameters, employee name and employee ID number.
     * @param name Employee name.
     * @param idNum Employee ID number.
     */
    public Payroll(String name, int idNum) {
        strName = name;
        intIDNumber = idNum;
        dblPayrate = 0.0;
        dblHoursWorked = 0.0;
    }
    
    /**
     * No-argument constructor that sets all variables to zeroed values.
     */
    public Payroll() {
        strName = "";
        intIDNumber = 0;
        dblPayrate = 0.0;
        dblHoursWorked = 0.0;
    }
    
    /**
     * Method sets employee name as a string object.
     * @param name 
     */
    public void setName(String name) {
        strName = name;
    }
    
    /**
     * Method returns employee name as a string object.
     * @return 
     */
    public String getName() {
        return strName;
    }
    
    /**
     * Method sets employee ID number with integer parameter.
     * @param idNum Employee ID number.
     */
    public void setIDNumber(int idNum) {
        intIDNumber = idNum;
    }
    
    /**
     * Method returns employee ID number as an integer value.
     * @return 
     */
    public int getIDNumber() {
        return intIDNumber;
    }
    
    /**
     * Method sets employee payrate using a double parameter input.
     * @param payrate Employee payrate.
     */
    public void setPayrate(double payrate) {
        dblPayrate = payrate;
    }
    
    /**
     * Method returns employee payrate as a double value.
     * @return 
     */
    public double getPayrate() {
        return dblPayrate;
    }
    
    /**
     * Method sets employee's hours worked with a double input.
     * @param hoursWorked Employee hours worked.
     */
    public void setHoursWorked(double hoursWorked) {
        dblHoursWorked = hoursWorked;
    }
    
    /**
     * Method returns employee hours worked as a double value.
     * @return 
     */
    public double getHoursWorked() {
        return dblHoursWorked;
    }
    
    /**
     * Method calculates gross pay from payrate and hours worked and returns
     * gross pay as a double value.
     * @return 
     */
    public double getGrossPay() {
        double dblGrossPay;
        
        dblGrossPay = dblHoursWorked * dblPayrate;
        
        return dblGrossPay;
    }
}
