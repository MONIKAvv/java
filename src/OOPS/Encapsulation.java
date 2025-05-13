package OOPS;

public class Encapsulation {


    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println(obj.getsameof());
        obj.setNameOf("monika");
        System.out.println(obj.getsameof());
//        obj.getName();
//        System.out.println(obj.name);
//     name is defines as private and cannot be accessed
    }
}

class Person{
    private String nameof;

    //Getter

    public String getsameof() {
//        we can write any thing like getName or getNameof, gotnameof any thing
        return nameof;
    }
    void setNameOf(String newname){
        this.nameof = newname;
    }
    private void display(){
        System.out.println("This is private method");
    }
}

/*
* Encapsulation means hiding the necessary or sensitive data from the user or outside of class
* Encapsulation is used for providing the security to the data we use in our class
* Private member variable or member functions(methods) could be access through the get and set method
* we can achieve encapsulation by declaring any variable to private
*
*
* JAVA PACKAGES AND APIS
* Packages are used to group related classes
* Packages are of two types 1. Built in packages (that are prebuild from the java side   ) 2. user defined packages (which can be created by own0
*Packages are used to avoid name conflicts, it is like the folders of files
* Built-in-packages----> these are the library of prewritten classes that are free to use, and are included in JDE (Java Development Environment)
*                        these are the library contains components for managing the input and output and databases,(we can find more in oracle)
*                        The library are further divided into package and class
*           Meaning we can either import or use the single class or the whole package that could contains multiple classes using import keyword
*   e.g import java.util.Scanner; ---> single class called scanner class
*      import java.util.*   ----> the whole packages we are importing
*
* */