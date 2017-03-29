import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ILokhart on 3/15/2017.
 */
public class HandTest {

    @Test
    public void addCardTest() {

        Hand testHand = new Hand();

        System.out.println(testHand.toString());
        Card card = new Card("Spades",1,"Ace");
        testHand.addCard(card);

        assertEquals(true, testHand.contains(new Card("Spades",1,"Ace")));

    }

    @Test
    public void clearHand() {
        Hand testHand = new Hand();

        System.out.println(testHand.toString());

        Card card = new Card("Spades",1,"Ace");
        Card card2 = new Card("Spades",1,"Ace");

        testHand.addCard(card);
        testHand.addCard(card2);

        assertFalse(testHand.empty());
        testHand.clear();
        assertTrue(testHand.empty());


    }

    @Test
    public void totalHandTest() {
        Hand testHand = new Hand();

        Card card1 = new Card("Spades",11,"Ace");
        Card card2 = new Card("Hearts",5,"5");
        Card card3 = new Card("Diamond",5,"5");
        testHand.addCard(card1);
        testHand.addCard(card2);
        testHand.addCard(card3);

        System.out.println(testHand.toString());

        assertEquals(21,testHand.total());
    }

    @Test
    public void isBustTest() {


        Hand testHand = new Hand();

        Card card1 = new Card("Spades",11,"Ace");
        Card card2 = new Card("Hearts",5,"5");
        Card card3 = new Card("Diamond",5,"5");
        Card card4 = new Card("Clubs",10,"Jack");
        Card card5 = new Card("Clubs",5,"5");
        testHand.addCard(card1);
        testHand.addCard(card2);
        testHand.addCard(card3);

        System.out.println(testHand.toString());

        assertFalse(testHand.isBust());

        testHand.addCard(card4);
        assertFalse(testHand.isBust());


        testHand.addCard(card5);
        assertTrue(testHand.isBust());


    }

    @Test
    public void getNumCardsTest() {

        Hand testHand = new Hand();

        Card card1 = new Card("Spades",11,"Ace");
        Card card2 = new Card("Hearts",5,"5");
        Card card3 = new Card("Diamond",5,"5");

        testHand.addCard(card1);
        testHand.addCard(card2);
        testHand.addCard(card3);

        assertEquals(3,testHand.getNumCards());

    }

    @Test
    public void getFaceUpCardsTest() {

        Hand testHand = new Hand();
        String str = " 10 of Clubs";

        testHand.addCard(new Card("Hearts", 7, "7"));
        testHand.addCard(new Card("Clubs", 10, "10"));

        assertEquals(str,testHand.getFaceUpCards());
    }

    @Test
    public void getShowTest() {
        Hand testHand = new Hand();

        testHand.addCard(new Card("Hearts", 7, "7"));
        testHand.addCard(new Card("Clubs", 10, "10"));

        assertEquals(10,testHand.show());
    }

    }
