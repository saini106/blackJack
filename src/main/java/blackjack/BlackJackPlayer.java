package blackjack;
import java.util.*;

public abstract class BlackJackPlayer
{
    public abstract Hand getHand ();
    public abstract int getHandValue ();
    public abstract Card getCardAt (int i);
}