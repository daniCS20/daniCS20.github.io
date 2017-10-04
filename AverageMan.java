import java.util.Scanner; 

public class AverageMan {
	Scanner input= new Scanner(System.in); 
//Make your constructor 
	public AverageMan() {
		//CALL METHOD
	foodMethod(foodWeekLog);
		//need your setter and getter variables
		//Setter variables=  In order for outside objects and classes to change the variables
//Getter Variables = In order to let other objects and classes have access to Dog's variables
//Setter and getter variables are useful when it comes to making methods 
		//make a method 
		//public double getWater() {
			/*return water; 
	
			
		}
}
}
*/
		//public static void  foodMethod (double foodWeekLog) {
			
		}
		//double dairy= .5 . then in the array, assign the location for dairy a numerical value. 
		//remember to print out units which is POUNDS 
double dairy = 12.11;   //input.nextDouble();
double poultry = 3.58;  //input.nextDoubl=e();
double wheat =3.79;     // input.nextDouble();
double fruit= 5.25;     //input.nextDouble();
double veggies = 7.98;  //input.nextDouble();
//make 2 dimensional array for veggies and fruit 
//an array for man's food intake
//rows is food items 
//columns = week 1
double[][] foodWeekLog = new double[5][1];
{
foodWeekLog[0][0] = dairy; 
foodWeekLog[1][0] = poultry;
foodWeekLog[2][0] = wheat;
foodWeekLog[3][0] = fruit;
foodWeekLog[4][0] = veggies;
}

public static double[][] foodMethod(double[][] foodWeekLog) {
	//System.out.println(foodWeekLog.length);
	//need to return a value ( since void is not uses) [whatever is returned MUST be of the data type declared in the method header= double values ]
//*NOTE*: MUST CALL ON THE ARRAY IN THIS METHOD 
return  (foodWeekLog); 
	
}

	}



