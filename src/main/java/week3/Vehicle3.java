package week3;

public class Vehicle3 {
    int passengers; // quantity of passengers
    int fuelcap; // fuel tank capacity
    int mpg; // fuel consumption in miles per gallon

    int range(){
        return fuelcap * mpg;
    }
}
