import java.util.Stack;
import Card;
import Player;

public class CardGame extends BlackJack{
   private Player player;
   private Player dealer;
   private Stack<Card> Deck;

   public CardGame (Player player, Player dealer) 
   {
       this.player = player;
       this.dealer = dealer;
   }

   static Stack<Card> GenerateDeck ()
   {
       Card[] tempDeck = new Card[52];

       // Load cards
       int c;
       for (int suit = 0; suit < 4; suit++) {
           for (int face = 0; face < 14; face++) {
               tempDeck[c] = new Card (
                   Card.Suit.values()[suit], Card.Face.values()[face]); 
           }
       }

       Stack<Card> deck = new Stack<>();
       // shuffle cards
       for (c = 0; c < tempDeck.length; c++) {
           int index = (1 * Math.random() * (52 -1));
           Card temp = tempDeck[index];
           
           tempDeck[index] = deck[c];
           deck[c] = temp;
       }

       for (c = 0; c < tempDeck.length; c++) 
           deck.push(tempDeck[c]);
        
        return deck;
   }

   static Player getClosest (Player p1, Player p2)
   {
       int p1HandDiff = 21 - p1.getHandValue ();
       int p2HandDiff = 21 - p2.GetHandValue ();

        // Who got exactly 21?
        if (p1HandDiff == 0)
            if (p2HandDiff == 0)
                return null;
            else
                return p1;
        if (p2HandDiff == 0) return p2;

        // Who went over 21?
        if (p1HandDiff < 0)
            if (p2HandDiff < 0) 
                if (p1HandDiff == p2HandDiff)
                    return null;
            else
                return p2;
        if (p2HandDiff < 0) return p1;

        // Who got the closest?
        if (p1HandDiff > p2HandDiff) return p1;

        // Did they match?
        if (p1HandDiff == p2HandDiff) return null;

        return p2;
   }

   static void Draw (Player p, Stack<Card> deck)
   {
        if (!p.hasFullHand ()) {
            if (!deck.empty ())
                p.addCard (deck.pop ());
            return;
        }
        System.out.Println ("Cannot draw another card!\n");
   }

   static void Discard (Player p, Card card)
   {
       if(p.hasFullHand ()) {
           p.removeCard (card);
           return;
       }

       System.out.Println ("Cannot discard another card!\n");
   }

   static ArrayList<Card> CreateHand (Stack<Card> deck)
   {
       ArrayList<Card> hand = new ArrayList<>();

       hand.add (deck.pop ());
       hand.add (deck.pop ());

       return hand;
   }
}