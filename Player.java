package cardGameWar;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	
	 int score = 0;
	 int name = 0;
	
	public void describe() {
		System.out.println("Player: " + name + "Score: " + score);
		System.out.println("The hand consists of the following cards");
		for(Card card : hand) {
	    	System.out.println(card.toString());
		}
	
	}

	public Card flip() {
	    return this.hand.remove(0);
	  }
	public void draw(Deck deck) {
	    this.hand.add(deck.draw());
	  }
	  public void incrementScore() {
		    this.score++; 
		  }
}

