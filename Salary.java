
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    private double netPay;
    private int totalSalary = 100;
    private double tax = 0.30;
    public void myNetPay(int workedHours, int hourlyWage){
        //something is not logical in this code..
        workedHours = totalSalary; 
        hourlyWage = totalSalary/hourlyWage; 
        netPay = hourlyWage * totalSalary/tax; 
                System.out.println(netPay);
        }
}
//I realized that by removing the tax and inputing 10, 10 into the parameters it will equal to 1000 (not part of the exam)
