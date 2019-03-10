/*
 * StarGraph.java
 * Author:Daniela Murcia 
 * Submission Date: 10/11/2018 *
 * Purpose: The purpose of this program is to practice manipulating the contents
 * of an array using loops and multi-branch if/else statements as well as nested loops. 
 * The program will evaluate user inputed parameters for the x and y values, and 
 * calculate them. Then, using the y values, a loop will evaulate the value and will look
 * at the whole number in order to print out that number of stars per line. 
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

public class StarGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);



		//prompt user for nums of x vals for array
		System.out.print("Please enter the number of x values to process: ");
		int xVals=input.nextInt();
		if (xVals==0 ) {
			System.out.print("The number of x values must be an integer greater than 0.");
			System.exit(xVals);
		}
		//make arrays
		double [] xArray= new double[xVals];
		double [] yArray= new double[xVals];
		//make an x-min var 
		System.out.print("Enter a minimum value for x: ");
		double xMin=(double)input.nextDouble();
		System.out.print("Enter the amont to increment x: ");
		double incremX=input.nextDouble();
		if (incremX <=0) {
			System.out.print("The incremend must be a decimal number greater than 0.");
			System.exit((int)incremX);
		}
		double min= xMin;
		//xArray[0]=min;

		System.out.println("\n"+ "Values");
		//make a for loop that'll assign vals for x & y
		for (int i=0; i < xArray.length;i++) {
			xArray[i]= min + incremX*i;
			yArray[i]= ((20.0 * (Math.abs(Math.sin(xArray[i])))));

			//format
			System.out.printf("x: %.3f " , xArray[i]);
			System.out.printf(", y: %.3f", yArray[i]);
			System.out.print("\n");
		}

		System.out.println("\n" + "Graph");
		//nested for loops that will go through arrays to print stars
		for (int i = 0; i < xArray.length ; i++) {
			System.out.print(":");

			//FIX ERROR FOR EXAMPLE 4 THAT ADDS A STAR ON ACCIDENT
			for (int j = 0 ; j < Math.floor(yArray[i]); j++) {



				System.out.print("*");
			}
			System.out.println("");
		}
	}
}



