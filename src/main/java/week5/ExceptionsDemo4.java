package week5;

public class ExceptionsDemo4 {
    public static void main(String[] args) {
        int nums[] = { 0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };;
        int nums2[] = { 1, 2, 3, 0, 5, 0, 7, 8, 0, 10 };;

        for(int i = 0; i< nums.length; i++){
            try{
                int result = nums[i]/nums2[i];
                System.out.println("Result is " + result);
            }catch (ArithmeticException e) {
                System.out.println("Division by zero!");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Out of range!");
            }
                System.out.println("After catch");
            }
        }


}
