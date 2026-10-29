import java.util.*;

/** Question 29: Convert Set to List and iterate. */
public class Q29_SetToList {
    public static void main(String[] args) {
        Set<String> source = new LinkedHashSet<>(Arrays.asList("Java", "DBMS", "AI"));
        List<String> list = new ArrayList<>(source);
        for (String item : list) System.out.println(item);
    }
}
