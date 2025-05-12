import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main (String[]args){
       Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter the first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the second number");
            int secondNumber = scanner.nextInt();
            int result = firstNumber / secondNumber;
            System.out.println("The result is: " + result);
        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }finally{
            scanner.close();
        }

    }
}
