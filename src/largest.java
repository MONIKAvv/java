import java.util.Scanner;

public class largest {
    public static void main(String [] args){
//        Find the largest number among the three
        int a= 20;
         int b = 100;
         int c = 90;
         int g = 0;
//         if(a>b && a> c) {
//             g = c;
//         } else if (b > a&& b>c) {
//             g = b;
//
//         }else {
//             g = c;
//         }
//        System.out.println(g);

//        Check by entering any character and check whether its a upper case or lower case
        System.out.println("Please enter any character you want");
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().trim().charAt(0);
if(chr >= 'a' && chr <= 'z'){
    System.out.println("Lower case chararcter your have entered");
}else if(chr >= 'A' && chr <= 'Z') {
    System.out.println("You have enterd the upper case character !");
}
        System.out.println(chr);




    }
}
