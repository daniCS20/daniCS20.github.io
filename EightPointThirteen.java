//Daniela Murcia 
//8.13 
//Goal: write method that returns largest element in 2-dimensional array
import java.util.Scanner;
public class EightPointThirteen {
	 Scanner input = new Scanner(System.in);
     System.out.print("Enter the number of rows and columns of the array: ");
	   //Read no.of rows
    int rows  = input.nextInt();
    //Read no.of columns
    int columns = input.nextInt();

	
	public static void main (String[] args) {
	
        //Read the input from the console
      
    

        public static int[] locateLargest(double[][] a)
        {

            int maxRow=-1,maxCol=-1;
            double maxVal=-1;

            for (int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < a[i].length; j++)
                {
                    if (a[i][j] > maxVal)
                    {
                        maxRow = i;
                        maxCol = j;
                        maxVal = a[i][j];
                    }
                }
            }

            return new int[]{maxRow,maxCol};
        }

}
