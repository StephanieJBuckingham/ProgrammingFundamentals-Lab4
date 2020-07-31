import java.util.Random;

public class Card {

	public static void main(String[] args) {

		// Make an array with size 52 to represent deck of cards
		int[] cards = new int[52];

		// Represent card properties by creating string of suits and ranks
		String[] suits = { "Hearts", "Diamonds", "Spades", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		// Initialize cards
		for (int i = 0; i < 1; i++) {
			cards[i] += i;

			// Create random constructor
			Random random = new Random();

			// Pick 5 cards
			for (int y = 1; y <= 5; y++) {

				// Select random suit and rank
				String suit = suits[random.nextInt(suits.length)];
				String rank = ranks[random.nextInt(ranks.length)];

				// Print out 5 selected cards rank and suit
				System.out.print("Card " + y + ": ");
				System.out.println(rank + " of " + suit);
			}

		}
	}
}
