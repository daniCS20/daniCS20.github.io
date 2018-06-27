/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmantest;
import java.util.Scanner;
/**
 *
 * @author STEPHEN
 */
public class HangmanTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//declare vars 
String userGuess;
String spaces;
String userPlayAgain;
String askPlayAgain;
int spacesToGuess;
int guessesLeft=1;
int gamesPlayed=0;
int possibleNumOfGames=20;
int count=0;
boolean solve= false;
//ints for switch case
int firstSpace;
int secondSpace;
int thirdSpace;
int fourthSpace;
boolean rightAnswer;
//random string value 
String gameWord = "dogo";

//make a while loop that'll look at total plays 
while (gamesPlayed <=possibleNumOfGames) {
	System.out.println("Please enter the difficulty you would like: easy (e), intermediate (i), or hard (h)");
	String userInput=input.nextLine().toLowerCase().substring(0, 1);
	if (userInput=="e") {
	guessesLeft=15;
	spacesToGuess=4;
	continue;}
	else if (userInput=="i") {
		guessesLeft=12;
		spacesToGuess=3;	
		continue;}
	else if (userInput=="h") {
		guessesLeft=12;
		spacesToGuess=2;
		continue;
	}

	//loop that'll create hyphen-spaces for letters
	int gameWordLength=gameWord.length();
     spaces="-"; 
	int i;
	 for (i=gameWordLength; i >1; i--) {
	spaces+= "-";
	 
	 }
	 System.out.println("The  word is: " + spaces);
	 System.out.println("Please enter the letter you want to guess: ");
     userGuess=input.nextLine().toLowerCase().substring(0, 1);
}
while ((guessesLeft > 0)) {
	if (spaces.equalsIgnoreCase(gameWord)) {
System.out.println("Congrats! You solved the hangman! Would you like to play again? (y) or (n) ");
userPlayAgain=input.nextLine();
         if (userPlayAgain.equals("y")) {
        	 gamesPlayed++;
        	 guessesLeft=1;
        	 break;
         }
	
         else {
        	 System.out.println("Thank you for playing!");
        	 System.exit(gamesPlayed);
         }
	
         System.out.println("You have " + guessesLeft + " guesses remaining.");
System.out.println("Which letter would you like to guess?");
userGuess = input.nextLine().trim();
if (userGuess.equalsIgnoreCase("solve")) {
System.out.println("What word would you like to guess?");
}
	
String guessWord = input.nextLine();
	if (gameWord.equalsIgnoreCase(gameWord)) {
System.out.println("Congratulations! That is the correct gameWord.");
System.out.println("Would you like to play again? (y) or (n)");
askPlayAgain = input.nextLine();
	
   if (askPlayAgain.equalsIgnoreCase("n")) {
System.exit(0);
   }
	else if (askPlayAgain.equalsIgnoreCase("y")) {
		gamesPlayed++;
		continue;
	}
	else { 
	System.out.println("That is incorrect!");
	solve = true;
	guessesLeft--;
	continue;
	}
if (userGuess.length()>1 && solve== false) {
	System.out.println("You can only guess 1 letter, please try again!");
	continue;
}
System.out.println("Which spaces would you like to guess? (Separate by spaces)");
spaces = input.nextLine().trim();
spaces = spaces.replaceAll("\\s", "");

if (spaces.length()>spacesToGuess) {
	System.out.println("You have guessed too many spaces, please guess " + spacesToGuess + " spaces!");
	continue;
}	
for (int p=0; p < spacesToGuess;p++) {
//cant use if "p" cant pass if boolean
	switch (p) {
	case(0):
	firstSpace=  Character.getNumericValue(spaces.charAt(0));	
	break;
	case(1):
	secondSpace=  Character.getNumericValue(spaces.charAt(1));	
	break;
	case(2):
	thirdSpace=  Character.getNumericValue(spaces.charAt(2));	
	break;
	case(3):
		fourthSpace=  Character.getNumericValue(spaces.charAt(3));	
		break;
		
	}
	}
if (firstSpace<0 || secondSpace<0 || thirdSpace<0 || thirdSpace<0 || firstSpace>gameWord.length()-1 || secondSpace>gameWord.length()-1 || thirdSpace>gameWord.length()-1 || thirdSpace>gameWord.length()-1) {
	System.out.println("That is not a valid space. Please try again");
	System.out.println("");
	continue;
}
if (gameWord.substring(firstSpace, firstSpace + 1).equalsIgnoreCase(userGuess)) {
	gameWord = gameWord.substring(0,firstSpace) + userGuess + gameWord.substring(firstSpace+1,gameWord.length());
	rightAnswer = true;
}
if (gameWord.substring(secondSpace, secondSpace +1).equalsIgnoreCase(userGuess)) {
	gameWord = gameWord.substring(0,secondSpace) + userGuess + gameWord.substring(secondSpace+1,gameWord.length());
		rightAnswer = true;
	}
if (spacesToGuess == 2) {
	spacesToGuess = 2;
}
else if (gameWord.substring(thirdSpace, thirdSpace+1).equalsIgnoreCase(userGuess)) {
	gameWord = gameWord.substring(0,thirdSpace) + userGuess + gameWord.substring(thirdSpace+1, gameWord.length());
		rightAnswer = true;
	}
if (spacesToGuess == 3 || spacesToGuess == 2) {
	int oof = 2;
}
else if (gameWord.substring(thirdSpace,thirdSpace+1).equalsIgnoreCase(userGuess)) {
	gameWord = gameWord.substring(0,thirdSpace) + userGuess + gameWord.substring(thirdSpace+1, gameWord.length());
	rightAnswer = true;
}
if (rightAnswer == true) {
	System.out.println("That is correct!");
	System.out.println("Your new word is " + gameWord);
	guessesLeft--;
}
else if (rightAnswer == false) {
	System.out.println("That is incorrect!");
	System.out.println("Your word is " + gameWord);
	guessesLeft--;
		}
	}
	
		}
}
}
    }
