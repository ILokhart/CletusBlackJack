import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jory on 3/15/17.
 */
public class CardTest {

    @Test
    public void setSuit() {
        Card test = new Card();

        System.out.println(test.toString());

        test.setSuit("Spades");

        assertEquals("Spades",test.getSuit());
    }

    @Test
    public void setValue() {
        Card test = new Card();

        System.out.println(test);

        test.setValue(5);

        assertEquals(5,test.getValue());
    }

    public void setSvalue() {
        Card test = new Card();

        System.out.print(test.toString());

        test.setSValue("Jack");

        assertEquals("Jack",test.getSValue());
    }

    @Test
    public void testConstructor() {
        Card test = new Card("Spades",1,"Ace");

        System.out.println(test.toString());

        assertEquals("Ace",test.getSValue());
        assertEquals(1,test.getValue());
        assertEquals("Spades",test.getSuit());


    }

}