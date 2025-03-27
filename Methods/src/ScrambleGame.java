//import utility class
import java.util.*;

public class ScrambleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //use Random class to shuffle words and pick random words
        Random random = new Random();

        //Game instructions
        System.out.println("Hello, welcome to Scramble Game!");
        System.out.println("In this game, you have to unscramble words to come up with correct words");
        System.out.println("For each word correctly unscrambled, you get one point");
        System.out.println("Good luck!");

        //List of words to be scrumbled
        String [] list = {"cupcake","diabolical","integer","welfare","enormous"};

        //initialise the score of the player
        int playerScore = 0;
        //controls the game loop i.e if it goes on or not
        boolean keepPlaying = true;

        while (keepPlaying) {
            //Select a random word from the list
            String word = list[random.nextInt(list.length)];

            // Scramble the selected word
            String scrambledWord = scrambleWord(word,random);

            // Track if the player has guessed correctly
            System.out.println("Scrambled word: " + scrambledWord);
            boolean wordGuessed = false;
            int attempts = 3;


            while (attempts > 0 && !wordGuessed) {
                //Prompt user for input and read the user's guess
                System.out.println("Your guess: ");
                String playerGuess = scanner.nextLine();

                if (playerGuess.equalsIgnoreCase(word)) {
                    System.out.println("You unscrambled the word!");
                    //player's score increases
                    playerScore++;
                    wordGuessed = true;
                }else{
                    //Decrease attempts on wrong answer
                    attempts--;
                    System.out.println("Your scrambled word is incorrect!");
                    System.out.println("Wrong! Attempts remaining: "+ attempts);
                }
            }

            // If user fails all attempts, reveal the correct word
            if(!wordGuessed){
                System.out.println("The correct word was: " + word);
            }
            System.out.println("Your current score is: " + playerScore);

            // Ask the user if they want to continue playing
            System.out.println("Do you want to play again? (Yes/No)");
            String answer = scanner.nextLine();
            //Continue only if the user inputs yes
            keepPlaying = answer.equalsIgnoreCase("Yes");
        }
        System.out.println("You guessed " + playerScore + " words right!");
        System.out.println("Thank you for playing Scramble Game!");
        System.out.println("Goodbye!");

    }
    //Create a method to return a scrambled word
    public static String scrambleWord(String word, Random random) {

        //Convert word into an array of characters
        char[] letters = word.toCharArray();

        //Goes through the letters and it's length
        for (int i = 0; i < letters.length; i++) {

            // Pick a random index
            int j = random.nextInt(letters.length);

            //Swaps letters
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }

        // Convert the shuffled char array back to a string
        return new String(letters);
    }



}
