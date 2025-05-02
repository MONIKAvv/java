package Array;

import java.util.Arrays;

public class passingFunctions {
    public static void main(String [] args){
        String [] sentence = {"We ", "will", "learn", "together", "yes"};
        System.out.println(Arrays.toString(sentence));
        change(sentence);
        System.out.println(Arrays.toString(sentence));
    }
    static void change(String[] arr){
        arr[0] = "monika";
    }
}


// arrays are mutable in nature while Strings are not mutable in nature