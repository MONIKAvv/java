package OOPS;

public class ConstructorOverloading {
    public static void main(String[] args) {
//        Overloading obj = new Overloading();
//        obj.display();
        Overloading obj2 = new Overloading(23);
        obj2.display();
        Overloading obj3 = new Overloading(23, 12);
        obj3.display();
//        Overloading obj4 = new Overloading(56, 34, "sinichhi");
//obj4.display();
    }
}

class Overloading {
    int age;
    int id;
    String name;
    ;

//    Overloading() {
//        age = 12;
//    }

    Overloading(int age) {
        name = "Light Yagami";
        this.age = age;
        id = 90;
        Overloading obj4 = new Overloading(56, 34, "sinichhi");
//       obj4.display();
        display();
    }

    Overloading(int age, int id) {
        name = "Ryuk";
        this.age = age;
        this.id = id;

    }

    private Overloading(int age, int id, String name) {
        this.name = name;
        this.age = age;
        this.id = id;
        display();

    }

    void display() {
        System.out.println("The data provided by the Overloading Constructor are: " + name + " " + age + " " + id);
    }
}
