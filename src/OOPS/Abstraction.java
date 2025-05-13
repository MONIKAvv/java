package OOPS;

public class Abstraction {
    public static void main(String[] args) {
//        Animal obj = new Animal();   this couldn't be possible due to abstract type class
    Phiggi obj = new Phiggi();
    obj.animalSound();
    obj.sleep();

    }

}
abstract class Animal{
    abstract void animalSound();
    void sleep(){
        System.out.println("Zzzz...");
    }
}
class Phiggi extends Animal{
    Phiggi(){
        super();
    }
    void animalSound(){

        System.out.println("Phiggi sounds like: Wee Wee!");
    }
    void sleeps(){
        System.out.println("Phiggi is Sleeping");
    }
}






/*
Abstraction ---> to only show the important information and hiding all the unnecessary details from user
Abstraction can be achieve through 1. abstract class 2. interface
1. Abstract Class --> restrict to create object to access class of abstract type (To access it , it must be inherit from another class) that is
                      if the abstract class get inherited then the derived class can access its instance variable and member methods... with derived class object

2. Abstract Method ----> Abstract methods can be used only in abstract classes, and abstract methods has no body into it (The body of  the abstract class can be defined by the derived class)



 */