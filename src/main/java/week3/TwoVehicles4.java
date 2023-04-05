package week3;

public class TwoVehicles4 {
    public static void main(String[] args) {
        Vehicle4 minivan = new Vehicle4();
        Vehicle4 sportcar = new Vehicle4();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("Minivan needs " + gallons + " gallons of fuel to travel " + dist + " miles");

        gallons = sportcar.fuelNeeded(dist);

        System.out.println("Sportcar needs " + gallons + " gallons of fuel to travel " + dist + " miles");

    }
}
