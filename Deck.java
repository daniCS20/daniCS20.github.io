/*
 * Deck.java
 * Author: Zack Hanville
 * Submission Date: 07/23/18
 *
 * Purpose: This program is the deck object for BlackJack and 
 * includes methods for drawing, swapping, shifting, and 
 * shuffling cards in the deck. 
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

import java.util.Random;

/**
 * Class representing a standard 52 card deck. Allows users to shuffle, draw,
 * and add cards to the bottom for the purpose of playing various card games.
 */
public class Deck {

	/**
	 * Cards in the deck
	 */
	private Card [] cards;

	/**
	 * The number of cards in the physical deck on the table.
	 */
	private int numCardsInDeck;

	/**
	 * Create a standard 52 card deck w/ one of each type (Ace, King, Queen...) for each Suit (Hearts, Spades ..)
	 */
	public Deck() {

		Card.Suit [] suits = Card.Suit.values(); //creates an array of all of the Suits
		Card.Type [] types = Card.Type.values(); //creates an array of all of the Types
		cards = new Card[suits.length*types.length]; //sets the size of cards to 52 (types & suits)
		numCardsInDeck = 0;

		for (int i = 0; i < suits.length; i++)
		{
			for (int j = 0; j < types.length; j++)
			{
				//Assigns 52 unique cards to the cards deck
				cards[numCardsInDeck] = new Card(types[j], suits[i]); 
				numCardsInDeck++; //increments the number of cards in the deck
			}
		}	
	}
	/**
	 * Draws card from the top
	 * @return the top card
	 */
	public Card draw() {
		if (this.numCardsInDeck == 0)
		{
			System.out.println("Error: No cards left in deck.");	// deck cannot be empty to draw 
			return null;
		}
		else 
		{
			Card cardDrawn = cards[numCardsInDeck - 1];    
			numCardsInDeck--;
			return cardDrawn;	// returns card drawn from deck 
		}
	}

	/**
	 * Swaps card at a with card at b
	 * @param a card to be swapped with b
	 * @param b card to be swapped with a
	 */ 
	private void swap(int a, int b) {	// swaps card a and card b
		Card swap = this.cards[a];
		this.cards[a] = this.cards[b];
		this.cards[b] = swap;
	}

	/**
	 * Shifts all the cards in the deck right by one place
	 */
	private void shiftRightOne() {
		if (numCardsInDeck == 52)
		{
			System.out.println("Error: Deck full.");	// cards cannot shift if deck full
		}
		else
		{
			for (int i = numCardsInDeck - 1; i >= 0; i--)
			{
				this.cards[i + 1] = this.cards[i];	// shifts cards to the right 
			}
		}
	}	
	/**
	 * Add c to the bottom of the deck
	 * Print "Deck Full" when count equals the size of the deck
	 * @param c card to add
	 */	
	public void addToBottom(Card c) {
		if (numCardsInDeck == 52)
		{
			System.out.println("Error: Deck full.");	// card cannot be added to bottom if deck full
		}
		else
		{
			this.shiftRightOne();	// shifts cards
			this.cards[0] = c;
			this.numCardsInDeck++;
		}
	}

	/**
	 * Shuffles the deck by swapping the cards 100 times
	 */
	public void shuffle() {    // shuffles cards 100 times 
		this.shuffle(100);    
	}
	/**
	 * Shuffles the deck by swapping cards n times
	 * @param n number of swaps
	 */ 
	public void shuffle(int n) {	// shuffles cards n times
		Random x = new Random();
		int a = 0;
		int b = 0;
		for(int i = 0; i < n; i++) {
			a = x.nextInt(cards.length);
			b = x.nextInt(cards.length);
			swap(a,b);
		}

	}

}
