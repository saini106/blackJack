import blackjack.Card;

public class CardTest {
   public static void main (String args[]) 
   {
       Card c = new Card (Card.Suit.HEARTS, Card.Face.ACE);
       
       System.out.println (c);
   }
}