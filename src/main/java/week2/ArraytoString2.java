package week2;

import java.util.Arrays;
public class ArraytoString2 {
    public static void main(String[] args) {
        int[][] array2D = {{0, 1}, {2, 3}};
        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D));
        System.out.println(Arrays.deepToString(array2D));
    }
}
//[[I@2ff4f00f
//[[I@c818063, [I@3f0ee7cb]
//[[0, 1], [2, 3]]
