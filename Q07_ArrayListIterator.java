import java.util.*;

/** Question 07: Iterate ArrayList using Iterator. */
public class Q07_ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Asha", "Ravi", "Neha"));
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
