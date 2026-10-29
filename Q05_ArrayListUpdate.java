import java.util.*;

/** Question 05: Update ArrayList at index. */
public class Q05_ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        colors.set(1, "Yellow");
        System.out.println("Updated: " + colors);
    }
}
