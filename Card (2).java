/*
* Card.java
* Author: Daniela Murcia
* Submission Date: 12/4/2018
*
* Purpose: This class represents the different types of cards that 
* can be used to play Blackjack. Here we just have to make sure that we 
* can return the right kind of format, and check if two cards are equal. 
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
	//sets initial values of instance vars
	public Card(Type type, Suit suit) {
	this.type=type;
	this.suit=suit;
	}
	
	/**
	 * Checks if this card equals card c
	 * @param c Card to compare
	 * @return boolean true if the suit and type of the cards match
	 */
	
	//checks if suits and type equal
	public boolean equals(Card c) {
		return this.type.equals(c.type) && this.suit.equals(c.suit);
	}
		/*if (c==null) { //check if null 
			return false;
		}
		if (this.getSuit()==c.getSuit() && this.getType()==c.getType()) {
			return true;
		}
		else 
		return false; //replace this line with your own code
	}
	*/
	/**
	 * Returns a String representation of the Card (ex. ACE OF SPADES)
	 */
	@Override
	public String toString() {
		
		//String a = this.getType() + " of " + this.getSuit() + "s";
		return type + " of " + suit + "S";
	}
	
	/**
	 * @return the suit of the card
	 */
	public Suit getSuit() {
		return suit;
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
