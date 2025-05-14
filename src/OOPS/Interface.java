package OOPS;

public class Interface {
    public static void main(String[] args) {
        Saint kabir = new Saint();
        kabir.Language();
        kabir.meal();
        kabir.sleep();
        kabir.Karma();
    }
}

interface Human {
    String aim = "To know about the truth";

    public void meal();

    public void Language();
}

interface consious {
    String state = "Free from all goods and bads";

 void Karma();

}

//class to inherit Human class to define the methods of the Human
class Saint implements Human, consious{
    public void meal() {
//        aim = "hey change now"; cann't assign value to a final variable ---> interface attributes are by default public static final
        System.out.println("Value  from the interface class" + aim);
        System.out.println("Saints eats normal foods!");
    }

    public void Language() {
        System.out.println("There is no Specific Language for saints , they only know bhakti");
    }

    public void sleep() {
        System.out.println("There is no any Sleep hour for them: " +
                "They sleep when they feel");
    }

    public void Karma() {
        System.out.println("The karma of saints are: " + state);
    }

}



/*
Interface----> An Interface is completely abstract class that are used to group methods with empty bodies
TO access the interface methods we have to implement it that is we need to inherit it using the inplements keyword (instead of extends)
and the body of the interface can be defined by the derived class

Like wise the abstract class interface doesn't allow to create objects, also we cannot create constructor on both coz to access or execute constructor object creatiion is necessary.
In abstract and Interface classes all the methods should be defined in derived class it is mandatory
Interface attributes are by default public, static, final and methods are by default abstract and public

we can implement multiple interface to a same class ----> and this is the multiple inheritance
to inherit multiple interface ,separate them with commas;

 */