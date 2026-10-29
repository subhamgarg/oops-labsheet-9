import java.util.*;

/** Question 03: Insert an element at a specific index. */
public class Q03_ArrayListInsert {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Delhi", "Jaipur"));
        cities.add(1, "Agra");
        System.out.println("After insert: " + cities);
    }
}
