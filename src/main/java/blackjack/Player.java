package blackjack;

import java.util.ArrayList;


public class Player extends BlackJackPlayer 
{
    private static int playerNumber = 0;
    private int number;
    private Hand hand;

    Player() {}
    public Player (Card c1, Card c2) {
        this.hand = new Hand (c1, c2);
        this.number = getNextPlayerNumber();
    }

    private static int getNextPlayerNumber () { return playerNumber++; }

    @Override
    public Hand getHand () { return this.hand; }

    @Override
    public Card getCardAt (int i) { return hand.getCardAt (i); }

    @Override
    public int getHandValue () { return this.hand.getValue(); }
    
    public int getPlayerNumber(){ return this.number; }
}