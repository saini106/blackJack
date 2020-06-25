package blackjack;
import java.util.*;


public abstract class BlackJack {
   private static int MaxDeckSize;
   private static int MaxHandSize;
   private static int MaxDraw;
   private static int MaxDiscard;
  
  
public static int EvaluateHand(ArrayList<Card> hand){

  if (hand.get(0).getFace() == Card.Face.ACE)
    if (EvaluateCard (hand.get(1).getFace()) == 10) // is it another face card?
        return 21;
  if (hand.get(2).getFace() == Card.Face.ACE)
    if (EvaluateCard (hand.get(0).getFace()) == 10) // is it another face card?
        return 21;

  return EvaluateCard(hand.get(0).getFace()) + 
    EvaluateCard(hand.get(1).getFace()); 
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

   public abstract void Draw();
   public abstract void Discard();
   public abstract void CreateHand();
   public abstract void MeetsWinCondition();
}
