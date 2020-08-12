package blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private static ArrayList<Card> hand;
    
    public static void main (String[] args)
    {
        CardGame game = new CardGame();
        Scanner input = new Scanner(System.in);
         

        // Print player & dealer cards
        while (!game.checkBust () || game.playerStanding ()) {

            System.out.print ("Hit or Stand? [H|S]:");
            char inpu = input.next().charAt(0);

            if (inpu == 'H' || inpu == 'h') {
                game.hitPlayer();
            } else if (inpu == 's' || inpu == 'S') {
                game.standPlayer();
            }
            
              game.printCards(hand,0);
            // Print player & dealer cards
        }
        

        Player winner = game.getWinner();
        // Inform user who won using winner
        // Print player & dealer cards
    }
}



