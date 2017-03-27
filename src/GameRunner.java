import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jory on 3/23/17.
 */
public class GameRunner {

    public static void main(String[] args) {
        String betAmount = "";
        String hit = "";
        Scanner input = new Scanner(System.in);
        Game game = new Game();
        game.generateDeck();

        while(game.getPlayerMoney() >0 && game.getPlayerMoney() <5000) {

            System.out.println("You curretnly have " + game.getPlayerMoney() + " dollars. Enter the whole number amount " +
                    "you would like to bet?");
            betAmount = input.next();

            while(betAmount.contains(".")){
                System.out.println(betAmount + "is not a whole number please enter a whole number.");
                betAmount = input.next();
            }
            System.out.println("You bet " + betAmount + " dollars.");
            System.out.println("Handing out cards!");

            game.hitPlayer();
            game.hitPlayer();


            System.out.println(game.getPlayerHand());
            while(!game.getPlayerHand().isBust() && game.getNumPlayerCards() < 5) {
                System.out.println(game.getPlayerHand());
                System.out.println("Your score is " + game.getPlayerScore());
                System.out.println("Hit or stay?");
                hit = input.next();

                if(hit.equalsIgnoreCase("hit")) {
                    game.hitPlayer();
                }
                else if(hit.equals("stay")) {
                    break;
                }
                else {
                    System.out.println(hit + " is not valid input. Please try again");
                }
                System.out.println("Your hand contains the following cards " + game.getPlayerHand());
            }
            
        }

    }
}
