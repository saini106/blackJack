package blackjack;

import java.util.*;

public abstract class BlackJack {
   private static int MaxDeckSize;
   private static int MaxHandSize;
   private static int MaxDraw;
   private static int MaxDiscard;
  
  
    public static int EvaluateHand(ArrayList<Card> hand){
        Stack<Card> aces = new Stack<>();
        int handValue = 0;

        for (int i = 0; i < hand.size (); i++) {
            Card c = hand.get (i);
            if (c.getFace() == Card.Face.ACE) 
                aces.push (c); // save it for later
            else 
                handValue += BlackJack.EvaluateCard (c.getFace());
        }

        // Evaluate aces if there were any
        if (aces.size() != 0)
            for (int i = 0; i < aces.size(); i++) {
                if (handValue + 11 < 21) 
                    handValue += 11;
                else 
                    handValue += 1;
                aces.pop();
            }

        return handValue;
    }
       
    public static int EvaluateCard(Card.Face c){
       switch(c){
            case ONE:   
            case ACE:   return 1;
            case TWO:   return 2;
            case THREE: return 3;
            case FOUR:  return 4;
            case FIVE:  return 5;
            case SIX:   return 6;
            case SEVEN: return 7;
            case EIGHT: return 8;
            case NINE:  return 9;
            case TEN:   return 10;
            case KING:  return 10;
            case JACK:  return 10;
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
