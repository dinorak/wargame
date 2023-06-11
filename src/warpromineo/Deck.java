package warpromineo;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		for(int i = 2; i <= 14; i++) {
				 for (String suit : suits) {
		                String name = "";
		                if (i == 11) {
		                    name = "Jack of " + suit;
		                } else if (i == 12) {
		                    name = "Queen of " + suit;
		                } else if (i == 13) {
		                    name = "King of " + suit;
		                } else if (i == 14) {
		                    name = "Ace of " + suit;
		                } else {
		                    name = i + " of " + suit;
		                }
		                Card card = new Card(i, name);
		                cards.add(card);
		            }
		        }
		}
	public void shuffle(){
		Collections.shuffle(cards);
	}
	public Card draw() {
		 Card card = cards.get(0);
	        cards.remove(0);
	        return card;
        }
       
    
	
	
	
}


