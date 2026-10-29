import java.util.*;

/** Question 26: ArrayList of Student objects iterated by Iterator. */
public class Q26_CustomObjectIterator {
    public static void main(String[] args) {
        class Student {
            int id; String name;
            Student(int id, String name) { this.id = id; this.name = name; }
            public String toString() { return id + " - " + name; }
        }
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Asha"));
        students.add(new Student(2, "Ravi"));
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
