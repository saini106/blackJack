package blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private static ArrayList<Card> hand;
    
    public static void main (String[] args)
    {
        CardGame game = new CardGame ();
        Player player = new Player();
        DeckOfCards doc = new DeckOfCards();
        Dealer dealer = new Dealer();
        
        
        
        game.getPlayer();
        game.getDealer();
        
            System.out.print ("Hit or Stand? [H|S]:");
            Scanner input = new Scanner(System.in);
            char inpu = input.next().charAt(0);
 
            if (inpu == 'H' || inpu == 'h') {
             
                DeckOfCards.GenerateDeck();
                game.hitPlayer();
                
                
             
                System.out.println(doc.Draw()); 
            
             if(player.getHandValue() < 21){
                 System.out.println("Hit or Stand");
                 if(inpu == 'h' || inpu == 'H'){
                   game.hitPlayer();
                     System.out.println();
                 }
                 
             }
               
            }  
            else if (inpu == 's' || inpu == 'S') {
                game.standPlayer();
            }
               
                  
                           
    
            
                    
                
            
            
          //  System.out.println ("Dealer :" + game.getDealer().getRevealCard() );
          //  System.out.println ("Player :" + game.getPlayer().showHand() + "\n");
           
        // Compare dealer hand with player hand
       game.getWinner();
          
    }
}



