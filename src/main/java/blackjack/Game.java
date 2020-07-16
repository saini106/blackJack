package blackjack;

public class Game {
    
    private static void main (String[] args)
    {
        boolean stand = false;

        CardGame game = new CardGame ();
        // Game loop
        do {
            System.out.println ("Dealer :" + CardGame.getDealer().getRevealCard());
            System.out.println ("Player :" + CardGame.getPlayer().ShowHand() + "\n");

            System.out.print ("Hit or Stand? [H|S]:");
            char input ='c';

            switch (input) {
                case 'H':
                case 'h':
                    game.Hit (game.getPlayer());
                    break;
                case 'S':
                case 's':
                    break;
                default: 
                    System.out.println ("Not an option!");
            }

            if (input == 'H' || input == 'h') {
                game.Hit (game.getPlayer ());
                if (game.getPlayer().getHandValue() > 21)
                    game.getPlayer().toggleBust();
            } else {
                game.getPlayer().toggleStand();
            }

        } while (CardGame.getPlayer().stand() || CardGame.getPlayer().bust());

        // Compare dealer hand with player hand
        game.getWinner();
    }
}