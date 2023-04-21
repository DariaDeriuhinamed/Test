package week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo4 {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("red", "green", "blue");
        System.out.println(Collections.max(collection));
        System.out.println(Collections.min(collection));
    }
}
