import java.util.Scanner;

public class fibonacciSequence {
    public static void main (String[]args){
        //011235813
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of terms : ");
        int n = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        if(n==1){
                System.out.println(firstTerm);
        }else {
            System.out.print(firstTerm + " " + secondTerm);

            for(int i=3; i<=n; i++){
                int nextTerm = firstTerm + secondTerm;
                System.out.print(" " + nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
}
