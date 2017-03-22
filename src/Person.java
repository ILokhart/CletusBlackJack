/**
 * Created by ILokhart on 3/15/2017.
 */
public class Person {

    private Hand hand;
    private int money;
    private String name;

    public Person(int _money, String _name) {
        hand = new Hand();
        this.money = _money;
        this.name = _name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int _money) {
        money = _money;
    }


    public void addMoney(int i) {

        money = money + i;
    }

    @Override
    public String toString() {
        return name + " has " + money + " and " + hand.total() + " Showing";
    }

    public void addCard(Card card) {        hand.addCard(card);
    }

    public void clearHand(){
        hand.clear();
    }
}
