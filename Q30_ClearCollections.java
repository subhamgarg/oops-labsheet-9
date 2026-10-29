import java.util.*;

/** Question 30: Clear List, Set and Queue. */
public class Q30_ClearCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2));
        Set<Integer> set = new HashSet<>(Arrays.asList(3, 4));
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(5, 6));
        list.clear(); set.clear(); queue.clear();
        System.out.println("List empty? " + list.isEmpty());
        System.out.println("Set empty? " + set.isEmpty());
        System.out.println("Queue empty? " + queue.isEmpty());
    }
}
