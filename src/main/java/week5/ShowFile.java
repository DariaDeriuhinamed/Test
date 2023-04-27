package week5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        try{
            fin = new FileInputStream("test.txt");
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            return;
        }

        try{
            do{
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        }catch (IOException e){
            System.out.println("Error while reading file");
        }finally {
            try{
                fin.close();
            }catch (IOException e){
                System.out.println("File closing error");
            }
        }
    }
}
