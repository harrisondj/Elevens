/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card ace = new Card("Ace", "Diamonds", 1);
		Card three = new Card("Three", "Hearts", 3);
		Card hthree = new Card("Three", "Hearts", 3);
		System.out.println(three.matches(ace));
		System.out.println(three.matches(hthree));
	}
}
