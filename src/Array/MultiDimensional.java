package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String [] args){
//multi dimentional array
//        int [][] array = {
//        {1,2,3}, {1,2,3}, {1,2,3}};
        int [][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in 3-d array");

        for(int row = 0; row< array.length; row++){
            for(int col = 0; col< array[row].length; col++){
                array[row][col] = sc.nextInt();
            }
        }
//        show the elements of the array
//        for(int row = 0; row< array.length; row++){
//            for (int col = 0; col< array[row].length; col++){
//                System.out.print(array[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for(int row = 0; row< array.length; row++){
//            System.out.println(Arrays.toString(array[row]));
//        }
        for(int []row : array){
            System.out.println(Arrays.toString(row));
        }

//        for(int i= 0; i< 3; i++){
//            for(int j = 0; j< 3; j++){
//                array[i][j] = sc.nextInt();
//            }
//        }
//        for(int i= 0; i< 3; i++){
//            for(int j = 0; j< 3; j++){
//                System.out.println(array[i][j]);
//            }
//        }
//        System.out.println(Arrays.toString(array));




    }
}
