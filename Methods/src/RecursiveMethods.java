import java.util.Scanner;

public class RecursiveMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + factorial(n));
        sc.close();
    }

    public static int factorial(int n) {
        //Returns 1 if the entered number is 1
        if (n == 0) {
            return 1;
        }
        //method factorial is calling itself in the same method
        return n * factorial(n - 1);
    }

    /*
    Eg; If the user inputs 5,here is how the factorial calculation will work:
       //Since 5 != 0, the function calls itself with factorial(4), waiting for its result before completing multiplication.
       factorial(5) → 5 * factorial(4)
       //4 is not 0, so it calls factorial(3), postponing multiplication.
       factorial(4) → 4 * factorial(3)
       //3 is not 0, so it calls factorial(2).
       factorial(3) → 3 * factorial(2)
       //2 is not 0, so it calls factorial(1).
       factorial(2) → 2 * factorial(1)
       //1 is not 0, so it calls factorial(0).
       factorial(1) → 1 * factorial(0)
       //Since n == 0, we return 1. This stops further recursion and starts returning values back up the call stack.
       factorial(0) → 1  (Base Case)

      Now that we reached the base case, we start returning values step by step:
      factorial(1) → 1 * factorial(0) = 1 * 1 = 1 //The result is used to multiply the next value
      factorial(2) → 2 * factorial(1) = 2 * 1 = 2
      factorial(3) → 3 * factorial(2) = 3 * 2 = 6
      factorial(4) → 4 * factorial(3) = 4 * 6 = 24
      factorial(5) → 5 * factorial(4) = 5 * 24 = 120

      Key Takeaways
     1.Recursion works like a stack:
           Calls are pushed until the base case is reached.
           Then, values are popped as the function returns.
     2.Base case stops infinite recursion:
           Without if (n == 0) return 1;, the function would recurse infinitely.
     3.Execution order:
           The function keeps calling itself until n == 0.
           Then, it starts returning values from the smallest call back up.

           //Every recursion must have a halting condition otherwise the recursion will be infinite
     */

    /* Alternatively, to save memory usage, this code could be applied:

    public class RecursiveMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + factorial(n));
        sc.close();
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by i at each step
        }
        return result; // Return the final result
    }
}
     */
}
