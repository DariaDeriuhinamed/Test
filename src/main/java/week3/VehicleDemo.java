package week3;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;
        //assigning values to fields
        minivan.passengers =  7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //distance calculation
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " passengers on distance " + range + " miles");
    }
}
