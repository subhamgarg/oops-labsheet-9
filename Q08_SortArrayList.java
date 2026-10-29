import java.util.*;

/** Question 08: Sort ArrayList ascending. */
public class Q08_SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(9, 2, 7, 1, 5));
        Collections.sort(numbers);
        System.out.println("Ascending: " + numbers);
    }
}
