package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String [] args){
//        Multi Arraylist ---> Arraylist inside the arrayList
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multiarraylist = new ArrayList<>();
//        initialization of arraylist
        for (int i = 0; i < 3; i++){
            multiarraylist.add(new ArrayList());
        }
        System.out.println("Enter the elements in an array!");
//        add elements to the arraylist  ---> add at each row
        for (int i = 0; i < 3; i++){
            for (int j = 0; j< 3; j++){
                multiarraylist.get(i).add(sc.nextInt());  // at every new row add elements into the array columns
            }
        }
//        display of the elements in arrayList

        for (ArrayList list : multiarraylist){
            System.out.println(list);
        }
    }
}



//Note:- Arraylist actually has fixed size , when it exide its limits then a new array formed with double the size as previous one and copy all the previous elements into new arraylist and delete the previos one
