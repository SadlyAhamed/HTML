
package moneyexchenge;

import java.util.Scanner;

public class MoneyExchenge {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       
//       // Enter annual interest rate in percentage, e.g., 7.25%
// System.out.print("Enter annual interest rate, such as 7.25%: ");
// double annualInterestRate = sc.nextDouble();
//
// // Obtain monthly interest rate
// double monthlyInterestRate = annualInterestRate / 1200;
//
// // Enter number of years
// System.out.print(
// "Enter number of years as an integer, such as, 5: ");
// int numberOfYears = sc.nextInt();
//
// // Enter loan amount
// System.out.print("Enter loan amount, such as, 120000.95: ");
// double loanAmount = sc.nextDouble();
//
// // Calculate payment
//double monthlyPayment = loanAmount * monthlyInterestRate / (1
//- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
//       
//       double totalPayment = monthlyPayment * numberOfYears * 12;
//
//// Display results
// System.out.println("The monthly payment is " + 
// (int)(monthlyPayment * 100) / 100.0);
// System.out.println("The total payment is " + 
// (int)(totalPayment * 100) / 100.0);
       
       
       
       
       
    // Receive the amount 
// System.out.print(
// "Enter an amount in double, for example 11.56: ");
// double amount = sc.nextDouble();
//
// int remainingAmount = (int)(amount * 100);
//
//   // Find the number of one dollars
// int numberOfOneDollars = remainingAmount / 100;
// remainingAmount = remainingAmount % 100;
//
//        // Find the number of quarters in the remaining amount
// int numberOfQuarters = remainingAmount / 25;    
//           
//  remainingAmount = remainingAmount % 25;
//
//        // Find the number of dimes in the remaining amount
// int numberOfDimes = remainingAmount / 10;
// remainingAmount = remainingAmount % 10;
//
//        // Find the number of nickels in the remaining amount
// int numberOfNickels = remainingAmount / 5;
// remainingAmount = remainingAmount % 5;
//
//        // Find the number of pennies in the remaining amount
// int numberOfPennies = remainingAmount;
//
//        // Display results
// System.out.println("Your amount " + amount + " consists of");
// System.out.println(" " + numberOfOneDollars + " dollars");
// System.out.println(" " + numberOfQuarters + " quarters ");
// System.out.println(" " + numberOfDimes + " dimes");
// System.out.println(" " + numberOfNickels + " nickels");
// System.out.println(" " + numberOfPennies + " pennies");     
       
    // (Sum the digits in an integer) Write a program that reads an integer between 0 and 
//1000 and adds all the digits in the integer. For example, if an integer is 932, the 
//sum of all its digits is 14.
//Hint: Use the % operator to extract digits, and use the / operator to remove the 
//extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
//Here is a sample run:   
//       
       
        System.out.println("pls enter number : ");  
        int amount =sc.nextInt();
        
        int RemainingTaka=(amount/100);  //9
        int RemeiningFirstAmount=(amount%100);  //99
        
        int RemeiningSocendAmount=(RemeiningFirstAmount%10); //9
        
        int RemeiningThirdAmount=(RemeiningSocendAmount/1);  //9
       
       
      int  total = RemainingTaka+ RemeiningSocendAmount+RemeiningThirdAmount;
        

                
        System.out.println("RemainingTaka "+RemainingTaka);  
        System.out.println("RemeiningSocendAmount "+RemeiningSocendAmount);
        System.out.println("RemeiningThirdAmount "+RemeiningThirdAmount);
        
        System.out.println("total = " +total);
        
    }
    
}
