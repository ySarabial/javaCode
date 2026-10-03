import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class Hangman {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Hangman");

        System.out.print("Enter your name: ");
        String playerName = input.nextLine();

        String displayName = playerName.toUpperCase();

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry, car, error, days");

        int randomIndex = random.nextInt(words.size());
        String randomWord = words.get(randomIndex);
        //System.out.println("Random word: " + randomWord);


        int maxAttempts = 6;
        int attempts = 0;
        int score = 100;
        boolean won = false;

        char[] hiddenWord = new char[randomWord.length()];

        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '_';
        }

        System.out.println("\nHello, " + displayName + "!"); //\n is new line
        System.out.println("Guess a the word, one letter at a time");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts && !won){

            System.out.print("\nWord: ");

            for (char letter : hiddenWord) {
                System.out.print(letter + " ");
            }

            System.out.print("\nEnter your guess:\t");
            char guess = input.next().toLowerCase().charAt(0);

            boolean correctGuess = false;

            for (int i = 0; i < randomWord.length(); i++){

                if (randomWord.charAt(i) == guess){
                    hiddenWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (correctGuess){
                System.out.println("Correct guess!");
            }
            else {
                attempts++;
                score -=20;
                System.out.println("Wrong guess!");
                System.out.println("Attempts left: " + (maxAttempts - attempts));

            }
            won = true;

            for (char letter : hiddenWord) {
                if (letter == '_') {
                    won = false;
                    break;
                }


            }

        }

        if (won) {
            System.out.println("\nCongratulations, " + displayName + "!");
            System.out.println("You guessed the word: " + randomWord);
            System.out.println("Your score: " + score);
        } else {
            System.out.println("\nGame Over!");
            System.out.println("The word was: " + randomWord);
            System.out.println("Your score: 0");
        }

        input.close();


    }



}
