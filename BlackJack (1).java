
/*
* BlackJack.java
* Author: Daniela Murcia
* Submission Date: 12/4/2018
*
* Purpose: The purpose of this program represents the actual game. 
* We had to reset the game, make sure the deck gets shuffled,  get the value, 
* etc. This is similar to the other classes in the sense we just continue to 
* manipulate methods and fill them in, array manipulatin. 
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








import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
/**
 * Class representing a single player blackjack game
 */
public class BlackJack {
	
	private Deck deck;
	private Dealer dealer;
	private Player player;


	/**
	 * Constructs and prepares for a new game of BlackJack.
	 * Creates player, dealer and deck objects then shuffles
	 * the deck and gives both the dealer and player two cards.
	 */
	public BlackJack() {
	
		player = new Player();
        dealer = new Dealer();
        deck = new Deck();
      Hand playerHand= player.getHand();
      Hand dealerHand =dealer.getHand();
       
       
        //call shuffling deck
        deck.shuffle();
       
        
        
        //draw 2x cards
        for (int i = 0; i < 2; i++)
		{
			player.getHand().addCard(deck.draw());	
			dealer.getHand().addCard(deck.draw());	
		}
        //draw 2 cards from deck , put in dealers hand 
        /*dealerHand.addCard(deck.draw());
        dealerHand.addCard(deck.draw());
        playerHand.addCard(deck.draw());
        playerHand.addCard(deck.draw());
       */
		
	}
	/**
	 * Restarts in a few steps
	 * 1. The Player and dealer return their cards to the deck.
	 * 2. The deck is shuffled.
	 * 3. Both the player and the dealer receive two cards drawn form the top of the deck.
	 */
	public void restart() {
		
		
		player.returnCardstoDeck(deck);    // player returns cards
		dealer.returnCardstoDeck(deck);	   // dealer returns cards
		this.deck.shuffle();	// deck gets shuffled 
		player.getHand().addCard(deck.draw());	// player draws two cards
		player.getHand().addCard(deck.draw());
		dealer.getHand().addCard(deck.draw());	// dealer draws two cards
		dealer.getHand().addCard(deck.draw());	
		
	}
		
		
		//returning cards to deck
        
		
		
		/*
		
		
		dealer.returnCardstoDeck(deck);
        player.returnCardstoDeck(deck);
        Hand playerHand= player.getHand(); 
        Hand dealerHand = dealer.getHand();
       
        //shuffling deck
        deck.shuffle();
       
        
        
        
        dealerHand.addCard(deck.draw());
        dealerHand.addCard(deck.draw());
        
        playerHand.addCard(deck.draw());
        playerHand.addCard(deck.draw());	
	}
	*/
	/**
	 * Returns the value of a card in a standard game of Blackjack based on the type of the card
	 * ex. An Ace would return 1, a 2 would return 2... 
	 * @param c card whose value is extracted
	 * @return value of the card
	 */
	public static int getValueOfCard(Card c) {
	
		if (c.getType() == Card.Type.ACE)
		{
			return 1;
		}
		else if (c.getType() == Card.Type.TWO)
		{
			return 2;
		}
		else if (c.getType() == Card.Type.THREE)
		{
			return 3;
		}
		else if (c.getType() == Card.Type.FOUR)
		{
			return 4;
		}
		else if (c.getType() == Card.Type.FIVE)
		{
			return 5;
		}
		else if (c.getType() == Card.Type.SIX)
		{
			return 6;
		}
		else if (c.getType() == Card.Type.SEVEN)
		{
			return 7;
		}
		else if (c.getType() == Card.Type.EIGHT)
		{
			return 8;
		}
		else if (c.getType() == Card.Type.NINE)
		{
			return 9;
		}
		else if (c.getType() == Card.Type.TEN)
		{
			return 10;
		}
		else if (c.getType() == Card.Type.JACK)
		{
			return 10;
		}
		else if (c.getType() == Card.Type.QUEEN)
		{
			return 10;
		}
		else if (c.getType() == Card.Type.KING)
		{
			return 10;
		}
		else
		{
			return 0;	// default case 
		}
		
		
		
	}
	/**
	 * Returns the maximum value of the hand that does not result in a bust
	 * @param h Hand whose value is returned
	 * @return value of h
	 */
	public static int getValueOfHand(Hand h) {
		int handVal = 0;
        Card[] hand = h.getCards();
                               
      //if not aces 
      for(int i = 0; i < hand.length; i++)
                                {
      if(hand[i].getType() != Card.Type.ACE)
        {
           handVal = handVal + getValueOfCard(hand[i]);
              }
      }
 //aces
   for(int i = 0; i < hand.length; i++) {
           if(hand[i].getType() == Card.Type.ACE)  {
              if(handVal + 11 > 21) {
                       handVal = handVal + 1;
                     }
  else  {
     handVal = handVal + 11; //add to val
   			}
          }
          	}
                    			
                    return handVal;
	}

	/**
	 * @return Deck used to play
	 */
	public Deck getDeck() {
		return deck;
	}
	
	/**
	 * @return Dealer of the game
	 */
	public Dealer getDealer() {
		return dealer;
	}
	
	/**
	 * @return Player playing the blackjack game
	 */
	public Player getPlayer() {
		return player;
	}

}
