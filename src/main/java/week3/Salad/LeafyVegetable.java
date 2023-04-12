package week3.Salad;

public class LeafyVegetable extends Vegetable {
    private int hardness;

    LeafyVegetable(String name, int calories, int hardness){
        super(name, calories);
        this.hardness = hardness;
    }

    public int getHardness(){
        return hardness;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "\nHardness " + hardness;
    }
}
