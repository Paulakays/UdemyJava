
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        //Ask user to input a list of items
        System.out.println("Enter a list of items you would like to buy");
        input = scanner.nextLine();

        //Create an ArrayList to store the items
        ArrayList<String>userInputs = new ArrayList<>();

        //Split the input by commas and add items to the list
        String[] items = input.split(" ");
        for(String item : items){
            System.out.println(item);

        }

        scanner.close();
    }
}
