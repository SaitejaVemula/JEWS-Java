import java.util.Scanner;

class Prompter {

    private Game game;

    public Prompter( Game game ) {
        this.game = game;
    }

    public boolean promptForGuess() {
        Scanner scanner = new Scanner(System.in);
        boolean isHit = false;
        boolean isAcceptable = false;

        do {
            System.out.print("Enter a letter :  ");
            String guessInput = scanner.nextLine();

            try {
                isHit = game.applyGuess(guessInput);
                isAcceptable = true;
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage() + " Please try again.");
            }

        } while(! isAcceptable);

        return isHit;
    }

    public void displayProgress() {
        System.out.println("You have "+ game.getRemainingTries() +" tries left to solve :  " + game.getCurrentProgress());
    }

    public void displayOutcome() {
        if(game.isWon()) {
            System.out.println("Congratulations, you've won the game with " + game.getRemainingTries() + " tries remaining.");
        } else {
            System.out.println("Sorry, you've lost it. The word was " + game.getAnswer());
        }
    }

}