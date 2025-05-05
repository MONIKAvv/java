package Array;

import java.util.Arrays;

public class ReverseArray {
//    Reverse the elements of array
    public static void main(String [] args){
        int [] array = {1,5,6,7,9};
        System.out.println(Arrays.toString(array));
        reverse(array, 0, 4);

    }
    static void reverse(int [] array, int start, int end){
//        for (int i = 4; i >= 0; i--){
//            System.out.print(array[i] + " ");
//        }

        while(start <= end){

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
//            System.out.println(array[start]);
        }


    }
}
