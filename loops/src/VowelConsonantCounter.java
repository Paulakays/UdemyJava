/*import java.util.*;

public class VowelConsonantCounter {
    public static void main (String[]args){
        // Step 1: Declare and initialize Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user for input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Step 3: Initialize vowel and consonant counters
        int vowels = 0, consonants = 0;
        String vowelsList = "aeiouAEIOU";

        // Step 4: Loop through the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Step 5: Ask user if they want to continue or exit (COMPLETE THIS PART)
            System.out.println("Do you want to continue? (yes to continue, no to exit)");
            String userChoice = scanner.nextLine();

            if (userChoice.equals("yes")) {
                vowels++;
            break; // Exit loop early
        }

        // Step 6: Ignore non-alphabet characters
        if (!Character.isLetter(ch)) {
            continue;
        }

        // Step 7: Determine if character is a vowel or consonant (COMPLETE THIS PART)
        if ( {
        vowels++;
    } else {
        consonants++;
    }
}

// Step 8: Display results
        System.out.println("Total vowels: " + vowels);
        System.out.println("Total consonants: " + consonants);

// Step 9: Close Scanner
        scanner.close();
    }
    }
}

 */
