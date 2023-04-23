package week5;

public class ThrowDemo {
    public static void main(String[] args) {
        try{
            System.out.println("Before throw");
            throw new ArithmeticException();
        }catch (ArithmeticException e) {
            System.out.println("Exception is retaken");
        }
        }

}
