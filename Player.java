

/*
* Player.java
* Author: Daniela Murcia
* Submission Date: Nov 8 , 2017*
* Purpose:The purpose of this class is to 
* store different get and set methods that 
* store information about the player such as user guess, name , 
* games completed, etc. In addition, this class holds a method that 
* will document the user's fastest time and constantly update 
* the time throughout. ALl of this is manipulated inside of Bagel. 
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


import java.util.Scanner;
public class Player {
Scanner input = new Scanner(System.in);
//declare instance variables 
private String name="";
private int fastestWin=Integer.MAX_VALUE;
private int gamesCompleted=0;




public String askForGuess() {
	//insert code 
	System.out.println("Enter your guess: ");
	String guess=input.nextLine();
	return guess;
}

public String getName() {

//insert code 
	return name;	
}

public int getFastestWin() {
	//insert code 
	return fastestWin;
}

public int getGamesCompleted() {
	//insert code
	return this.gamesCompleted;
}

public void setName(String name) {
	//insert code 
	this.name=name;
	
}

public void updateStats(int numberOfMovesTakenToWin) {
	//insert code
	//here you are incrmenting games and if the 
	//new num of moves is less, make that high score
	
	if (numberOfMovesTakenToWin < fastestWin)  {
		fastestWin=numberOfMovesTakenToWin;
	}
	gamesCompleted++;
}


}

