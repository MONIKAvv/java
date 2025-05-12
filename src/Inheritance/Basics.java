package Inheritance;

public class Basics {
    public static void main(String[] args) {

       Tata obj = new Tata();
        obj.show();
        obj.display();
//        Vehicle v = new Vehicle();
        System.out.println(obj.speed);
        System.out.println(obj.name);
    }

}
class Vehicle{
    int speed = 90;
    String model = "TaTa";
    Vehicle(){
        System.out.println("This is constructor of base class");
    }
    void display(){
        System.out.println("This is Vehicle Class parent Class!" +
                "Model and speed of vehicle are: " + model+ " " + speed);
    }
}
class Car extends Vehicle{

    String name = "Mustang";

    void show(){
        System.out.println("Speed of car is: "+ speed+ " and model is :"+ model+ " name of car is : "+ name);

    }

}
class Tata extends Car{
    void display(){
        System.out.println("This is multilevel inheritance" + speed+ " " + " " + model);

    }
}

/*
* Inheritance is a concept that inherits properties of other class called base class
* Inheritance is of three types --> Single , Multilevel, Hierichical inheritance
*Private Specifier class cann't be inherited.
* */
