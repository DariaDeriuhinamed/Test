package week3;

public class Vehicle4 {
    int passengers; // quantity of passengers
    int fuelcap; // fuel tank capacity
    int mpg; // fuel consumption in miles per gallon

    int range(){
        return fuelcap * mpg;
    }
    // calculation of the amount of fuel required by a vehicle to cover a given distance
    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }
}
