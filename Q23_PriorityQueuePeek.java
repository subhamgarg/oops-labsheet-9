import java.util.*;

/** Question 23: Peek without removing first priority value. */
public class Q23_PriorityQueuePeek {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Arrays.asList(40, 10, 30));
        System.out.println("Peek: " + queue.peek());
        System.out.println("Size after peek: " + queue.size());
    }
}
