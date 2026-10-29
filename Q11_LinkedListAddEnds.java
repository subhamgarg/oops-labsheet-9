import java.util.*;

/** Question 11: Add beginning and end of LinkedList. */
public class Q11_LinkedListAddEnds {
    public static void main(String[] args) {
        LinkedList<String> days = new LinkedList<>(Arrays.asList("Tuesday", "Wednesday"));
        days.addFirst("Monday"); days.addLast("Thursday");
        System.out.println(days);
    }
}
