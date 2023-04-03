package week2;

public class DynInt {
    // new data type and multiplication
    public static void main(String[] args) {
        double radius = 4, height = 5;
//Переменная volume инициализируется динамически во время
        double volume = 3.1416 * radius * radius * height;
        System.out.println("Объем: " + volume);
    }
}
