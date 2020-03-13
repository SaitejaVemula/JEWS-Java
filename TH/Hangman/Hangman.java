class Hangman {

    public static void main(String[] args) {

        Game game = new Game("jagruthi");
        Prompter prompter = new Prompter(game);

        while (game.getRemainingTries() > 0 && !game.isWon()) {
            prompter.promptForGuess();
            prompter.displayProgress();
        }

        prompter.displayOutcome();
    }

}