package blackjack;

import java.util.*;
import blackjack.Card;
import blackjack.Player;
import blackjack.Dealer;

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

       /**
        * Generates a new deck of 52 cards that is shuffled. The deck is 
        *   returned as a stack.
        * @param void
        * @return Stack<Card>
        */
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

   /**
    *  Compares two player objects and determines which one is the
    *   winner of the two. The winner is returned. If it is a tie,
    *   NULL is returned.
    * @param p1
    * @param p2
    * @return Player
    */
   static Player getWinner (Player p1, Player p2)
   {
       int p1HandDiff = 21 - p1.getHandValue ();
       int p2HandDiff = 21 - p2.getHandValue ();

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

   /** 
    * Draws a card from a stack of cards.
    * @param p
    * @param deck
    */
   static void Draw (Player p, Stack<Card> deck)
   {
        if (!p.hasFullHand ()) {
            if (!deck.empty ())
                p.addCard (deck.pop ());
            return;
        }
        System.out.Println ("Cannot draw another card!\n");
   }

   /**
    * Discards a card from a player's hand. Uses a card object 
    * to identify the card to be discarded.
    * @param p
    * @param card
    */
   static void Discard (Player p, Card card)
   {
       if(p.hasFullHand ()) {
           p.removeCard (card);
           return;
       }

       System.out.println ("Cannot discard another card!\n");
   }

   /**
    * Generates a new hand by grabbing a full hand from the 
    * stack of cards.
    * @param deck
    * @return ArrayList<Card>
    */
   static ArrayList<Card> CreateHand (Stack<Card> deck)
   {
       ArrayList<Card> hand = new ArrayList<>();

       hand.add (deck.pop ());
       hand.add (deck.pop ());

       return hand;
   }
}