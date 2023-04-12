package week3.Salad;

public class Chef {
    public static void main(String[] args) {
        LeafyVegetable lettuce = new LeafyVegetable("Lettuce", 14, 2);
        LeafyVegetable spinach = new LeafyVegetable("Spinach", 23, 4);
        RootVegetable carrot = new RootVegetable("Carrot", 41, 7);
        RootVegetable beetroot = new RootVegetable("Beetroot", 43, 10);
        RootVegetable potato = new RootVegetable("Potato", 41, 7);

        //Creating salad
        Salad salad = new Salad();
        salad.addVegetable(lettuce);
        salad.addVegetable(spinach);
        salad.addVegetable(carrot);
        salad.addVegetable(beetroot);
        salad.addVegetable(potato);

        //Calculate calories
        System.out.println("Salad calories: " + salad.calculateCalories());

        //Find vegetables by calories

        salad.findVegetablesByCaloriesRange(10, 50);
    }
}