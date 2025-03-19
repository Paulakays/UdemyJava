import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String>items = new ArrayList<>();
        items.add("oranges");
        items.add("mango");
        items.add("apple");
        items.add("banana");
        items.add("cherry");
        items.add("grapes");

        //Prints out all items
        System.out.println(items);

        //Prints out the third item in the list; arrays count from 0
        System.out.println(items.get(2));

        //Checks if a certain item is present in the list.
        //Every item has to be written the same as in the ArrayList otherwise it won't be recognised
        boolean fruitAvailable = items.contains ("cars");
        System.out.println(fruitAvailable);

        //Prints the number of items
        System.out.println(items.size());

        //Removes items in the data type entered
        items.remove("apple");
        System.out.println(items);

        //Removes items in the specified position
        items.remove(4);
        System.out.println(items);

        //Adds item in the first position
        items.addFirst("guavas");
        System.out.println(items);

    }
}
