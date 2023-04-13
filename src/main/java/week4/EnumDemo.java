package week4;

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;

        tp = Transport.AIRPLANE;

        //display enumerated value
        System.out.println("Value tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        //compare two enumerated values
        if (tp == Transport.TRAIN)
            System.out.println("tp contains TRAIN\n");

        //switch
        switch(tp){
            case CAR:
                System.out.println("Car carries people");
                break;
            case TRUCK:
                System.out.println("Truck carries cargo");
                break;
            case AIRPLANE:
                System.out.println("Airplane flies");
                break;
            case TRAIN:
                System.out.println("Train moving on rails");
                break;
            case BOAT:
                System.out.println("Boat is sailing");
                break;
        }
    }
}
