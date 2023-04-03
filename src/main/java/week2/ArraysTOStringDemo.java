package week2;

import java.util.Arrays;
public class ArraysTOStringDemo {
    public static void main(String[] args) {
        int[] array={1,2,3};
// demo: array1D -> String
        System.out.println(array); //[I@4dd8dc3
        System.out.println(Arrays.toString(array)); //[ 1, 2, 3]
    }
}
