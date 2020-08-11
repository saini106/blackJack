package blackjack;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
import org.junit.Test;

public class BlackJackTest {

    @Test
    public void TestEvaluateHand () 
    {
        Hand goodHand = new Hand(
            new Card(Card.Suit.DIAMONDS, Card.Face.TEN), 
            new Card(Card.Suit.SPADES, Card.Face.TWO));
        
        Hand blackJackHand = new Hand(
            new Card(Card.Suit.DIAMONDS, Card.Face.TEN),
            new Card(Card.Suit.SPADES, Card.Face.ACE));

        Hand doubleAceHand = new Hand(
            new Card(Card.Suit.SPADES, Card.Face.ACE),
            new Card(Card.Suit.DIAMONDS, Card.Face.ACE));

        Hand badHand = new Hand (null, null);

        Hand okHand = new Hand (
            new Card(Card.Suit.HEARTS, Card.Face.SIX),
            null);

        Assert.assertEquals (21, BlackJack.EvaluateHand(blackJackHand.cards));

        Assert.assertEquals (2, BlackJack.EvaluateHand(doubleAceHand.cards));
        
        // This method SHOULD return 12. If it doesn't the test fails
        Assert.assertEquals (12, BlackJack.EvaluateHand (goodHand.cards));


        // If this method produces an error, it's a problem.
        Assert.assertEquals (0, BlackJack.EvaluateHand (badHand.cards));

        
        Assert.assertEquals (6, BlackJack.EvaluateHand (okHand.cards));
    }    

    @Test
    public void TestEvaluateCard () 
    {
        Assert.assertEquals (BlackJack.EvaluateCard (Card.Face.EIGHT), 8);

        Assert.assertEquals (BlackJack.EvaluateCard (null), 0);
    }
}