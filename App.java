package cardGameWar;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		deck.shuffle();
		
		for (int i = 1; i < 52; i++) {
			if (i %2 == 0) {
		          player1.draw(deck);
		        } else {
		          player2.draw(deck);
		        }
		}
		for (int i = 1; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			System.out.println("Player 1 turn: ");
			card1.describe();
			System.out.println("Player 2 turn: ");
			card2.describe();
			if(card1.getValue() > card2.getValue()) {
	            player1.incrementScore();
	       } else if(card1.getValue() < card2.getValue()) {
	            player2.incrementScore();
	            }
		}
	    int player1Score = player1.score;
		int player2Score = player2.score;
			
			System.out.println("Player 1 final score: " + player1Score);
			System.out.println("Player 2 final score: " + player2Score);
			
			
			
		if (player1Score > player2Score) {
			System.out.println("Winner: Player 1!");
	        }
		if (player2Score > player1Score) {
			System.out.println("Winner: Player 2!");
		}
		if (player1Score == player2Score) {
			System.out.println("It's a DRAW! Play again!");
		}
		

	}
}

