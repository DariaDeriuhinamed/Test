package week4;

public class EnumDemo3 {
    public static void main(String[] args) {
        System.out.println("Usual airplane speed: " + Transport2.AIRPLANE.getSpeed() + " km per hour\n");

        System.out.println("Usual transport speed and price of trip: ");
        for (Transport2 t : Transport2.values())
            System.out.println(t + ": " + t.getSpeed() + " km per hour" +
                    "\nPrice of trip: " + t.getPrice() + " hrn");
    }

}
