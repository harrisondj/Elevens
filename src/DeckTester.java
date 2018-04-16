/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck deck = new Deck(ranks, suits, values);
		System.out.println(deck.size());
		System.out.println(deck.isEmpty());
		System.out.println(deck.deal());
	}
}
