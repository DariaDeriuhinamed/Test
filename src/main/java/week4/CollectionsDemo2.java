package week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("red", "green", "blue", "yellow");
        Collections.reverse(list1);
        System.out.println(list1);

        List<String> list2 = Arrays.asList("red", "green", "yellow", "blue");
        Collections.shuffle(list2);
        System.out.println(list2);
    }
}

