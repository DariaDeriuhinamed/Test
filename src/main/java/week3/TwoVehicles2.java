package week3;

public class TwoVehicles2 {
    public static void main(String[] args) {
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportcar = new Vehicle2();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        System.out.println("Minivan can carry " + minivan.passengers + " passengers");
        minivan.range();
        System.out.println("Sportcar can carry " + sportcar.passengers + " passengers");
        sportcar.range();
    }
}
