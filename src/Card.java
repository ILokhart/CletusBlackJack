/**
 * Created by ILokhart on 3/15/2017.
 */
public class Card {

    private String suit;
    private int value;
    private String sValue;

    public Card()
    {
    }

    public Card(String _suit, int _value, String _sValue) {
        suit = _suit;
        value = _value;
        sValue = _sValue;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String toString() {
        return sValue + " of " + suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSValue() {
        return sValue;
    }

    public void setSValue(String SValue) {
        this.sValue = SValue;
    }
}
