import java.util.Scanner;
public class simpleCalculations{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite food");
        String name = scanner.nextLine();
        System.out.println("Wow!! I love " + name +" too!");
        scanner.close();
    }
}
