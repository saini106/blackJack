package blackjack;

import java.util.ArrayList;

public class CardGame extends BlackJack{
   private PlayablePlayer player;
   private Dealer dealer;
   private DeckOfCards deck;
  
   
    public CardGame () {
        this.deck = new DeckOfCards();
        this.player = new PlayablePlayer (this.deck.Draw(), this.deck.Draw());
        this.dealer = new Dealer (this.deck.Draw(), this.deck.Draw());
    }
    
    public void printCards(ArrayList<Card> cards) {
        printCards(cards, 0); 
    }

    public void printCards(ArrayList<Card> cards, int flippedCards) {
        for (Card card : cards) {
            
            if (flippedCards == 0) {
                System.out.println((card.getFace() + " of " + card.getSuit()));
            } else {
                System.out.println("face down card");
                flippedCards--;
            }
        }
    }

    public PlayablePlayer getPlayer(){ return player; } 
    public Dealer getDealer(){ return dealer; }


   /**
    *  Compares two player objects and determines which one is the
    *   winner of the two. The winner is returned. If it is a tie,
    *   NULL is returned.
    * @return Player
    */
   public Player getWinner ()
   {
       int playerDiff = Math.abs (21 - this.player.getHandValue ());
       int dealerDiff = Math.abs (21 - this.dealer.getHandValue ());

        // Anyone get blackjack?
        if (playerDiff == 0)
            return this.player;
        else if (dealerDiff == 0)
            return this.dealer;

        // Who got closer?
        if (playerDiff > dealerDiff)
            return this.dealer;
        else if (playerDiff < dealerDiff)
            return this.player;

        // Then it is a tie game
        return null;
   }

   /** 
    * Draws a card from a stack of cards.
    * @return void 
    */
   public void hitPlayer ()
   {
        Card c = deck.Draw();

        if (c != null) 
            this.player.addCard (c);
   }

   /** 
    * Determines if the player has busted.
    * @param boolean 
    */
   public boolean checkBust () 
   {
       if (player.getHandValue() > 21) return true;
       return false;
   }

   public void standPlayer () { if (!player.isStanding()) player.stand(); }

   public boolean playerStanding () { return player.isStanding(); }

}