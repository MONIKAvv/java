package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String [] args){
//         addition of matrices
        Scanner sc = new Scanner(System.in);
//        asking for elements of two arrays
        int array1 [][] = new int[3][3];
        int [][] array2 = new int[3][3];
        int [][] array3 = new int[3][3];
        System.out.println("Please Enter the elements of first array");
       for(int row = 0; row< array1.length; row++){
           for (int col = 0; col< array1[row].length; col++){
               array1[row][col] = sc.nextInt();
           }
       } System.out.println("Please Enter the elements of second array");
       for(int row = 0; row< array1.length; row++){
           for (int col = 0; col< array1[row].length; col++){
               array2[row][col] = sc.nextInt();
           }
       }
//       addition of matrices
        for (int row = 0; row < array1.length; row++){
            for (int col = 0; col < array2.length; col++){
                array3[row][col] = array1[row][col]+array2[row][col];
            }
        }
        for (int [] row : array3){
            System.out.println(Arrays.toString(row));
        }
    }
}
