package blackjack;

public class PlayablePlayer extends Player
{
    private boolean stand;

    public PlayablePlayer () { super(); }
    public PlayablePlayer (Card c1, Card c2) { super (c1, c2); }

    public boolean isStanding () { return this.stand; }

    public void stand () { this.stand = (!this.stand); }

    public void addCard (Card c) 
    { 
        this.hand.addCard(c);
    }
}