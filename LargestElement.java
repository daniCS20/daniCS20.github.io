import java.util.*; //imports all classes
import java.util.Scanner; 
public class LargestElement {
public static void main (String[] args) {
	Scanner input= new Scanner(System.in);
	//Goal: write a method thaT rEturns the location of the largest element in a two-dimensional array
	//make variable for rows 
	//prompt user to enter number of rows and columns
	

	System.out.print("Enter the number of rows and columns of the array");

	int rows = input.nextInt(); 
	//System.out.print(s);//make variable for columns
	int columns = input.nextInt();
	//make an array and prompt user to enter dimensions
	int[][] numbersByUser = new int[rows][columns];
	//System.out.print("Enter the number of rows and columns of the array:  ");
	//System.out.println(rows + "  and  " + columns);
	//OKAY, array list will be made here...
	System.out.println("enter the array:");
numbersByUser [0][1]=9;
	
	//int rowsValues=input.nextInt();;
	
	int nums=input.nextInt();

	
	System.out.println(nums);
	//So, before this works you're going to need a loop 
	
}
}
