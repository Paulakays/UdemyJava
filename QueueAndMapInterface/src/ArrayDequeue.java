import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {
    public static void main(String[] args) {
        Deque<String> arrayDequeue = new ArrayDeque<String>();

        arrayDequeue.addLast("Hello");
        arrayDequeue.addLast("World");
        arrayDequeue.addFirst("First");

        System.out.println("Array dequeue:" + arrayDequeue);

        String removedFirst = arrayDequeue.removeFirst();
        System.out.println("Removed first: " + removedFirst);
        System.out.println("Array dequeue:" + arrayDequeue);

        String peekFirst = arrayDequeue.peekFirst();
        System.out.println("Peek first: " + peekFirst);
        System.out.println("Array dequeue:" + arrayDequeue);
    }
}
