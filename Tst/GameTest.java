import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ILokhart on 3/15/2017.
 */
public class GameTest {

    @Test
    public void testComponents() {

        Game gameTest = new Game();

        System.out.println(gameTest.toString());

        gameTest.generateDeck();

        assertEquals(2000,gameTest.getPlayerMoney());
        assertEquals(10000,gameTest.getPDealerMoney());
        assertFalse(gameTest.deckEmpty());



    }

    @Test
    public void testHit() {
        Game gameTest = new Game();

        System.out.println(gameTest.toString());

        gameTest.generateDeck();

        assertFalse(gameTest.getPlayerScore() > 0);
        assertFalse(gameTest.getDealerScore() > 0);

        gameTest.hitPlayer();
        gameTest.hitDealer();

        assertTrue(gameTest.getPlayerScore() > 0);
        assertTrue(gameTest.getDealerScore() > 0);


    }

    @Test
    public void testBust() {
        Game gameTest = new Game();
        gameTest.generateDeck();

        gameTest.hitDealer();
        gameTest.hitDealer();
        gameTest.hitDealer();
        gameTest.hitDealer();
        gameTest.hitDealer();
        gameTest.hitDealer();
        gameTest.hitDealer();
        gameTest.hitDealer();
        gameTest.hitDealer();
        gameTest.hitDealer();
        gameTest.hitDealer();
        gameTest.hitDealer();

        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();
        gameTest.hitPlayer();

        System.out.println(gameTest.toString());

        assertTrue(gameTest.dealerBust());
        assertTrue(gameTest.playerBust());
    }

}