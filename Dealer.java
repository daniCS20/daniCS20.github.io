/*
* Dealer.java
* Author: Daniela Murcia
* Submission Date: 12/4/2018
*
* Purpose: The purpose of the dealer class is to create a play 
* turn method, a check if the  dealer busts its deck of cards,
*  check if the dealer is done, and then return the dealer's hand. 
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
 * The Dealer in your game of BlackJack. Draws until he/she gets 17 points or has 5 cards.
 *
 */
public class Dealer {
	/**
	 * The dealers hand
	 */
	Hand hand;
	
	/**
	 * Construct a new dealer with an empty hand
	 */
	public Dealer() {
	hand = new Hand();	
	}
	
	/**
	 * Dealer draws a card if his hand is worth less than 17 points and has less than 5 cards in in his hand.
	 * 
	 * @param deck
	 * @return
	 */
	public Card playTurn(Deck deck) {
		//return card if drawn, else null 
		if (this.hand.size() < 5 && BlackJack.getValueOfHand(this.hand) < 17)	//player draws if they have fewer than five cards and 17 points
		{
			Card card = deck.draw();
			this.hand.addCard(card);
			return card;
		}
		else
		{
			return null;
		}
	}
	
	
	/**
	 * A method to check if the dealer has busted
	 * @return boolean true if the dealer has busted
	 */
	public boolean busted() {
		//check if the dealer went over 21
		return BlackJack.getValueOfHand(this.hand) > 21;
	}
	
	/**
	 * A method to check if the dealer will draw a card.
	 * @return
	 */
	public boolean isDone() {
		//check if the dealer is done playing blackjack for said round
		return BlackJack.getValueOfHand(this.hand) < 17 && this.hand.size() < 5;
	}
	
	/**
	 * Returns the dealers cards to the deck
	 * @param d Deck to return the cards to
	 */
	public void returnCardstoDeck(Deck d) {
		//empty hand
		Card[] cardsToDeck = new Card[hand.size()];
		for (int i = 0; i < hand.size(); i++)
		{
			cardsToDeck[i] = hand.getCards()[i];
			d.addToBottom(cardsToDeck[i]);
		}
		this.hand.emptyHand();	// hand becomes empty 
		
	}
	/**
	 * @return Hand the dealer's hand
	 */
	public Hand getHand() {
		return hand;
	}
}
