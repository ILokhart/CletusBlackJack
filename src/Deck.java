import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by ILokhart on 3/15/2017.
 */
public class Deck {

    private Stack<Card> cardDeck = new Stack<Card>();

    public Stack<Card> getDeck() {
        return cardDeck;
    }

    public Card getCard() {
        return cardDeck.pop();
    }

    public int getCardsRemaining() {
        return cardDeck.size();
    }


    public void addCard(Card newCard) {
        cardDeck.push(newCard);
    }

    public void shuffleDeck() {
        Collections.shuffle(cardDeck);
    }

    public void generateDeck() {

        cardDeck.clear();
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        Card tempCard = null;

        for(String suit: suits) {
            for(Integer i = 1; i < 14;i++) {
                tempCard = new Card();
                tempCard.setSuit(suit);
                if(i == 1) {
                    tempCard.setValue(11);
                }
                else if(i >10) {
                    tempCard.setValue(10);
                }
                else {
                    tempCard.setValue(i);
                }
                if(i == 1) {
                    tempCard.setSValue("Ace");
                }
                else if(i == 11) {
                    tempCard.setSValue("Jack");
                }
                else if(i == 12) {
                    tempCard.setSValue("Queen");
                }
                else if(i == 13) {
                    tempCard.setSValue("King");
                }
                else {

                    tempCard.setSValue(i.toString());
                }
                cardDeck.push(tempCard);
            }

        }


    }

    public String toString() {
        return cardDeck.toString();
    }
}
