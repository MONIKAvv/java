package AdvanceJava;

import java.util.ArrayList;
import java.util.function.Consumer;

public class JavaLambda {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(12);
        number.add(15);
        number.add(42);
        number.add(67);
        number.add(2);
        number.add(72);
        number.add(132);
//         storing the lambda expressions in variable and consumer is a Interface type
        Consumer <Integer> lambda = (n) -> {
            System.out.println(n);
        };
//        this is the lambda expression
//        number.forEach(lambda);
//        number.forEach((n) -> {
//            System.out.println(n);
//        });

StringFunction obj1 = (s) -> s+"!";
StringFunction obj2 = (s) -> s+"?";
printFormatted("Hello", obj1);
printFormatted("How are you", obj2);


        }
public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
    System.out.println(result);
}


}

interface StringFunction{
    String run (String str);
}



/*
Lambda:- Lambda Expression are short code that onyl has parameter and return values and it has no name , and it could be define inside the body of the method
 Syntax:- parameters,... -> expressions

 expressions shoule be short that is just for returning the value, no variables, if or loops nothing just to return the value , if we want to have more lines of code in expressions then we have to use the {}

Lambda expressions are usally passes as parameters to a function

Lambda expressions can be stored in a variable and that variable's type should be interface in nature and have one method

 */