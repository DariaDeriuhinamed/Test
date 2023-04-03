package week2;

public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100000; i <= 999999; i++) {
            int firstHalfSum = (i / 100000) + (i / 10000 % 10) + (i / 1000 % 10);
            int secondHalfSum = (i / 100 % 10) + (i / 10 % 10) + (i % 10);
            if (firstHalfSum == secondHalfSum) {
                count++;
            }
        }
        System.out.println("Count of 6 digits: " + count);
    }
}
