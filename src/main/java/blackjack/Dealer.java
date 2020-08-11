package blackjack;

public class Dealer extends Player 
{
    public Dealer () { 
        super (); 
    }
    public Dealer (Card c1, Card c2) { 
        super(c1, c2); 
    } 
    
    public Card getRevealCard () { return this.getCardAt (1); }
}