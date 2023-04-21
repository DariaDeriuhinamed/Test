package week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("red", "green", "blue");
        Collections.fill(list, "black");
        System.out.println(list);
    }
}
