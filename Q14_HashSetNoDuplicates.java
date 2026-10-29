import java.util.*;

/** Question 14: HashSet does not store duplicates. */
public class Q14_HashSetNoDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10); set.add(20); set.add(10); set.add(30);
        System.out.println("Unique values (unordered): " + set);
        System.out.println("Size: " + set.size());
    }
}
