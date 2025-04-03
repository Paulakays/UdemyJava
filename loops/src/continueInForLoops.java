import java.util.Scanner;

public class continueInForLoops {

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            int numberOfChildren;
            System.out.println("Enter the number of children: ");
            numberOfChildren = scanner.nextInt();

            for (int x = 5; x < numberOfChildren; x++){
                if(x==10){
                    //10 is ignored while incrementing i.e if the number entered is more than 10
                    continue;
                    //Any statement after continue will not be executed because it's not reachable
                }
                System.out.println(x);
            }
            System.out.println(numberOfChildren);
        }
    }


