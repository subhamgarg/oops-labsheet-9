import java.util.*;

/** Question 22: Remove priority queue elements in priority order. */
public class Q22_PriorityQueuePoll {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Arrays.asList(40, 10, 30, 20));
        while (!queue.isEmpty()) System.out.println("Removed: " + queue.poll());
    }
}
