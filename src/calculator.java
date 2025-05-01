import javax.swing.*;
import java.util.Scanner;

public class calculator {
 public static void main(String [] args){
//     perform calculation using if else only
  Scanner sc = new Scanner(System.in);

  while (true) {
   System.out.println("If you want to terminate the operations the enter X else enter any other key to move further");
   char terminate = sc.next().trim().charAt(0);
   if(terminate == 'X' || terminate == 'x'){
    break;
   }
   System.out.println("Please choose the operation you want to execute!");
   char opt = sc.next().trim().charAt(0);
   if(opt == 'X' || opt == 'x'){
    break;
   }
   System.out.println("Please enter any two numbers to perform operations into this!");
   int num1 = sc.nextInt();
   int num2 = sc.nextInt();
   if (opt == '+') {
    System.out.println("The addition of two number is: " + (num1 + num2));
   } else if (opt == '-') {
    System.out.println("Subtraction of two digits is : " + (num1 - num2));

   } else if (opt == '*') {
    System.out.println("Multiplication o two number is " + (num1 * num2));
   } else if (opt == '/') {
    System.out.println("Division of two number is " + (num1 / num2));
   } else if (opt == '%') {
    System.out.println("The modulus of operands are " + (num1 % num2));
   } else {
    System.out.println("Please enter valid operation!");
   }


  }
 }
}
