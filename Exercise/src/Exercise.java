// Importing the necessary Java package for handling user input
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a full sentence
        System.out.println("Enter a full sentence:");
        String sentence = scanner.nextLine();

        // Print the length of the sentence
        int numbers = sentence.length();
        System.out.println(numbers);

        // Print the first and last character of the sentence
        char firstCharacter = sentence.charAt(0);
        System.out.println("The first character of the sentence is: " + firstCharacter);
        char lastCharacter = sentence.charAt(10);
        System.out.println("The last character of the sentence is: " + lastCharacter);
        // Ask for another string to compare
        System.out.println("Enter another sentence to compare");
        String sentence2 = scanner.nextLine();

        // Compare the two sentences using equals and equalsIgnoreCase
        System.out.println(sentence.equalsIgnoreCase(sentence2));
        System.out.println(sentence.equals(sentence2));

        // Lexicographical comparison using compareTo
        System.out.println( sentence.compareTo(sentence2));

        // Demonstrate substring and replace methods
        String substring = sentence2.substring(6,10);
        System.out.println("Enter a word to replace in the first sentence");
        String word = scanner.nextLine();
        String replace = word.replace("World","Java");
        System.out.println(replace);

        // Convert sentence to upper and lower case
        String lower = sentence2.toLowerCase();
        String upper = sentence2.toUpperCase();
        System.out.println(lower);
        System.out.println(upper);

        // Formatting with strings and numbers
        System.out.println("Enter an interest rate");
        float interest= scanner.nextFloat();
        System.out.printf("The formatted interest rate is: %.2f%% ", interest);
    }
}
