package week3;

public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        //access to alpha is possible only by using special methods
        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        // this option will be unavailable: ob.alpha = -99

        ob.beta = 88;
        ob.gamma = 99;
    }
}
