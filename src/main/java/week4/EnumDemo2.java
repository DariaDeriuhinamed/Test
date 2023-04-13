package week4;

public class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Transport constants: ");
        Transport allTransport[] = Transport.values();
        for(Transport t: allTransport)
            System.out.println(t);

        System.out.println();

        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
}
