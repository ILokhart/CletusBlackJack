import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by Jory on 3/15/17.
 */
public class DeckTest {


    @Test
    public void addCardTest() {
        Deck deck = new Deck();

        deck.addCard(new Card("Spades",1,"Ace"));

        Stack<Card> s = new Stack();

        s.push(new Card("Spades",1,"Ace"));

        System.out.println(deck);
        System.out.println(s);

        assertEquals(s.toString(), deck.toString());
    }

    @Test
    public void generateDeckTest() {


        Stack<Card> createdDeck = new Stack<Card>();

        Deck d = new Deck();
        d.generateDeck();


        Card s1 = new Card("Spades",1,"Ace");
        Card s2 = new Card("Spades",2,"2");
        Card s3 = new Card("Spades",3,"3");
        Card s4 = new Card("Spades",4,"4");
        Card s5 = new Card("Spades",5,"5");
        Card s6 = new Card("Spades",6,"6");
        Card s7 = new Card("Spades",7,"7");
        Card s8 = new Card("Spades",8,"8");
        Card s9 = new Card("Spades",9,"9");
        Card s10 = new Card("Spades",10,"10");
        Card s11 = new Card("Spades",10,"Jack");
        Card s12 = new Card("Spades",10,"Queen");
        Card s13 = new Card("Spades",10,"King");

        Card d1 = new Card("Diamonds",1,"Ace");
        Card d2 = new Card("Diamonds",2,"2");
        Card d3 = new Card("Diamonds",3,"3");
        Card d4 = new Card("Diamonds",4,"4");
        Card d5 = new Card("Diamonds",5,"5");
        Card d6 = new Card("Diamonds",6,"6");
        Card d7 = new Card("Diamonds",7,"7");
        Card d8 = new Card("Diamonds",8,"8");
        Card d9 = new Card("Diamonds",9,"9");
        Card d10 = new Card("Diamonds",10,"10");
        Card d11 = new Card("Diamonds",10,"Jack");
        Card d12 = new Card("Diamonds",10,"Queen");
        Card d13 = new Card("Diamonds",10,"King");

        Card h1 = new Card("Hearts",1,"Ace");
        Card h2 = new Card("Hearts",2,"2");
        Card h3 = new Card("Hearts",3,"3");
        Card h4 = new Card("Hearts",4,"4");
        Card h5 = new Card("Hearts",5,"5");
        Card h6 = new Card("Hearts",6,"6");
        Card h7 = new Card("Hearts",7,"7");
        Card h8 = new Card("Hearts",8,"8");
        Card h9 = new Card("Hearts",9,"9");
        Card h10 = new Card("Hearts",10,"10");
        Card h11 = new Card("Hearts",10,"Jack");
        Card h12 = new Card("Hearts",10,"Queen");
        Card h13 = new Card("Hearts",10,"King");

        Card c1 = new Card("Clubs",1,"Ace");
        Card c2 = new Card("Clubs",2,"2");
        Card c3 = new Card("Clubs",3,"3");
        Card c4 = new Card("Clubs",4,"4");
        Card c5 = new Card("Clubs",5,"5");
        Card c6 = new Card("Clubs",6,"6");
        Card c7 = new Card("Clubs",7,"7");
        Card c8 = new Card("Clubs",8,"8");
        Card c9 = new Card("Clubs",9,"9");
        Card c10 = new Card("Clubs",10,"10");
        Card c11 = new Card("Clubs",10,"Jack");
        Card c12 = new Card("Clubs",10,"Queen");
        Card c13 = new Card("Clubs",10,"King");


        createdDeck.push(h1);
        createdDeck.push(h2);
        createdDeck.push(h3);
        createdDeck.push(h4);
        createdDeck.push(h5);
        createdDeck.push(h6);
        createdDeck.push(h7);
        createdDeck.push(h8);
        createdDeck.push(h9);
        createdDeck.push(h10);
        createdDeck.push(h11);
        createdDeck.push(h12);
        createdDeck.push(h13);

        createdDeck.push(d1);
        createdDeck.push(d2);
        createdDeck.push(d3);
        createdDeck.push(d4);
        createdDeck.push(d5);
        createdDeck.push(d6);
        createdDeck.push(d7);
        createdDeck.push(d8);
        createdDeck.push(d9);
        createdDeck.push(d10);
        createdDeck.push(d11);
        createdDeck.push(d12);
        createdDeck.push(d13);

        createdDeck.push(s1);
        createdDeck.push(s2);
        createdDeck.push(s3);
        createdDeck.push(s4);
        createdDeck.push(s5);
        createdDeck.push(s6);
        createdDeck.push(s7);
        createdDeck.push(s8);
        createdDeck.push(s9);
        createdDeck.push(s10);
        createdDeck.push(s11);
        createdDeck.push(s12);
        createdDeck.push(s13);

        createdDeck.push(c1);
        createdDeck.push(c2);
        createdDeck.push(c3);
        createdDeck.push(c4);
        createdDeck.push(c5);
        createdDeck.push(c6);
        createdDeck.push(c7);
        createdDeck.push(c8);
        createdDeck.push(c9);
        createdDeck.push(c10);
        createdDeck.push(c11);
        createdDeck.push(c12);
        createdDeck.push(c13);

        System.out.println(d.toString());
        System.out.println(createdDeck.toString());

        assertEquals(createdDeck.toString(), d.toString());


    }

