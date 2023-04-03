package week3;

public class TwoVehicles3 {
    public static void main(String[] args) {
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportcar = new Vehicle3();
        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Minivan can carry " + minivan.passengers + " passengers on distance " + range1 + " miles");
        System.out.println("Sportcar can carry " + sportcar.passengers + " passengers on distance " + range2 + " miles");
    }
}
