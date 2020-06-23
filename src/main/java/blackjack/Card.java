package blackjack;
public class Card {
    public static enum Suit  
    {
        HEARTS,
        DIAMONDS,
        CLUBS,
        SPADES
    } 
    public static enum Face 
    {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        KING,
        QUEEN,
        ACE
    }

    private Suit suit;
    private Face face;

    public Card (Suit suit, Face face)
    {
        this.suit = suit;
        this.face = face;
    }

    public Suit getSuit () { return this.suit; }
    public Face getFace () { return this.face; }
    public void setFace (Face face) { this.face = face; }
    public void setSuit (Suit suit) { this.suit = suit; }
}