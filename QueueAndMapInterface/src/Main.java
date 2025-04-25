import java.util.*;

public class Main {
    public static void main(String[] args) {
     Queue<Integer> priorityQueue = new PriorityQueue<>();

     priorityQueue.add(10);
     priorityQueue.add(200);
     priorityQueue.add(36);
     priorityQueue.add(45);


     System.out.println("Priority Queue: " + priorityQueue);
     //Removed the first element in the queue
     int remove = priorityQueue.poll();
     System.out.println("Removed element: " + remove);
     System.out.println("Priority Queue: " + priorityQueue);


    }
}
