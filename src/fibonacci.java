import java.util.Scanner;

public class fibonacci {
    public static void main(String [] args){
//        fibonacii series
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your terms to calculate fibonacci seroes");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        int third;
        System.out.println(first);
        System.out.println(second);
        for(int i = 2 ; i< num; i++){
            third = first+second;
            first = second;
            second = third;
            System.out.println(third);
        }
    }
}
