package Functions;

import java.util.Scanner;

public class Greetings {
    public static void main(String [] args){
        String name = greeting();
        System.out.println("Hello " + name + " Nice to meet you!");
    }
    static String greeting(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter your name!");
        String name = in.next();


        return name;
    }
}
