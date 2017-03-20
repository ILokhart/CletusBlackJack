import java.util.ArrayList;

/**
 * Created by ILokhart on 3/15/2017.
 */
public class Hand {

    ArrayList<Card> cards = new ArrayList<Card>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public boolean contains(Card card) {
        boolean inHand = false;
        for(Card x: cards)
        {
            if(card.getSuit().equals(x.getSuit()) && card.getSValue().equals(x.getSValue()) && card.getValue() == x.getValue()) {
                inHand = true;
            }
        }
        return inHand;
    }

    @Override
    public String toString()
    {
        return cards.toString();
    }

    public boolean empty() {
        return cards.isEmpty();
    }

    public void clear() {
        cards.clear();
    }

    public int total() {
        int total = 0;

        for(Card x: cards) {

            total = total + x.getValue();
        }

        return total;
    }

    public boolean isBust() {
        boolean bust = false;
        boolean containsAce = containsAce();
        if(total() > 21 && !containsAce() ) {
            bust =true;

        }
        else if (total() > 21 && containsAce()) {
            changeAce();
            bust = isBust();

        }

        return bust;
    }

    private void changeAce() {

        for(Card x: cards)
        {
            if(x.getSValue().equals("Ace")) {
                x.setValue(1);
                return;
            }
        }

    }

    private boolean containsAce() {
        boolean contains = false;

        for(Card x: cards)
        {
            if(x.getSValue().equals("Ace") && x.getValue() == 11) {
                contains = true;

            }
        }

        return contains;
    }
}
