package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("red", "green", "blue");
        Collections.sort(list1);
        System.out.println(list1);

        List<String> list2 = Arrays.asList("red", "green", "yellow", "blue");
        Collections.sort(list2, Collections.<String>reverseOrder());
        System.out.println(list2);
    }
}
