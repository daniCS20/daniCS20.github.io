

import java.util.Scanner;
public class MyMethods {
	  
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
   	 
    	 int x=input.nextInt();
   	  int y= input.nextInt();
        System.out.println(MyMethods(x,y));

    }
    public static int  MyMethods( int x,  int y) {
        if (x > y) {
            return x;
        }
        if (y > x) {
            return y;
        }
        else {
            return 0;
        }
    }
}




/*import java.util.Scanner;
public class MyMethods {

	public static void main(String[] args) {
		System.out.println(MyMethods(2,3));
	}
	
	Scanner input = new Scanner(System.in);
	
	public static int MyMethods(int x,int y) {
		if (x > y) {
			return x;
		}
		if (y > x) {
			return y;
		}
		else {
			return 0;
		}
		}
		
	}
*/
