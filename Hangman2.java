/*
* Hangman2.java
* Author: Daniela Murcia
* Submission Date: 10/19/2018
*
* Purpose: The purpose of this program is to create a Hangman game utilizing loops, strings, methods, etc in
* order to allow the user to play the game.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
Page 7 of 8
CSCI 1301: Introduction to Computing and Programming Fall 2018 Project 3: Hangman 2.0 (A Word Guessing Game)
* or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based * on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department * of Computer Science at the University of Georgia.
*/
import java.util.Scanner;
public class Hangman2 {



	private static final boolean testingMode = true;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean wordFound;
		boolean letterFound=false;
		String secretWord = "";
		String gameWord = "-";
		int guessesLeft = 20;
		String userSpaces = "";
		int numSpacesAllowed=0;
		int indexSpot=0 ;
		int gameCountMaxGames = 1;
       int totalScore=0;
       String new0="";
		 String new2="";
		 String new3 ="";
		 String new4="";
		 String new5="";
		 int roundScore=0;

		 char zoom;
		 String word="";
		while(gameCountMaxGames <= 20)
		{
			//System.out.println("HI");
			secretWord = RandomWord.newWord();
			gameCountMaxGames++;
			while(secretWord.length() != gameWord.length())
			{
				gameWord += "-";
			}
			System.out.println("The word is: " +gameWord);

			//testing mode condition
			if (testingMode) {
				System.out.println("The secret word is: " +secretWord);
			}

			while(!((numSpacesAllowed >= 1) && (numSpacesAllowed<= secretWord.length()))) {
				System.out.println("Enter the number of spaces allowed " );
				numSpacesAllowed=input.nextInt();
				if(!((numSpacesAllowed >= 1) && (numSpacesAllowed<= secretWord.length()))) {
					//if numSpacesAllowed invalid, ask the user to try again
					System.out.println("Invalid input. Try again. ");
				}



			}
			input.nextLine();
			//rounds
			while((guessesLeft> 0) && !(gameWord.equals(secretWord))) {




			//check for letter
			System.out.println("Please enter the letter you want to guess: ");
			char letter = input.nextLine().charAt(0);
			//check if guess is in word


				System.out.println("Enter the number of spaces you want to check(seperate by spaces)");
				//letterFound=false;
				//System.out.println("Letter found is false");
				//boolean userSpacesCheckMe=input.hasNextInt();
				//input.nextLine();
				userSpaces=input.nextLine();

				//
				//check if letter is in the guess



				//error handling attempt 2
				while(true) {
				if ((Character.isLetter(letter) && (!(userSpaces.length()==((numSpacesAllowed * 2)-1))))) {
				System.out.println("invalid input. Try Again. ");
				break;
				}


				else {
					break;
				}
				}
				//System.out.println("user " + userSpaces);
				// ******ERROR HANDLING**********



				for (int i= 0; i < userSpaces.length(); i++) {

					int whiteSpaces=userSpaces.indexOf(" ");

					if ((whiteSpaces==-1)&& (userSpaces.length()==1)) {
						break;
					}
					//if (userSpaces.length()==1) {
						//break;
					//}

				String b=userSpaces.substring(i,whiteSpaces);
				if (b.length() > 1) {
					System.out.println("Invalid input. Try again.");
				}
				 // if whiteSpace==-1 --> prove no white spaces exist


				else {
					break;
				}


				}


								//******END OF ERROR HANDLING********

								//returns the index that needs to be checked

				 int length=userSpaces.length();

				 for (int i=0; i <length; i++) {
					 word="";
					 if (Character.isLetter(userSpaces.charAt(i)))
					 {
						 System.out.println("your input input is invalid. Try again.");
					 }

					 //indexspot in the int that represents what index needs to be evaluated
					 indexSpot =  Character.getNumericValue(userSpaces.charAt(i));
					//insert loop
					 if (indexSpot < 0) {
						 continue;

					 }
					 if (!(secretWord.charAt(indexSpot)==letter)) {
						 continue;

					 }

//a loop that will add the letter to gameWord(hyphen word) if indexes match up
					 for (int j=0; j < gameWord.length(); j++) {

					//System.out.println(((j==indexSpot) && (secretWord.charAt(j)==letter)));

					 if ((j==indexSpot) && (secretWord.charAt(j)==letter)){

						 word+=letter;


						 int countTrue=0;
						 int countFalse=0;
						 //nested check of true or false to manage letterFound results
						 if ((j==indexSpot) && (secretWord.charAt(j)==letter)) {
							 countTrue++;
						 }
						 else {
							 countFalse++;
						 }
						 if (countTrue>=1) {
						 letterFound=true;
						 }
						 else {
							 letterFound=false;
							 word+=gameWord.charAt(j);
						 }

						 //*RECENT CHANGE ^^^*
					 }
					else {

						word+=gameWord.charAt(j);
					}



				 }
					 gameWord=word;

					 //herewe will calculate the wrong score
					 roundScore=((guessesLeft * 10)/numSpacesAllowed);

				 }
				 totalScore+=roundScore;







					 //Here I am looking at the index value for the character guessed in secretNumber
					 //to the guess positions of the user , i checkequality in if statement below
					 //I use strings to move along the String.


					if (letterFound){

					 System.out.println("Your guess is in the word");
					 System.out.println("The updated word is: " + gameWord);
					 System.out.println("Guesses Remaining: " + guessesLeft);
					 letterFound=false;
					}
					else {


						//here it decrements the number of guesses and tells the user if something inputted is wrong
						if (letterFound==false) {
	guessesLeft--;
						System.out.println("Your letter was not found in the spcaes you provided.");
						System.out.println("Guesses Remaining: " + guessesLeft);

					}

					}

				 if (Character.isLetter(letter) && userSpaces.length()==((numSpacesAllowed * 2)-1)) {
					for (int w =0; w < secretWord.length(); w++) {
						char a=secretWord.charAt(w);



							//check if new word == the word you want
							if (gameWord.equals(secretWord)) {
								 wordFound=true;
								System.out.println("You have guessed the word! Congratulations");
								System.out.println("Score for this round: " + roundScore);
								System.out.println("Total Score: " + totalScore);
								//ask the user to play again
								System.out.println("Do you want to play again?");
								String userAnswer=input.nextLine();
								    if (userAnswer.equalsIgnoreCase("y")) {
								    	secretWord = RandomWord.newWord();
										gameCountMaxGames++;
										while(secretWord.length() != gameWord.length())
										{
											gameWord += "-";
										}
										System.out.println("The word is: " +gameWord);

								    	numSpacesAllowed=0;
										gameCountMaxGames++;
										guessesLeft=20;
										numSpacesAllowed=-1;

								    }
								    if (userAnswer.equalsIgnoreCase("n")) {
								    	System.exit(0);
								    }
								//reset everything
								//ask the user to play again

							}
							else if (guessesLeft==0) {
								System.out.println("you have failed to guess the word.... :( ");
								//ask the user to play again
								System.out.println("Score for this round: " + 0);
								System.out.println("Total Score " + totalScore);
								System.out.println("Do you want to play again?");
								String userAnswer=input.nextLine();
								    if (userAnswer.equalsIgnoreCase("y")) {
								    	//numSpacesAllowed=0;


										gameCountMaxGames++;
										guessesLeft=20;
										roundScore=0;
										secretWord = RandomWord.newWord();
										gameCountMaxGames++;
										while(secretWord.length() != gameWord.length())
										{
											gameWord += "-";
										}
										System.out.println("The word is: " +gameWord);

										continue;//reset the score to 0
								    }
								    if (userAnswer.equalsIgnoreCase("n")) {
								    	System.exit(0);
								    }
								wordFound=false;
								//here it decrements the number of guesses and tells the user if something inputted is wrong
								if (wordFound=false) {
			guessesLeft--;
								System.out.println("Your letter was not found in the spcaes you provided.");
								System.out.println("Guesses Remaining: " + guessesLeft);

							}

					}

					}

				}
				else  {
					System.out.println("Invalid input. Try again ");
				}
			//outside of here add the wordFound true and rh =e print scores, etc.

		}

	}


	}
}
