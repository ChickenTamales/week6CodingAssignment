package cardGameWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	
	Deck(){
		int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		String[] names = {"Clubs", "Diamonds", "Hearts", "Spades"};
		for (String name : names) {//for each name in the array 'names'
			int count = 2;//count initialized at 2 
			for (int value : values) {//each value in the array 'values'
				Card card = new Card(value, name);//a new card is created with a value, and a name.
				this.cards.add(card);
				count++;//move to the next card
				
				Deck newDeck = new Deck();
				newDeck.shuffle();
				System.out.println("Deck has " + (newDeck.getCards().size() + "cards!"));//"Deck has (number of) cards!"
			
				
				
			}
		}
	}
	
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	public Card draw() {//doesn't need parameters because we're using the field in the deck class
		Card card = this.cards.remove(0);//this will take the card out of the deck and in the card variable
		return card;
	}
	public List<Card> getCards() {
		return cards;
	}
}
