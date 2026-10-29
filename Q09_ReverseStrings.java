import java.util.*;

/** Question 09: Reverse ArrayList strings. */
public class Q09_ReverseStrings {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        Collections.reverse(words);
        System.out.println("Reversed order: " + words);
    }
}
