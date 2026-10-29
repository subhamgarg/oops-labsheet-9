import java.util.*;

/** Question 15: Remove element from HashSet. */
public class Q15_HashSetRemove {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(Arrays.asList("Asha", "Ravi", "Neha"));
        System.out.println("Removed Ravi? " + names.remove("Ravi"));
        System.out.println("Remaining: " + names);
    }
}
