package AdvanceJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaComparator {
    public static void main(String[] args) {

        ArrayList<Car> myCar = new ArrayList<Car>();
        myCar.add(new Car("BMW", "X5", 1999));
        myCar.add(new Car("Honda", "Accord", 2006));
        myCar.add(new Car("Ford", "Mustang", 1970));

//        Comparator comparator = new SortbyYear();
//        Collections.sort(myCar,comparator);


        for (Car c : myCar){
            System.out.println(c.brand + " " + c.model+" "+ c.year);
        }
    }
}
//creation of class
class Car{
   public String brand;
   public String model;
    public int year;
    Car(String b, String m , int y){
        this.brand = b;
        this.model = m;
        this.year = y;
    }
}
//creation of comparator

//class SortbyYear implements Comparator<Car>{
//    public int compare(Object obj1, Object obj2){
//
//Car a = (Car) obj1;
//Car b = (Car) obj2;
//
//if(a.year < b.year){
//    return -1;
//}
//if(a.year > b.year) return +1;
//
//        return 0;
//    }
//}


/*
The comparable and comparator are the interface that provide us the rule to sort the objects.

An object that implements the comparator interface called comparator
comparator interface creates a class with a method called compare() and compares the objects to display which object will come first in list
The compare () returns -1 if first object comes first
                        +1 if second object comes first
                        0 if non of the object comes or order doesn't matter

Comparable is used for natural sorting of objects. It is implemented within the class whose objects you want to sort,
and the method it uses is compareTo().

compareTo() compares the current object with another object of the same type and sorts them accordingly based on a natural order
 (like sorting by age, year, or name in ascending or descending order).

Comparator is used for custom sorting where you may need to define multiple ways to sort objects (e.g., by name, year, or price).
It is usually implemented in a separate class, and the method it uses is compare().

compare() compares two objects and sorts them in any custom order you define, such as sorting by the brand first, or by year in descending order.

 */