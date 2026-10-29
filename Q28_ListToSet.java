import java.util.*;

/** Question 28: Convert List to Set removing duplicate items. */
public class Q28_ListToSet {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Asha", "Ravi", "Asha", "Neha");
        Set<String> unique = new LinkedHashSet<>(names);
        System.out.println("List: " + names);
        System.out.println("Set: " + unique);
    }
}
