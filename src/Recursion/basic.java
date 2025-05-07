package Recursion;
// Recursion love difficulties 😅😅

public class basic {
//    write a function that prints hello world
public static void main(String[] args) {
    message(5);

}
static void message(int n){
//    System.out.println("Hello world!");

    if(n==0){
        return;
    }  // this is called base condition , terminating condition, simple if condition and recursion stop calling itself
    System.out.println(n);
    message(n-1); // as many time function call itself it holds new stack memory space , Stack will get filled again and again
//     every call of function takes memory and when the function finished its execution then it will return back to that called type
}
}
//dynamic // heart of dsa,
// work on recursion
//Suppose it like----> a function calls another function


// base condition
// body (things needs to do)
// separate memory takes (calling itself)
// we need recursion ---> 1. It helps us in solving bigger complex problems in simpler way
//2. we can convert recursion solutions into iterations and vise versa (without loop)
//3. Used when Space complexity is not constant because of recursive calls.
//4. It helps us in breaking down bigger problems into smaller problems

