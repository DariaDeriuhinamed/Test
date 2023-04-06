package week3;

public class ConsOverload {
    int x;

    ConsOverload(){
        System.out.println("Inside ConsOverload().");
        x = 0;
    }

    ConsOverload(int i){
        System.out.println("Inside ConsOverload(int).");
        x = i;
    }

    ConsOverload(double d){
        System.out.println("Inside ConsOverload(double).");
        x = (int) d;
    }

    ConsOverload(int i, int j){
        System.out.println("Inside ConsOverload(int, int).");
        x = i * j;
    }
}
