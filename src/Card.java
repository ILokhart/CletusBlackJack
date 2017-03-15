/**
 * Created by ILokhart on 3/15/2017.
 */
public class Card {

    String suit;
    int value;

    public Card()
    {
    }

    public Card(String _suit, int _value) {
        suit = _suit;
        value = _value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String toString() {
        return suit + " of " + value;
    }
}
