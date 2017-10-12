package ooDesign.deckOfCards;

public class BlackjackCard extends Card {
    BlackjackCard(FaceValue f, Suit s) {
        super(f, s);
    }

    public int getValue() {
        //Jack (11) through King (13)
        if(this.faceValue.value > 10 && this.faceValue.value <= 13) {
            return 10;
        }
        else if (this.faceValue == FaceValue.ACE) {
            return 11;
        }
        else {
            return this.faceValue.value;
        }
    }
}
