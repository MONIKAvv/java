package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String [] args){
        sum(1, 2);
//        sum();
        int answer = sum2(6,9);
        System.out.println("The result of the addition of two number is : " + answer);
    }

    public static void sum(int num1, int num2){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter two values for addition!");
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
        System.out.println(num1+num2);
    }
    public static int sum2(int num1, int num2){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter two values for addition!");
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
        int result = num1+ num2;
        return result;
    }
}
