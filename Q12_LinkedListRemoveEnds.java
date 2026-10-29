import java.util.*;

/** Question 12: Remove first and last LinkedList elements. */
public class Q12_LinkedListRemoveEnds {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("First removed: " + nums.removeFirst());
        System.out.println("Last removed: " + nums.removeLast());
        System.out.println("Remaining: " + nums);
    }
}
