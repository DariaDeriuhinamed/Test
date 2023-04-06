package week3;

public class CallByRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);

        System.out.println("ob.a and ob.b before run: " + ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("ob.a and ob.b after run: " + ob.a + " " + ob.b);


        //we refer to an object, therefore there is change
    }
}
