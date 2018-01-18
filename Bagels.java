
/*
* Bagels.java
* Author: Daniela Murcia
* Submission Date: Nov 8 , 2017 *
* Purpose: The purpose of this program is to test 
* player, validator, and engine class in order for a
* user to play a game. The game consists of guessing 
* a number that is randomly selected. This class requires
* me to create loops and call different methods that are in objects.
* I found the act of actually remembering the functions of validator 
* a bit tricky since we didn't write validator. 
*
* Statement of Academic Honesty: *
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on a programming project created by the Department of
* Computer Science at the University of Georgia. Any publishing
* of source code for this project is strictly prohibited without
* written consent from the Department of Computer Science. */








import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Bagels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
//just need a main method here
		
	
	
//boolean trueOrFalseVal= Validator.validateGuess( e.getSecretNumber() ,e.convertNumToDigitArray(p.askForGuess()) , e.getNumDigits());
	

System.out.println("Welcome!");	
boolean playerWins=true;
//make a loop to check if player wants to play again 
				//make loop if player wants to reset 
boolean playAgain=true;
  
String next="";
while(playAgain) {  
	Engine e= new Engine();
	Player p= new Player();
  
	int count=1;

//user enters digits
	System.out.println("Enter the number of digits to use: " ); 
	int a=input.nextInt(); //random var to store user's numDigits
	input.nextLine();
	e.setNumDigits(a);
	System.out.println("Enter the player's name: ");
	String name=input.nextLine();
	p.setName(name); //assigns user val to name var in Person class
	boolean joe= true;
	//while loop for p
	while(joe) {
		System.out.println("Start game #"+count );
		
		int numberOfMovesTakenToWin=0;
	e.generateNewSecret();
	boolean why=true;
	while(why) {
		//increment moves 
		 numberOfMovesTakenToWin++;
	String t = p.askForGuess(); //obtain guess from method 
	//store user guess
	int guess[] = e.convertNumToDigitArray(t);
	Validator.validateGuess(e.getSecretNumber(), guess, a);
	//here you check if user guess is == to random array of ints
	if (Arrays.equals(e.getSecretNumber(),guess)==true) {
		p.updateStats(numberOfMovesTakenToWin);
		//generic statements--call methods from player/engine
		System.out.println("Congratulations! You won in " + numberOfMovesTakenToWin + " moves");
		System.out.println("Statistics for: " + p.getName());
	    System.out.println("Number Of digits: " + e.getNumDigits() );
	    System.out.println("Games completed: " + p.getGamesCompleted());
	    System.out.println("Fastest win: " + p.getFastestWin());
	    System.out.println("p	-	Play again" );
	    System.out.println("r	-	Reset game" );
	    System.out.println("q	-	Quit" );
        
	    System.out.println("What would you like to do?" );
	    String userInput=input.nextLine();
	    next=userInput;
	    //play again
	if (userInput.equals("p")) {
		count++; //increment plays
	    break;	
	}
	//first break
    else if (userInput.equals("r")) {
    	break;
	}
    else {
    	//exit program
    	System.out.println("Goodbye!");
    	System.exit(0);
    }
	}

}
	//loop exit for reset
	if (next.equals("r")) {
		break;
	}
}
}
	}
}
