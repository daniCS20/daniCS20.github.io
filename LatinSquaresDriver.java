import java.util.Scanner;

public class LatinSquaresDriver {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		String config=args[0];
		//made a new obj                                                                           
		LatinSquaresGame obj1 = new LatinSquaresGame(config);

		//things im supposed to make here                                                          
		/* interpret args[0] as config --> a string that specififes the path                       
for some file is provides start config                                                             

		 */                                                                                             


		obj1.play();

	}
}   