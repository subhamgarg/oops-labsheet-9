import java.util.*;

/** Question 19: LinkedHashSet insertion order. */
public class Q19_LinkedHashSetOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Banana"); set.add("Apple"); set.add("Mango"); set.add("Apple");
        System.out.println("Insertion order: " + set);
    }
}
