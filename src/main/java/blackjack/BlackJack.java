package blackjack;

import java.util.*;

public abstract class BlackJack {
   private static int MaxDeckSize;
   private static int MaxHandSize;
   private static int MaxDraw;
   private static int MaxDiscard;
  
  
    public static int EvaluateHand(ArrayList<Card> hand){
        Stack<Card> aces = new Stack<Card>();
        int handValue = 0;

        for (int i = 0; i < hand.size (); i++) {
            Card c = hand.get (i);
            if (c != null) {
                if (c.getFace() == Card.Face.ACE) 
                    aces.push (c); // save it for later
                else 
                    handValue += BlackJack.EvaluateCard (c.getFace());
            }
        }

        // Evaluate aces if there were any
        if (aces.size() != 0) 
            for (int i = 0; i < aces.size(); i++) {
                if (handValue + 11 <= 21) 
                    handValue += 11;
                else 
                    handValue += 1;
                aces.pop();
            }

        return handValue;
    }
       
    public static int EvaluateCard(Card.Face c){
        if (c == null) return 0;
        switch(c){
            case ACE:   return 1;
            case TWO:   return 2;
            case THREE: return 3;
            case FOUR:  return 4;
            case FIVE:  return 5;
            case SIX:   return 6;
            case SEVEN: return 7;
            case EIGHT: return 8;
            case NINE:  return 9;
            case TEN:   
            case KING:  
            case JACK:  
            case QUEEN: return 10;
            default:    return 0;
        }
   }

   public static int getMaxDeckSize(){
       return MaxDeckSize;         
   }
   public static int getMaxHandSize(){
       return MaxHandSize;
   }
   public static int getMaxDraw(){
       return MaxDraw;
   }
   public static int getMaxDiscard(){
       return MaxDiscard;
   }

   public abstract Player getWinner ();
   public abstract boolean checkBust ();
   public abstract void hitPlayer ();
}
