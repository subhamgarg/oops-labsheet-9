import java.util.*;

/** Question 25: Add, remove, peek on Queue. */
public class Q25_QueueOperations {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A"); queue.offer("B"); queue.offer("C");
        System.out.println("Peek: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Now: " + queue);
    }
}
