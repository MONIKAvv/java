package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student obj = new Student(1, "monika", 78.6f);
        Student monika = new Student(74, "kumari", 85.6f);
        System.out.println("Outside of the construction");
//        System.out.println(obj.name);
//        System.out.println(obj.rollno);
//        System.out.println(obj.marks);
    }

}
//default constructor
class Student{
int rollno;
String name;
float marks;
    Student(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        System.out.println("Hey this is constructor inside the Student Class");
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(marks);
    }
}
