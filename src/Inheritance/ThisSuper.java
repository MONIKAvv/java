package Inheritance;

public class ThisSuper {
    public static void main(String[] args) {
//        B obj = new B();
//        obj.display();
        Student s= new Student(74);
//        Person p = new Person("Light Yagami");

    }
}

class A{
    String meaning  = "Apple";
    A(){
        System.out.println("A Constructior called ");
    }
    void display() {
        System.out.println("A for " + meaning);
    }
}
class B extends A{
    String meaning = "Banana";
    B(){
        super();
        System.out.println("B constructor called" );
    }
    void display(){
//        super();
        System.out.println("B for "+ meaning);
        super.display();
        System.out.println("Accesssing instance varible of same class "+this.meaning);
        System.out.println("Accessing instance variable of parent class " +super.meaning);
    }

}


class Person {
    Person(String name){
        System.out.println("Name of the Person is : "+ name);
    }
}
class Student extends Person{
int roll;

    Student(int roll){
        super("Ram");
        System.out.println("Students roll no. " + roll);
//        super("Ram");   ----> super must be used at the top of the child class constructor or methods and can only call parent class constrctor and methods
        this.roll = 56;
    }
}
