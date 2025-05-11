package OOPS;

import org.w3c.dom.ls.LSOutput;

public class parameterConstructor {
    int num;
    String message;

    public static void main(String[] args) {
//        int EmpNo = 7;
//        String EmpName = "monika";
//        float EmpSalary = 34.5f;
//        parameterConstructor obj = new parameterConstructor(EmpNo, EmpName, EmpSalary);
//        parameterConstructor obj2 = new parameterConstructor();
////        System.out.println(obj2.num);
////        System.out.println("Welcome to the world of programming and we are greeting you "+ obj2.message);
//        Employee obj3 = new Employee();
//        System.out.println(obj3.Empid);


        StudentParameterise newobject = new StudentParameterise(74, "monika", 21);
    newobject.display();

    }

    parameterConstructor(int EmpNo, String name, float salary) {
//        System.out.println("We are inside the constructor");
//        System.out.println("Emp id, name and salary of Employees are:" + EmpNo +" " + name+ " " + salary);


    }

    parameterConstructor() {
        num = 90;
        message = "Hello World!";
    }

}

class Employee {
    //    properties
    int Empid = 34;
    String EmpName;
    float Empsalary;
    int workhour;

    public static void main(String[] args) {
        System.out.println("jjjj");
        Employee empobj = new Employee();
    }

    Employee() {
        System.out.println("Constructor of another class called Employee");
    }
}


class StudentParameterise {
    int Roll;
    String name;
    int age;

    StudentParameterise(int roll, String name, int age) {
        this.Roll = roll;
        this.name = name;
        this.age = age;
//    display();
//
//        this.roll = Roll;
//        name = name;
//        age = age;
        System.out.println(roll);
    }


    void display() {
        System.out.println("Name and Age of the Student is: " + Roll + " " + name + " " + age);

    }

}











/*
 * constructor is a special type of function
 * having the same name as of its class name
 * used to initialise objects
 * automatically called once the object get created
 * If we don't create any constructor then java calls by default constructor as the object of the class get created
 *
 *
 * */