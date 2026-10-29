import java.util.*;

/** Question 24: Queue interface with LinkedList implementation. */
public class Q24_QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("First"); queue.offer("Second");
        System.out.println("Removed: " + queue.poll());
        System.out.println("Remaining: " + queue);
    }
}
