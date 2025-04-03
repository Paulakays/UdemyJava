import java.util.Scanner;

public class breaksInForLoops {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);

        int numberOfChildren;
        System.out.println("Enter the number of children: ");
        numberOfChildren = scanner.nextInt();

        for (int x = 5; x < numberOfChildren; x++){
            if(x%2==0){
                //loop breaks immediately if the "if" statement is true. Increment is not continued
                break;

            }
            System.out.println(x);
        }
        System.out.println(numberOfChildren);
    }
}
