import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jory on 3/15/17.
 */
public class PersonTest {

    @Test
    public void moneyTest() {
        Person fred = new Person(2000, "Player");

        System.out.println(fred.toString());

        fred.setMoney(3000);

        assertEquals(3000,fred.getMoney());

        fred.addMoney(200);

        assertEquals(3200,fred.getMoney());

    }

    @Test
    public void handTest() {

        Person fred = new Person(2000, "Player");

        Card card1 = new Card("Spades",11,"Ace");
        Card card2 = new Card("Hearts",5,"5");
        Card card3 = new Card("Diamond",5,"5");
        Card card4 = new Card("Clubs",10,"Jack");

        fred.addCard(card1);
        fred.addCard(card2);
        fred.addCard(card3);
        fred.addCard(card4);

        System.out.println(fred.toString());

        assertTrue(fred.getHand().contains(card1));
        assertTrue(fred.getHand().contains(card2));
        assertTrue(fred.getHand().contains(card3));
        assertTrue(fred.getHand().contains(card4));

        fred.clearHand();

        assertTrue(fred.getHand().empty());


    }

}