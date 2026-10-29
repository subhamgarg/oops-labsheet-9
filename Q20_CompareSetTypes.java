import java.util.*;

/** Question 20: Compare HashSet, LinkedHashSet, TreeSet. */
public class Q20_CompareSetTypes {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(7, 3, 9, 3, 1);
        System.out.println("HashSet (order unspecified): " + new HashSet<>(data));
        System.out.println("LinkedHashSet (insertion): " + new LinkedHashSet<>(data));
        System.out.println("TreeSet (sorted): " + new TreeSet<>(data));
    }
}
