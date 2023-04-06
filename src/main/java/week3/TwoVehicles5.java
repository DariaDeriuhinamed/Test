package week3;

public class TwoVehicles5 {
    public static void main(String[] args) {
        Vehicle5 minivan = new Vehicle5(7, 16, 21);
        Vehicle5 sportcar = new Vehicle5(2, 14, 12);
        double gallons;
        int dist = 252;
// we give values with parameteres
        gallons = minivan.fuelNeeded(dist);

        System.out.println("Minivan needs " + gallons + " gallons of fuel to travel " + dist + " miles");

        gallons = sportcar.fuelNeeded(dist);

        System.out.println("Sportcar needs " + gallons + " gallons of fuel to travel " + dist + " miles");
    }
}
