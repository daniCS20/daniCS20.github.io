//Average Man

import java.util.Scanner;
public class AvMan {


public static void main(String[] args ) {
	Scanner input= new Scanner(System.in); {
	
//make an object
	AvMan  testObject= new AvMan();
	//constructor 
	new AvMan() {
	                 };
	
	//Print 
	testObject.dairy(); 
	System.out.println("The median dairy the average man consumes in a month is: " + testObject.dairy() + " pounds");
	
    testObject.poultry();
    System.out.println("The median poultry the average man consumes in a month is: " + testObject.poultry() + " pounds");
	
    testObject.wheat(); 
    System.out.println("The median wheat the average man consumes in a month is: " + testObject.wheat() + " pounds");
	
	testObject.fruit();
	System.out.println("The median fruit the average man consumes in a month is: " + testObject.fruit() + " pounds");

    testObject.veggies();
    System.out.println("The median veggies the average man consumes in a month is: " + testObject.veggies() + " pounds");
                     
	
//arrayList
double doubleArrayy[] = new double[] { testObject.dairy() , testObject.poultry() , testObject.wheat() , testObject.fruit() , testObject.veggies() };

		bubbleSort(doubleArrayy);
		
		System.out.println("Array after bubble sort in increasing order : ");
		for  ( double i =0;  i < doubleArrayy.length; i++ ) {
			System.out.println(" - " + doubleArrayy[(int) i] + " pounds ");
		           }
	               }
}

	private static void bubbleSort(double[] doubleArrayy) {
		double n = doubleArrayy.length;
      int temp = 0;
     
      for(int i=0; i < n; i++){
              for(int j=1; j < (n-i); j++){
                     
             if(doubleArrayy[j-1] > doubleArrayy[j]){
              temp =(int) doubleArrayy[j-1];
               doubleArrayy[j-1] = doubleArrayy[j];
              doubleArrayy[j] = temp;
                   }
              }
      }
	}
	//Methods 
	 private double dairy() {
			double dairy=( 630.00 / 12.00);
			return dairy;

		            }
		
		private double poultry() {
			double poultry=(185.00 / 12.00);
			return poultry;
			
		            }
		private double wheat() {
			double wheat=(197.00 / 12.00);
			return wheat;
		            }
	   private double fruit() {
		   double fruit=(273.00 / 12.00);
		   return fruit;
	                }
	private double veggies() {	
		double veggies=(415.00 / 12.00);
		return veggies;
		
	                }
		

                     }

