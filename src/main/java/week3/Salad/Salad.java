package week3.Salad;

import java.util.ArrayList;
import java.util.List;

class Salad {
    private List<Vegetable> vegetables = new ArrayList<Vegetable>();

    public void addVegetable(Vegetable vegetable){
        vegetables.add(vegetable);
    }

    public int calculateCalories(){
        int calories = 0;
        for (Vegetable vegetable : vegetables){
            calories += vegetable.getCalories();
        }
        return calories;
    }

    public void findVegetablesByCaloriesRange(int minCalories, int maxCalories){
        System.out.println("Vegetables with calories from " + minCalories + " to " + maxCalories + ":");
        for (Vegetable vegetable : vegetables){
            if (vegetable.getCalories() >= minCalories && vegetable.getCalories() <= maxCalories){
                System.out.println(vegetable.getInfo());
            }
        }
    }
}
