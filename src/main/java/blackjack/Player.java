package blackjack;

import java.util.ArrayList;


public class Player{

    int handValue;
    private int id;
    private static int playerNumber;
    
    private ArrayList<Card> hand;
    
    Player(){
        
    }
    
    public Player(Card c1, Card c2){
      
        this.handValue = handValue;
        hand.add(c1);
        hand.add(c2);
        id = playerNumber++;
    }
    
    public void ShowHand(){
        for(int i = 0; i < 2; i++){
            System.out.println(hand.get(i));
        }
    }
    

    public boolean hasFullHand(int handValue){
        if(handValue==(21)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void addCard(Card c){
        hand.add(c);
    }
    
    public int getHandValue(int handValue){
        return handValue;
    }
    
    public int getNumber(int number){
        return number;
    }
    
    public Card getCard(Card currentCard){
        return currentCard;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

}