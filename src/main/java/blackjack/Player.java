package blackjack;

import java.util.ArrayList;


public class Player{

    private static int playerNumber;

    private int handValue;
    private int id;
    private ArrayList<Card> hand;

    private boolean bust;
    
    Player(){}
    
    public Player(Card c1, Card c2){
        this.hand.add(c1);
        this.hand.add(c2);
        this.id = playerNumber++;
        handValue = BlackJack.EvaluateHand(hand);
        bust = false;
    }
    
    /**
     *  Prints the cards to stdout
     */
    public void ShowHand(){
        for(int i = 0; i < 2; i++){
            System.out.println(hand.get(i));
        }
    }
    

    /**
     *  Determines whether the hand can accept more cards
     * @param handValue
     * @return boolean
     */
    public boolean hasFullHand (){
        if (hand.size () == 2)
            return true;
        return false;
    }
    
    /**
     * Adds a card to the player's hand 
     * @param c
     */
    public void addCard(Card c){
        this.hand.add(c);
        // Recalculate Hand value
        this.handValue = BlackJack.EvaluateHand(hand);
    }
    
    public int getHandValue(){
        return this.handValue;
    }
    
    public int getPlayerNumber(){
        return this.id;
    }
    
    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

}