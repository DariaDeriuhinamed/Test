package week5;

public class ExceptionsDemo {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Before exception");

            nums[7] = 10; //try to reach out of range of massive
            System.out.println("This row will not display");
        } catch

        (ArrayIndexOutOfBoundsException e) {//we retake the exception
            System.out.println("Error - this value is out of range");
        }
        System.out.println("After instruction catch");
    }
}
