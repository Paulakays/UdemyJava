import java.util.Scanner;

public class basicIntCalculator{
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Welcome to basic integers calculator.");
        System.out.println("Please enter the first number and press enter. It has to be an integer");
        int number1 = scanner.nextInt();
        System.out.println("Please enter the second number and press enter. It has to be an integer");
        int number2 = scanner.nextInt();
        int sum = number1+ number2;
        System.out.println("The answer is " + sum);
    }
}