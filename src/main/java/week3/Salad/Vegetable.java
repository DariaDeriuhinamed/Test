package week3.Salad;

abstract class Vegetable {
    private String name;
    private int calories;

    public Vegetable(String name, int calories){
        this.name = name;
        this.calories = calories;
    }

    public String getName(){
        return name;
    }

    public int getCalories(){
        return calories;
    }

    public String getInfo(){
        return "Name: " + name + " - " + calories + " calories";
    }
}
