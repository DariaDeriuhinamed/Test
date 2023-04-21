package week4;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a hash set.
        HashSet<String> hs = new HashSet<String>();
        // Add elements to the hash set.
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");

        System.out.println(hs);

        hs.add("A");
        System.out.println(hs);
    }
}
