import java.util.Random;
import java.util.Scanner;

/**
 * Created by Jory on 3/23/17.
 */
public class GameRunner {


    public static final int MAXNUMBERCARDS = 5;
    public static final int SLEEPTIME = 1500;
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
            try {
                Thread.sleep(SLEEPTIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            betAmount = input.next();

            for(int i = 0; i < betAmount.length(); i++) {

                if(!Character.isDigit(betAmount.charAt(i))) {
                    System.out.println(betAmount + " is not a valid whole number bet please try again");
                    try {
                        Thread.sleep(SLEEPTIME);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i = 0;
                    betAmount = input.next();
                }

            }

            if(Integer.parseInt(betAmount) > game.getPlayerMoney()) {
                try {
                    Thread.sleep(SLEEPTIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                betAmount = "" + game.getPlayerMoney();
                System.out.println("You bet more money than you have lowering bet to your total wallet amount.");
            }




            System.out.println("You bet " + betAmount + " dollars.");
            try {
                Thread.sleep(SLEEPTIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Handing out cards!");
            try {
                Thread.sleep(SLEEPTIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            game.hitPlayer();
            game.hitDealer();
            game.hitPlayer();
            game.hitDealer();

            System.out.println("Dealer hand shows following cards " + game.getDealerShowHand());
            try {
                Thread.sleep(SLEEPTIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Your hand contains the following cards " + game.getPlayerHand());
            try {
                Thread.sleep(SLEEPTIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while(!game.getPlayerHand().isBust() && game.getNumPlayerCards() < MAXNUMBERCARDS) {

                System.out.println("Your score is " + game.getPlayerScore());
                try {
                    Thread.sleep(SLEEPTIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hit or stay?");
                try {
                    Thread.sleep(SLEEPTIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hit = input.next();

                if(hit.equalsIgnoreCase("hit")) {
                    game.hitPlayer();
                }
                else if(hit.equals("stay")) {
                    break;
                }
                else {
                    System.out.println(hit + " is not valid input. Please try again");
                    try {
                        Thread.sleep(SLEEPTIME);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if(game.deckEmpty()) {
                    game.generateDeck();
                }



                System.out.println("Your hand contains the following cards " + game.getPlayerHand());
                try {
                    Thread.sleep(SLEEPTIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if(game.getPlayerHand().isBust()) {
                System.out.println("You busted at " + game.getPlayerScore() + " points");
                try {
                    Thread.sleep(SLEEPTIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            else {
                System.out.println("You currently sit at " + game.getPlayerScore() +  " points ");
            }

            while(!game.dealerBust()) {

                if (game.getDealerScore() < 11) {
                    System.out.println("Dealer Hits");
                    try {
                        Thread.sleep(SLEEPTIME);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    game.hitDealer();
                } else if (game.getDealerScore() >= 11 && game.getDealerScore() < 16) {
                    ran = random.nextInt(3);
                    if (ran > 0) {
                        System.out.println("Dealer Hits");
                        try {
                            Thread.sleep(SLEEPTIME);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        game.hitDealer();
                    }
                    else {
                        System.out.println("Dealer Stays");
                        try {
                            Thread.sleep(SLEEPTIME);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }

                } else if (game.getDealerScore() >= 16 && game.getDealerScore() < 21) {
                    ran = random.nextInt(3);

                    if (ran == 0) {
                        System.out.println("Dealer Hits");
                        try {
                            Thread.sleep(SLEEPTIME);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        game.hitDealer();
                    }
                    else {
                        System.out.println("Dealer Stays");
                        try {
                            Thread.sleep(SLEEPTIME);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
                else {
                    break;
                }

                System.out.println("Dealer hand shows following cards " + game.getDealerShowHand());
                try {
                    Thread.sleep(SLEEPTIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

            System.out.println("Dealer reveals hand that contains " + game.getDealerHand());
            try {
                Thread.sleep(SLEEPTIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("You have " + game.getPlayerScore() + " poits.");
            try {
                Thread.sleep(SLEEPTIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Dealer has " + game.getDealerScore() + " poits.");
            try {
                Thread.sleep(SLEEPTIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if ((game.getDealerScore() >= game.getPlayerScore() || game.playerBust()) && !game.dealerBust()) {
                System.out.println("Dealer Wins you loose " + betAmount + " dollars.");
                game.setPlayerMoney(game.getPlayerMoney() - Integer.parseInt(betAmount));
                game.setDealerMoney(game.getPDealerMoney() + Integer.parseInt(betAmount));
            }
            else {
                System.out.println("You Win!");
                game.setPlayerMoney(game.getPlayerMoney() + Integer.parseInt(betAmount));
                game.setDealerMoney(game.getPDealerMoney() - Integer.parseInt(betAmount));
            }





            //clear the hands when the round is over
            game.getPlayerHand().clear();
            game.getDealerHand().clear();

            try {
                Thread.sleep(SLEEPTIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            
        }

        if(game.getPlayerMoney() >= 5000) {
            System.out.println("You beat the house. Congratulations!");
        }
        else {
            System.out.println("You lost all your money! You Loose");
        }

    }
}
