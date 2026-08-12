package phase1DSA.Operator;

import java.util.Scanner;

public class Basics {
    public  static void main(String[] args){
//        multiplication of two number
//        take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        int a = 10;
//        int b = 20;
        if(a == 10 && b == 20)
        System.out.println("Multiplication of two number is: "+ a*b*c);
        System.out.println("Average of three number is: "+ ((a+b+c)/3));
    }
}
