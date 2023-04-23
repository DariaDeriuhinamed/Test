package week5;

public class ExceptionsDemo2 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Before exception");
            nums[7] = 10;
            System.out.println("This row will not display");
        } catch (ArithmeticException e) { //not correct exception, should be another IndexOutOfBoundException
            System.out.println("Arifmetic error");
        } catch(ArrayIndexOutOfBoundsException e) {//we retake the exception or we can use RunTimeException
            System.out.println("Error - this value is out of range");}
        System.out.println("After instruction");
    }
}
