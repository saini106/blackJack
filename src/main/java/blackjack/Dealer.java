package blackjack;

public class Dealer extends Player 
{
    private Card revealedCard;
    public Dealer (Card c1, Card c2) {super (c1, c2);} 
    public Dealer () {super ();}

   public Card getRevealCard () {return this.revealedCard;}
}