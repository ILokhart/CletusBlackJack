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

}