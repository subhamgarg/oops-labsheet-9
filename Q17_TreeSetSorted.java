import java.util.*;

/** Question 17: TreeSet sorts values automatically. */
public class Q17_TreeSetSorted {
    public static void main(String[] args) {
        TreeSet<Integer> sorted = new TreeSet<>(Arrays.asList(30, 5, 20, 10));
        System.out.println("Sorted: " + sorted);
    }
}
