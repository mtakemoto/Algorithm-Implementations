package ooDesign.deckOfCards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck<T extends Card> {
    private ArrayList<T> cards;
    int dealtIdx = 0;

    // Separate card deck init from implementation
    // Not all decks will have all 52 cards
    public void setDeck(ArrayList<T> deck) {
        this.cards = deck;
    }
    public void shuffle() {
        Collections.shuffle(cards);
    }
    public ArrayList<T> dealHand(int number) {
        ArrayList<T> hand = new ArrayList<>();
        number = Math.min(number, cards.size());
        for(int i=dealtIdx; i<number; i++) {
            hand.add(cards.get(i));
        }
        return hand;
    }
    public T dealCard() {
        return cards.get(dealtIdx);
    }

}
