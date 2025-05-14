package OOPS;

public class Enum {

    enum Positions{
        UPPER,
        lower,
        Higher
    }

    public static void main(String[] args) {
        Level myvar = Level.FIRST;
        System.out.println(myvar);
        Positions var = Positions.lower;
        Role role = Role.ADMIN;
        TrafficLight signal = TrafficLight.GREEN;


        Pizza size = Pizza.LARGE;
        size.order();
        size.print();



      switch (var){
          case UPPER -> System.out.println("Upper Level from enum inside the class");
          case lower -> System.out.println("Lower level from enum inside of class "+var.name());
          case Higher -> System.out.println("Hiher Calss");
      }

      for (Level label : Level.values()){
//          value() is used to return the array of all constrant , this is usefull when we want to loop constants
          System.out.println(label);
      }
    }
}
enum Level{
    FIRST,
    SECOND,
    THIRD
}

enum Role{
    ADMIN,
    USER, GUEST
}
enum TrafficLight{
    GREEN, YELLOW, RED
}

interface Printable{
   public void print();
}

enum Pizza implements Printable{
    SMALL, MEDIUM, LARGE;
    void order(){
        System.out.println("Order of Pizza on way!");
    }
    public  void print(){
        System.out.println("Print the printable!");
    }
}







/*
Enums ---> Enums are the special class that is like class, will have both variables, methods but are constant in nature(public , static, final)
Enums object is not created but Enums can implements interface,
To create Enums , use enum keyword and make the constant and separate with commas, it is used when we know that the values won't get change
the enums constant must be writtent in Uppercase

Enums can be accessed through the dot syntax
Enums ---> enumberations "Specifically listed"
we can create enum inside and outside of the class

Enums is special type that are used to define a list of constant, it is used when we already know lists values in advance
Enums in java are class behind the scence and it is of static type thats why we don't need to create objects for enums
 */
