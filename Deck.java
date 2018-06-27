/*
* Deck.java
* Author: Daniela Murcia
* Submission Date: December 5 , 2017
*
* Purpose: The purpose of this class was to return the card at the top of the deck 
* and to also check if the deck was empty. If so, I had to return an error 
* message--which I almost forgot to do. I created a swap method that would switch two ints
* when passed. Had to make a shift method which was a bit challenging that would swap 
* cards at different indices, which the purpose of it in relation to blackjack still perplexes me a tad. 
* Adding a card to the bottom was pretty standard. 
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
	Random rand = new Random();
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
		
		for(int i =0; i<suits.length; i++)
		{
			for(int j = 0; j<types.length; j++)
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
		if (numCardsInDeck==0) {
			System.out.println("Error. The deck is empty");
			return null;
			//how do we return an error message 
		}
		
		numCardsInDeck--;
	return cards[numCardsInDeck]; //card on top
	}
/*//if (numCardsInDeck> 0) {
	
	//numCardsInDeck--;
	//return cards[52];
//}
		if (numCardsInDeck==0) {
			return null;
		//return error message
		
		}
		else {
			numCardsInDeck--;
		return cards[52];
		
		
		}
	} */

	  /**
     * Swaps card at a with card at b
     * @param a card to be swapped with b
     * @param b card to be swapped with a
     */
     private void swap(int a, int b) {
                     Card tempA = cards[a];
                     cards[a] = cards[b];
                     cards[b] = tempA;
     }
    
     /**
     * Shifts all the cards in the deck right by one place
     */
     private void shiftRightOne() {
    	 Card[] newCards = new Card[this.cards.length + 1];
 		
 		int n = this.numCardsInDeck;
 		
 		if (this.numCardsInDeck == 52)
 		{
 			System.out.println("Deck is full");
 		}
 		else
 		{
 			
 			for (int count  = 0; count < this.cards.length; count++)
 			{
 				newCards[count] = this.cards[count];
 			}
 			
 			for (int count2 = n; count2 > 0; count2--)
 			{
 				newCards[count2] = newCards[count2-1]; 
 			}
 		}
 		
 		cards = newCards;
     }             
     /**
     * Add c to the bottom of the deck
     * Print "Deck Full" when count equals the size of the deck
     * @param c card to add
     */         
     public void addToBottom(Card c) {
    if (this.numCardsInDeck == 52)
 		{
 			System.out.println("Deck is full");
 		}
 		else
 		{
 			
 			shiftRightOne();
 			cards[0]=c;
 			numCardsInDeck++;
 		}
     }

    	 
    

     /**
     * Shuffles the deck by swapping the cards 100 times
     */
     public void shuffle() { //do n num of swaps 
                     for(int i = 0; i < 100; i++)  {
 swap(rand.nextInt(numCardsInDeck - 1) , rand.nextInt(numCardsInDeck - 1));
                     }
     }
     /**
     * Shuffles the deck by swapping cards n times
     * @param n number of swaps
     */
     public void shuffle(int k) { //pass n 
                     for(int i = 0; i < k; i++) {
     swap(rand.nextInt(numCardsInDeck - 1), rand.nextInt(numCardsInDeck - 1)); //swap 
                     }
     }

}
