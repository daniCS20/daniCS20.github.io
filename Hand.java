/*
 * Hand.java
 * Author: Zack Hanville
 * Submission Date: 07/23/18
 *
 * Purpose: This program is the hand object for BlackJack, and it
 * contains different methods for adding cards to the player's hand
 * and emptying the hand.
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

/**
 * 
 * @author ghyzel
 *
 */
public class Hand {

	/**
	 * The cards in the hand
	 */
	private Card [] cards;

	/**
	 * Creates an empty hand
	 */
	public Hand() {
		//Initializing an empty array. 
		//Calling cards.length on this array would return 0
		cards = new Card[0];		
	}

	/**
	 * Adds Card c to the hand
	 * 
	 * @param c card to be added
	 */
	public void addCard(Card c) {    	// adds card to hand
		Card[] cards2 = new Card[cards.length + 1];
		for (int i = 0; i < cards.length; i++)
		{
			cards2[i] = cards[i];
		}
		cards2[cards.length] = c;
		cards = cards2;	
	}

	/**
	 * @return number of cards in the hand
	 */
	public int size() {
		return cards.length;	// returns number of cards in hand 
	}

	/**
	 * Returns an array of all the cards in the hand
	 * 
	 * @return the cards in the hand
	 */
	public Card[] getCards() {
		// Ensure you return reference to the copy of the cards array
		// and not a reference actual cards array!
		Card[] cards2 = new Card[cards.length];
		for (int i = 0; i < cards.length; i++)
		{
			cards2[i] = cards[i];
		}
		return cards2;
	}

	/**
	 * Empties the hand, and returns an array containing the discarded cards.
	 * 
	 * @return the discarded cards
	 */
	public Card[] emptyHand() {    // empties the hand and returns discarded cards
		Card[] cards2 = new Card[cards.length];
		for (int i = 0; i < cards.length; i++)
		{
			cards2[i] = cards[i];
		}
		cards = new Card[0];
		return cards2;
	}

	/**
	 * Returns a String representation of the hand
	 * 
	 * E.g.
	 * 
	 * "Empty Hand"
	 * "1. ACE OF SPADES\n2. QUEEN OF HEARTS"
	 * 
	 * @return a String representing the hand
	 */
	@Override
	public String toString() {
		if (cards.length == 0)
		{
			return "Empty hand";	// hand empty if cards length = 0
		}
		else
		{
			String output = "";
			for (int i = 0; i < cards.length; i++) 
			{
				output = output + cards[i].toString();
			}
			System.out.println(output);
			return output;    // returns cards in hand as string
		}
	}
}
