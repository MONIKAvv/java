package Recursion;

public class fabonacciNo {
    public static void main(String [] args){
//        fabinacci series

        System.out.println("The fibonacci series are: " + fabonacci(7));
    }
    static int fabonacci(int n){
        if(n<2){
            return n;
        }

        return (fabonacci(n-1) + fabonacci(n-2));
    }
}

//The base condition is registered by answer we already have,
// in this , we know that f(0) = 0, and f(1) = 1;   this is called base condition
// Recursion if i can break it down into smaller problems


// last recursion function called tailed recursion and if any function call is not last or calling for continue then that is not tailed recursion


//How to understand and approach problem?----> Identify if you can break any problem into smaller problems
//                                         ----> Write the recursion relation if needed
//                                        ----> Draw the recurive tree
//About the tree

//see the flow of funcitons, how they are getting in stack
//Identify and focus on left tree calls and right tree calls
//Draw the tree and pointer again and again
//Use a debugger to see the pointer/ flow
// See how the values and what types of values(int, String,etc) are return at each steps
//see where the function call will come out. And In the end we will come out of main function
//








//vvvvI Variable
// Arguments
// return type
// body



//what are the things that needs to put into the arguments and on body----> The things that are repeative or need in
// future recursion call and will need to update and will change again and again put that in argument
// and the things that are not necessary to repeat put that on body



//Don't overthink just solve the problem and after problem get solved then put your brain into it

