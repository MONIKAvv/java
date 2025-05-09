package OOPS;

import java.util.Scanner;

public class Introduction {
    public static void main(String [] args){

        int [] rollno = new int[5];
        String [] name = new String[5];
        float [] marks = new float[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter rollno and name and marks of the students ");
        for (int i = 0; i < 5; i++){
            rollno[i] = sc.nextInt();
            name[i] = sc.next();
            marks[i] = sc.nextFloat();
        }
        System.out.println("The data of the students are : ");
        for (int i = 0; i < 5; i++){
            System.out.println("Student " + i+ "is : "+ rollno[i]+ "name and marks are: "+ name[i] + marks[i]);
        }
    }



}
/*
*Class ---> Template of an object,is an logical construct
* Object --> an instance of a class --> has some physical reality --> accupies space in memory
* Objects properties // objects stores in heap memory and reference variable are stored in stack memory
* state( values from its data type)
* identity
* behaviour of the objects (functions of the objects)
*
*
* Variables inside the object called instance variable
*
* */
