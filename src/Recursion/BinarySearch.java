package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int [] arr = {1,4,7,3,8,4,0,34,56,2,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 56;
        System.out.println("The searched Item is : " + (Binary(arr,target,0, arr.length-1)));
    }
    static int Binary(int [] arr, int target , int s, int e){
        int m = s + (e - s ) / 2;
        if(s > e){
            return -1;
        }
        if(arr[m] == target){
            return m;
        }

        if(target > arr[m]){
            return Binary(arr, target, m+1, e);
        }
        return Binary(arr, target, s, m-1);
    }
}
