import java.util.*;

/** Question 06: Iterate ArrayList using for-each. */
public class Q06_ForEachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        for (Integer number : numbers) System.out.println(number);
    }
}
