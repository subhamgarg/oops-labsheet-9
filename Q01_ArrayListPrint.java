import java.util.*;

/** Question 01: Create ArrayList of integers and print elements. */
public class Q01_ArrayListPrint {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        for (int value : values) System.out.println(value);
    }
}
