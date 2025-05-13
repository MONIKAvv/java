package OOPS;

public class InnerClass {
    public static void main(String[] args) {

        OuterClass outobj = new OuterClass();
        OuterClass.InnerCls innobj = outobj.new InnerCls();
        System.out.println("Addition of two inner classes are: " + (innobj.y + outobj.x));
        OuterClass.Game gameobj = outobj.new Game();
//        Outerclass.game is private access specifier
        gameobj.setName("FreeFire");
        System.out.println(gameobj.getName());

        OuterClass.SecInnerClass secobj = new OuterClass.SecInnerClass();
//        System.out.println(secobj.y);
        System.out.println("Addition: "+( outobj.x+innobj.y+secobj.y));
        System.out.println(innobj.InnerClassDisplay());

        OuterClass.Animal A = outobj.new Animal();
        System.out.println(A.display());

    }
}

class OuterClass {
    int x = 10;
    int y = 50;

    class InnerCls {
        int y = 20;
        int InnerClassDisplay(){
          return x;
        }
        InnerCls() {
            System.out.println("This is inner class");
        }
    }

    static class SecInnerClass{
        int y = 34;

    }
    class Game {
        //private String name = "FreeFire";
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    class Animal{
        int display(){
            return y+5;
        }
    }
}


/*
 * Inner Class --> class inside the another class called inner class
 * inner class can be acessed by the object of the outerclass that is . first the object of the outer class will create and then after the object of inner class will created
 *
 * well the private class are mostly declared as private or Protected class because we don't want other classes to access our inner class
 *if we create inner class as private then we cannot access it , it will throw an error
 *
 * Static inner class --> we can create a static inner class and we can access the inner class without creating the object of the outer class
 *
 * we can also access variables and mehtods of outerclass with the help of inner class
 *
 *
 * */