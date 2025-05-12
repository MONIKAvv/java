package OOPS;

public class ConstructorOverloading {
    public static void main(String[] args) {
//        Overloading obj = new Overloading();
//        obj.display();
//        Overloading obj2 = new Overloading(23);
//        obj2.display();
//        Overloading obj3 = new Overloading(23, 12);
//        obj3.display();
//        Overloading obj4 = new Overloading(56, 34, "sinichhi");
//obj4.display();


        Book b = new Book();
        b.display();
        Book b2 = new Book(234,"Psychology of money", "didn't remember");
        b2.display();
        Book b3 = new Book(b2);
b3.display();
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



class Book{
    float price;
    String title;
    String author;

    Book(){
        price = 788.90f;
        title = "48 Law of Power";
        author = "Greem Something";
    }
    Book(float price, String title, String author){
        this.price = 90.456f;
        this.title = title;
        this.author = author;

    }
  Book(Book b){
        price = 34;
        title = b.title;
        author = b.author;

    }
    void display(){
        System.out.println("The price of the book is "+ price+" and title of the book is: "+title+"and the author of the book is: "+author);
    }
}
