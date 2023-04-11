package week3;

public class Outer {
    int nums[]; //variable

    Outer(int n[]){
        nums = n;
    }
    //constructor which fills variable with massive

    void analyse(){
        Inner inOb = new Inner();
        System.out.println("Min: " + inOb.min());
        System.out.println("Max: " + inOb.max());
        System.out.println("Avg: " + inOb.avg());
    }
    //method analyse, inside we create object of new class which is our inner class

    class Inner {
        int min(){
            int m = nums[0];

            for(int i = 1; i < nums.length; i++){
                if(nums[i] < m) m = nums[i];
            }
            return m;
        }

        int max(){
            int m = nums[0];

            for(int i = 1; i < nums.length; i++){
                if(nums[i] > m) m = nums[i];
            }
            return m;
        }

        int avg(){
            int a = 0;

            for(int i = 0; i < nums.length; i++){
                a += nums[i];
            }
            return a/nums.length;
        }
    }
}
