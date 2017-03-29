import java.util.Random;
import java.util.Scanner;

/**
 * Created by Jory on 3/23/17.
 */
public class GameRunner {


    public static final int MAXNUMBERCARDS = 5;
    public static void main(String[] args) {
        String betAmount = "";
        String hit = "";
        Scanner input = new Scanner(System.in);
        Game game = new Game();
        game.generateDeck();
        Random random = new Random();
        int ran;

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
            game.hitDealer();
            game.hitPlayer();
            game.hitDealer();

            System.out.println("Dealer hand shows following cards " + game.getDealerShowHand());
            System.out.println("Your hand contains the following cards " + game.getPlayerHand());
            while(!game.getPlayerHand().isBust() && game.getNumPlayerCards() < MAXNUMBERCARDS) {

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

                if(game.deckEmpty()) {
                    game.generateDeck();
                }



                System.out.println("Your hand contains the following cards " + game.getPlayerHand());
            }

            if(game.getPlayerHand().isBust()) {
                System.out.println("You busted at " + game.getPlayerScore() + " points");

            }
            else {
                System.out.println("You currently sit at " + game.getPlayerScore() +  " points ");
            }

            while(!game.dealerBust()) {

                if (game.getDealerScore() < 11) {
                    System.out.println("Dealer Hits");
                    game.hitDealer();
                } else if (game.getDealerScore() >= 11 && game.getDealerScore() < 16) {
                    ran = random.nextInt(3);
                    if (ran > 0) {
                        System.out.println("Dealer Hits");
                        game.hitDealer();
                    }
                    else {
                        System.out.println("Dealer Stays");
                        break;
                    }

                } else if (game.getDealerScore() >= 16 && game.getDealerScore() < 21) {
                    ran = random.nextInt(3);

                    if (ran == 0) {
                        System.out.println("Dealer Hits");
                        game.hitDealer();
                    }
                    else {
                        System.out.println("Dealer Stays");
                        break;
                    }
                }

                System.out.println("Dealer hand shows following cards " + game.getDealerShowHand());


            }

            System.out.println("Dealer reveals hand that contains " + game.getDealerHand());
            System.out.println("You have " + game.getPlayerScore() + " poits.");
            System.out.println("Dealer has " + game.getDealerScore() + " poits.");

            if ((game.getDealerScore() >= game.getPlayerScore() || game.playerBust()) && !game.dealerBust()) {
                System.out.println("Dealer Wins you loose " + betAmount + " dollars.");
                game.setPlayerMoney(game.getPlayerMoney() - Integer.parseInt(betAmount));
                game.setDealerMoney(game.getPDealerMoney() + Integer.parseInt(betAmount));
            }
            else {
                System.out.println("You Win!");
                game.setPlayerMoney(game.getPlayerMoney() + Integer.parseInt(betAmount)  * 2);
                game.setDealerMoney(game.getPDealerMoney() - Integer.parseInt(betAmount));
            }





            //clear the hands when the round is over
            game.getPlayerHand().clear();
            game.getDealerHand().clear();


            
        }

        if(game.getPlayerMoney() >= 5000) {
            System.out.println("You beat the house. Congratulations!");
        }
        else {
            System.out.println("You lost all your money! You Loose");
        }

    }
}
