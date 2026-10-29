import java.util.*;

/** Question 02: Add elements to ArrayList and show size. */
public class Q02_ArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Asha"); names.add("Ravi"); names.add("Neha");
        System.out.println("Names: " + names);
        System.out.println("Size: " + names.size());
    }
}
