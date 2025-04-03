import java.util.Scanner;

public class whileLoop {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        //Balance in bank
        double bankBalance = 1000.00;

        //Prompt user to enter the amount they would like to withdraw
        System.out.println("Please enter the amount you would like to withdraw: ");
        double userInput= scanner.nextDouble();

        //Condition if the user withdraws more than 1000 or less than 0
        while (userInput >1000 || userInput < 0) {
            System.out.println("Please enter a valid amount");
            //If the user enters an amount that is more than 1000 or less than 0, the amount will keep on being invalid.
            userInput = scanner.nextDouble();
            System.out.println("You entered: " + userInput);
        }
        scanner.close();
    }
}
