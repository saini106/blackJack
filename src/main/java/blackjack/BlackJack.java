package blackjack;
import java.util.*;


public abstract class BlackJack {
   private static int MaxDeckSize;
   private static int MaxHandSize;
   private static int MaxDraw;
   private static int MaxDiscard;
  
  
public static int EvaluateHand(ArrayList<Card> hand){
  int value = 0;
  for (int i=0; i< hand.size(); i++)
  {
    value += EvaluateCard(hand.get(i).getFace());
  }
  return value;
} 
       
    public static int EvaluateCard(Card.Face c){
       switch(c){
            case ONE:   return 1;
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
            case ACE:   return 11;
            default:    return 0;
       }
   }
   
   public void Draw(){
       
   }
   public void Discard(){
       
   }
   public void CreateHand(){
       
   }
   public void MeetsWinCondition(){
       
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
}
