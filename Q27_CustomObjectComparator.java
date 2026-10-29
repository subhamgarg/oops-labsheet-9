import java.util.*;

/** Question 27: Sort custom Student objects with Comparator. */
public class Q27_CustomObjectComparator {
    public static void main(String[] args) {
        class Student {
            int roll; String name;
            Student(int roll, String name) { this.roll = roll; this.name = name; }
            public String toString() { return roll + " - " + name; }
        }
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Neha"));
        students.add(new Student(1, "Asha"));
        students.add(new Student(2, "Ravi"));
        students.sort(Comparator.comparingInt(s -> s.roll));
        System.out.println("Sorted by roll: " + students);
    }
}
