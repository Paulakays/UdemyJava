import java.util.*;

public class SandwichMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many slices of cheese do you want on your sandwich?");
        //Method is called including the users input
        makeSandwich(scanner.nextInt());

        scanner.close();
    }

    public static void makeSandwich(int slicesOfCheese) {
        System.out.println("Take two slices of bread");
        System.out.println("Spread butter on one slice");
        for (int i = 0; i < slicesOfCheese; i++) {
            System.out.println("Add a slice of cheese");
        }
        System.out.println("Put the second slice of bread on top");
        System.out.println("Sandwich is ready!");

    }
}
