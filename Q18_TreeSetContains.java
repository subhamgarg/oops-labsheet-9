import java.util.*;

/** Question 18: Check TreeSet membership. */
public class Q18_TreeSetContains {
    public static void main(String[] args) {
        TreeSet<Integer> values = new TreeSet<>(Arrays.asList(10, 20, 30));
        System.out.println("Contains 20? " + values.contains(20));
        System.out.println("Contains 99? " + values.contains(99));
    }
}
