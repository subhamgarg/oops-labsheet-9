import java.util.*;

/** Question 10: Create and display LinkedList strings. */
public class Q10_LinkedListPrint {
    public static void main(String[] args) {
        LinkedList<String> subjects = new LinkedList<>(Arrays.asList("Java", "DBMS", "AI"));
        for (String subject : subjects) System.out.println(subject);
    }
}
