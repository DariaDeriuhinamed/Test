package week3;

public class Test2 {
    int a, b;

    Test2(int i, int j){
        a = i;
        b = j;
    }

    //passing an object to a method. now the variables ob.a and ob.b of the object used in the call will change

    void change(Test2 ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
