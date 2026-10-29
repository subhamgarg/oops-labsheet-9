import java.util.*;

/** Question 13: Get first and last LinkedList elements. */
public class Q13_LinkedListGetEnds {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(Arrays.asList("One", "Two", "Three"));
        System.out.println("First: " + names.getFirst());
        System.out.println("Last: " + names.getLast());
    }
}
