package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {

        public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(1,89);
//            number.remove(0);

            list.set(0,1234);
//             in order to access elements through index--> we use get(index)
//            System.out.println(number.get(3));
//            System.out.println(cars);



//            aize of ArrayList
//            number.size();
//            System.out.println(number.size());


//            Loop through an ArrayList
//            for (int list = 0; list < number.size(); list++){
//                System.out.println(list);
//            }
//            for each loop
//            for (Number list : number){
//                System.out.println(list);
//
//            }
            Collections.sort(cars);
            for (String i : cars){
                System.out.println(i);
            }
            Collections.sort(list);
            for (Number i : list){
                System.out.println(i);
            }
        }
    }
//Arraylist ---> with the help of this arraylist we can resize our array unlike other array type whose size can't be resize
//Strings in java is object type , and string can't be modify but array does
//ArrayList also have one package called collection class and it is used for sorting the array elements alphabetically
// Array reference varible are in heap and varibales are in stack???
// In Arraylist ---> size is fixed internally
