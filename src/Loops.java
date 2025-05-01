import java.util.Scanner;

public class Loops {
    public static void main(String [] args){
        int flag = 0;
//        print numbers form 1 ot 5;
        int i = 1;
//         while(i<=5){
//             System.out.println(i);
//             i++;
//         }
//        for (; i<= 5; i++){
//       flag = 1;
//            System.out.println(i);
//        }
//        do{
//            flag = 1;
//            System.out.println(i);
//            i++;
//        }while(i==5);
//        if(flag == 1){
//            System.out.println("This is do while Loop executing !");
//        }

//        Print number from 1 to n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to print in Loop!");
       int num = sc.nextInt();
        System.out.println("You have entered the number " + num);
       while(i<=num){

           System.out.println(i);
           i++;
       }

    }
}
