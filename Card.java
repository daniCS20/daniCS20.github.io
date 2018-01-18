
/*
* Card.java
* Author: Daniela Murcia
* Submission Date: December 5, 2017
*
* Purpose: The purpose of this class is get the type of the cards. 
* Here I had to initialize variables in Card constructors, check if 
* if cards are the same using a boolean method and I had to complete a 
* toString method. This was a pretty easy class that was straight forward and consisted of simpl
* instructions. 
*
* Statement of Academic Honesty:
*
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
* written consent from the Department of Computer Science.
*/



import javafx.scene.image.Image;

public class Card {
	
	/**
	 * Suits of a card deck
	 */
	public static enum Suit{
		CLUB, DIAMOND, HEART, SPADE
	}
	
	/**
	 * Types of cards
	 */
	public static enum Type {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}

	private Suit suit;
	private Type type;
	
	/**
	 * Create a card with Type type and Suit suit
	 * @param type type of the card
	 * @param suit suit of the card
	 */
	public Card(Type type, Suit suit) {
		this.type=type;
		this.suit=suit;
	}
	
	/**
	 * Checks if this card equals card c
	 * @param c Card to compare
	 * @return boolean true if the suit and type of the cards match
	 */
	
	public boolean equals(Card c) { //check if same
		if (c==null) { //check if null 
			return false;
		}
		if ((this.type==c.type) && (this.suit==c.suit)) { //make condition if same 
		return true;
		}
		else {
	
			
		return false; //replace this line with your own code
	}
	}
	/**
	 * Returns a String representation of the Card (ex. ACE OF SPADES)
	 */
	@Override
	public String toString() {
		return type + " OF " + suit +"S";
	}
	//public String toString(): Returns a string representation of the current card (ex. “ACE OF SPADES”)
	//Hint: Print the enumeration values themselves to make this easier.
	//(Note the “S” at the end of the suit. We don’t print ACE OF SPADE 
	//– We concatenate an “S” to the end. Also note the numbers that are printed.)
	/**
	 * @return the suit of the card
	 */
	public Suit getSuit() {
		return suit ;
	}
	
	/**
	 * @return the type of the card
	 */
	public Type getType() {
		return type;
	}
	/**
	 * Don't worry about this method. This is for the Graphical User Interface
	 * @return the image of the card
	 */
	public Image getImage() {
		return new Image("file:classic-cards/" + this.getType() + "" + this.getSuit() + ".png");
	}
}
