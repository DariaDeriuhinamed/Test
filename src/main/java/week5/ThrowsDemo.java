package week5;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

public class ThrowsDemo {
    public static char prompt(String str) throws IOException{
        System.out.println(str + ": ");
        return (char)System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try{
            ch = prompt("Enter symbol");
        }catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
