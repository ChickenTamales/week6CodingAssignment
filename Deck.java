package cardGameWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> deck = new ArrayList<Card>();
	
	Deck(){
		int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		String[] names = {"Clubs", "Diamonds", "Hearts", "Spades"};
		for (String name : names) {//for each name in the array 'names'
			int count = 2;//count initialized at 2 
			for (int value : values) {//each value in the array 'values'
				Card card = new Card(value, name);//a new card is created with a value, and a name.
				this.deck.add(card);
				count++;//move to the next card
				
//				System.out.println("Deck has " + (deck.getDeck().size() + "cards!"));//"Deck deck = new Deck();
//				deck.shuffle();
//				Deck has (number of) cards!"
			
				
				
			}
		}
	}
	
	
	public void shuffle() {
		Collections.shuffle(this.deck);
	}
	public Card draw() {//doesn't need parameters because we're using the field in the deck class
		Card card = this.deck.remove(0);//this will take the card out of the deck and in the card variable
		return card;
	}
	public List<Card> getDeck() {
		return deck;
	}
}
