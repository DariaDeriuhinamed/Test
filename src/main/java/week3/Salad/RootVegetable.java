package week3.Salad;

public class RootVegetable extends Vegetable {
    private int sweetness;

    RootVegetable(String name, int calories, int sweetness){
        super(name, calories);
        this.sweetness = sweetness;
    }

    public int getSweetness(){
        return sweetness;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "\nSweetness - " + sweetness;
    }
}
