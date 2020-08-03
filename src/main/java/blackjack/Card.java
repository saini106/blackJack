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

    public static String suitToString (Card.Suit s)
    {
        switch (s) {
            case HEARTS:    return "Hearts";
            case DIAMONDS:  return "Diamonds";
            case CLUBS:     return "Clubs";
            case SPADES:    return "Spades";
            default:        return "";
        }
    }

    public static String faceToString (Card.Face f) {
        switch (f) {
            case ONE:   return "1";
            case TWO:   return "2";
            case THREE: return "3";
            case FOUR:  return "4";
            case FIVE:  return "5";
            case SIX:   return "6";
            case SEVEN: return "7";
            case EIGHT: return "8";
            case NINE:  return "9";
            case TEN:   return "10";
            case JACK:  return "Jack";
            case QUEEN: return "Queen";
            case ACE:   return "Ace";
            default:    return "";
        }
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

 
    public String toString ()
    {
        return "face: " + faceToString(this.face) + "suit: "+suitToString(this.suit);
    }
}