    @Test
    public void shuffleDeckTest() {


        Stack<Card> createdDeck = new Stack<Card>();

        Deck d = new Deck();
        d.generateDeck();
        d.shuffleDeck();


        Card s1 = new Card("Spades",1,"Ace");
        Card s2 = new Card("Spades",2,"2");
        Card s3 = new Card("Spades",3,"3");
        Card s4 = new Card("Spades",4,"4");
        Card s5 = new Card("Spades",5,"5");
        Card s6 = new Card("Spades",6,"6");
        Card s7 = new Card("Spades",7,"7");
        Card s8 = new Card("Spades",8,"8");
        Card s9 = new Card("Spades",9,"9");
        Card s10 = new Card("Spades",10,"10");
        Card s11 = new Card("Spades",10,"Jack");
        Card s12 = new Card("Spades",10,"Queen");
        Card s13 = new Card("Spades",10,"King");

        Card d1 = new Card("Diamonds",1,"Ace");
        Card d2 = new Card("Diamonds",2,"2");
        Card d3 = new Card("Diamonds",3,"3");
        Card d4 = new Card("Diamonds",4,"4");
        Card d5 = new Card("Diamonds",5,"5");
        Card d6 = new Card("Diamonds",6,"6");
        Card d7 = new Card("Diamonds",7,"7");
        Card d8 = new Card("Diamonds",8,"8");
        Card d9 = new Card("Diamonds",9,"9");
        Card d10 = new Card("Diamonds",10,"10");
        Card d11 = new Card("Diamonds",10,"Jack");
        Card d12 = new Card("Diamonds",10,"Queen");
        Card d13 = new Card("Diamonds",10,"King");

        Card h1 = new Card("Hearts",1,"Ace");
        Card h2 = new Card("Hearts",2,"2");
        Card h3 = new Card("Hearts",3,"3");
        Card h4 = new Card("Hearts",4,"4");
        Card h5 = new Card("Hearts",5,"5");
        Card h6 = new Card("Hearts",6,"6");
        Card h7 = new Card("Hearts",7,"7");
        Card h8 = new Card("Hearts",8,"8");
        Card h9 = new Card("Hearts",9,"9");
        Card h10 = new Card("Hearts",10,"10");
        Card h11 = new Card("Hearts",10,"Jack");
        Card h12 = new Card("Hearts",10,"Queen");
        Card h13 = new Card("Hearts",10,"King");

        Card c1 = new Card("Clubs",1,"Ace");
        Card c2 = new Card("Clubs",2,"2");
        Card c3 = new Card("Clubs",3,"3");
        Card c4 = new Card("Clubs",4,"4");
        Card c5 = new Card("Clubs",5,"5");
        Card c6 = new Card("Clubs",6,"6");
        Card c7 = new Card("Clubs",7,"7");
        Card c8 = new Card("Clubs",8,"8");
        Card c9 = new Card("Clubs",9,"9");
        Card c10 = new Card("Clubs",10,"10");
        Card c11 = new Card("Clubs",10,"Jack");
        Card c12 = new Card("Clubs",10,"Queen");
        Card c13 = new Card("Clubs",10,"King");


        createdDeck.push(h1);
        createdDeck.push(h2);
        createdDeck.push(h3);
        createdDeck.push(h4);
        createdDeck.push(h5);
        createdDeck.push(h6);
        createdDeck.push(h7);
        createdDeck.push(h8);
        createdDeck.push(h9);
        createdDeck.push(h10);
        createdDeck.push(h11);
        createdDeck.push(h12);
        createdDeck.push(h13);

        createdDeck.push(d1);
        createdDeck.push(d2);
        createdDeck.push(d3);
        createdDeck.push(d4);
        createdDeck.push(d5);
        createdDeck.push(d6);
        createdDeck.push(d7);
        createdDeck.push(d8);
        createdDeck.push(d9);
        createdDeck.push(d10);
        createdDeck.push(d11);
        createdDeck.push(d12);
        createdDeck.push(d13);

        createdDeck.push(s1);
        createdDeck.push(s2);
        createdDeck.push(s3);
        createdDeck.push(s4);
        createdDeck.push(s5);
        createdDeck.push(s6);
        createdDeck.push(s7);
        createdDeck.push(s8);
        createdDeck.push(s9);
        createdDeck.push(s10);
        createdDeck.push(s11);
        createdDeck.push(s12);
        createdDeck.push(s13);

        createdDeck.push(c1);
        createdDeck.push(c2);
        createdDeck.push(c3);
        createdDeck.push(c4);
        createdDeck.push(c5);
        createdDeck.push(c6);
        createdDeck.push(c7);
        createdDeck.push(c8);
        createdDeck.push(c9);
        createdDeck.push(c10);
        createdDeck.push(c11);
        createdDeck.push(c12);
        createdDeck.push(c13);

        System.out.println(d.toString());
        System.out.println(createdDeck.toString());

        assertNotEquals(createdDeck.toString(), d.toString());


    }


    @Test
    public void testGetCardsRemaining(){
        Deck d = new Deck();

        assertEquals(0,d.getCardsRemaining());
        System.out.println(d);

        d.generateDeck();
        System.out.println(d);

        assertEquals(52,d.getCardsRemaining());
    }

    @Test
    public void testGetCard() {
        Deck d = new Deck();
        d.addCard(new Card("Spades",1,"Ace"));
        Card c = d.getCard();

        assertEquals(c.toString(),new Card("Spades",1,"Ace").toString());
    }





}