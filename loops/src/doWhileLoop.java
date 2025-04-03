import java.util.Scanner;

public class doWhileLoop {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int balance;
        // The code in "do" will keep being executed till the condition in while is met.

        do{
            System.out.print("Enter balance: ");
            balance = scanner.nextInt();
            System.out.println(balance);
        }while(balance > 0);

        scanner.close();
    }
}
