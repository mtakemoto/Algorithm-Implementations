package ooDesign.deckOfCards;

public enum Suit {
    Heart (0), Diamond (1), Club (2), Spade (3);

    private final int value;

    Suit(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    public static Suit getSuitFromValue(int value) {
        switch(value) {
            case 0: return Heart;
            case 1: return Diamond;
            case 2: return Club;
            case 3: return Spade;
        }
        return null;
    }
}
