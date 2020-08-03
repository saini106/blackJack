package blackjack;
import java.util.*;

public class PlayablePlayer extends Player
{
    private boolean stand;

    public PlayablePlayer () { super(); }
    public PlayablePlayer (Card c1, Card c2) { super (c1, c2); }

    public boolean isStanding () { return this.stand; }

    public void toggleStand () { this.stand = (!this.stand); }

    public void addCard (Card c) { this.addCard (c); }
}