import java.util.Scanner;
public class SimpleInterestCalculator{
    public static void main ( String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here is a simple calculator for your simple interest ");
        System.out.println("How much is the principal amount?");
        double principalAmount=scanner.nextDouble();
        System.out.println("What is the is the annual interest rate?");
        double interestRate = scanner.nextDouble();
        System.out.println("What is the time period in years?");
        int time = scanner.nextInt();
        double simpleInterest= interestRate * time * principalAmount / 100;
        System.out.print(" Your simple interest rate is " + simpleInterest);


        scanner.close();
    }
}