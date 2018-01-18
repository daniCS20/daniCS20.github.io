/*
*Palindrome.java
* Author: Daniela Murcia
* Submission Date: September 28 , 2017
* Purpose: The purpose of this program was the practice utilizing loops, 
* conditional statements, and creating algorithms without relying on string methods. 
* What this program does is it evaluates a user inputted integer, and determines
* whether or not it is a palindrome;the number is the same backwards. After it determines
* that, it adds up all of the integers from one, until it reaches original integer.
* In addition, this program has to check whether or not the user inputted number is 
* positive, and if it is not, then the user must try again. I utilized System.exit(); 
* in order to terminate the program if the number entered did not fit desired criteria. 
* In the end, the program returns 3 lines that reveal the number, whether or not the integer 
* is a palindrome, and then what the total sum of those numbers are. 
* Statement of Academic Honesty: *
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia. */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
//var declaration
System.out.print("Please enter an integer > 0: ");
int num = input.nextInt();
int fun=num;
int newNum = num;
int numOther=0;
int numm;

if (num<=0) {
	System.out.println("Sorry , you must enter an integer greater than zero.");
	System.exit(num);
}
//check if palindrome
    while(num > 0) 
{ 
  numm = num % 10; 
  numOther= numOther * 10 + numm; 
  num = num / 10; 
}
    if(numOther == newNum) {
  System.out.println("The integer " + newNum + " is a palindrome."); 
  int temp;
  int sum=0;
  int count=0;
  //calculate palindrome sum
  while(count < newNum)
  {   temp=newNum-1;
  	sum +=  newNum + temp; 
  	newNum = newNum-2;
  }
  	
  	System.out.println("The sum of the numbers from 1 to " + fun + " is " + sum);
  	
}
else {
  System.out.println("The integer  " + newNum + " is not a palindrome."); 
}






	}
}

	
	

	
