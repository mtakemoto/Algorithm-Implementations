package ooDesign.deckOfCards;

public abstract class Card {
    FaceValue faceValue;
    Suit suit;

    Card(FaceValue f, Suit s) {
        this.faceValue = f;
        this.suit = s;
    }

    // Abstract to allow for game type to determine value
    public abstract int getValue();
    public Suit getSuit() {
        return this.suit;
    }
}
