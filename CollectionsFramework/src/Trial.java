import java.util.*;



public class Trial {
    public static void main(String[] args) {
       ArrayList<String> fruits = new ArrayList<>();
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Orange");
       fruits.add("Pear");
       fruits.add("Grape");

       System.out.println("The first fruit is " + fruits.getFirst());

       for (String fruit : fruits) {
           System.out.println(fruit);
       }

       LinkedList<String> animals = new LinkedList<>();
       animals.add("Dog");
       animals.add("Cat");
       animals.add("Cow");
       animals.add("Pig");
       animals.add("Sheep");
       animals.addLast("Lion");
       animals.addFirst("Rabbit");

       for (String animal : animals) {
           System.out.println(animal);
       }

       System.out.println("The second animal is " + animals.getLast());

       Stack<String> stack = new Stack<>();
       stack.push("chair");
       stack.push("table");
       stack.push("sofa");


       //Get the whole list of items
       System.out.println(stack);
       //Get the last item that was added in the list
       System.out.println("The last item added is: " + stack.peek());
       //Removes the item at the top of the list (item that was added last)
        System.out.println("The value removed is: " + stack.pop());

        //After removal of one item from the list, The size and position of items changes
        int sizeOfStack = stack.size();
        System.out.println("The size of the stack is: " + sizeOfStack);
        int search = stack.search("chair");
        System.out.println("The position of chair is: " + search);

        boolean isEmpty = stack.isEmpty();
        System.out.println("The stack is empty: " + isEmpty);

        //Doesn't list according to position
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("porsche");
        hashSet.add("Limousine");
        hashSet.add("Volkswagen");
        hashSet.add("Peugeot");

        System.out.println(hashSet);

        //checks if a particular item is in the list
        boolean contains = hashSet.contains("Peugeot");
        System.out.println("List contains Peugeot: " + contains);
        //Removes item from list
        hashSet.remove("Peugeot");
        //Checks the size of the list (number of items in the list)
        int size = hashSet.size();
        System.out.println("The size of the hash set is: " + size);

        for(String item : hashSet) {
            System.out.println(item);
        }
        hashSet.clear();
        System.out.println("Hash set after clearing: " + hashSet);
    }
}
