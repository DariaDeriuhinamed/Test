package week3;

public class Vehicle5 {
    int passengers; // quantity of passengers
    int fuelcap; // fuel tank capacity
    int mpg; // fuel consumption in miles per gallon

    Vehicle5(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range(){
        return fuelcap * mpg;
    }
    // calculation of the amount of fuel required by a vehicle to cover a given distance
    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }
}
