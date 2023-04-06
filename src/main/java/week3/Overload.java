package week3;

public class Overload {

    void ovlDemo(){
        System.out.println("Without parameters");
    }

    void ovlDemo(int a){
        System.out.println("With one parameter " + a);
    }

    int ovlDemo(int a, int b){
        System.out.println("With two parameters " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b){
        System.out.println("With two parameters type double " + a + " " + b);
        return a + b;
    }
}
