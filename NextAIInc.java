/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nextaiinc;

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class NextAIInc {


    public void calculateWeeklyPay(double basePay, int hoursWorked) {
        
        if (basePay < 30000) {
            System.out.println("Error: Base pay must not be below UGX 30,000.");
            return;
        }

        
        if (hoursWorked > 72) {
            System.out.println("Error: Hours worked must not exceed 72 hours per week.");
            return;
        }

        
        double totalPay;
        if (hoursWorked <= 48) {
            totalPay = basePay * hoursWorked;
        } else {
            int overtimeHours = hoursWorked - 48;
            totalPay = (basePay * 48) + (overtimeHours * basePay * 2);
        }

        
        System.out.printf("Total weekly pay for the contractor: UGX %.2f%n", totalPay);
    }

    
    public static void main(String[] args) {
        
        NextAIInc company = new NextAIInc();

        
        try (Scanner scanner = new Scanner(System.in)) {
            String[] contractors = {"A", "B", "C"};
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for Contractor " + contractors[i]);

                System.out.println("Enter base pay (UGX/hour): ");
                double basePay = scanner.nextDouble();

                System.out.println("Enter hours worked: ");
                int hoursWorked = scanner.nextInt();

                
                company.calculateWeeklyPay(basePay, hoursWorked);
                
                System.out.println(); 
            }
        }
    }
}
