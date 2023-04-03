package week2;

public class CharDemo {
    public static void main(String[] args) {
        char ch;
        ch = 'X';
        System.out.println("ch has " + ch);
        ch++; // инкрементируем переменную сh - 'Y' - это следующий по порядку символ в Unicode
        System.out.println("now ch has " + ch);
        ch = 90; // присваиваем значение 'Z'
        System.out.println("now ch has " + ch);
    }
}
