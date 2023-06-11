package warpromineo;

import java.util.List;
import java.util.ArrayList;

public class Player {
	private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        hand = new ArrayList<Card>();
        score = 0;
        this.name = name;
    }

    public void describe() {
        System.out.println("Player: " + name);
        for(Card card: hand) {
            card.describe();
        }
    }

    public Card flip() {
        Card card = hand.get(0);
        hand.remove(0);
        return card;
    }

    public void draw(Deck deck) {
        Card card = deck.draw();
        hand.add(card);
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}


