package Inheritance;

public class Polymorphism {
    public static void main(String[] args) {
        Animal myanimal = new Animal();
        myanimal.animalsound();
        Animal dog = new Dog();
        dog.animalsound();
        Animal pig = new Pig();
        pig.animalsound();


        Dog dog1 = new Dog();
        dog1.dogsound();
    }
}

class Animal{
    void animalsound(){
        System.out.println("Animals are saying somethings");
    }
}
class Dog extends Animal{
    void dogsound(){
        System.out.println("This is Dog Sound!");
    }
    void animalsound(){
        System.out.println("Dog is barking:  bow wow ");
    }
}
class Pig extends Animal{
    void pigsound(){
        System.out.println("This is Phiggi Sound!");
    }
    void animalsound(){
        System.out.println("Phiggi is doing wee wee! ");
    }
}
