
package blackjack;
import java.util.Scanner;

public class BlackJackTest {
    public static void main(String[] args) {
         CardGame game = new CardGame();
         Card c;
        char choice ='h';
      Scanner input = new Scanner(System.in);  
      
   while(!game.bust(game.getPlayer()) || game.getPlayer.isStand()){
             System.out.println("Hit or Stand");
             choice = input.next();
             if('h'.equals(choice)){
             
             game.Hit();
             }
             else if ('s'==(choice)){
                 game.GetWinner();
             }
         }
    }
    
    
}
