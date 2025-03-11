import java.util.Scanner;


public class SimpleChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Greetings
        System.out.println("Hello, My name is Linda, let's chat!");
        //Prompt user to enter something
        System.out.println("Feel free to carry on the conversation!😉");
        String greetingsInput = scanner.nextLine();
        //Process user input using conditional statements
        if (greetingsInput.equalsIgnoreCase("Hello")
                || greetingsInput.equalsIgnoreCase("Hi")
        ) {
            System.out.println("How are you doing?");
        }
            //offer service
            System.out.println("How may I help you today?");
            String serviceOutput = scanner.nextLine();
            if (!serviceOutput.equalsIgnoreCase("help")) {
                System.out.println("Sorry, I don't understand. Please write in other words");
            }


            scanner.close();
        }
    }

