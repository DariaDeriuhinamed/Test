package week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo5 {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("red", "cyan", "red");
        System.out.println(Collections.frequency(collection, "red"));
    }
}
