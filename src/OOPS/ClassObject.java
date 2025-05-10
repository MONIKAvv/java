package OOPS;

public class ClassObject {
    public static void main(String[] args) {
        Students obj = new Students();

        obj.rollno = 9;
        System.out.println(obj.rollno);
        System.out.println(obj.name);
        System.out.println(obj.marks);
    }
}
class Students{
    int rollno  = 90;
    String name = " Monika";
    float marks = 78.9f;
}
/*
* construction defines what happens when the object is created
* when object created we need to allocate these things
* */
