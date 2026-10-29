import java.util.*;

/** Question 21: Create PriorityQueue and print. */
public class Q21_PriorityQueuePrint {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(30); queue.add(10); queue.add(20);
        System.out.println("Queue heap view (not sorted order): " + queue);
    }
}
