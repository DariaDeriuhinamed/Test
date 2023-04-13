package week4;

public enum Transport2 {
    CAR(100, 100), TRUCK(80, 200), AIRPLANE(900, 1000), TRAIN(120, 700), BOAT(35, 1000);

    private int speed, price;

    Transport2(int speed, int price){
        this.speed = speed;
        this.price = price;
    }

    int getSpeed(){
        return speed;
    }

    int getPrice(){
        return price;
    }
}
