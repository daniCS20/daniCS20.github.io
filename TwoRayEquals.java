//Daniela Murcia 
//8.29 

import java.util.Arrays;
import java.util.Scanner;
public class TwoRayEquals {
	
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int[][] a = new int[3][3];
int[][] b = new int[3][3];
System.out.println("Enter list1: ");

for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a[0].length; j++) {
a[i][j] = input.nextInt();
}
}
System.out.println("Enter list2: ");

for (int i = 0; i < b.length; i++) {
for (int j = 0; j < b[0].length; j++) {
	b[i][j] = input.nextInt();
}
}
//AHHH I NEED TO CALL THE METHOD 
//make boolean conditional statement that will print first statement if true 
if(Equals(a , b))
	
System.out.print("the two arrays are identifcial");
else 
System.out.println("the two arrays are not identifcial");
}
			
	

public static boolean Equals(int[][] m1 , int[][]  m2) {
	if (m1==m2) 
return true;
{
if (m1==m2 &&  true) {
System.out.println("the two arrays are identifcial"); 
if (m1 != m2 && false)
System.out.println("arrays are not identical");
                      }
return true;
	                                                            }
		
		}
         }
 
				
			
		
		
