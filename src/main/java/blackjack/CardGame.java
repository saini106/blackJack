package blackjack;

import java.util.*;
import blackjack.Card;
import blackjack.Player;
import blackjack.Dealer;

public class CardGame extends BlackJack{
   private PlayablePlayer player;
   private Dealer dealer;
   private DeckOfCards deck;
   
    public CardGame () {
        this.deck = new DeckOfCards();
        this.player = new PlayablePlayer (this.deck.pop(), this.deck.pop());
        this.dealer = new Dealer (this.deck.pop(), this.deck.pop());
    }

    public PlayablePlayer getPlayer(){ return player; } 
    public Dealer getDealer(){ return dealer; }


   /**
    *  Compares two player objects and determines which one is the
    *   winner of the two. The winner is returned. If it is a tie,
    *   NULL is returned.
    * @param p1
    * @param p2
    * @return Player
    */
   static Player GetWinner (Player p1, Player p2)
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
   public void Hit (Player p)
   {
        Card c = deck.Draw();

        if (c != null) 
            p.AddCard (c);
   }

}