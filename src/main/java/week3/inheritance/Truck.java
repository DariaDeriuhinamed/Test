package week3.inheritance;

public class Truck extends Vehicle {
    private int cargocap; //load capacity in pounds

    //constructor
    Truck(int p, int f, int m, int c){
        super(p, f, m );
        cargocap = c;
    }

    //access methods to variable cargocap
    public int getCargocap() {return cargocap;}

    public void setCargocap() {this.cargocap = cargocap;}
}
