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
        Stack<Card> aces = new Stack<Card>();
        int handValue = 0;

        for (int i = 0; i < hand.size (); i++) {
            Card c = hand.get (i);
            if (c.getFace() == Card.Face.ACE) 
                aces.push (c); // save it for later
            else 
                handValue += BlackJack.EvaluateCard (c.getFace());
        }

        // Evaluate aces if there were any
        if (aces.size() != 0)
            for (int i = 0; i < aces.size(); i++) {
                if (handValue + 11 < 21) 
                    handValue += 11;
                else 
                    handValue += 1;
                aces.pop();
            }

        return handValue;
    }


    public int getValue () { return this.value; }

    public Card getCardAt (int i) 
    {
        if (i < 0) return null;
        if (i > this.cards.size ()) return null;

        return cards.get (i);
    }

    public void updateHandValue () { this.value = EvaluateHand (this.cards); }

    public void showCards () 
    {
        for (int i = 0; i < this.cards.size (); i++) 
            System.out.println (this.getCardAt (i).toString());
    }

}