package ooDesign.deckOfCards;

import java.util.ArrayList;

public class Hand<T extends Card> {
    private ArrayList<T> cards;

    public int value() {
        int v = 0;
        for(Card c : cards) {
            v += c.getValue();
        }
    }
}
