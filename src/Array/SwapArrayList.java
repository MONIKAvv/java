package Array;

import java.util.Arrays;

public class SwapArrayList {
//    swap the elements of the array for particular index or region
    public static void main(String [] args){
        int [] array =  {1,2,3,4,5,6};
        int end = array.length-1;
      swap(array, end);
        System.out.println(Arrays.toString(array));
    }
    static void swap(int [] array, int end){
        int temp = array[4];
        array[4] = array[end];
        array[end] = temp;
        System.out.println(Arrays.toString(array));

    }
}
