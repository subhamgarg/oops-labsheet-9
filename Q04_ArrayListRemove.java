import java.util.*;

/** Question 04: Remove by index and by value. */
public class Q04_ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Guava"));
        System.out.println("Removed at index 1: " + fruits.remove(1));
        System.out.println("Removed Mango by value? " + fruits.remove("Mango"));
        System.out.println("Remaining: " + fruits);
    }
}
