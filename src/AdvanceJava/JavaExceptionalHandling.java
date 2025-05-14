package AdvanceJava;

public class JavaExceptionalHandling {
    public static void main(String[] args) {
//        checkAge(15);


        try{
            int [] mynumber = {1,2,4};
            System.out.println(mynumber[9]);
//            CheckAge(20);
            JavaExceptionalHandling obj = new JavaExceptionalHandling();
            obj.checkAge(30);
        }catch (Exception e){
            System.out.println("There is no such index present ");
            System.out.println("Error for checkage");
        }finally {
            System.out.println("The catch block is finished");
        }


    }
void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

}

/*
Try block is execute for if all the things runs well (block of code tested for errors while it been executed (code that will check for the error)
catch block will start to execute when the error found

finally keyword is used after the catch block get over
throw keyword is used to throw error (custom error)



 */
