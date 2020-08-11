package blackjack;

import java.util.Scanner;

public class Game {
    
    public static void main (String[] args)
    {
        CardGame game = new CardGame ();
        
            System.out.print ("Hit or Stand? [H|S]:");
             
            Scanner input = new Scanner(System.in);
            
            char inpu = input.next().charAt(0);
             
            switch (inpu) {
                case 'H':
                case 'h':
                    game.hitPlayer ();
                    break;
                case 'S':
                case 's':
                    break;
                default: 
                    System.out.println ("Not an option!");
            }
        
            if (inpu == 'H' || inpu == 'h') {
                game.hitPlayer ();
                if (game.checkBust ()) {
                    game.getWinner();
                }
                   
                  
            else {
                game.standPlayer();
            }
            }
            System.out.println ("Dealer :" + game.getDealer().getRevealCard() );
            System.out.println ("Player :" + game.getPlayer().showHand() + "\n");
           
        // Compare dealer hand with player hand
       game.getWinner();
          
    }
}



