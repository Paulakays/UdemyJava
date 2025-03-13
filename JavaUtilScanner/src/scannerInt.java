import java.util.Scanner;

public class scannerInt{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What year did Kenya gain independence?");
        int name = scanner.nextInt();
        System.out.println("Yes, that's correct!");
        scanner.close();
    }
}