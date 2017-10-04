
/*
* CreditCardPayOff.java
* Author: Daniela Murcia
* Submission Date: September 4 , 2017
* Purpose: The purpose of this program is the calculate the months required to pay off a payment to the bank, 
* while simultaneously taking into account estimated time, actual time, and interest. In addition, this program forces
* the programmer to evaluate  the mathematical variables, and create an algorithm that'll compute the over payment.
* In addition, this program requires the programmer to evaluate different variable types, explore the math library,printf, 
* and more.
* 
* Statement of Academic Honesty: *
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
CSCI 1301: Project 1 Page 2
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department * of Computer Science at the University of Georgia.
*/




	import java.util.Scanner;
    public class CreditCardPayOff {
	

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	System.out.print("Principal:    " + "\t" + "\t");
		double principal =input.nextDouble();
	System.out.print("Annual Interest Rate (%):");
		double annualInterestRate =input.nextDouble();
	System.out.print("Monthly Payment: " + "\t");
		double monthlyPayment =input.nextDouble();
	System.out.print( "\n");
	
		double payOff = (java.lang.Math.log(monthlyPayment) - java.lang.Math.log(monthlyPayment - ((annualInterestRate / 1200.0) * principal))) 
			/ java.lang.Math.log((annualInterestRate/ 1200.0) + 1.0);
		double totalAmountPaid=(monthlyPayment * (Math.ceil(payOff)));
		double totalInterestPaid=totalAmountPaid - principal;
//total months minus the actual number of months w/ decimal , and then multiply that value by monthlyPayment
		double overPayement= (Math.ceil(payOff)- payOff) * monthlyPayment;
	System.out.printf("Months needed to pay Off:"  +  ((int)Math.ceil(payOff)));  System.out.print("\n");
	System.out.printf("Total Amount Paid:  " + "\t" + "$" + "%.2f", totalAmountPaid); System.out.print("\n");
	System.out.printf("Total Interest Paid:    " + "$"+  "%.2f",totalInterestPaid); System.out.print("\n");
	System.out.printf("Overpayement:" + "\t"+ "\t"+ "$" + "%.2f", overPayement);
	}

    }
