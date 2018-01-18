/*
* BlackJack.java
* Author: Daniela Murcia
* Submission Date: December 5 , 2017
*
* Purpose: First I had to create player, dealer, and deck objects that I could 
* later manipulate. I have a void method restart that removes cards, shuffles them, and then checks if 
* two cards receive cards from the top of the deck. I know I have a lot of ifs and else ifs, but it 
* was necessary. Get value of hand as pretty standard and similar to the others that 
* consisted of conditions. 
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



public class BlackJack {
               
	
	
	//make 3 private objects
	private Deck deck;
	private Dealer dealer;
     private Player player;
 
 
     	/**
       * Constructs and prepares for a new game of BlackJack.
       * Creates player, dealer and deck objects then shuffles
       * the deck and gives both the dealer and player two cards.
       */
                public BlackJack() {   //constructor makes new game                                                                                                                                                                                                       
                                
                                player = new Player();
                                dealer = new Dealer();
                                deck = new Deck();
                                Hand playerHand= new Hand();
                                Hand dealerHand = new Hand();
                               
                               
                                //call shuffling deck
                                deck.shuffle();
                               
                                //draw 2 cards from deck , put in dealers hand 
                                dealerHand.addCard(deck.draw());
                                dealerHand.addCard(deck.draw());
                                playerHand.addCard(deck.draw());
                                playerHand.addCard(deck.draw());
                               
                }
                /**
                * Restarts in a few steps
                * 1. The Player and dealer return their cards to the deck.
                * 2. The deck is shuffled.
                * 3. Both the player and the dealer receive two cards drawn form the top of the deck.
                */
                public void restart() {
                                //returning cards to deck
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
                /**
                * Returns the value of a card in a standard game of Blackjack based on the type of the card
                * ex. An Ace would return 1, a 2 would return 2...
                 * @param c card whose value is extracted
                * @return value of the card
                */
     public static int getValueOfCard(Card c) {
            int cardVal = 0;
                               
               if(c.getType() == Card.Type.ACE) {
                              cardVal = 1;
                                }
                else if(c.getType() == Card.Type.TWO) {
                               cardVal = 2;
                                }
                else if(c.getType() == Card.Type.THREE) {
                               cardVal = 3;
                                }
                  else if(c.getType() == Card.Type.FOUR)
                                {
                                 cardVal = 4;
                                }
                   else if(c.getType() == Card.Type.FIVE) {
                                 cardVal = 5;
                                }
                   else  if(c.getType() == Card.Type.SIX) {
                                 cardVal = 6;
                                }
                    else  if(c.getType() == Card.Type.SEVEN) {
                                  cardVal = 7;
                                }
                    else  if(c.getType() == Card.Type.EIGHT){
                                 cardVal = 8;
                                }
                  else if(c.getType() == Card.Type.NINE){
                                    cardVal = 9;
                                }
                  else if(c.getType() == Card.Type.TEN) {
                                    cardVal = 10;
                                }
                   else if((c.getType() == Card.Type.JACK) || (c.getType() == Card.Type.KING) || (c.getType() == Card.Type.QUEEN))  {
                                {
                         cardVal = 10; //all in one line because return same thing
                           
                                }
                                }
                               
                                return cardVal; //return val
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
                public Deck getDeck() { //get deck 
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