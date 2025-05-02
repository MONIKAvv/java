package Array;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String [] args){
//        take input from user in array
        Scanner in = new Scanner(System.in);
//        int [] array = new int[5];
//        System.out.println("Enter five elements in array!");
//        for(int i = 0; i< array.length; i++)
//        {
//            array[i] = in.nextInt();
//        }
//        for(int i = 0; i< 5; i++){
//            System.out.println(array[i]);
//        }
//        System.out.println(Arrays.toString(array));


//        array of objects
        String [] name = new String[5];
        System.out.println("Enter 5 Strings in array");
        for(int i = 0; i< name.length; i++){
            name[i] = in.next();
        }
        name[3] = "light yagami";
        System.out.println(Arrays.toString(name));

    }
}
