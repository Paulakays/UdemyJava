
   import java.util.Scanner;

    public class BreakInForLoops {
        public static void main(String[] args) {
            int numberOfChildren;

            // prompt user for input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of children: ");


            // input validation loop
            while(true) {
                if(scanner.hasNextInt()){
                    numberOfChildren = scanner.nextInt();
                    // exit the loop if input is valid
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    // clear the invalid input
                    scanner.next();
                }
            }

            scanner.close();

            for (int x = 5; x < numberOfChildren; x++) {
                if (x % 2 == 0) {
                    break;
                }
                System.out.println(x);
            }
            System.out.println(numberOfChildren);
        }
    }



