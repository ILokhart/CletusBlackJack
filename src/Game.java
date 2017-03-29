/**
 * Created by ILokhart on 3/15/2017.
 */
public class Game {

    Person player = new Person(2000,"Player");
    Person dealer = new Person(10000,"Dealer");
    Deck deck = new Deck();

    public void generateDeck() {
        deck.generateDeck();
        deck.shuffleDeck();
    }

    public int getPlayerMoney() {
        return player.getMoney();
    }

    public int getPDealerMoney() {
        return dealer.getMoney();
    }

    public boolean deckEmpty() {
        return deck.isEmpty();
    }

    @Override
    public String toString() {
        return player.toString() + " \n" + dealer.toString();
    }

    public int getPlayerScore() {
        return player.getHand().total();
    }

    public int getDealerScore() {
        return dealer.getHand().total();
    }

    public void hitPlayer() {
        player.addCard(deck.nextCard());
    }

    public void hitDealer() {
        dealer.addCard(deck.nextCard());
    }

    public boolean dealerBust() {
        return dealer.getHand().isBust();
    }

    public boolean playerBust() {
        return player.getHand().isBust();
    }

    public Hand getPlayerHand() {

        return player.getHand();
    }

    public Hand getDealerHand() {
        return dealer.getHand();
    }

    public int getNumPlayerCards() {
        return player.getHand().getNumCards();
    }

    public int getNumDealerCards() {
        return dealer.getHand().getNumCards();
    }

    public int getDealerShow() {
        return dealer.getShow();
    }

    public int getPlayerShow() {
        return player.getShow();
    }

    public String getDealerShowHand() {
        return dealer.getDealerShowHand();
    }

    public void setPlayerMoney(int x) {
        player.setMoney(x);
    }

    public void setDealerMoney(int x) {
        dealer.setMoney(x);
    }




}
