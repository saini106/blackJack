
import blackjack.Card;
import blackjack.CardGame;
import java.util.ArrayList;
import java.util.Stack;


public class DeckOfCards  {
    private Stack<Card> deck;
    private int cardsLeft;


public DeckOfCards(){
   this.deck = GenerateDeck();
}
    
    public static Stack<Card> GenerateDeck(){
       Card[] tempDeck = new Card[52];
       int c = 0;
       for (int suit = 0; suit < 4; suit++) {
           for (int face = 0; face < 14; face++) {
               tempDeck[c] = new Card (
                   Card.Suit.values()[suit], Card.Face.values()[face]); 
                c++;
           }
       }
   
     Stack<Card> deck = new Stack<>();
       // Populate a deck and shuffle the cards
       for (c = 0; c < tempDeck.length; c++) {
           int index = (int)(1 * Math.random() * (52 -1));
           Card temp = tempDeck[index];
           
           tempDeck[index] = tempDeck[c];
           tempDeck[c] = temp;
       }
       // Copy the shuffled deck into a Stack
       for (c = 0; c < tempDeck.length; c++) 
           deck.push(tempDeck[c]);
        
        return deck;
   }
    public Card Draw() {
        if (!deck.empty ()) {
            return deck.pop(); 
        }
        return null;
    }
   /* public Card[] DrawCardSet(int amount){
        amount = 
    } */
}


