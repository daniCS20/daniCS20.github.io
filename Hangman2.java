
/*
* Hangman2.java
* Author: Daniela Murcia
* Submission Date: 10/22/17
*
* Purpose:The purpose of this program is to prompt a user to enter a difficulty and complete 
* up top 20 games of Hangman. This program required a lot of tedious loop and nested loop building,
*  as well as string usage, conditionals, and multivarible managment. I found a lot of difficulty 
*  with curly brace. This also required us to build on swapping out words, replacing them, and
*  manipulating different variable types. 
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department * of Computer Science at the University of Georgia.
*/




import java.util.Scanner;

public class Hangman2 {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//declare vars 
	//testingMode=true;				
int numOfGames = 0;
int numTotalOfGames = 0;String secretWord = "";
String gameWord = "-";
int guessesLeft = 0;
String altStringg = "";
boolean wrong = false;
int zeroSpace = 0;
//ints for switch case
String numOfGuess = "";
int numGuessOne = 0;
int numGuessTwo = 0;
int numGuessThree = 0;
int gameCount3 = 0;
String spaces = "-"; 
char randoString= ' ';
//make a while loop that'll look at total plays 
while(numTotalOfGames <= 20) {
	if(numOfGames == 0) {
//ask about difficulty
System.out.println("Enter your difficulty: Easy (e), Intermediate (i), or Hard (h)");
if(gameWord.equals(secretWord)) {
	input.nextLine();
		}
////random word:insert from main file
altStringg = input.nextLine();
secretWord = RandomWord.newWord();
//incrememnt num of games
numTotalOfGames++;
gameWord = "-";		
//go through length of word
while(secretWord.length() != gameWord.length()) {

	gameWord += "-";
		}
guessesLeft = 0;
   while(altStringg.charAt(0) != 'h' && altStringg.charAt(0) != 'i' && altStringg.charAt(0) != 'e') {
  System.out.println("Invalid altStringg. Try again.");
//check difficulty
  System.out.println("Enter your altStringg: Easy (e), Intermediate (i), or Hard (h)");
 altStringg = input.next();
		}
if(altStringg.charAt(0) == 'e') {
	guessesLeft = 15;
              }
	if(altStringg.charAt(0) == 'i') {
    guessesLeft = 12;
			}
if(altStringg.charAt(0) == 'h') {
    guessesLeft = 10;
			}
			}
//condition for game set to zero 
if(numOfGames == 0) {
System.out.println("The secret word is: " +secretWord);
System.out.println("The word is: " +gameWord);
			}
else if(wrong ==false){
System.out.println("The updated word is: " +gameWord);
			}
numOfGuess = " ";

    while(true) {
 if((numOfGames != 0 || gameCount3 != 0)) {
System.out.println("guessesLeft Remaining: " +guessesLeft);
		   }
gameCount3++;
System.out.print("Please enter the letter you want to guess: ");
String guessString = input.next();
randoString= guessString.charAt(0);
 if(Character.isDigit(randoString)) {
System.out.println("This input is not valid. Try again.");
 continue;
			}
if(guessString.equals("solve")) {
System.out.print("Please solve the answer: ");
String solveGuess = input.next();
if(solveGuess.equals(secretWord)) {
System.out.println("You win!");
System.out.println("You have guessed the word! Congratulations");
System.out.println("Would you like to play again? Yes(y) or No(n)"); 
String playAgain = input.next();
if(playAgain.equals("n")) {
System.exit(0);

	     	}
else {
System.out.println("That is not the secret word");
numOfGames = 0;
			}
		 }
else {
System.out.println("That is not the secret word");
guessesLeft--;
numOfGames++;
continue;
		}
		}
System.out.println("Please enter the spaces you want to check. (seperated by spaces):  ");
input.nextLine();
numOfGuess = input.nextLine();
System.out.println("This input is not valid. Try again.");
continue;
    }
						
	}
	}
	}




	


   