package blackjack;

public class Game {
    
    public static void main (String[] args)
    {
        CardGame game = new CardGame ();
        // Game loop
        do {
            System.out.println ("Dealer :" + game.getDealer().getRevealCard() );
            System.out.println ("Player :" + game.getPlayer().showHand() + "\n");

            System.out.print ("Hit or Stand? [H|S]:");
            char input ='c';

            switch (input) {
                case 'H':
                case 'h':
                    game.hitPlayer ();
                    break;
                case 'S':
                case 's':
                    break;
                default: 
                    System.out.println ("Not an option!");
            }

            if (input == 'H' || input == 'h') {
                game.hitPlayer ();
                if (game.checkBust ()) {}
                    //TODO: Code to exit game loop. Player looses.
            } else {
                game.standPlayer();
            }

        } while (game.getPlayer().isStanding() || game.checkBust());

        // Compare dealer hand with player hand
        game.getWinner();
    }
}