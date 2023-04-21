package week4;

public class Gen<T> {
    T ob; // declared object of type T

    Gen(T o){ob = o; }

    T getOb(){ return ob;}

    // displays type T
    void showType() { System.out.println("Type T is " + ob.getClass().getName());}
}
