//Import Scanner class
import java.util.*;


public class ReturnMethods {
    public static void main (String[] args){
       Scanner scanner = new Scanner (System.in);

       //Prompt user for input
       System.out.println("Enter a first number");
       int num1 = scanner.nextInt();
       System.out.println("Enter a second number");
       int num2 = scanner.nextInt();

       //create a variable to access numbers method
       int result = numbers(num1, num2);

       //Print out the result
       System.out.println("The result is: " + result);

    }

    //Create a method that returns the sum of numbers
    public static int numbers(int num1, int num2){
        return num1 + num2;
    }
}
