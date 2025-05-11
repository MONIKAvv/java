package OOPS;

// Copy constructor copies data from one object to another.
//Constructor has no return type and if we give return type to a constructor then that called a method not a constructor any more

public class CopyConstructor {
    public static void main(String[] args) {
        CopyStudent obj1 = new CopyStudent(21, "monika");
        CopyStudent obj2 = new CopyStudent(obj1);
        obj1.display();
        obj2.display();
    }
}

class CopyStudent {
    String name;
    int age;

    //    create two constructor to copy
    CopyStudent(int age, String name) {
        this.name = name;
        this.age = age;

    }

    CopyStudent(CopyStudent s1) {
        name = s1.name;
        age = s1.age;

    }

    void display() {
        System.out.println("The name and age of the Student is: " + name + " " + age);
    }

}
