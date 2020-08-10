package blackjack;
import java.util.*;

public class Hand {

    ArrayList<Card> cards = new ArrayList<Card>();
    int value = 0;

    public Hand (Card c1, Card c2) {
        cards.add (c1);
        cards.add (c2);
        updateHandValue ();
    }

    private static int EvaluateHand (ArrayList<Card> hand)
    {
        return BlackJack.EvaluateHand (hand);
    }


    public int getValue () { return this.value; }

    public Card getCardAt (int i) 
    {
        if (i < 0) return null;
        if (i > this.cards.size ()) return null;

        return cards.get (i);
    }

    public void addCard (Card c) 
    {
        cards.add (c);
        updateHandValue ();
    }

    public void updateHandValue () { this.value = EvaluateHand (this.cards); }

    public void showCards () 
    {
        for (int i = 0; i < this.cards.size (); i++) 
            System.out.println (this.getCardAt (i).toString());
    }

    @Override
    public String toString () 
    {
        String out = "";

        for (int i = 0; i < this.cards.size(); i++)
            out += cards.get(i).toString ();

        return out;
    }

}