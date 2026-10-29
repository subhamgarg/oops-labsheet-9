import java.util.*;

/** Question 16: Iterate HashSet using Iterator. */
public class Q16_HashSetIterator {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(15, 5, 25));
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
