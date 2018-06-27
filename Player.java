/**
 * A player in a blackJack game
 *
 */
public class Player {
	/**
	 * The players hand
	 */
	private Hand hand;
	
	/**
	 * Instantiates the hand instance variable.
	 */
	public Player() {
		
	}
	
	/**
	 * @return true if the player has bused
	 */
	public boolean busted() {
		return false;
	}
	
	/**
	 * empty the player hand into the cards
	 * @param d deck that receives the cards
	 */
	public void returnCardstoDeck(Deck d) {
		
	}
	/**
	 * @return the player's hand
	 */
	public Hand getHand() {
		return hand;
	}
}
