package blackjack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
import org.junit.Test;

public class BlackJackTest {

    @Test
    public void TestEvaluateHand () 
    {
        Hand goodHand = new Hand(
            new Card(Card.Suit.DIAMONDS, Card.Face.TEN), 
            new Card(Card.Suit.SPADES, Card.Face.TWO));
        
        // This method SHOULD return 12. If it doesn't the test fails
        assertEquals (BlackJack.EvaluateHand (goodHand.cards), 12);

        Hand badHand = new Hand (null, null);

        // If this method produces an error, it's a problem.
        assertEquals (BlackJack.EvaluateHand (badHand.cards), 0);

        Hand okHand = new Hand (
            new Card(Card.Suit.HEARTS, Card.Face.SIX),
            null);
        
        assertEquals (BlackJack.EvaluateHand (okHand.cards), 6);
    }    
}