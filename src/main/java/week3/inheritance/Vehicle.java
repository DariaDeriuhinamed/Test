package week3.inheritance;

public class Vehicle {
        private int passengers; // quantity of passengers
        private int fuelcap; // fuel tank capacity
        private int mpg; // fuel consumption in miles per gallon

    Vehicle(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range(){
        return fuelcap * mpg;
    }

    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    //getter ans setter were created because variables are private
}
