import java.util.Scanner;
public class LatinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);


		//create a 2-d array that can store contents from a 1d array
		int n=3;
		String[] valueString;
		System.out.println("Whats k?" );	
		int k=input.nextInt();
		//next I need to make an array that holds the whole string                             
		valueString=new String[k];
		for(int j=0; j < n; j++) {
			valueString[j]=input.next();

		}
		String[] a= new String[k];
		a[0] = "1 1 x";
		a[1] = "z 1 y";

		String[][] dubString = new String[n][n];


		for (int i = 0; i < a.length ; i++) {
			String  b=a[i];
		}
	}

	private static void toCharArray() {
		// TODO Auto-generated method stub

	}

}
